
package GUIS;

import Ayuda.CuentaDeAdmin;
import Clases.FuncionesInicioDeSesion;
import static Clases.RegistrarseFunciones.Caracteres;
import static Clases.RegistrarseFunciones.Entrar;
import static GUIS.Principal.Contador;
import static GUIS.Principal.Contador2;
import UsuariosSocialPOST.Administrador;
import UsuariosSocialPOST.Usuario;
import static UsuariosSocialPOST.Usuario.NombreUE;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class IniciarSesion extends javax.swing.JFrame {

    FuncionesInicioDeSesion CambiarIconoUser ;
    
    FuncionesInicioDeSesion LimpiarF = new FuncionesInicioDeSesion(this);
    
    FuncionesInicioDeSesion VerContra = new FuncionesInicioDeSesion(this);
    
    FuncionesInicioDeSesion ValidarUC;
    
    
    private Principal principal;

    IniciarSesion() {

    }

    
    public Principal getPrincipal(){
        
        return principal;
        
    }
    
    
    public IniciarSesion(Principal principal) {
        
        super("Sesion Iniciada");
        setResizable(false);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Iconos/User.png")).getImage());
        CambiarIconoUser= new FuncionesInicioDeSesion(this);
        this.principal=principal;
        CambiarIconoUser = new FuncionesInicioDeSesion(this);
        ValidarUC = new FuncionesInicioDeSesion(this);
        setLocationRelativeTo(this);
        
        CerrarVentana2();
                
    }

    
    public IniciarSesion(JLabel Contraseña2, JButton EntrarAInicarSesion, JLabel IconoDeTipoDeUsuario, JTextField IngresarContraseña, JTextField IngresarCorreo, JPasswordField IngresarPassword, JLabel IniciarSesionBanner, JLabel TipoDU, JComboBox<String> TipoDeCuentaUser, JCheckBox VerContraseña, JLabel correo2, JPanel jPanel1) {
        
        this.Contraseña2 = Contraseña2;
        this.EntrarAInicarSesion = EntrarAInicarSesion;
        this.IconoDeTipoDeUsuario = IconoDeTipoDeUsuario;
        this.IngresarContraseña = IngresarContraseña;
        this.IngresarCorreo = IngresarCorreo;
        this.IngresarPassword = IngresarPassword;
        this.IniciarSesionBanner = IniciarSesionBanner;
        this.TipoDU = TipoDU;
        this.TipoDeCuentaUser = TipoDeCuentaUser;
        this.VerContraseña = VerContraseña;
        this.correo2 = correo2;
        this.jPanel1 = jPanel1;
        
    }

    public JLabel getContraseña2() {
        return Contraseña2;
    }

    public void setContraseña2(JLabel Contraseña2) {
        this.Contraseña2 = Contraseña2;
    }

    public JButton getEntrarAInicarSesion() {
        return EntrarAInicarSesion;
    }

    public void setEntrarAInicarSesion(JButton EntrarAInicarSesion) {
        this.EntrarAInicarSesion = EntrarAInicarSesion;
    }

    public JLabel getIconoDeTipoDeUsuario() {
        return IconoDeTipoDeUsuario;
    }

    public void setIconoDeTipoDeUsuario(JLabel IconoDeTipoDeUsuario) {
        this.IconoDeTipoDeUsuario = IconoDeTipoDeUsuario;
    }

    public JTextField getIngresarContraseña() {
        return IngresarContraseña;
    }

    public void setIngresarContraseña(JTextField IngresarContraseña) {
        this.IngresarContraseña = IngresarContraseña;
    }

    public JTextField getIngresarCorreo() {
        return IngresarCorreo;
    }

    public void setIngresarCorreo(JTextField IngresarCorreo) {
        this.IngresarCorreo = IngresarCorreo;
    }

    public JPasswordField getIngresarPassword() {
        return IngresarPassword;
    }

    public void setIngresarPassword(JPasswordField IngresarPassword) {
        this.IngresarPassword = IngresarPassword;
    }

    public JLabel getIniciarSesionBanner() {
        return IniciarSesionBanner;
    }

    public void setIniciarSesionBanner(JLabel IniciarSesionBanner) {
        this.IniciarSesionBanner = IniciarSesionBanner;
    }

    public JLabel getTipoDU() {
        return TipoDU;
    }

    public void setTipoDU(JLabel TipoDU) {
        this.TipoDU = TipoDU;
    }

    public JComboBox<String> getTipoDeCuentaUser() {
        return TipoDeCuentaUser;
    }

    public void setTipoDeCuentaUser(JComboBox<String> TipoDeCuentaUser) {
        this.TipoDeCuentaUser = TipoDeCuentaUser;
    }

    public JCheckBox getVerContraseña() {
        return VerContraseña;
    }

    public void setVerContraseña(JCheckBox VerContraseña) {
        this.VerContraseña = VerContraseña;
    }

    public JLabel getCorreo2() {
        return correo2;
    }

    public void setCorreo2(JLabel correo2) {
        this.correo2 = correo2;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        EntrarAInicarSesion = new javax.swing.JButton();
        VerContraseña = new javax.swing.JCheckBox();
        IngresarPassword = new javax.swing.JPasswordField();
        IngresarContraseña = new javax.swing.JTextField();
        IngresarCorreo = new javax.swing.JTextField();
        correo2 = new javax.swing.JLabel();
        Contraseña2 = new javax.swing.JLabel();
        TipoDeCuentaUser = new javax.swing.JComboBox<>();
        IconoDeTipoDeUsuario = new javax.swing.JLabel();
        TipoDU = new javax.swing.JLabel();
        IniciarSesionBanner = new javax.swing.JLabel();
        Transparente = new javax.swing.JLabel();
        MenuBarIS = new javax.swing.JMenuBar();
        ItemHerramientas = new javax.swing.JMenu();
        itemLimpiarFormularioU = new javax.swing.JMenuItem();
        ItemCerrarProgramaU = new javax.swing.JMenuItem();
        ItemCuenta = new javax.swing.JMenu();
        ElegirAdministrador = new javax.swing.JMenuItem();
        ElegirUsuario = new javax.swing.JMenuItem();
        ElegirIncognito = new javax.swing.JMenuItem();
        AyudaU = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EntrarAInicarSesion.setBackground(new java.awt.Color(0, 204, 0));
        EntrarAInicarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EntrarAInicarSesion.setForeground(new java.awt.Color(255, 255, 255));
        EntrarAInicarSesion.setText("Entrar");
        EntrarAInicarSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 153, 0), new java.awt.Color(0, 255, 0), new java.awt.Color(0, 204, 51), new java.awt.Color(0, 204, 0)));
        EntrarAInicarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EntrarAInicarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarAInicarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(EntrarAInicarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 231, 70, 30));

        VerContraseña.setText("Ver Contraseña");
        VerContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VerContraseña.setOpaque(false);
        VerContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(VerContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        IngresarPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        IngresarPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IngresarPasswordKeyPressed(evt);
            }
        });
        jPanel1.add(IngresarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 210, -1));

        IngresarContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IngresarContraseñaKeyPressed(evt);
            }
        });
        jPanel1.add(IngresarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 210, -1));

        IngresarCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        IngresarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarCorreoActionPerformed(evt);
            }
        });
        IngresarCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IngresarCorreoKeyPressed(evt);
            }
        });
        jPanel1.add(IngresarCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 210, -1));

        correo2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        correo2.setText(" Correo:");
        jPanel1.add(correo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 50, 20));

        Contraseña2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Contraseña2.setText("Contraseña:");
        jPanel1.add(Contraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 150, 70, 20));

        TipoDeCuentaUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario", "Incognito" }));
        TipoDeCuentaUser.setSelectedIndex(1);
        TipoDeCuentaUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TipoDeCuentaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoDeCuentaUserActionPerformed(evt);
            }
        });
        jPanel1.add(TipoDeCuentaUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        IconoDeTipoDeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconoDeTipoDeUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/TradicionalUser-BigIcon.png"))); // NOI18N
        jPanel1.add(IconoDeTipoDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, 100));

        TipoDU.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        TipoDU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TipoDU.setText("Usuario");
        jPanel1.add(TipoDU, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, -1));

        IniciarSesionBanner.setBackground(new java.awt.Color(255, 0, 0));
        IniciarSesionBanner.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        IniciarSesionBanner.setForeground(new java.awt.Color(255, 255, 255));
        IniciarSesionBanner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IniciarSesionBanner.setText("Iniciar Sesion");
        IniciarSesionBanner.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 0, 0), new java.awt.Color(255, 51, 51), new java.awt.Color(255, 0, 0), new java.awt.Color(153, 0, 0)));
        IniciarSesionBanner.setOpaque(true);
        jPanel1.add(IniciarSesionBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 60));
        jPanel1.add(Transparente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 480, 20));

        MenuBarIS.setBackground(new java.awt.Color(0, 0, 0));
        MenuBarIS.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        MenuBarIS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ItemHerramientas.setBackground(new java.awt.Color(102, 102, 102));
        ItemHerramientas.setForeground(new java.awt.Color(255, 255, 255));
        ItemHerramientas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Tools.png"))); // NOI18N
        ItemHerramientas.setText("Herramientas");
        ItemHerramientas.setBorderPainted(true);
        ItemHerramientas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        itemLimpiarFormularioU.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        itemLimpiarFormularioU.setBackground(new java.awt.Color(102, 102, 102));
        itemLimpiarFormularioU.setForeground(new java.awt.Color(255, 255, 255));
        itemLimpiarFormularioU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Clear.png"))); // NOI18N
        itemLimpiarFormularioU.setText("Limpiar Formulario");
        itemLimpiarFormularioU.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemLimpiarFormularioU.setBorderPainted(true);
        itemLimpiarFormularioU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemLimpiarFormularioU.setOpaque(true);
        itemLimpiarFormularioU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLimpiarFormularioUActionPerformed(evt);
            }
        });
        ItemHerramientas.add(itemLimpiarFormularioU);

        ItemCerrarProgramaU.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        ItemCerrarProgramaU.setBackground(new java.awt.Color(102, 102, 102));
        ItemCerrarProgramaU.setForeground(new java.awt.Color(255, 255, 255));
        ItemCerrarProgramaU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/CerrarVentana.png"))); // NOI18N
        ItemCerrarProgramaU.setText("Cerrar");
        ItemCerrarProgramaU.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ItemCerrarProgramaU.setBorderPainted(true);
        ItemCerrarProgramaU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ItemCerrarProgramaU.setOpaque(true);
        ItemCerrarProgramaU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCerrarProgramaUActionPerformed(evt);
            }
        });
        ItemHerramientas.add(ItemCerrarProgramaU);

        MenuBarIS.add(ItemHerramientas);

        ItemCuenta.setBackground(new java.awt.Color(102, 102, 102));
        ItemCuenta.setForeground(new java.awt.Color(255, 255, 255));
        ItemCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/User.png"))); // NOI18N
        ItemCuenta.setText("Tipo de Cuenta");
        ItemCuenta.setBorderPainted(true);
        ItemCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ElegirAdministrador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));
        ElegirAdministrador.setBackground(new java.awt.Color(102, 102, 102));
        ElegirAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        ElegirAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/admin.png"))); // NOI18N
        ElegirAdministrador.setText("Administrador");
        ElegirAdministrador.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ElegirAdministrador.setBorderPainted(true);
        ElegirAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ElegirAdministrador.setOpaque(true);
        ElegirAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElegirAdministradorActionPerformed(evt);
            }
        });
        ItemCuenta.add(ElegirAdministrador);

        ElegirUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK));
        ElegirUsuario.setBackground(new java.awt.Color(102, 102, 102));
        ElegirUsuario.setForeground(new java.awt.Color(255, 255, 255));
        ElegirUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/TradicionalUser.png"))); // NOI18N
        ElegirUsuario.setText("Usuario");
        ElegirUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ElegirUsuario.setBorderPainted(true);
        ElegirUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ElegirUsuario.setOpaque(true);
        ElegirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElegirUsuarioActionPerformed(evt);
            }
        });
        ItemCuenta.add(ElegirUsuario);

        ElegirIncognito.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_MASK));
        ElegirIncognito.setBackground(new java.awt.Color(102, 102, 102));
        ElegirIncognito.setForeground(new java.awt.Color(255, 255, 255));
        ElegirIncognito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/incognito.png"))); // NOI18N
        ElegirIncognito.setText("Incognito");
        ElegirIncognito.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ElegirIncognito.setBorderPainted(true);
        ElegirIncognito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ElegirIncognito.setOpaque(true);
        ElegirIncognito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElegirIncognitoActionPerformed(evt);
            }
        });
        ItemCuenta.add(ElegirIncognito);

        MenuBarIS.add(ItemCuenta);

        AyudaU.setForeground(new java.awt.Color(255, 255, 255));
        AyudaU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Help.png"))); // NOI18N
        AyudaU.setText("Ayuda");
        AyudaU.setBorderPainted(true);
        AyudaU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem2.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/admin.png"))); // NOI18N
        jMenuItem2.setText("Administrador Cuenta");
        jMenuItem2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuItem2.setBorderPainted(true);
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.setOpaque(true);
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        AyudaU.add(jMenuItem2);

        MenuBarIS.add(AyudaU);

        setJMenuBar(MenuBarIS);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarCorreoActionPerformed

    private void EntrarAInicarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarAInicarSesionActionPerformed
        
        ValidarUC.IngresarComoUsuario();
        
    }//GEN-LAST:event_EntrarAInicarSesionActionPerformed
    
    public void ValidarAdmin(){
    
        new Administrador(this).setVisible(true);
    
    }
    
    public void ValidarUsuario(){
        
        if (validarContraseña(IngresarPassword.getPassword()).isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Por favor ingrese su respectiva contraseña");
            
            return;
            
        }
        
       boolean ExisteUsuario = this.principal.getNegocio().ingresarUsuario (  IngresarCorreo.getText()    , validarContraseña(IngresarPassword.getPassword()));
        
       if (ExisteUsuario) {
           
            new Usuario(this).setVisible(true);
            
            setVisible(false);
            
            //Usuario usu = new Usuario(this);
            
            //usu.setVisible(true);
            
            principal.setVisible(false);
            
            String[] ArregloConvertido = principal.getNegocio().datosDelLogeado();
            
            JOptionPane.showMessageDialog(null, "Bienvenid@ "+ArregloConvertido[0]+" "+ArregloConvertido[1], "SESION INICIADA", JOptionPane.INFORMATION_MESSAGE);
            
        }else{
           
           JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA INCORRECTA ");
           
       }
       
    }
    
    public String validarContraseña(char[] contra){
        
        String aux="";
        
        for (int i = 0; i < contra.length; i++) {
            
            aux+=contra[i];
            
        }
        
        return aux;
    }
    
    private void TipoDeCuentaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoDeCuentaUserActionPerformed
        
        
        CambiarIconoUser.CambiarTipoDeUsuarioIcono();
        
    }//GEN-LAST:event_TipoDeCuentaUserActionPerformed

    private void itemLimpiarFormularioUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLimpiarFormularioUActionPerformed

        LimpiarF.LimpiarFormulario();

    }//GEN-LAST:event_itemLimpiarFormularioUActionPerformed

    private void ItemCerrarProgramaUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCerrarProgramaUActionPerformed

        dispose();

        //RestarContador.RestarContador(Contador);

        Contador2 = Contador2 - Contador2;

    }//GEN-LAST:event_ItemCerrarProgramaUActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        CuentaDeAdmin dialogg = new CuentaDeAdmin(this, rootPaneCheckingEnabled);
        
        dialogg.setVisible(true);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void VerContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerContraseñaActionPerformed
        
        VerContra.VerContraseñaU();
        
    }//GEN-LAST:event_VerContraseñaActionPerformed

    private void IngresarCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IngresarCorreoKeyPressed
        
        char Saltar = evt.getKeyChar();
        
        if(Saltar == KeyEvent.VK_ENTER){
            
            if(VerContraseña.isSelected()){
            
                if(IngresarContraseña.getText().equals("")){
            
                    IngresarContraseña.requestFocus();
            
                }else if(!IngresarContraseña.getText().equals("")){
            
                    EntrarAInicarSesion.doClick();
                
                }
            
            }else if(!VerContraseña.isSelected()){
        
                if(IngresarPassword.getText().equals("")){
            
                    IngresarPassword.requestFocus();
            
                }else if(!IngresarPassword.getText().equals("")){
            
                    EntrarAInicarSesion.doClick();
                
                }
            
            }
            
        }
        
        ValidarUC.ActivarCheckContraseña(evt);
        
    }//GEN-LAST:event_IngresarCorreoKeyPressed

    private void IngresarPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IngresarPasswordKeyPressed
        
        char Saltar = evt.getKeyChar();
        
        if(Saltar == KeyEvent.VK_ENTER){
            
            if(IngresarCorreo.getText().equals("")){
            
                IngresarCorreo.requestFocus();
            
            }else if(!IngresarCorreo.getText().equals("")){
            
                EntrarAInicarSesion.doClick();
                
            }
            
        }

        ValidarUC.ActivarCheckContraseña(evt);
        
    }//GEN-LAST:event_IngresarPasswordKeyPressed

    private void IngresarContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IngresarContraseñaKeyPressed
        
        char Saltar = evt.getKeyChar();
        
        if(Saltar != KeyEvent.VK_ENTER){
            
            if(IngresarCorreo.getText().equals("")){
            
                IngresarCorreo.requestFocus();
            
            }else if(!IngresarCorreo.getText().equals("")){
            
                EntrarAInicarSesion.doClick();
                
            }
            
        }else if(Saltar != KeyEvent.VK_CONTROL){
        
            VerContraseña.doClick();
            
        }
        
    }//GEN-LAST:event_IngresarContraseñaKeyPressed

    private void ElegirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElegirUsuarioActionPerformed
        
        ValidarUC.ElegirCuentaUser();
        
    }//GEN-LAST:event_ElegirUsuarioActionPerformed

    private void ElegirAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElegirAdministradorActionPerformed
        
        ValidarUC.ElegirCuentaAdmin();
        
    }//GEN-LAST:event_ElegirAdministradorActionPerformed

    private void ElegirIncognitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElegirIncognitoActionPerformed
        
        ValidarUC.ElegirCuentaIncog();
        
    }//GEN-LAST:event_ElegirIncognitoActionPerformed

    public void CerrarVentana2(){

        try{
    
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e){
                
                    Contador2 = Contador2 - Contador2;
                
                    System.err.println("Reiniciar contador igual a: "+Contador2);
                
                }
            });
        
            this.setVisible(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AyudaU;
    private javax.swing.JLabel Contraseña2;
    private javax.swing.JMenuItem ElegirAdministrador;
    private javax.swing.JMenuItem ElegirIncognito;
    private javax.swing.JMenuItem ElegirUsuario;
    private javax.swing.JButton EntrarAInicarSesion;
    private javax.swing.JLabel IconoDeTipoDeUsuario;
    private javax.swing.JTextField IngresarContraseña;
    private javax.swing.JTextField IngresarCorreo;
    private javax.swing.JPasswordField IngresarPassword;
    public static javax.swing.JLabel IniciarSesionBanner;
    public static javax.swing.JMenuItem ItemCerrarProgramaU;
    private javax.swing.JMenu ItemCuenta;
    private javax.swing.JMenu ItemHerramientas;
    private javax.swing.JMenuBar MenuBarIS;
    private javax.swing.JLabel TipoDU;
    private javax.swing.JComboBox<String> TipoDeCuentaUser;
    private javax.swing.JLabel Transparente;
    private javax.swing.JCheckBox VerContraseña;
    private javax.swing.JLabel correo2;
    private javax.swing.JMenuItem itemLimpiarFormularioU;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
