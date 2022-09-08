
package Plegables;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class AgrandarImagen extends javax.swing.JDialog {


    public AgrandarImagen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocation(260,564);
        
        ImageIcon CreadorFoto = new ImageIcon("src/Imagenes/Lina&Julian.jpg");
        Icon CF = new ImageIcon(CreadorFoto.getImage().getScaledInstance(ImgCreadores.getWidth(), ImgCreadores.getHeight(), Image.SCALE_DEFAULT));
        ImgCreadores.setIcon(CF);
        
        Cerrar.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPlegable1 = new javax.swing.JPanel();
        Cerrar = new javax.swing.JLabel();
        ImgCreadores = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPlegable1.setBackground(new java.awt.Color(255, 255, 255));
        PanelPlegable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelPlegable1MouseExited(evt);
            }
        });
        PanelPlegable1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/CerrarVentana.png"))); // NOI18N
        Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarMouseExited(evt);
            }
        });
        PanelPlegable1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 20, 20));

        ImgCreadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImgCreadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lina&Julian.jpg"))); // NOI18N
        ImgCreadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ImgCreadoresMouseExited(evt);
            }
        });
        PanelPlegable1.add(ImgCreadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 130));

        getContentPane().add(PanelPlegable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        
        dispose();
        
    }//GEN-LAST:event_CerrarMouseClicked

    private void PanelPlegable1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelPlegable1MouseExited
        
        dispose();
        
    }//GEN-LAST:event_PanelPlegable1MouseExited

    private void ImgCreadoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImgCreadoresMouseExited
        
        dispose();
        
    }//GEN-LAST:event_ImgCreadoresMouseExited

    private void CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseExited
        
        dispose();
        
    }//GEN-LAST:event_CerrarMouseExited


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
            java.util.logging.Logger.getLogger(AgrandarImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgrandarImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgrandarImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgrandarImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgrandarImagen dialog = new AgrandarImagen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel ImgCreadores;
    private javax.swing.JPanel PanelPlegable1;
    // End of variables declaration//GEN-END:variables
}
