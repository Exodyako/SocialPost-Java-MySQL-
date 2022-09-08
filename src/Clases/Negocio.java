package Clases;

import GUIS.IniciarSesion;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Negocio {

    IniciarSesion IniciarS;

    private ArrayList<Usuarios> usuarios;
    private Usuarios usuarioLogeado;

    public Negocio() {

        usuarios = new ArrayList<>();
        leerBD();

    }

    public String ObtenerNombredelLoggeado() {

        return usuarioLogeado.getNombreR();

    }

    public String[] datosDelLogeado() {

        String[] datos = {usuarioLogeado.getNombreR(), usuarioLogeado.getApellidoR(), usuarioLogeado.getImgPerfil(), usuarioLogeado.getImgPortada(), usuarioLogeado.getSloganR(), usuarioLogeado.getCorreoR(), usuarioLogeado.getGenerosR(), usuarioLogeado.getFechaR(),usuarioLogeado.getTelefono(),usuarioLogeado.getDireccion(),usuarioLogeado.getDescripcion(), usuarioLogeado.getPost()};

        return datos;

    }

    public void eliminarUsuario(String correo) {
        for (int i = 0; i < usuarios.size(); i++) {
            Usuarios x = usuarios.get(i);
            if (x.getCorreoR().equalsIgnoreCase(correo)) {

                UsuarioBD usuario = new UsuarioBD(false);
                if (usuario.eliminarUsuario(correo)) {
                    usuarios.remove(x);
                }
            }
        }
    }

    public boolean guardarUsuario(String NombreR, String ApellidoR, String GenerosR, String FechaR, String CorreoR, String ContraseñaOcultaR, String ImgPerfil, String ImgPortada, String SloganR, String telefono, String direccion, String descripcion, String Post) throws Exception {
        boolean registrado = false;

        Usuarios us = new Usuarios(NombreR, ApellidoR, GenerosR, FechaR, CorreoR, ContraseñaOcultaR, ImgPerfil, ImgPortada, SloganR, telefono, direccion, descripcion, Post);
        UsuarioBD u = new UsuarioBD(false);

        boolean aux = u.insertarUsuario(us);
        if (aux) {
            usuarios.add(us);
            registrado = true;
        }

        //guardarEnTxt();
        return registrado;

    }

    public void editarMiDato(String nombreDato, String dato) throws Exception {
        editarMiDato(nombreDato, dato, usuarioLogeado);
    }

    public void editarDatoAdmin(String nombreDato, String dato, String correo) throws Exception {

        for (int i = 0; i < usuarios.size(); i++) {
            Usuarios user = usuarios.get(i);
            if (user.getCorreoR().equalsIgnoreCase(correo)) {
                editarMiDato(nombreDato, dato, user);
            }
        }
    }

    public void editarMiDato(String nombreDato, String dato, Usuarios usuarioLogeado) throws Exception {
        String columna = "";
        String correo = usuarioLogeado.getCorreoR();

        switch (nombreDato) {

            case "nombre":
                columna = "nombre";
                usuarioLogeado.setNombreR(dato);
                break;

            case "apellido":
                columna = "apellido";
                usuarioLogeado.setApellidoR(dato);
                break;

            case "correo":
                columna = "correo";
                usuarioLogeado.setCorreoR(dato);
                break;

            case "fecha":
                columna = "fechanacimiento";
                usuarioLogeado.setFechaR(dato);
                break;

            case "contraseña":
                columna = "contraseña";
                usuarioLogeado.setContraseñaOcultaR(dato);

                break;

            case "genero":
                columna = "genero";
                usuarioLogeado.setGenerosR(dato);

                break;

            case "perfil":
                columna = "imagenperfil";
                usuarioLogeado.setImgPerfil(dato);

                break;

            case "portada":
                columna = "imagenportada";
                usuarioLogeado.setImgPortada(dato);

                break;

            case "slogan":
                columna = "slogan";
                usuarioLogeado.setSloganR(dato);
                break;
                
            case "telefono":
                columna="telefono";
                usuarioLogeado.setTelefono(dato);
                break;
                
            case "direccion":
                columna="direccion";
                usuarioLogeado.setDireccion(dato);
                break;
                
            case "descripcion":
                columna="descripcion";
                usuarioLogeado.setDescripcion(dato);
                break;
                
            case "posteados":
                columna="posteados";
                usuarioLogeado.setPost(dato);
                break;

        }
        UsuarioBD conexion = new UsuarioBD(false);
        conexion.editarDatoProducto(dato, columna, correo);

    }

    private void actualizarEnArreglo() {

        for (int i = 0; i < usuarios.size(); i++) {

            Usuarios u = usuarios.get(i);

            if (u.equals(usuarioLogeado)) {

                usuarios.remove(u);
                usuarios.add(u);
//                guardarEnTxt();

            }
        }
    }

    public boolean validarCorreoExistente(String CorreoR) {

        boolean esta = false;

        for (int i = 0; i < usuarios.size(); i++) {

            if (CorreoR.equalsIgnoreCase(usuarios.get(i).getCorreoR())) {

                esta = true;

            }
        }

        return esta;
    }

    public boolean ingresarUsuario(String usuario, String contraseña) {

        boolean estoy = false;

        for (int i = 0; i < usuarios.size(); i++) {

            if (usuarios.get(i).getCorreoR().equalsIgnoreCase(usuario)) {

                if (usuarios.get(i).getContraseñaOcultaR().equalsIgnoreCase(contraseña)) {

                    estoy = true;
                    usuarioLogeado = usuarios.get(i);

                    break;

                }

            }

        }

        return estoy;
    }

    public String[][] ImprimirUsuario() {

        leerBD();

        String[][] usuarios = new String[this.usuarios.size()][8];

        for (int i = 0; i < this.usuarios.size(); i++) {

            Usuarios usuario = this.usuarios.get(i);

            usuarios[i][0] = usuario.getNombreR();
            usuarios[i][1] = usuario.getApellidoR();
            usuarios[i][2] = usuario.getGenerosR();
            usuarios[i][3] = usuario.getFechaR();
            usuarios[i][4] = usuario.getCorreoR();
            usuarios[i][5] = usuario.getContraseñaOcultaR();
            usuarios[i][6] = usuario.getImgPerfil();
            usuarios[i][7] = usuario.getImgPortada();
        }

        return usuarios;

    }

    //Metodo para guardar el archivo  
    public void guardarEnTxtt() {

        try {

            ObjectOutputStream output;
            output = new ObjectOutputStream(new FileOutputStream("usuario.txt"));
            output.writeObject(usuarios);
            output.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al guardar archivo", "Mensaje", JOptionPane.WARNING_MESSAGE);

        }
    }

    //metodo para leer el archivo de la angenda
    public void leerDelTxt() {

        try {

            ObjectInputStream input;
            input = new ObjectInputStream(new FileInputStream("usuario.txt"));
            usuarios = (ArrayList<Usuarios>) input.readObject();
            input.close();

            for (int i = 0; i < usuarios.size(); i++) {
            }

        } catch (IOException e) {
        } catch (ClassNotFoundException e) {
        }
    }

    public void leerBD() {

        UsuarioBD b = new UsuarioBD(false);
        this.usuarios = (ArrayList<Usuarios>) b.listarUsuarios();
    }
}
