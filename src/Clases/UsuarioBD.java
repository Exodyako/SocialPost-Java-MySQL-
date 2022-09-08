
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class UsuarioBD {
    
    public static String hostDB = "localhost";
    public static String puertoDB = "3306";
    public static String userDB = "root";
    public static String passDB = "";
    public static String sqlDB = "social";
    public static String driverDB = "com.mysql.jdbc.Driver";
    public static String gestorDB = "mysql";
    
    private Connection conn;
    private String DRIVER = driverDB;
    private String DBURL = "jdbc:"+gestorDB+"://"+hostDB+":"+puertoDB+"/"+sqlDB;
    private String USER = userDB;
    private String PASS = passDB;
    private boolean mantenerConexion;    

    public UsuarioBD(boolean mantenerConexion) {
        this.mantenerConexion = mantenerConexion;
        try {
            Class.forName(DRIVER).newInstance();
            conn = DriverManager.getConnection(DBURL, USER, PASS);
            //System.out.println("Conexion Establecida\n");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Connection ComprobarConexion(){
        Connection cn = null;
        try {
            Class.forName(DRIVER);
            cn = DriverManager.getConnection(DBURL, USER, PASS);
            System.out.println("\nConexion establecida...");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\nError al conectar con el servidor...\n"+e.getMessage());
        }
        return cn;
    }

    
    public boolean insertarUsuario(Usuarios usuario) throws Exception{
        boolean exito = false;
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement("insert into usuario (nombre,apellido,genero,fechanacimiento,correo,contraseña,imagenperfil,imagenportada,slogan) values(?,?,?,?,?,?,?,?,?)");
            stm.setString(1, usuario.getNombreR());
            stm.setString(2,usuario.getApellidoR());
            stm.setString(3, usuario.getGenerosR());
            stm.setString(4, usuario.getFechaR());
            stm.setString(5, usuario.getCorreoR());
            stm.setString(6, usuario.getContraseñaOcultaR());
            stm.setString(7, usuario.getImgPerfil());
            stm.setString(8, usuario.getImgPortada());
            stm.setString(9, usuario.getSloganR());
            int total = stm.executeUpdate();
            if (total > 0) {
                exito = true;
            }
            stm.close();
        } catch (Exception e) {
            if (e.getMessage().contains("PRIMARY")) {
                throw new Exception("Ingresaste un correo ya registrado");
            }else{
                e.printStackTrace();
            }
        } finally {
            try {
                if (!mantenerConexion) {
                    conn.close();
                }

            } catch (Exception e) {
            }

        }

        return exito;
    }
 
    
    
     public List<Usuarios> listarUsuarios() {
        Object aux = null;
        List<Usuarios> l = null;
        try {
            String selectStatement = "select nombre,apellido,genero,fechanacimiento,correo,contraseña,imagenperfil,imagenportada,slogan,telefono,direccion,descripcion, posteados from usuario";
            PreparedStatement prepStmt = conn.prepareStatement(selectStatement);

            ResultSet rs = prepStmt.executeQuery();
            l = new ArrayList<Usuarios>();
            while (rs.next()) {
                Usuarios usuario=new Usuarios(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12), rs.getString(13));
                l.add(usuario);
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (!mantenerConexion) {
                try {
                    conn.close();
                } catch (Exception e) {
                }
            }
        }

        return l;
    }
    
     public boolean editarDatoProducto(String dato, String columna, String correo) throws Exception {
        boolean exito = false;
        PreparedStatement stm = null;
        try {
            String consulta = "update usuario set usuario." + columna + "=? where usuario.correo=?";

            stm = conn.prepareStatement(consulta);
           stm.setString(1, dato);
            stm.setString(2, correo);
            int total = stm.executeUpdate();
            if (total > 0) {
                exito = true;
            }
            stm.close();
        } catch (Exception e) {
            if (e.getMessage().contains("PRIMARY")) {
                throw new Exception("El correo ingresado ya fue guardado en la base de datos");
            } else  {
                throw new Exception("Error al editar producto");
            }
        } finally {
            try {
                if (!mantenerConexion) {
                    conn.close();
                }
            } catch (Exception e) {
            }

        }

        return exito;
    }
     
     
     
     public boolean eliminarUsuario(String correo) {
        PreparedStatement stmt = null;
        boolean exito = false;
        try {
            stmt = conn.prepareStatement("delete from usuario where usuario.correo=?");
            stmt.setString(1, correo);
            int total = stmt.executeUpdate();
            if (total > 0) {
                exito = true;
            }
            stmt.close();
        } catch (Exception e) {
        } finally {
            try {
                if (!mantenerConexion) {

                    conn.close();

                }
            } catch (Exception e) {
            }

        }

        return exito;

    }
    
    
}
