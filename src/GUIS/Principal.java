
package GUIS;

import Clases.Main;
import Clases.Negocio;
import Clases.UsuarioBD;
import static GUIS.IniciarSesion.IniciarSesionBanner;
import static GUIS.Registrarse.Registro1;
import Plegables.AgrandarImagen;
import Plegables.AñadirAdministrador;
import Plegables.ConfigureDB;
import Plegables.ConfigureHost;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Principal extends javax.swing.JFrame {
    
    public static int Contador = 0;
    public static int Contador2 = 0;
    private Negocio negocio;
    
    AgrandarImagen AI = new AgrandarImagen(this, rootPaneCheckingEnabled);
    
    public Negocio getNegocio(){
        return negocio;
    }

    
    
    public void Construccion(){
    
        JOptionPane.showMessageDialog(null, "Esta opcion aun esta en construccion.", "EN CONSTRUCCION", JOptionPane.INFORMATION_MESSAGE);

    }
    
    public Principal() {
        
        super("SocialPOST");
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/SocialPostIcono.png")).getImage());
        initComponents();
        negocio=new Negocio();
        //setSize(800, 800);
        setLocation(250, 15);
        
        //Background
        ImageIcon ImagenBackground = new ImageIcon("src/Imagenes/FondoSocialPOST-Principal.jpg");
        Icon IconoBackground = new ImageIcon(ImagenBackground.getImage().getScaledInstance(Background1.getWidth(), Background1.getHeight(), Image.SCALE_DEFAULT));
        Background1.setIcon(IconoBackground);
        
        //Foto de los Creadores
        ImageIcon CreadorFoto = new ImageIcon("src/Imagenes/Lina&Julian.jpg");
        Icon CF = new ImageIcon(CreadorFoto.getImage().getScaledInstance(Creador.getWidth(), Creador.getHeight(), Image.SCALE_DEFAULT));
        Creador.setIcon(CF);
        
        IniciarSesionBanner.requestFocus();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        CerrarIcon = new javax.swing.JLabel();
        IniciarSesionBanner = new javax.swing.JLabel();
        Registrarse = new javax.swing.JButton();
        IniciarSecion = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        MusicaServicio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Creador = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Background1 = new javax.swing.JLabel();
        MenuBarIS = new javax.swing.JMenuBar();
        Navegacion = new javax.swing.JMenu();
        itemRegistrar = new javax.swing.JMenuItem();
        itemIniciarSesion = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenuItem();
        Vista = new javax.swing.JMenu();
        Presentacion = new javax.swing.JMenuItem();
        Presentacion1 = new javax.swing.JMenuItem();
        Servicios = new javax.swing.JMenu();
        MusicPost = new javax.swing.JMenuItem();
        red = new javax.swing.JMenu();
        Host = new javax.swing.JMenuItem();
        BaseDeDatos = new javax.swing.JMenuItem();
        ComprobarRed = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SocialPOST Portal");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMaximumSize(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelFondo.add(CerrarIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 770, 20));

        IniciarSesionBanner.setBackground(new java.awt.Color(255, 0, 0));
        IniciarSesionBanner.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        IniciarSesionBanner.setForeground(new java.awt.Color(255, 255, 255));
        IniciarSesionBanner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IniciarSesionBanner.setText("SocialPOST");
        IniciarSesionBanner.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 0, 0), new java.awt.Color(255, 51, 51), new java.awt.Color(255, 0, 0), new java.awt.Color(153, 0, 0)));
        IniciarSesionBanner.setOpaque(true);
        PanelFondo.add(IniciarSesionBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 60));

        Registrarse.setBackground(new java.awt.Color(51, 51, 255));
        Registrarse.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        Registrarse.setForeground(new java.awt.Color(255, 255, 255));
        Registrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/formMedium.png"))); // NOI18N
        Registrarse.setText(" Registrarse");
        Registrarse.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Registrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Registrarse.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseActionPerformed(evt);
            }
        });
        PanelFondo.add(Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 250, 70));

        IniciarSecion.setBackground(new java.awt.Color(255, 0, 0));
        IniciarSecion.setFont(new java.awt.Font("Tw Cen MT", 1, 32)); // NOI18N
        IniciarSecion.setForeground(new java.awt.Color(255, 255, 255));
        IniciarSecion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/userMedium.png"))); // NOI18N
        IniciarSecion.setText(" Iniciar Sesión");
        IniciarSecion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        IniciarSecion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        IniciarSecion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        IniciarSecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSecionActionPerformed(evt);
            }
        });
        PanelFondo.add(IniciarSecion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 250, 70));

        Salir.setBackground(new java.awt.Color(255, 153, 0));
        Salir.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/exitMedium.png"))); // NOI18N
        Salir.setText(" Salir");
        Salir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Salir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        PanelFondo.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 250, 70));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MusicPOST");
        PanelFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 150, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("<html>Escucha música dentro de nuestro portal SocialPOST en tu Perfil.</html>");
        PanelFondo.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, 130, 70));

        MusicaServicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MusicaServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/player_play-VeryBig.png"))); // NOI18N
        PanelFondo.add(MusicaServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 140, -1));

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("   Bienvenidos a SocialPOST");
        jLabel1.setOpaque(true);
        PanelFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 440, 40));

        jLabel4.setBackground(new java.awt.Color(51, 102, 255));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Requisitos de la Plataforma   ");
        jLabel4.setOpaque(true);
        PanelFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 430, 40));

        jLabel2.setBackground(new java.awt.Color(0, 204, 0));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("   Equipo Desarrollador");
        jLabel2.setOpaque(true);
        PanelFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 430, 40));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Otros Servicios");
        jLabel3.setOpaque(true);
        PanelFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 310, 50));

        Creador.setBackground(new java.awt.Color(255, 255, 255));
        Creador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Creador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Creador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lina&Julian.jpg"))); // NOI18N
        Creador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Creador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CreadorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CreadorMouseExited(evt);
            }
        });
        PanelFondo.add(Creador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 80, 80));

        jLabel14.setBackground(new java.awt.Color(255, 102, 51));
        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("   Juan Sanchez - SA");
        jLabel14.setOpaque(true);
        PanelFondo.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 560, 270, 20));

        jLabel6.setBackground(new java.awt.Color(204, 0, 255));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("   Desarrollo de software independiete");
        jLabel6.setOpaque(true);
        PanelFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 250, 20));

        jLabel7.setBackground(new java.awt.Color(102, 102, 255));
        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("   Julian Sequeda - EK");
        jLabel7.setOpaque(true);
        PanelFondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 290, 20));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("<html><p align=\"justify\">Nuestros requisitos para ser parte de SocialPOST son simples:  <br><br>Solo debes de registrarte con tus datos personales y opcio- nalmente una foto de Perfil, una de Portada y un Slogan.  y listo, ya puedes empezar a POSTEAR a tu gusto.</p></html>");
        jLabel8.setOpaque(true);
        PanelFondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 400, 100));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel9.setText("<html><p align=\"justify\">SocialPOST es una red social creada especialmente para  compartir POSTEOS en nuestra comunidad.  <br><br>Teniendo la posibilidad de compartir cualquier tipo de informa- ción, incluyendo: texto, imagenes y canciones por el momento.</p></html>");
        jLabel9.setOpaque(true);
        PanelFondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 410, 100));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel11.setOpaque(true);
        PanelFondo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 430, 100));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel10.setOpaque(true);
        PanelFondo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 420, 100));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("PORTAL");
        jLabel12.setOpaque(true);
        PanelFondo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 310, 50));

        jLabel13.setBackground(new java.awt.Color(102, 102, 102));
        jLabel13.setOpaque(true);
        PanelFondo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 310, 170));

        Background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoSocialPOST-Principal.jpg"))); // NOI18N
        PanelFondo.add(Background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 310, 390));

        getContentPane().add(PanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 640));

        MenuBarIS.setBackground(new java.awt.Color(0, 0, 0));
        MenuBarIS.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        MenuBarIS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Navegacion.setBackground(new java.awt.Color(0, 0, 0));
        Navegacion.setForeground(new java.awt.Color(255, 255, 255));
        Navegacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Config.png"))); // NOI18N
        Navegacion.setText("Navegación");
        Navegacion.setBorderPainted(true);
        Navegacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        itemRegistrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, 0));
        itemRegistrar.setBackground(new java.awt.Color(102, 102, 102));
        itemRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        itemRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/form.png"))); // NOI18N
        itemRegistrar.setText("Registrarse");
        itemRegistrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemRegistrar.setBorderPainted(true);
        itemRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        itemRegistrar.setOpaque(true);
        itemRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarActionPerformed(evt);
            }
        });
        Navegacion.add(itemRegistrar);

        itemIniciarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, 0));
        itemIniciarSesion.setBackground(new java.awt.Color(102, 102, 102));
        itemIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        itemIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/User.png"))); // NOI18N
        itemIniciarSesion.setText("Iniciar Sesion");
        itemIniciarSesion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemIniciarSesion.setBorderPainted(true);
        itemIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        itemIniciarSesion.setOpaque(true);
        itemIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIniciarSesionActionPerformed(evt);
            }
        });
        Navegacion.add(itemIniciarSesion);

        itemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        itemSalir.setBackground(new java.awt.Color(102, 102, 102));
        itemSalir.setForeground(new java.awt.Color(255, 255, 255));
        itemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/exit.png"))); // NOI18N
        itemSalir.setText("Salir");
        itemSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemSalir.setBorderPainted(true);
        itemSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        itemSalir.setOpaque(true);
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        Navegacion.add(itemSalir);

        MenuBarIS.add(Navegacion);

        Vista.setForeground(new java.awt.Color(255, 255, 255));
        Vista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eye.png"))); // NOI18N
        Vista.setText("Vista");
        Vista.setBorderPainted(true);
        Vista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Presentacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ADD, 0));
        Presentacion.setBackground(new java.awt.Color(102, 102, 102));
        Presentacion.setForeground(new java.awt.Color(255, 255, 255));
        Presentacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/window_fullscreen.png"))); // NOI18N
        Presentacion.setText("Presentación");
        Presentacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Presentacion.setBorderPainted(true);
        Presentacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Presentacion.setOpaque(true);
        Presentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresentacionActionPerformed(evt);
            }
        });
        Vista.add(Presentacion);

        Presentacion1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SUBTRACT, 0));
        Presentacion1.setBackground(new java.awt.Color(102, 102, 102));
        Presentacion1.setForeground(new java.awt.Color(255, 255, 255));
        Presentacion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/2.png"))); // NOI18N
        Presentacion1.setText("Portal");
        Presentacion1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Presentacion1.setBorderPainted(true);
        Presentacion1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Presentacion1.setOpaque(true);
        Presentacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Presentacion1ActionPerformed(evt);
            }
        });
        Vista.add(Presentacion1);

        MenuBarIS.add(Vista);

        Servicios.setForeground(new java.awt.Color(255, 255, 255));
        Servicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/service.png"))); // NOI18N
        Servicios.setText("Servicios");
        Servicios.setBorderPainted(true);
        Servicios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        MusicPost.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, 0));
        MusicPost.setBackground(new java.awt.Color(102, 102, 102));
        MusicPost.setForeground(new java.awt.Color(255, 255, 255));
        MusicPost.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/player_play-Small.png"))); // NOI18N
        MusicPost.setText("MusicPOST");
        MusicPost.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MusicPost.setBorderPainted(true);
        MusicPost.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MusicPost.setOpaque(true);
        MusicPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusicPostActionPerformed(evt);
            }
        });
        Servicios.add(MusicPost);

        MenuBarIS.add(Servicios);

        red.setForeground(new java.awt.Color(255, 255, 255));
        red.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/www.png"))); // NOI18N
        red.setText("Red");
        red.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Host.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, 0));
        Host.setBackground(new java.awt.Color(102, 102, 102));
        Host.setForeground(new java.awt.Color(255, 255, 255));
        Host.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/code.png"))); // NOI18N
        Host.setText("Configurar Host");
        Host.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Host.setBorderPainted(true);
        Host.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Host.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HostActionPerformed(evt);
            }
        });
        red.add(Host);

        BaseDeDatos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, 0));
        BaseDeDatos.setBackground(new java.awt.Color(102, 102, 102));
        BaseDeDatos.setForeground(new java.awt.Color(255, 255, 255));
        BaseDeDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/code.png"))); // NOI18N
        BaseDeDatos.setText("Config. Base de Datos");
        BaseDeDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BaseDeDatos.setBorderPainted(true);
        BaseDeDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BaseDeDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaseDeDatosActionPerformed(evt);
            }
        });
        red.add(BaseDeDatos);

        ComprobarRed.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, 0));
        ComprobarRed.setBackground(new java.awt.Color(102, 102, 102));
        ComprobarRed.setForeground(new java.awt.Color(255, 255, 255));
        ComprobarRed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/internet_connection_small.png"))); // NOI18N
        ComprobarRed.setText("Comprobar Conexion");
        ComprobarRed.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ComprobarRed.setBorderPainted(true);
        ComprobarRed.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ComprobarRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprobarRedActionPerformed(evt);
            }
        });
        red.add(ComprobarRed);

        MenuBarIS.add(red);

        setJMenuBar(MenuBarIS);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseActionPerformed
        UsuarioBD ubd = new UsuarioBD(rootPaneCheckingEnabled);
        if (ubd.ComprobarConexion() != null) {

            Contador = Contador + 1;

            //System.out.println("Resultado de Contador: "+Contador);
            if (Contador == 1) {

                new Registrarse(this).setVisible(true);

            } else if (Contador > 1) {

                JOptionPane.showMessageDialog(null, "Esta ventana ya se encuentra abierta.");

            }

            Registro1.requestFocus();

        } else {
            SinConexion();
        }
        
    }//GEN-LAST:event_RegistrarseActionPerformed

    
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_SalirActionPerformed

    private void IniciarSecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSecionActionPerformed
        UsuarioBD ubd = new UsuarioBD(rootPaneCheckingEnabled);
        if (ubd.ComprobarConexion() != null) {

            Contador2 = Contador2 + 1;

            if (Contador2 == 1) {

                new IniciarSesion(this).setVisible(true);

            } else if (Contador2 > 1) {

                JOptionPane.showMessageDialog(null, "Esta ventana ya se encuentra abierta.");

            }

            Registro1.requestFocus();

        } else {
            SinConexion();
        }

        
    }//GEN-LAST:event_IniciarSecionActionPerformed

    private void itemRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarActionPerformed

        Contador = Contador+1;
        
        //System.out.println("Resultado de Contador: "+Contador);
        
        if(Contador == 1){
        
            new Registrarse(this).setVisible(true);
        
        }else if(Contador > 1){
        
            JOptionPane.showMessageDialog(null, "Esta ventana ya se encuentra abierta.");
        
        } 
        
        Registro1.requestFocus();
        
    }//GEN-LAST:event_itemRegistrarActionPerformed

    private void itemIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIniciarSesionActionPerformed

        Contador2 = Contador2+1;
        
        if(Contador2 == 1){

            new IniciarSesion(this).setVisible(true);
        
        }else if(Contador2 > 1){
        
            JOptionPane.showMessageDialog(null, "Esta ventana ya se encuentra abierta.");
        
        } 
        
        //Registro1.requestFocus();
        
    }//GEN-LAST:event_itemIniciarSesionActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_itemSalirActionPerformed

    private void PresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PresentacionActionPerformed
        
        JOptionPane.showMessageDialog(null, "Ya te encuentras en el modo de Presentación.", "?", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_PresentacionActionPerformed

    private void Presentacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Presentacion1ActionPerformed
        /*
        PrincipalSmall Portal = new PrincipalSmall();
        Portal.setVisible(true);*/
        
        new PrincipalSmall().setVisible(true);
        
        dispose();

        
        //JOptionPane.showMessageDialog(null, "Esta opcion estara disponible solamente en futuras versiones de SocialPOST", "PROXIMAMENTE", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_Presentacion1ActionPerformed

    private void CreadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreadorMouseEntered

        AI.setVisible(true);
        
    }//GEN-LAST:event_CreadorMouseEntered

    private void CreadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreadorMouseExited
        
        AI.dispose();
        
    }//GEN-LAST:event_CreadorMouseExited

    private void MusicPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusicPostActionPerformed
        
        JOptionPane.showMessageDialog(null, "Esta opcion estara disponible solamente en futuras versiones de SocialPOST", "PROXIMAMENTE", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_MusicPostActionPerformed

    private void HostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HostActionPerformed
        
        ConfigureHost hc = new ConfigureHost(this, rootPaneCheckingEnabled);
        hc.setVisible(true);

        //JOptionPane.showMessageDialog(null, "Esta ventana ya se encuentra abierta.");
        
    }//GEN-LAST:event_HostActionPerformed

    private void ComprobarRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprobarRedActionPerformed
        UsuarioBD ubd = new UsuarioBD(rootPaneCheckingEnabled);
        if (ubd.ComprobarConexion() != null) {
            ConConexion();
        }else{
            SinConexion();
        }
        
    }//GEN-LAST:event_ComprobarRedActionPerformed

    private void BaseDeDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaseDeDatosActionPerformed
        
        ConfigureDB dbc = new ConfigureDB(this, rootPaneCheckingEnabled);
        dbc.setVisible(true);
        
    }//GEN-LAST:event_BaseDeDatosActionPerformed

    public void ConConexion() {
        JOptionPane.showMessageDialog(null, "Conexion establecida con el servidor.", "Conexion EXITOSA!", JOptionPane.INFORMATION_MESSAGE);

    }

    public void SinConexion() {
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar conectar con el servidor.", "ERROR de Conexion!", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Verifique que el xampp este encendido, haber cargado la base de datos \nal localhost y que los parametros del host sean los correctos.", "Compruebe su conexion", JOptionPane.INFORMATION_MESSAGE);

    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background1;
    private javax.swing.JMenuItem BaseDeDatos;
    private javax.swing.JLabel CerrarIcon;
    private javax.swing.JMenuItem ComprobarRed;
    public static javax.swing.JLabel Creador;
    private javax.swing.JMenuItem Host;
    public static javax.swing.JButton IniciarSecion;
    public static javax.swing.JLabel IniciarSesionBanner;
    private javax.swing.JMenuBar MenuBarIS;
    private javax.swing.JMenuItem MusicPost;
    private javax.swing.JLabel MusicaServicio;
    private javax.swing.JMenu Navegacion;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JMenuItem Presentacion;
    private javax.swing.JMenuItem Presentacion1;
    public static javax.swing.JButton Registrarse;
    public static javax.swing.JButton Salir;
    private javax.swing.JMenu Servicios;
    private javax.swing.JMenu Vista;
    public static javax.swing.JMenuItem itemIniciarSesion;
    private javax.swing.JMenuItem itemRegistrar;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu red;
    // End of variables declaration//GEN-END:variables
}
