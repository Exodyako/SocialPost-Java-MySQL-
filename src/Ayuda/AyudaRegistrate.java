
package Ayuda;

import javax.swing.ImageIcon;


public class AyudaRegistrate extends javax.swing.JFrame {


    public AyudaRegistrate() {
        
        super("Ayuda");
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Iconos/Help.png")).getImage());
        initComponents();
        setLocationRelativeTo(this);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAyuda = new javax.swing.JPanel();
        RegistroDePerfil = new javax.swing.JScrollPane();
        Interior2 = new javax.swing.JTextArea();
        Vacio = new javax.swing.JLabel();
        BienvenidoAyuda = new javax.swing.JLabel();
        RegistroDeDatosTA1 = new javax.swing.JScrollPane();
        Interior4 = new javax.swing.JTextArea();
        Soporte = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAyuda.setBackground(new java.awt.Color(255, 255, 255));
        PanelAyuda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegistroDePerfil.setBorder(null);

        Interior2.setEditable(false);
        Interior2.setBackground(new java.awt.Color(255, 0, 0));
        Interior2.setColumns(20);
        Interior2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        Interior2.setForeground(new java.awt.Color(255, 255, 255));
        Interior2.setLineWrap(true);
        Interior2.setRows(5);
        Interior2.setText("En nuestro registro de perfil podras colocar una foto de perfil y una de portada cargada desde tu ordenador, y un Slogan para tu perfil de SocialPOST.");
        Interior2.setToolTipText("");
        Interior2.setWrapStyleWord(true);
        Interior2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Perfil", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 1, 24), new java.awt.Color(0, 204, 0))); // NOI18N
        Interior2.setCaretColor(new java.awt.Color(240, 240, 240));
        RegistroDePerfil.setViewportView(Interior2);

        PanelAyuda.add(RegistroDePerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 470, 150));
        PanelAyuda.add(Vacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 490, 20));

        BienvenidoAyuda.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BienvenidoAyuda.setForeground(new java.awt.Color(204, 0, 0));
        BienvenidoAyuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BienvenidoAyuda.setText("Bienvenido a nuestro soporte de Ayuda");
        PanelAyuda.add(BienvenidoAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 470, 44));

        RegistroDeDatosTA1.setBorder(null);

        Interior4.setEditable(false);
        Interior4.setBackground(new java.awt.Color(0, 51, 255));
        Interior4.setColumns(20);
        Interior4.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        Interior4.setForeground(new java.awt.Color(255, 255, 255));
        Interior4.setLineWrap(true);
        Interior4.setRows(5);
        Interior4.setText("En nuestro registro de datos como su nombre lo indica: es para registrar tus datos personales que se te indiquen para poder crear una cuenta en SocialPOST, y ser parte de nuestro portal de Posteos.                                                                                                                                                        El manejo del formulario de registro es muy sencillo, solo es de darle click a las casillas para llenarlas y cuando el formulario este completado, sera procesado y podras continuar con tu registro.");
        Interior4.setToolTipText("");
        Interior4.setWrapStyleWord(true);
        Interior4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Datos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 1, 24), new java.awt.Color(255, 204, 0))); // NOI18N
        Interior4.setCaretColor(new java.awt.Color(240, 240, 240));
        RegistroDeDatosTA1.setViewportView(Interior4);

        PanelAyuda.add(RegistroDeDatosTA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 470, 150));

        Soporte.setBackground(new java.awt.Color(255, 153, 0));
        Soporte.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Soporte.setForeground(new java.awt.Color(255, 255, 255));
        Soporte.setText(" Aqui podras encontrar ayuda para cualquier inquietud con tu registro.");
        Soporte.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Soporte.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Soporte", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 1, 36), new java.awt.Color(102, 0, 204))); // NOI18N
        Soporte.setOpaque(true);
        PanelAyuda.add(Soporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 470, 70));

        getContentPane().add(PanelAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AyudaRegistrate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AyudaRegistrate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AyudaRegistrate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AyudaRegistrate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AyudaRegistrate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BienvenidoAyuda;
    private javax.swing.JTextArea Interior2;
    private javax.swing.JTextArea Interior4;
    private javax.swing.JPanel PanelAyuda;
    private javax.swing.JScrollPane RegistroDeDatosTA1;
    private javax.swing.JScrollPane RegistroDePerfil;
    private javax.swing.JLabel Soporte;
    private javax.swing.JLabel Vacio;
    // End of variables declaration//GEN-END:variables
}
