
package GUIS;

import Clases.Negocio;
import static GUIS.Principal.Contador;
import static GUIS.Principal.Contador2;
import static GUIS.Principal.IniciarSesionBanner;
import static GUIS.Registrarse.Registro1;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PrincipalSmall extends javax.swing.JFrame {
    
    private Negocio negocio;
    
    public Negocio getNegocio(){
        return negocio;
    }

    
    public void Construccion(){
    
        JOptionPane.showMessageDialog(null, "Esta opcion aun esta en construccion.", "EN CONSTRUCCION", JOptionPane.INFORMATION_MESSAGE);

    }
    
    public PrincipalSmall() {
        
        super("SocialPOST");
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/SocialPostIcono.png")).getImage());
        initComponents();
        setLocation(80, 40);
        negocio=new Negocio();
        
        //Background
        ImageIcon ImagenBackground = new ImageIcon("src/Imagenes/FondoSocialPOST-Principal.jpg");
        Icon IconoBackground = new ImageIcon(ImagenBackground.getImage().getScaledInstance(Background1.getWidth(), Background1.getHeight(), Image.SCALE_DEFAULT));
        Background1.setIcon(IconoBackground);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        IniciarSecion = new javax.swing.JButton();
        Registrarse = new javax.swing.JButton();
        PortadaSocialPOST = new javax.swing.JLabel();
        CerrarIcon = new javax.swing.JLabel();
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
        Presentacion2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SocialPOST Portal");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setBackground(new java.awt.Color(255, 153, 0));
        Salir.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/exit.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        PanelPrincipal.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 190, 30));

        IniciarSecion.setBackground(new java.awt.Color(255, 0, 0));
        IniciarSecion.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        IniciarSecion.setForeground(new java.awt.Color(255, 255, 255));
        IniciarSecion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/User.png"))); // NOI18N
        IniciarSecion.setText("Iniciar Sesión");
        IniciarSecion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        IniciarSecion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IniciarSecion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        IniciarSecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSecionActionPerformed(evt);
            }
        });
        PanelPrincipal.add(IniciarSecion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 190, 30));

        Registrarse.setBackground(new java.awt.Color(51, 51, 255));
        Registrarse.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Registrarse.setForeground(new java.awt.Color(255, 255, 255));
        Registrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/form.png"))); // NOI18N
        Registrarse.setText("Registrarse");
        Registrarse.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Registrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registrarse.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseActionPerformed(evt);
            }
        });
        PanelPrincipal.add(Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 190, 30));

        PortadaSocialPOST.setBackground(new java.awt.Color(255, 0, 0));
        PortadaSocialPOST.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        PortadaSocialPOST.setForeground(new java.awt.Color(255, 255, 255));
        PortadaSocialPOST.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PortadaSocialPOST.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoSocialPOST.png"))); // NOI18N
        PortadaSocialPOST.setToolTipText("SocialPOST");
        PanelPrincipal.add(PortadaSocialPOST, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 40));
        PanelPrincipal.add(CerrarIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 250, 20));

        Background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoSocialPOST-Principal.jpg"))); // NOI18N
        PanelPrincipal.add(Background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 250, 220));

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 260));

        MenuBarIS.setBackground(new java.awt.Color(0, 0, 0));
        MenuBarIS.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        MenuBarIS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Navegacion.setBackground(new java.awt.Color(0, 0, 0));
        Navegacion.setForeground(new java.awt.Color(255, 255, 255));
        Navegacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Config.png"))); // NOI18N
        Navegacion.setText("Navegación");
        Navegacion.setBorderPainted(true);

        itemRegistrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, 0));
        itemRegistrar.setBackground(new java.awt.Color(102, 102, 102));
        itemRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        itemRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/form.png"))); // NOI18N
        itemRegistrar.setText("Registrarse");
        itemRegistrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemRegistrar.setBorderPainted(true);
        itemRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        itemIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        itemSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        Presentacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ADD, 0));
        Presentacion.setBackground(new java.awt.Color(102, 102, 102));
        Presentacion.setForeground(new java.awt.Color(255, 255, 255));
        Presentacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/window_fullscreen.png"))); // NOI18N
        Presentacion.setText("Presentación");
        Presentacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Presentacion.setBorderPainted(true);
        Presentacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        Presentacion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        Presentacion2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, 0));
        Presentacion2.setBackground(new java.awt.Color(102, 102, 102));
        Presentacion2.setForeground(new java.awt.Color(255, 255, 255));
        Presentacion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/player_play-Small.png"))); // NOI18N
        Presentacion2.setText("MusicPOST");
        Presentacion2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Presentacion2.setBorderPainted(true);
        Presentacion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Presentacion2.setOpaque(true);
        Presentacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Presentacion2ActionPerformed(evt);
            }
        });
        Servicios.add(Presentacion2);

        MenuBarIS.add(Servicios);

        setJMenuBar(MenuBarIS);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseActionPerformed

        Contador = Contador+1;
        
        //System.out.println("Resultado de Contador: "+Contador);
        
        if(Contador == 1){
        
            Registrarse Re = new Registrarse();
            Re.setVisible(true);
        
        }else if(Contador > 1){
        
            JOptionPane.showMessageDialog(null, "Esta ventana ya se encuentra abierta.");
        
        } 
        
        Registro1.requestFocus();
        
    }//GEN-LAST:event_RegistrarseActionPerformed

    
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_SalirActionPerformed

    private void IniciarSecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSecionActionPerformed
        
        Contador2 = Contador2+1;
        
        System.out.println("Resultado de Contador: "+Contador2);
        
        if(Contador2 == 1){
        
            IniciarSesion IS = new IniciarSesion();
            IS.setVisible(true);
            
            IniciarSesionBanner.requestFocus();
        
        }else if(Contador2 > 1){
        
            JOptionPane.showMessageDialog(null, "Esta ventana ya se encuentra abierta.");
        
        } 
        
        //Registro1.requestFocus();
        
    }//GEN-LAST:event_IniciarSecionActionPerformed

    private void itemRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarActionPerformed

        Contador = Contador+1;

        //System.out.println("Resultado de Contador: "+Contador);

        if(Contador == 1){

            Registrarse AbrirRegistrarse = new Registrarse();
            AbrirRegistrarse.setVisible(true);

        }else if(Contador > 1){

            JOptionPane.showMessageDialog(null, "Esta ventana ya se encuentra abierta.");

        }

        Registro1.requestFocus();

    }//GEN-LAST:event_itemRegistrarActionPerformed

    private void itemIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIniciarSesionActionPerformed

        Contador2 = Contador2+1;

        if(Contador2 == 1){

            IniciarSesion AbrirIniciarSesion = new IniciarSesion();
            AbrirIniciarSesion.setVisible(true);

        }else if(Contador2 > 1){

            JOptionPane.showMessageDialog(null, "Esta ventana ya se encuentra abierta.");

        }

        //Registro1.requestFocus();

    }//GEN-LAST:event_itemIniciarSesionActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed

        System.exit(0);

    }//GEN-LAST:event_itemSalirActionPerformed

    private void PresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PresentacionActionPerformed
        
        Principal Presentacion = new Principal();
        Presentacion.setVisible(true);

        dispose();
        
    }//GEN-LAST:event_PresentacionActionPerformed

    private void Presentacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Presentacion1ActionPerformed

        JOptionPane.showMessageDialog(null, "Ya te encuentras en el modo de Portal.", "?", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_Presentacion1ActionPerformed

    private void Presentacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Presentacion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Presentacion2ActionPerformed


   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background1;
    private javax.swing.JLabel CerrarIcon;
    public static javax.swing.JButton IniciarSecion;
    private javax.swing.JMenuBar MenuBarIS;
    private javax.swing.JMenu Navegacion;
    private javax.swing.JPanel PanelPrincipal;
    public static javax.swing.JLabel PortadaSocialPOST;
    private javax.swing.JMenuItem Presentacion;
    private javax.swing.JMenuItem Presentacion1;
    private javax.swing.JMenuItem Presentacion2;
    public static javax.swing.JButton Registrarse;
    public static javax.swing.JButton Salir;
    private javax.swing.JMenu Servicios;
    private javax.swing.JMenu Vista;
    public static javax.swing.JMenuItem itemIniciarSesion;
    private javax.swing.JMenuItem itemRegistrar;
    private javax.swing.JMenuItem itemSalir;
    // End of variables declaration//GEN-END:variables
}
