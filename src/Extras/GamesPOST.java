
package Extras;

import static GUIS.Registrarse.Portada;
import static GUIS.Registrarse.Siguiente;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class GamesPOST extends javax.swing.JFrame {

    
    public GamesPOST() {
        super();
        setResizable(false);
        initComponents();
        setLocationRelativeTo(this);
        
        ImageIcon ImagenBackground = new ImageIcon("src/Imagenes/BG_Game.jpg");
        Icon IconoBackground = new ImageIcon(ImagenBackground.getImage().getScaledInstance(Background.getWidth(), Background.getHeight(), Image.SCALE_DEFAULT));
        Background.setIcon(IconoBackground);
        
        ImageIcon Player1 = new ImageIcon("src/Sprites/mm_desplazamiento.gif");
        Icon P1 = new ImageIcon(Player1.getImage().getScaledInstance(Jugador1.getWidth(), Jugador1.getHeight(), Image.SCALE_DEFAULT));
        Jugador1.setIcon(P1);
        start();
        
        PanelMB.requestFocus();
    }

    private void start(){
         Thread hilo= new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {                
                if (moverDerecha) {
                    Mover(1);
                    
                }else if (moverIzquierda) {
                    Mover(-1);
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                }
            }
        }
    });
         hilo.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMB = new javax.swing.JPanel();
        Jugador1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelMB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PanelMBKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PanelMBKeyReleased(evt);
            }
        });
        PanelMB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jugador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/mm_desplazamiento.gif"))); // NOI18N
        PanelMB.add(Jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 70));

        jButton2.setText("Izquierda");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        PanelMB.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, -1));

        jButton1.setText("Derecha");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelMB.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, -1, -1));

        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BG_Game.jpg"))); // NOI18N
        Background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackgroundMouseClicked(evt);
            }
        });
        PanelMB.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PanelMB.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BackgroundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMouseClicked
         
        
    }//GEN-LAST:event_BackgroundMouseClicked

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        moverDerecha=false;
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
      
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       moverIzquierda=true;
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        moverIzquierda=false;
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PanelMB.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        moverDerecha=true;
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        
    }//GEN-LAST:event_jButton2KeyPressed

    private void PanelMBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PanelMBKeyPressed

        if(evt.getKeyCode() == evt.VK_LEFT){
            
          moverIzquierda=true;  
        
        }
        
        if(evt.getKeyCode() == evt.VK_RIGHT){
            
          moverDerecha=true;  
        
        }
        
    }//GEN-LAST:event_PanelMBKeyPressed

    private void PanelMBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PanelMBKeyReleased
        
        if(evt.getKeyCode() == evt.VK_LEFT){
            
          moverIzquierda=false;  
        
        }
        
        if(evt.getKeyCode() == evt.VK_RIGHT){
            
          moverDerecha=false;  
        
        }
        
    }//GEN-LAST:event_PanelMBKeyReleased

    public void Mover(int mov){
    
        Rectangle x= Jugador1.getBounds();
        x.x+=4*mov;
        Jugador1.setBounds(x);
    
    }
    
    boolean moverDerecha=false;
    boolean moverIzquierda=false;
    
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
            java.util.logging.Logger.getLogger(GamesPOST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamesPOST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamesPOST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamesPOST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamesPOST().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Jugador1;
    private javax.swing.JPanel PanelMB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
