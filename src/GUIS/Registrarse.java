
package GUIS;

import Ayuda.AyudaRegistrate;
import Clases.CargarArchivos;
import javax.swing.JOptionPane;
import Clases.RegistrarseFunciones;
import static GUIS.Principal.Contador;
import ImportarExportar.CargarFoto;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Registrarse extends javax.swing.JFrame {

    RegistrarseFunciones RF = new RegistrarseFunciones(this);
    
    CargarArchivos CargarFotoDelPerfil = new CargarArchivos(null);
    
    CargarArchivos CargarFotoDelPortada = new CargarArchivos(null);
    
    public static Icon Success;
    
    private Principal principal;
    
    boolean Aprovado = true;
    
    
    public Registrarse(Principal principal) {
        
        super("Registrarse");
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Iconos/form.png")).getImage());
        initComponents();
        this.principal=principal;
        setLocationRelativeTo(this);
        
        Success = new ImageIcon(getClass().getResource("/Iconos/success.png"));
         
        Pestañas.setEnabled(false);
        ContraseñaVisible.setVisible(false);
        ContraseñaOculta.setVisible(true);
        
        ImageIcon ImagenBackground = new ImageIcon("src/Imagenes/FondoSocialPOST-Principal.jpg");
        Icon IconoBackground = new ImageIcon(ImagenBackground.getImage().getScaledInstance(Portada.getWidth(), Portada.getHeight(), Image.SCALE_DEFAULT));
        Portada.setIcon(IconoBackground);
        
        CerrarVentana();
     
    }

    public Registrarse(Principal principal, JTextField Apdo, JLabel Apellido, JTextField Arroba, JComboBox<String> Año, JSpinner AñoSpinner, JButton BtnCargarFotoPerfil, JButton BtnCargarFotoPortada, JLabel CargarFotoDePerfil, JLabel CargarFotoDePerfilText, JLabel CargarFotoDePortada, JLabel CargarFotoDePortadaText, JPasswordField ContraseñaOculta, JTextField ContraseñaVisible, JTextField Correo, JLabel CorreoElectronico, JLabel CuadroDeTexto, JComboBox<String> Dia, JComboBox<String> Extencion, JLabel FAño, JLabel FDia, JLabel FMes, JRadioButton Hombre, JButton IngresarAño, JTextField IngresarSlogan, JMenuBar MenuBarR, JComboBox<String> Mes, JCheckBox MostrarContraseña, JTextField MostrarSlogan, JRadioButton Mujer, JTextField Nom, JLabel Nombre, JLabel Seguridad, JButton SeleccionarAño, JLabel SloganTxt, JLabel Texto1, JLabel Texto2, JComboBox<String> TipoCorreo, JLabel Transparente, JLabel ValidarCantidadDeContraseña, JButton Volver, JMenu jMenu1, JMenu jMenu2, JMenuItem jMenuItem1, JMenuItem jMenuItem2) {
        this.principal = principal;
        this.Apdo = Apdo;
        this.Apellido = Apellido;
        this.Arroba = Arroba;
        this.Año = Año;
        this.BtnCargarFotoPerfil = BtnCargarFotoPerfil;
        this.BtnCargarFotoPortada = BtnCargarFotoPortada;
        this.CargarFotoDePerfil = CargarFotoDePerfil;
        this.CargarFotoDePerfilText = CargarFotoDePerfilText;
        this.CargarFotoDePortada = CargarFotoDePortada;
        this.CargarFotoDePortadaText = CargarFotoDePortadaText;
        this.ContraseñaOculta = ContraseñaOculta;
        this.ContraseñaVisible = ContraseñaVisible;
        this.Correo = Correo;
        this.CorreoElectronico = CorreoElectronico;
        this.Dia = Dia;
        this.Extencion = Extencion;
        this.FAño = FAño;
        this.FDia = FDia;
        this.FMes = FMes;
        this.Hombre = Hombre;
        this.IngresarSlogan = IngresarSlogan;
        this.MenuBarR = MenuBarR;
        this.Mes = Mes;
        this.MostrarContraseña = MostrarContraseña;
        this.MostrarSlogan = MostrarSlogan;
        this.Mujer = Mujer;
        this.Nom = Nom;
        this.Nombre = Nombre;
        this.Seguridad = Seguridad;
        this.SloganTxt = SloganTxt;
        this.TipoCorreo = TipoCorreo;
        this.Transparente = Transparente;
        this.ValidarCantidadDeContraseña = ValidarCantidadDeContraseña;
        this.Volver = Volver;
        this.jMenu1 = jMenu1;
        this.jMenu2 = jMenu2;
        this.jMenuItem1 = jMenuItem1;
        this.jMenuItem2 = jMenuItem2;
    }

    Registrarse() {

    }

    public RegistrarseFunciones getRF() {
        return RF;
    }

    public void setRF(RegistrarseFunciones RF) {
        this.RF = RF;
    }

    public CargarArchivos getCargarFotoDelPerfil() {
        return CargarFotoDelPerfil;
    }

    public void setCargarFotoDelPerfil(CargarArchivos CargarFotoDelPerfil) {
        this.CargarFotoDelPerfil = CargarFotoDelPerfil;
    }

    public CargarArchivos getCargarFotoDelPortada() {
        return CargarFotoDelPortada;
    }

    public void setCargarFotoDelPortada(CargarArchivos CargarFotoDelPortada) {
        this.CargarFotoDelPortada = CargarFotoDelPortada;
    }

    public static Icon getSuccess() {
        return Success;
    }

    public static void setSuccess(Icon Success) {
        Registrarse.Success = Success;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public boolean isAprovado() {
        return Aprovado;
    }

    public void setAprovado(boolean Aprovado) {
        this.Aprovado = Aprovado;
    }

    public JTextField getApdo() {
        return Apdo;
    }

    public void setApdo(JTextField Apdo) {
        this.Apdo = Apdo;
    }

    public JLabel getApellido() {
        return Apellido;
    }

    public void setApellido(JLabel Apellido) {
        this.Apellido = Apellido;
    }

    public JTextField getArroba() {
        return Arroba;
    }

    public void setArroba(JTextField Arroba) {
        this.Arroba = Arroba;
    }

    public JComboBox<String> getAño() {
        return Año;
    }

    public void setAño(JComboBox<String> Año) {
        this.Año = Año;
    }

    public JButton getBtnCargarFotoPerfil() {
        return BtnCargarFotoPerfil;
    }

    public void setBtnCargarFotoPerfil(JButton BtnCargarFotoPerfil) {
        this.BtnCargarFotoPerfil = BtnCargarFotoPerfil;
    }

    public JButton getBtnCargarFotoPortada() {
        return BtnCargarFotoPortada;
    }

    public void setBtnCargarFotoPortada(JButton BtnCargarFotoPortada) {
        this.BtnCargarFotoPortada = BtnCargarFotoPortada;
    }

    public JLabel getCargarFotoDePerfil() {
        return CargarFotoDePerfil;
    }

    public void setCargarFotoDePerfil(JLabel CargarFotoDePerfil) {
        this.CargarFotoDePerfil = CargarFotoDePerfil;
    }

    public JLabel getCargarFotoDePerfilText() {
        return CargarFotoDePerfilText;
    }

    public void setCargarFotoDePerfilText(JLabel CargarFotoDePerfilText) {
        this.CargarFotoDePerfilText = CargarFotoDePerfilText;
    }

    public JLabel getCargarFotoDePortada() {
        return CargarFotoDePortada;
    }

    public void setCargarFotoDePortada(JLabel CargarFotoDePortada) {
        this.CargarFotoDePortada = CargarFotoDePortada;
    }

    public JLabel getCargarFotoDePortadaText() {
        return CargarFotoDePortadaText;
    }

    public void setCargarFotoDePortadaText(JLabel CargarFotoDePortadaText) {
        this.CargarFotoDePortadaText = CargarFotoDePortadaText;
    }

    public JPasswordField getContraseñaOculta() {
        return ContraseñaOculta;
    }

    public void setContraseñaOculta(JPasswordField ContraseñaOculta) {
        this.ContraseñaOculta = ContraseñaOculta;
    }

    public JTextField getContraseñaVisible() {
        return ContraseñaVisible;
    }

    public void setContraseñaVisible(JTextField ContraseñaVisible) {
        this.ContraseñaVisible = ContraseñaVisible;
    }

    public JTextField getCorreo() {
        return Correo;
    }

    public void setCorreo(JTextField Correo) {
        this.Correo = Correo;
    }

    public JLabel getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(JLabel CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public static JPanel getDatosPerfil() {
        return DatosPerfil;
    }

    public static void setDatosPerfil(JPanel DatosPerfil) {
        Registrarse.DatosPerfil = DatosPerfil;
    }

    public static JPanel getDatosPersonales() {
        return DatosPersonales;
    }

    public static void setDatosPersonales(JPanel DatosPersonales) {
        Registrarse.DatosPersonales = DatosPersonales;
    }

    public JComboBox<String> getDia() {
        return Dia;
    }

    public void setDia(JComboBox<String> Dia) {
        this.Dia = Dia;
    }

    public static JLabel getEdad() {
        return Edad;
    }

    public static void setEdad(JLabel Edad) {
        Registrarse.Edad = Edad;
    }

    public JComboBox<String> getExtencion() {
        return Extencion;
    }

    public void setExtencion(JComboBox<String> Extencion) {
        this.Extencion = Extencion;
    }

    public JLabel getFAño() {
        return FAño;
    }

    public void setFAño(JLabel FAño) {
        this.FAño = FAño;
    }

    public JLabel getFDia() {
        return FDia;
    }

    public void setFDia(JLabel FDia) {
        this.FDia = FDia;
    }

    public JLabel getFMes() {
        return FMes;
    }

    public void setFMes(JLabel FMes) {
        this.FMes = FMes;
    }

    public static JButton getFinalizar() {
        return Finalizar;
    }

    public static void setFinalizar(JButton Finalizar) {
        Registrarse.Finalizar = Finalizar;
    }

    public static JLabel getFoto() {
        return Foto;
    }

    public static void setFoto(JLabel Foto) {
        Registrarse.Foto = Foto;
    }

    public static JLabel getGenero() {
        return Genero;
    }

    public static void setGenero(JLabel Genero) {
        Registrarse.Genero = Genero;
    }

    public static ButtonGroup getGeneroGroup() {
        return GeneroGroup;
    }

    public static void setGeneroGroup(ButtonGroup GeneroGroup) {
        Registrarse.GeneroGroup = GeneroGroup;
    }

    public JRadioButton getHombre() {
        return Hombre;
    }

    public void setHombre(JRadioButton Hombre) {
        this.Hombre = Hombre;
    }

    public JTextField getIngresarSlogan() {
        return IngresarSlogan;
    }

    public void setIngresarSlogan(JTextField IngresarSlogan) {
        this.IngresarSlogan = IngresarSlogan;
    }

    public static JMenuItem getItemCerrarPrograma() {
        return ItemCerrarPrograma;
    }

    public static void setItemCerrarPrograma(JMenuItem ItemCerrarPrograma) {
        Registrarse.ItemCerrarPrograma = ItemCerrarPrograma;
    }

    public JMenuBar getMenuBarR() {
        return MenuBarR;
    }

    public void setMenuBarR(JMenuBar MenuBarR) {
        this.MenuBarR = MenuBarR;
    }

    public JComboBox<String> getMes() {
        return Mes;
    }

    public void setMes(JComboBox<String> Mes) {
        this.Mes = Mes;
    }

    public JCheckBox getMostrarContraseña() {
        return MostrarContraseña;
    }

    public void setMostrarContraseña(JCheckBox MostrarContraseña) {
        this.MostrarContraseña = MostrarContraseña;
    }

    public JTextField getMostrarSlogan() {
        return MostrarSlogan;
    }

    public void setMostrarSlogan(JTextField MostrarSlogan) {
        this.MostrarSlogan = MostrarSlogan;
    }

    public JRadioButton getMujer() {
        return Mujer;
    }

    public void setMujer(JRadioButton Mujer) {
        this.Mujer = Mujer;
    }

    public JTextField getNom() {
        return Nom;
    }

    public void setNom(JTextField Nom) {
        this.Nom = Nom;
    }

    public JLabel getNombre() {
        return Nombre;
    }

    public void setNombre(JLabel Nombre) {
        this.Nombre = Nombre;
    }

    public static JLabel getPerfil() {
        return Perfil;
    }

    public static void setPerfil(JLabel Perfil) {
        Registrarse.Perfil = Perfil;
    }

    public static JTabbedPane getPestañas() {
        return Pestañas;
    }

    public static void setPestañas(JTabbedPane Pestañas) {
        Registrarse.Pestañas = Pestañas;
    }

    public static JLabel getPortada() {
        return Portada;
    }

    public static void setPortada(JLabel Portada) {
        Registrarse.Portada = Portada;
    }

    public static JLabel getRegistro1() {
        return Registro1;
    }

    public static void setRegistro1(JLabel Registro1) {
        Registrarse.Registro1 = Registro1;
    }

    public JLabel getSeguridad() {
        return Seguridad;
    }

    public void setSeguridad(JLabel Seguridad) {
        this.Seguridad = Seguridad;
    }

    public static JButton getSiguiente() {
        return Siguiente;
    }

    public static void setSiguiente(JButton Siguiente) {
        Registrarse.Siguiente = Siguiente;
    }

    public JLabel getSloganTxt() {
        return SloganTxt;
    }

    public void setSloganTxt(JLabel SloganTxt) {
        this.SloganTxt = SloganTxt;
    }

    public JComboBox<String> getTipoCorreo() {
        return TipoCorreo;
    }

    public void setTipoCorreo(JComboBox<String> TipoCorreo) {
        this.TipoCorreo = TipoCorreo;
    }

    public JLabel getTransparente() {
        return Transparente;
    }

    public void setTransparente(JLabel Transparente) {
        this.Transparente = Transparente;
    }

    public JLabel getValidarCantidadDeContraseña() {
        return ValidarCantidadDeContraseña;
    }

    public void setValidarCantidadDeContraseña(JLabel ValidarCantidadDeContraseña) {
        this.ValidarCantidadDeContraseña = ValidarCantidadDeContraseña;
    }

    public JButton getVolver() {
        return Volver;
    }

    public void setVolver(JButton Volver) {
        this.Volver = Volver;
    }

    public JMenu getjMenu1() {
        return jMenu1;
    }

    public void setjMenu1(JMenu jMenu1) {
        this.jMenu1 = jMenu1;
    }

    public JMenu getjMenu2() {
        return jMenu2;
    }

    public void setjMenu2(JMenu jMenu2) {
        this.jMenu2 = jMenu2;
    }

    public JMenuItem getjMenuItem1() {
        return jMenuItem1;
    }

    public void setjMenuItem1(JMenuItem jMenuItem1) {
        this.jMenuItem1 = jMenuItem1;
    }

    public JMenuItem getjMenuItem2() {
        return jMenuItem2;
    }

    public void setjMenuItem2(JMenuItem jMenuItem2) {
        this.jMenuItem2 = jMenuItem2;
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GeneroGroup = new javax.swing.ButtonGroup();
        Pestañas = new javax.swing.JTabbedPane();
        DatosPersonales = new javax.swing.JPanel();
        Siguiente = new javax.swing.JButton();
        ValidarCantidadDeContraseña = new javax.swing.JLabel();
        MostrarContraseña = new javax.swing.JCheckBox();
        ContraseñaOculta = new javax.swing.JPasswordField();
        ContraseñaVisible = new javax.swing.JTextField();
        Seguridad = new javax.swing.JLabel();
        Extencion = new javax.swing.JComboBox<>();
        TipoCorreo = new javax.swing.JComboBox<>();
        Arroba = new javax.swing.JTextField();
        Correo = new javax.swing.JTextField();
        CorreoElectronico = new javax.swing.JLabel();
        Año = new javax.swing.JComboBox<>();
        FAño = new javax.swing.JLabel();
        Mes = new javax.swing.JComboBox<>();
        FMes = new javax.swing.JLabel();
        Dia = new javax.swing.JComboBox<>();
        FDia = new javax.swing.JLabel();
        Edad = new javax.swing.JLabel();
        Mujer = new javax.swing.JRadioButton();
        Hombre = new javax.swing.JRadioButton();
        Genero = new javax.swing.JLabel();
        Apdo = new javax.swing.JTextField();
        Apellido = new javax.swing.JLabel();
        Nom = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        Registro1 = new javax.swing.JLabel();
        Transparente = new javax.swing.JLabel();
        DatosPerfil = new javax.swing.JPanel();
        MostrarSlogan = new javax.swing.JTextField();
        IngresarSlogan = new javax.swing.JTextField();
        SloganTxt = new javax.swing.JLabel();
        BtnCargarFotoPortada = new javax.swing.JButton();
        CargarFotoDePortada = new javax.swing.JLabel();
        CargarFotoDePortadaText = new javax.swing.JLabel();
        BtnCargarFotoPerfil = new javax.swing.JButton();
        CargarFotoDePerfil = new javax.swing.JLabel();
        CargarFotoDePerfilText = new javax.swing.JLabel();
        Foto = new javax.swing.JLabel();
        Portada = new javax.swing.JLabel();
        Perfil = new javax.swing.JLabel();
        Finalizar = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        MenuBarR = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        ItemCerrarPrograma = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Pestañas.setBackground(new java.awt.Color(51, 153, 255));
        Pestañas.setForeground(new java.awt.Color(255, 255, 255));

        DatosPersonales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Siguiente.setBackground(new java.awt.Color(0, 51, 255));
        Siguiente.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Siguiente.setForeground(new java.awt.Color(255, 255, 255));
        Siguiente.setText("Siguiente >>");
        Siguiente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 153), new java.awt.Color(51, 51, 255), new java.awt.Color(0, 51, 255), new java.awt.Color(0, 0, 255)));
        Siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });
        DatosPersonales.add(Siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 130, 30));

        ValidarCantidadDeContraseña.setForeground(new java.awt.Color(255, 0, 0));
        DatosPersonales.add(ValidarCantidadDeContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 200, 20));

        MostrarContraseña.setText("Mostrar Contraseña");
        MostrarContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MostrarContraseña.setOpaque(false);
        MostrarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarContraseñaActionPerformed(evt);
            }
        });
        DatosPersonales.add(MostrarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 150, -1));

        ContraseñaOculta.setText("Escribir...");
        ContraseñaOculta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ContraseñaOcultaFocusGained(evt);
            }
        });
        ContraseñaOculta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContraseñaOcultaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ContraseñaOcultaMouseExited(evt);
            }
        });
        ContraseñaOculta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaOcultaActionPerformed(evt);
            }
        });
        ContraseñaOculta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ContraseñaOcultaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ContraseñaOcultaKeyTyped(evt);
            }
        });
        DatosPersonales.add(ContraseñaOculta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 200, -1));

        ContraseñaVisible.setText("Escribir...");
        ContraseñaVisible.setAutoscrolls(false);
        ContraseñaVisible.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ContraseñaVisibleFocusGained(evt);
            }
        });
        ContraseñaVisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContraseñaVisibleMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ContraseñaVisibleMouseExited(evt);
            }
        });
        ContraseñaVisible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaVisibleActionPerformed(evt);
            }
        });
        ContraseñaVisible.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ContraseñaVisibleKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ContraseñaVisibleKeyTyped(evt);
            }
        });
        DatosPersonales.add(ContraseñaVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 200, -1));

        Seguridad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Seguridad.setText("Contraseña:");
        DatosPersonales.add(Seguridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 20));

        Extencion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".com", ".co", ".org", ".es", ".es.tl" }));
        Extencion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DatosPersonales.add(Extencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 60, 20));

        TipoCorreo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "hotmail", "gmail", "mail.edu" }));
        TipoCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DatosPersonales.add(TipoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 80, 20));

        Arroba.setEditable(false);
        Arroba.setText("@");
        Arroba.setAutoscrolls(false);
        Arroba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArrobaMouseClicked(evt);
            }
        });
        Arroba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArrobaActionPerformed(evt);
            }
        });
        DatosPersonales.add(Arroba, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 20, 20));

        Correo.setText("Escribir...");
        Correo.setAutoscrolls(false);
        Correo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Correo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CorreoFocusGained(evt);
            }
        });
        Correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CorreoMouseClicked(evt);
            }
        });
        Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoActionPerformed(evt);
            }
        });
        Correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CorreoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CorreoKeyTyped(evt);
            }
        });
        DatosPersonales.add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 160, 20));

        CorreoElectronico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CorreoElectronico.setText("Correo Electronico:");
        DatosPersonales.add(CorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 20));

        Año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "Digitar" }));
        Año.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Año.setOpaque(false);
        Año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñoActionPerformed(evt);
            }
        });
        DatosPersonales.add(Año, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 70, 20));

        FAño.setText("Año:");
        DatosPersonales.add(FAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, 20));

        Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        Mes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mes.setOpaque(false);
        Mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesActionPerformed(evt);
            }
        });
        DatosPersonales.add(Mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 110, 20));

        FMes.setText("Mes:");
        DatosPersonales.add(FMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, 20));

        Dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Dia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Dia.setOpaque(false);
        Dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaActionPerformed(evt);
            }
        });
        DatosPersonales.add(Dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 50, 20));

        FDia.setText("Dia:");
        DatosPersonales.add(FDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, 20));

        Edad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Edad.setText("Fecha de Nacimiento:");
        DatosPersonales.add(Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 20));

        GeneroGroup.add(Mujer);
        Mujer.setText("Mujer");
        Mujer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DatosPersonales.add(Mujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        GeneroGroup.add(Hombre);
        Hombre.setSelected(true);
        Hombre.setText("Hombre");
        Hombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DatosPersonales.add(Hombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        Genero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Genero.setText("Genero:");
        DatosPersonales.add(Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 20));

        Apdo.setText("Escribir...");
        Apdo.setAutoscrolls(false);
        Apdo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ApdoFocusGained(evt);
            }
        });
        Apdo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApdoMouseClicked(evt);
            }
        });
        Apdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApdoActionPerformed(evt);
            }
        });
        Apdo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ApdoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApdoKeyTyped(evt);
            }
        });
        DatosPersonales.add(Apdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 200, -1));

        Apellido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Apellido.setText("Apellido/s:");
        DatosPersonales.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 20));

        Nom.setText("Escribir...");
        Nom.setAutoscrolls(false);
        Nom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Nom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NomFocusGained(evt);
            }
        });
        Nom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NomMouseClicked(evt);
            }
        });
        Nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomActionPerformed(evt);
            }
        });
        Nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NomKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NomKeyTyped(evt);
            }
        });
        DatosPersonales.add(Nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 200, -1));

        Nombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Nombre.setText("Nombre/s:");
        DatosPersonales.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        Registro1.setBackground(new java.awt.Color(255, 0, 0));
        Registro1.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        Registro1.setForeground(new java.awt.Color(255, 255, 255));
        Registro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Registro1.setText("Registro");
        Registro1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 0, 0), new java.awt.Color(255, 51, 51), new java.awt.Color(255, 0, 0), new java.awt.Color(153, 0, 0)));
        Registro1.setOpaque(true);
        DatosPersonales.add(Registro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 60));
        DatosPersonales.add(Transparente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 480, 20));

        Pestañas.addTab("Datos Personales", DatosPersonales);

        DatosPerfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MostrarSlogan.setEditable(false);
        MostrarSlogan.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        DatosPerfil.add(MostrarSlogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 300, -1));

        IngresarSlogan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IngresarSloganMouseExited(evt);
            }
        });
        IngresarSlogan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IngresarSloganKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IngresarSloganKeyTyped(evt);
            }
        });
        DatosPerfil.add(IngresarSlogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 170, -1));

        SloganTxt.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        SloganTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SloganTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aqui puedes Añadir tu Slogan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 1, 14))); // NOI18N
        DatosPerfil.add(SloganTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 190, 70));

        BtnCargarFotoPortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/open_folder.png"))); // NOI18N
        BtnCargarFotoPortada.setText("Cargar...");
        BtnCargarFotoPortada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCargarFotoPortada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarFotoPortadaActionPerformed(evt);
            }
        });
        DatosPerfil.add(BtnCargarFotoPortada, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 130, -1));

        CargarFotoDePortada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CargarFotoDePortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/camera.png"))); // NOI18N
        CargarFotoDePortada.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CargarFotoDePortada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CargarFotoDePortada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarFotoDePortadaMouseClicked(evt);
            }
        });
        DatosPerfil.add(CargarFotoDePortada, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 80, 70));

        CargarFotoDePortadaText.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        CargarFotoDePortadaText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CargarFotoDePortadaText.setText("<html>&nbsp;&nbsp; Cargar foto de Portada<br /><br /><br /></html>");
        CargarFotoDePortadaText.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CargarFotoDePortadaText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CargarFotoDePortadaText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarFotoDePortadaTextMouseClicked(evt);
            }
        });
        DatosPerfil.add(CargarFotoDePortadaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 240, 90));

        BtnCargarFotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/open_folder.png"))); // NOI18N
        BtnCargarFotoPerfil.setText("Cargar... ");
        BtnCargarFotoPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCargarFotoPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnCargarFotoPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarFotoPerfilActionPerformed(evt);
            }
        });
        DatosPerfil.add(BtnCargarFotoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 130, -1));

        CargarFotoDePerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CargarFotoDePerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/camera.png"))); // NOI18N
        CargarFotoDePerfil.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CargarFotoDePerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CargarFotoDePerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarFotoDePerfilMouseClicked(evt);
            }
        });
        DatosPerfil.add(CargarFotoDePerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 80, 70));

        CargarFotoDePerfilText.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        CargarFotoDePerfilText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CargarFotoDePerfilText.setText("<html>Cargar foto de Perfil &nbsp;&nbsp;&nbsp;&nbsp;<br /><br /><br /></html>");
        CargarFotoDePerfilText.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CargarFotoDePerfilText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CargarFotoDePerfilText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarFotoDePerfilTextMouseClicked(evt);
            }
        });
        DatosPerfil.add(CargarFotoDePerfilText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 240, 90));

        Foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/TradicionalUser-BigIcon.png"))); // NOI18N
        Foto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        DatosPerfil.add(Foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 90, 80));

        Portada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Portada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoSocialPOST-Principal.jpg"))); // NOI18N
        Portada.setToolTipText("");
        Portada.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        DatosPerfil.add(Portada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 460, 120));

        Perfil.setBackground(new java.awt.Color(255, 0, 0));
        Perfil.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        Perfil.setForeground(new java.awt.Color(255, 255, 255));
        Perfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Perfil.setText("Perfil");
        Perfil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 0, 0), new java.awt.Color(255, 51, 51), new java.awt.Color(255, 0, 0), new java.awt.Color(153, 0, 0)));
        Perfil.setOpaque(true);
        DatosPerfil.add(Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 60));

        Finalizar.setBackground(new java.awt.Color(51, 51, 255));
        Finalizar.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        Finalizar.setForeground(new java.awt.Color(255, 255, 255));
        Finalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/action_success-medium.png"))); // NOI18N
        Finalizar.setText("Finalizar");
        Finalizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255), new java.awt.Color(0, 51, 255), new java.awt.Color(0, 102, 255)));
        Finalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Finalizar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarActionPerformed(evt);
            }
        });
        DatosPerfil.add(Finalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 150, 40));

        Volver.setBackground(new java.awt.Color(0, 204, 204));
        Volver.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Volver.setForeground(new java.awt.Color(255, 255, 255));
        Volver.setText("<<  Volver");
        Volver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(0, 204, 204), new java.awt.Color(0, 153, 153)));
        Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        DatosPerfil.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 110, -1));

        Pestañas.addTab("Datos de Perfil", DatosPerfil);

        MenuBarR.setBackground(new java.awt.Color(0, 0, 0));
        MenuBarR.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        MenuBarR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setBackground(new java.awt.Color(0, 0, 0));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Tools.png"))); // NOI18N
        jMenu1.setText("Herramientas");
        jMenu1.setBorderPainted(true);
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Clear.png"))); // NOI18N
        jMenuItem1.setText("Limpiar Formulario");
        jMenuItem1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuItem1.setBorderPainted(true);
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.setOpaque(true);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        ItemCerrarPrograma.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        ItemCerrarPrograma.setBackground(new java.awt.Color(102, 102, 102));
        ItemCerrarPrograma.setForeground(new java.awt.Color(255, 255, 255));
        ItemCerrarPrograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/CerrarVentana.png"))); // NOI18N
        ItemCerrarPrograma.setText("Cerrar");
        ItemCerrarPrograma.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ItemCerrarPrograma.setBorderPainted(true);
        ItemCerrarPrograma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ItemCerrarPrograma.setOpaque(true);
        ItemCerrarPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCerrarProgramaActionPerformed(evt);
            }
        });
        jMenu1.add(ItemCerrarPrograma);

        MenuBarR.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Help.png"))); // NOI18N
        jMenu2.setText("Ayuda");
        jMenu2.setBorderPainted(true);
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem2.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Document.png"))); // NOI18N
        jMenuItem2.setText("Manejo de Registro");
        jMenuItem2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuItem2.setBorderPainted(true);
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.setOpaque(true);
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        MenuBarR.add(jMenu2);

        setJMenuBar(MenuBarR);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pestañas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pestañas)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomActionPerformed

    private void NomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NomMouseClicked
        
        RF.MouseClickNombre();
        
    }//GEN-LAST:event_NomMouseClicked

    private void ApdoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApdoMouseClicked
        
        RF.MouseClickApdo();
        
    }//GEN-LAST:event_ApdoMouseClicked

    private void ApdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApdoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApdoActionPerformed

    private void CorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CorreoMouseClicked
        
        RF.MouseClickCorreo();
        
    }//GEN-LAST:event_CorreoMouseClicked

    private void CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoActionPerformed

    private void ContraseñaVisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaVisibleMouseClicked
        
        RF.MouseClickContraseñaVisible();
        
    }//GEN-LAST:event_ContraseñaVisibleMouseClicked

    private void ContraseñaVisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaVisibleActionPerformed
        

        
    }//GEN-LAST:event_ContraseñaVisibleActionPerformed

    private String sacarSexo(){
        
        String aux="";
        
        if (this.Hombre.isSelected()) {
            
            aux="Hombre";
            
        }else{
            
            aux="Mujer";
            
        }
        
        return aux;
    }
    
    
    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        
        ValidarBtnSiguiente();
        
    }//GEN-LAST:event_SiguienteActionPerformed

    private boolean ValidarBtnSiguiente(){
        
        MostrarContraseña.doClick();
        //System.out.println("Activado");
        
        String Contraseña = validarContraseña(ContraseñaOculta.getPassword());
        
        MostrarContraseña.doClick();
        //System.out.println("Apagado");
        
        if(Nom.getText().equals("") && Apdo.getText().equals("") && !Hombre.isSelected() && Correo.getText().equals("") && Contraseña.equals("") || Nom.getText().equals("") && Apdo.getText().equals("") && !Hombre.isSelected() && Correo.getText().equals("") && Contraseña.equals("") || Nom.getText().equals("") && Apdo.getText().equals("") && !Mujer.isSelected() && Correo.getText().equals("") && ContraseñaVisible.getText().equals("") || Nom.getText().equals("") && Apdo.getText().equals("") && !Mujer.isSelected() && Correo.getText().equals("") && Contraseña.equals("") || Nom.getText().equals("Escribir...") && Apdo.getText().equals("Escribir...") && !Hombre.isSelected() && Correo.getText().equals("Escribir...") && ContraseñaVisible.getText().equals("Escribir...") || Nom.getText().equals("Escribir...") && Apdo.getText().equals("Escribir...") && !Hombre.isSelected() && Correo.getText().equals("Escribir...") && Contraseña.equals("Escribir...") || Nom.getText().equals("Escribir...") && Apdo.getText().equals("Escribir...") && !Mujer.isSelected() && Correo.getText().equals("Escribir...") && ContraseñaVisible.getText().equals("Escribir...") || Nom.getText().equals("Escribir...") && Apdo.getText().equals("Escribir...") && !Mujer.isSelected() && Correo.getText().equals("Escribir...") && Contraseña.equals("Escribir...")||
            //Validacion de 4 Campos
            Nom.getText().equals("") && Apdo.getText().equals("Escribir...") && !Hombre.isSelected() && Correo.getText().equals("Escribir...") && Contraseña.equals("Escribir...") || Nom.getText().equals("") && Apdo.getText().equals("Escribir...") && !Hombre.isSelected() && Correo.getText().equals("Escribir...") && ContraseñaVisible.getText().equals("Escribir...") || Nom.getText().equals("") && Apdo.getText().equals("Escribir...") && !Mujer.isSelected() && Correo.getText().equals("Escribir...") && ContraseñaOculta.getText().equals("Escribir...") || Nom.getText().equals("") && Apdo.getText().equals("Escribir...") && !Mujer.isSelected() && Correo.getText().equals("Escribir...") && ContraseñaVisible.getText().equals("Escribir...") ||
            Nom.getText().equals("Escribir...") && Apdo.getText().equals("") && !Hombre.isSelected() && Correo.getText().equals("Escribir...") && Contraseña.equals("Escribir...") || Nom.getText().equals("Escribir...") && Apdo.getText().equals("") && !Hombre.isSelected() && Correo.getText().equals("Escribir...") && ContraseñaVisible.getText().equals("Escribir...") || Nom.getText().equals("Escribir...") && Apdo.getText().equals("") && !Mujer.isSelected() && Correo.getText().equals("Escribir...") && ContraseñaOculta.getText().equals("Escribir...") || Nom.getText().equals("Escribir...") && Apdo.getText().equals("") && !Mujer.isSelected() && Correo.getText().equals("Escribir...") && ContraseñaVisible.getText().equals("Escribir...") ||
            Nom.getText().equals("Escribir...") && Apdo.getText().equals("Escribir...") && !Hombre.isSelected() && Correo.getText().equals("") && Contraseña.equals("Escribir...") || Nom.getText().equals("Escribir...") && Apdo.getText().equals("Escribir...") && !Hombre.isSelected() && Correo.getText().equals("") && ContraseñaVisible.getText().equals("Escribir...") || Nom.getText().equals("Escribir...") && Apdo.getText().equals("Escribir...") && !Mujer.isSelected() && Correo.getText().equals("") && ContraseñaOculta.getText().equals("Escribir...") || Nom.getText().equals("Escribir...") && Apdo.getText().equals("Escribir...") && !Mujer.isSelected() && Correo.getText().equals("") && ContraseñaVisible.getText().equals("Escribir...") ||
            Nom.getText().equals("Escribir...") && Apdo.getText().equals("Escribir...") && !Hombre.isSelected() && Correo.getText().equals("Escribir...") && Contraseña.equals("") || Nom.getText().equals("Escribir...") && Apdo.getText().equals("Escribir...") && !Hombre.isSelected() && Correo.getText().equals("Escribir...") && ContraseñaVisible.getText().equals("") || Nom.getText().equals("Escribir...") && Apdo.getText().equals("Escribir...") && !Mujer.isSelected() && Correo.getText().equals("Escribir...") && ContraseñaOculta.getText().equals("") || Nom.getText().equals("Escribir...") && Apdo.getText().equals("Escribir...") && !Mujer.isSelected() && Correo.getText().equals("Escribir...") && ContraseñaVisible.getText().equals("") ||
            //Hombre Validacion de 2 Campos
             !Nom.getText().equals("") && Apdo.getText().equals("Escribir...") && !Hombre.isSelected() && Correo.getText().equals("Escribir...") || Nombre.getText().equals("Escribir...") && !Apdo.getText().equals("") && !Hombre.isSelected() && Correo.getText().equals("Escribir...") || Nombre.getText().equals("Escribir...") && Apdo.getText().equals("Escribir...") && !Hombre.isSelected() && !Correo.getText().equals("") || 
             !Nom.getText().equals("") && Apdo.getText().equals("Escribir...") && !Hombre.isSelected() && Contraseña.equals("Escribir...") || Nom.getText().equals("Escribir...") && !Apdo.getText().equals("") && !Hombre.isSelected() && Contraseña.equals("Escribir...") || Nom.getText().equals("Escribir...") && Apdo.getText().equals("Escribir...") && !Hombre.isSelected() && !Contraseña.equals("") || !Nom.getText().equals("") && Apdo.getText().equals("Escribir...") && !Hombre.isSelected() && ContraseñaVisible.getText().equals("Escribir...") || Nom.getText().equals("Escribir...") && !Apdo.getText().equals("") && !Hombre.isSelected() && ContraseñaVisible.getText().equals("Escribir...") || Nom.getText().equals("Escribir...") && Apdo.getText().equals("Escribir...") && !Hombre.isSelected() && !ContraseñaVisible.getText().equals("") ||
             !Nom.getText().equals("") && !Hombre.isSelected() && Correo.getText().equals("Escribir...") && Contraseña.equals("Escribir...") || Nom.getText().equals("Escribir...") && !Hombre.isSelected() && !Correo.getText().equals("") && Contraseña.equals("Escribir...") || Nom.getText().equals("Escribir...") && !Hombre.isSelected() && Correo.getText().equals("Escribir...") && !Contraseña.equals("") || !Nom.getText().equals("") && !Hombre.isSelected() && Correo.getText().equals("Escribir...") && ContraseñaVisible.getText().equals("Escribir...") || Nom.getText().equals("Escribir...") && !Hombre.isSelected() && !Correo.getText().equals("") && ContraseñaVisible.getText().equals("Escribir...") || Nom.getText().equals("Escribir...") && !Hombre.isSelected() && Correo.getText().equals("Escribir...") && !ContraseñaVisible.getText().equals("") ||   
             !Apdo.getText().equals("") && !Hombre.isSelected() && Correo.getText().equals("Escribir...") && Contraseña.equals("Escribir...") || Apdo.getText().equals("Escribir...") && !Hombre.isSelected() && !Correo.getText().equals("") && Contraseña.equals("Escribir...") || Apdo.getText().equals("Escribir...") && !Hombre.isSelected() && Correo.getText().equals("Escribir...") && !Contraseña.equals("") || !Apdo.getText().equals("") && !Hombre.isSelected() && Correo.getText().equals("Escribir...") && ContraseñaVisible.getText().equals("Escribir...") || Apdo.getText().equals("Escribir...") && !Hombre.isSelected() && !Correo.getText().equals("") && ContraseñaVisible.getText().equals("Escribir...") || Apdo.getText().equals("Escribir...") && !Hombre.isSelected() && Correo.getText().equals("Escribir...") && !ContraseñaVisible.getText().equals("") ||
            //Mujer Validacion de 2 Campos
             !Nom.getText().equals("") && Apdo.getText().equals("Escribir...") && !Mujer.isSelected() && Correo.getText().equals("Escribir...") || Nombre.getText().equals("Escribir...") && !Apdo.getText().equals("") && !Mujer.isSelected() && Correo.getText().equals("Escribir...") || Nombre.getText().equals("Escribir...") && Apdo.getText().equals("Escribir...") && !Mujer.isSelected() && !Correo.getText().equals("") || 
             !Nom.getText().equals("") && Apdo.getText().equals("Escribir...") && !Mujer.isSelected() && Contraseña.equals("Escribir...") || Nom.getText().equals("Escribir...") && !Apdo.getText().equals("") && !Mujer.isSelected() && Contraseña.equals("Escribir...") || Nom.getText().equals("Escribir...") && Apdo.getText().equals("Escribir...") && !Mujer.isSelected() && !Contraseña.equals("") || !Nom.getText().equals("") && Apdo.getText().equals("Escribir...") && !Mujer.isSelected() && ContraseñaVisible.getText().equals("Escribir...") || Nom.getText().equals("Escribir...") && !Apdo.getText().equals("") && !Mujer.isSelected() && ContraseñaVisible.getText().equals("Escribir...") || Nom.getText().equals("Escribir...") && Apdo.getText().equals("Escribir...") && !Mujer.isSelected() && !ContraseñaVisible.getText().equals("") ||
             !Nom.getText().equals("") && !Mujer.isSelected() && Correo.getText().equals("Escribir...") && Contraseña.equals("Escribir...") || Nom.getText().equals("Escribir...") && !Mujer.isSelected() && !Correo.getText().equals("") && Contraseña.equals("Escribir...") || Nom.getText().equals("Escribir...") && !Mujer.isSelected() && Correo.getText().equals("Escribir...") && !Contraseña.equals("") || !Nom.getText().equals("") && !Mujer.isSelected() && Correo.getText().equals("Escribir...") && ContraseñaVisible.getText().equals("Escribir...") || Nom.getText().equals("Escribir...") && !Mujer.isSelected() && !Correo.getText().equals("") && ContraseñaVisible.getText().equals("Escribir...") || Nom.getText().equals("Escribir...") && !Mujer.isSelected() && Correo.getText().equals("Escribir...") && !ContraseñaVisible.getText().equals("") ||   
             !Apdo.getText().equals("") && !Mujer.isSelected() && Correo.getText().equals("Escribir...") && Contraseña.equals("Escribir...") || Apdo.getText().equals("Escribir...") && !Mujer.isSelected() && !Correo.getText().equals("") && Contraseña.equals("Escribir...") || Apdo.getText().equals("Escribir...") && !Mujer.isSelected() && Correo.getText().equals("Escribir...") && !Contraseña.equals("") || !Apdo.getText().equals("") && !Mujer.isSelected() && Correo.getText().equals("Escribir...") && ContraseñaVisible.getText().equals("Escribir...") || Apdo.getText().equals("Escribir...") && !Mujer.isSelected() && !Correo.getText().equals("") && ContraseñaVisible.getText().equals("Escribir...") || Apdo.getText().equals("Escribir...") && !Mujer.isSelected() && Correo.getText().equals("Escribir...") && !ContraseñaVisible.getText().equals("") ||
            //Hombre Validacion de 3 Campos
              !Nom.getText().equals("") && !Apdo.getText().equals("") && !Hombre.isSelected() && !Correo.getText().equals("") && Contraseña.equals("")|| !Nom.getText().equals("") && !Apdo.getText().equals("") && !Hombre.isSelected() && !Correo.getText().equals("") && Contraseña.equals("Escribir...") || !Nom.getText().equals("") && !Apdo.getText().equals("") && !Hombre.isSelected() && !Correo.getText().equals("") && ContraseñaVisible.getText().equals("")|| !Nom.getText().equals("") && !Apdo.getText().equals("") && !Hombre.isSelected() && !Correo.getText().equals("") && ContraseñaVisible.getText().equals("Escribir...") ||
            //Mujer Validacion de 3 Campos
              !Nom.getText().equals("") && !Apdo.getText().equals("") && !Mujer.isSelected() && !Correo.getText().equals("") && Contraseña.equals("")|| !Nom.getText().equals("") && !Apdo.getText().equals("") && !Mujer.isSelected() && !Correo.getText().equals("") && Contraseña.equals("Escribir...") || !Nom.getText().equals("") && !Apdo.getText().equals("") && !Mujer.isSelected() && !Correo.getText().equals("") && ContraseñaVisible.getText().equals("")|| !Nom.getText().equals("") && !Apdo.getText().equals("") && !Mujer.isSelected() && !Correo.getText().equals("") && ContraseñaVisible.getText().equals("Escribir...")
        
        ){
            
            JOptionPane.showMessageDialog(null, "Todos los campos son OBLIGATORIOS para registrarse.", "ERROR", JOptionPane.ERROR_MESSAGE);
            
            Aprovado = true;
            
            //System.out.println("No pasa: "+Aprovado);
            
        }else if(this.principal.getNegocio().validarCorreoExistente(CorreoCompleto())){
            
            JOptionPane.showMessageDialog(null, "Su registro no ha sido EXITOSO!\n\nEl Correo: '"+Correo.getText()+"' que ingresaste ya ha sido registrado anteriormente\n\nIngresa un correo diferente", "CORREO YA REGISTRADO", JOptionPane.INFORMATION_MESSAGE);
        
            Aprovado = true;
            
            //System.out.println("No pasa el correo: "+Aprovado);
            
        }else if(ContraseñaOculta.getText().length()<4 || ContraseñaVisible.getText().length()<4){
            
            JOptionPane.showMessageDialog(null, "Su registro no ha sido EXITOSO!\n\nSu contraseña: '"+ContraseñaOculta.getText()+"' es menor de 4 digitos y la contraseña minima es de 4 digitos.\n\nIngresa una contraseña mayor de 4 digitos y menor de 9.", "CORREO YA REGISTRADO", JOptionPane.INFORMATION_MESSAGE);
        
            Aprovado = true;
        
        }else{
        
            JOptionPane.showMessageDialog(null, "tu registro de Datos ha sido exitoso.", "ENABUENAHORA", JOptionPane.WARNING_MESSAGE,Success);
        
            Pestañas.setSelectedIndex(1);
            
            Aprovado = false;
            
            //System.out.println("Si pasa: "+Aprovado);
        
        }
    
        return Aprovado;
        
    }
    
    private void NomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomKeyTyped
        
        RF.ValidarSolamenteLetras(evt);
        
    }//GEN-LAST:event_NomKeyTyped

    private void NomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomKeyPressed
        
        RF.ValidarBtnEnterNombre(evt);

    }//GEN-LAST:event_NomKeyPressed

    private void ApdoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApdoKeyPressed
        
        RF.ValidarBtnEnterApdo(evt);
        
    }//GEN-LAST:event_ApdoKeyPressed

    private void ApdoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApdoKeyTyped

        RF.ValidarSolamenteLetras(evt);
        
    }//GEN-LAST:event_ApdoKeyTyped

    private void ContraseñaVisibleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraseñaVisibleKeyPressed
        
        RF.ValidarBtnEnterContraseñaVisible(evt);
        
    }//GEN-LAST:event_ContraseñaVisibleKeyPressed

    private void DiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaActionPerformed
        
        RF.ValidarDiasDeFebrero();
        
    }//GEN-LAST:event_DiaActionPerformed

    private void MesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesActionPerformed
        
        RF.ValidarDiasDeFebrero();
        
    }//GEN-LAST:event_MesActionPerformed

    private void ArrobaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArrobaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ArrobaMouseClicked

    private void ArrobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArrobaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArrobaActionPerformed

    private void CorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorreoKeyTyped
        
        RF.ValidarNumerosYLetras(evt);
        
    }//GEN-LAST:event_CorreoKeyTyped

    private void CorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorreoKeyPressed
        
        RF.ValidarBtnEnterCorreo(evt);
        
    }//GEN-LAST:event_CorreoKeyPressed

    private void AñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñoActionPerformed
        
        RF.HabilitarYDeshabilitarAño();
        
    }//GEN-LAST:event_AñoActionPerformed

    private void ContraseñaOcultaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraseñaOcultaKeyPressed
        
        RF.ValidarBtnEnterContraseñaOculta(evt);
        
    }//GEN-LAST:event_ContraseñaOcultaKeyPressed

    private void ContraseñaOcultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaOcultaMouseClicked
        
        RF.MouseClickContraseñaOculta();
        
    }//GEN-LAST:event_ContraseñaOcultaMouseClicked

    private void MostrarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarContraseñaActionPerformed
        
        RF.VerContraseña();
        
    }//GEN-LAST:event_MostrarContraseñaActionPerformed

    private void ContraseñaOcultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaOcultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaOcultaActionPerformed

    private void ItemCerrarProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCerrarProgramaActionPerformed
        
        dispose();
        
        //RestarContador.RestarContador(Contador);
        
        Contador = Contador - Contador;
        
    }//GEN-LAST:event_ItemCerrarProgramaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        RF.LimpiarRegistro();
                
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        new AyudaRegistrate().setVisible(true);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void FinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarActionPerformed

        if(Aprovado == true){
            
            ValidarBtnSiguiente();
            
        
            JOptionPane.showMessageDialog(null, "Su registro no ha podido ser procesado, debido a que aun faltan alguno/s Dato/s en su registro", "REGISTRO EXITOSO", JOptionPane.INFORMATION_MESSAGE);
        
            //System.out.println("No debe finalizar: "+Aprovado);
            
            
        }else if(Aprovado == false){
          boolean registroExitoso=false;
            try {
                registroExitoso = this.principal.getNegocio().guardarUsuario(this.Nom.getText(), this.Apdo.getText(), this.sacarSexo(), this.ValidarFecha(), this.CorreoCompleto(), validarContraseña(ContraseñaOculta.getPassword()),CargarFotoDelPerfil.getUrlPerfil(),CargarFotoDelPortada.getUrlPortada(),IngresarSlogan.getText(),null,null,null, null );
        
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
            if (registroExitoso) {
              
                JOptionPane.showMessageDialog(null, "Su registro ha sido EXITOSO!\n\nYa puedes iniciar sesión con tu \nCorreo: '"+Correo.getText()+"@"+TipoCorreo.getSelectedItem().toString()+Extencion.getSelectedItem().toString()+"'  y\nContraseña: '"+ContraseñaOculta.getText()+"'", "REGISTRO EXITOSO", JOptionPane.INFORMATION_MESSAGE);
        
                dispose();
        
                MostrarSlogan.setText(""+IngresarSlogan.getText());
        
                Contador = Contador - Contador;
                
                Aprovado = false;
                
                //System.out.println("Si finaliza: "+Aprovado);
        
            }
      
        }
        
    }//GEN-LAST:event_FinalizarActionPerformed

    private String validarContraseña(char[] contra){
        
        String aux="";
        
        for (int i = 0; i < contra.length; i++) {
            
            aux+=contra[i];
            
        }
        
        return aux;
    }
    
    private String ValidarFecha(){
    
        String Fecha = Dia.getSelectedItem().toString()+"/"+Mes.getSelectedItem().toString()+"/"+Año.getSelectedItem().toString();
        
        return Fecha;
    }
    
    private String CorreoCompleto(){
        
        String CC=Correo.getText()+"@"+TipoCorreo.getSelectedItem().toString()+Extencion.getSelectedItem().toString();
    
        return CC;
    }
    
    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        
        Pestañas.setSelectedIndex(0);
        
    }//GEN-LAST:event_VolverActionPerformed

    private void BtnCargarFotoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarFotoPerfilActionPerformed
        
        CargarFotoDelPerfil.CargarFotoDePerfilParaSocial();
        
    }//GEN-LAST:event_BtnCargarFotoPerfilActionPerformed

    private void CargarFotoDePerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarFotoDePerfilMouseClicked
        
        CargarFotoDelPerfil.CargarFotoDePerfilParaSocial();
        
    }//GEN-LAST:event_CargarFotoDePerfilMouseClicked

    private void CargarFotoDePerfilTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarFotoDePerfilTextMouseClicked
        
        CargarFotoDelPerfil.CargarFotoDePerfilParaSocial();
        
    }//GEN-LAST:event_CargarFotoDePerfilTextMouseClicked

    private void BtnCargarFotoPortadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarFotoPortadaActionPerformed
        
        CargarFotoDelPortada.CargarFotoDePortadaParaSocial();
        
    }//GEN-LAST:event_BtnCargarFotoPortadaActionPerformed

    private void CargarFotoDePortadaTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarFotoDePortadaTextMouseClicked
        
        CargarFotoDelPortada.CargarFotoDePortadaParaSocial();
        
    }//GEN-LAST:event_CargarFotoDePortadaTextMouseClicked

    private void CargarFotoDePortadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarFotoDePortadaMouseClicked
        
        CargarFotoDelPortada.CargarFotoDePortadaParaSocial();
        
    }//GEN-LAST:event_CargarFotoDePortadaMouseClicked

    private void IngresarSloganKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IngresarSloganKeyPressed
        
        MostrarSlogan.setText(""+IngresarSlogan.getText());
        
    }//GEN-LAST:event_IngresarSloganKeyPressed

    private void IngresarSloganMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarSloganMouseExited
        
        MostrarSlogan.setText(""+IngresarSlogan.getText());
        
    }//GEN-LAST:event_IngresarSloganMouseExited

    private void IngresarSloganKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IngresarSloganKeyTyped
        
        int CantidadDeCaracteres = 47;
        
        if(IngresarSlogan.getText().length() > CantidadDeCaracteres){
        
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "La cantidad maxima de caracteres que puedes ingresar para tu Slogan es de 48", "LIMITE EXCEDIDO", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
    }//GEN-LAST:event_IngresarSloganKeyTyped

    private void ContraseñaOcultaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaOcultaMouseExited
        
        RF.ValidadCantidadDeContraseñaConMouseFuera(evt);
        
    }//GEN-LAST:event_ContraseñaOcultaMouseExited

    private void ContraseñaOcultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraseñaOcultaKeyTyped
        
        RF.ValidadCantidadDeContraseñaConTeclado(evt);
        
    }//GEN-LAST:event_ContraseñaOcultaKeyTyped

    private void ContraseñaVisibleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaVisibleMouseExited
        
        RF.ValidadCantidadDeContraseñaConMouseFuera(evt);
        
    }//GEN-LAST:event_ContraseñaVisibleMouseExited

    private void ContraseñaVisibleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraseñaVisibleKeyTyped
        
        RF.ValidadCantidadDeContraseñaConTeclado(evt);
        
    }//GEN-LAST:event_ContraseñaVisibleKeyTyped

    private void NomFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NomFocusGained
        
        RF.MouseClickNombre();
        
    }//GEN-LAST:event_NomFocusGained

    private void ApdoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ApdoFocusGained
        
        RF.MouseClickApdo();
        
    }//GEN-LAST:event_ApdoFocusGained

    private void CorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CorreoFocusGained
        
        RF.MouseClickCorreo();
        
    }//GEN-LAST:event_CorreoFocusGained

    private void ContraseñaOcultaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContraseñaOcultaFocusGained
        
        RF.MouseClickContraseñaOculta();
        
    }//GEN-LAST:event_ContraseñaOcultaFocusGained

    private void ContraseñaVisibleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContraseñaVisibleFocusGained
        
        RF.MouseClickContraseñaVisible();
        
    }//GEN-LAST:event_ContraseñaVisibleFocusGained

    
    public void CerrarVentana(){

    try{
    
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                
                Contador = Contador - Contador;
                
                //System.err.println("Reiniciar contador igual a: "+Contador);
                
            }
        });
        
        this.setVisible(true);
    }catch(Exception e){
        e.printStackTrace();
    }

}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apdo;
    private javax.swing.JLabel Apellido;
    private javax.swing.JTextField Arroba;
    private javax.swing.JComboBox<String> Año;
    private javax.swing.JButton BtnCargarFotoPerfil;
    private javax.swing.JButton BtnCargarFotoPortada;
    private javax.swing.JLabel CargarFotoDePerfil;
    private javax.swing.JLabel CargarFotoDePerfilText;
    private javax.swing.JLabel CargarFotoDePortada;
    private javax.swing.JLabel CargarFotoDePortadaText;
    private javax.swing.JPasswordField ContraseñaOculta;
    private javax.swing.JTextField ContraseñaVisible;
    private javax.swing.JTextField Correo;
    private javax.swing.JLabel CorreoElectronico;
    public static javax.swing.JPanel DatosPerfil;
    public static javax.swing.JPanel DatosPersonales;
    private javax.swing.JComboBox<String> Dia;
    public static javax.swing.JLabel Edad;
    private javax.swing.JComboBox<String> Extencion;
    private javax.swing.JLabel FAño;
    private javax.swing.JLabel FDia;
    private javax.swing.JLabel FMes;
    public static javax.swing.JButton Finalizar;
    public static javax.swing.JLabel Foto;
    public static javax.swing.JLabel Genero;
    public static javax.swing.ButtonGroup GeneroGroup;
    private javax.swing.JRadioButton Hombre;
    private javax.swing.JTextField IngresarSlogan;
    public static javax.swing.JMenuItem ItemCerrarPrograma;
    private javax.swing.JMenuBar MenuBarR;
    private javax.swing.JComboBox<String> Mes;
    private javax.swing.JCheckBox MostrarContraseña;
    private javax.swing.JTextField MostrarSlogan;
    private javax.swing.JRadioButton Mujer;
    private javax.swing.JTextField Nom;
    private javax.swing.JLabel Nombre;
    public static javax.swing.JLabel Perfil;
    public static javax.swing.JTabbedPane Pestañas;
    public static javax.swing.JLabel Portada;
    public static javax.swing.JLabel Registro1;
    private javax.swing.JLabel Seguridad;
    public static javax.swing.JButton Siguiente;
    private javax.swing.JLabel SloganTxt;
    private javax.swing.JComboBox<String> TipoCorreo;
    private javax.swing.JLabel Transparente;
    private javax.swing.JLabel ValidarCantidadDeContraseña;
    private javax.swing.JButton Volver;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables

}
