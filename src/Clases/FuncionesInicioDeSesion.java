
package Clases;

import Ayuda.CuentaDeAdmin;
import GUIS.IniciarSesion;
import GUIS.Registrarse;
import UsuariosSocialPOST.Administrador;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class FuncionesInicioDeSesion {
    
    String RecuperarCorreo;
    String RecuperarPassword;
    
    public FuncionesInicioDeSesion(IniciarSesion iniciarSesion) {
        
        this.iniciarSesion = iniciarSesion;
        
    }
    
    IniciarSesion iniciarSesion;    
    
    ImageIcon IC = new ImageIcon(getClass().getResource("/Iconos/admin-BigIcon.png"));
    ImageIcon IC2 = new ImageIcon(getClass().getResource("/Iconos/TradicionalUser-BigIcon.png"));
    ImageIcon IC3 = new ImageIcon(getClass().getResource("/Iconos/incognito-BigIcon.png"));
    
    private String convertirContra(char[]contraseñaIngresada){
        
        String contraseña="";
        
        for (int i = 0; i < contraseñaIngresada.length; i++) {
            
            contraseña+=contraseñaIngresada[i];
            
        }
        
        return contraseña;
        
    }
    
    public void CambiarTipoDeUsuarioIcono(){
        
        //System.out.println("Funciona");
        
        String RC = RecuperarCorreo;
        String PW = RecuperarPassword;    
        
        if(iniciarSesion.getTipoDeCuentaUser().getSelectedItem().toString().equals("Administrador")){
        
            iniciarSesion.getTipoDU().setText("Administrador");
            iniciarSesion.getIconoDeTipoDeUsuario().setIcon(null);
            iniciarSesion.getIconoDeTipoDeUsuario().setIcon(IC);
            iniciarSesion.getIngresarCorreo().setEnabled(true);
            iniciarSesion.getIngresarPassword().setEnabled(true);
            iniciarSesion.getIngresarContraseña().setEnabled(true);
            iniciarSesion.getVerContraseña().setEnabled(true);
            iniciarSesion.getIngresarCorreo().setText(RC);
            iniciarSesion.getIngresarPassword().setText(PW);
    
        }else if(iniciarSesion.getTipoDeCuentaUser().getSelectedItem().toString().equals("Usuario")){
        
            iniciarSesion.getTipoDU().setText("Usuario");
            iniciarSesion.getIconoDeTipoDeUsuario().setIcon(null);
            iniciarSesion.getIconoDeTipoDeUsuario().setIcon(IC2);
            iniciarSesion.getIngresarCorreo().setEnabled(true);
            iniciarSesion.getIngresarPassword().setEnabled(true);
            iniciarSesion.getIngresarContraseña().setEnabled(true);
            iniciarSesion.getVerContraseña().setEnabled(true);
            iniciarSesion.getIngresarCorreo().setText(RC);
            iniciarSesion.getIngresarPassword().setText(PW);
    
        }else if(iniciarSesion.getTipoDeCuentaUser().getSelectedItem().toString().equals("Incognito")){
            
            RecuperarCorreo = iniciarSesion.getIngresarCorreo().getText();
            RecuperarPassword = convertirContra(iniciarSesion.getIngresarPassword().getPassword());
            
            String CE = "xxxxx",PE = "xxxxx";
            
            iniciarSesion.getTipoDU().setText("Incognito");
            iniciarSesion.getIconoDeTipoDeUsuario().setIcon(null);
            iniciarSesion.getIconoDeTipoDeUsuario().setIcon(IC3);
            iniciarSesion.getIngresarCorreo().setEnabled(false);            
            iniciarSesion.getIngresarCorreo().setText(CE);
            iniciarSesion.getIngresarPassword().setEnabled(false);
            iniciarSesion.getIngresarPassword().setText(PE);
            iniciarSesion.getIngresarContraseña().setEnabled(false);
            iniciarSesion.getVerContraseña().setSelected(false);
            iniciarSesion.getIngresarPassword().setVisible(true);
            iniciarSesion.getIngresarContraseña().setVisible(false);
            iniciarSesion.getVerContraseña().setEnabled(false);
            
        }
         
    }
    
    public void LimpiarFormulario(){
        
        iniciarSesion.getIngresarCorreo().setText("");
        iniciarSesion.getIngresarPassword().setText("");
        iniciarSesion.getIngresarContraseña().setText("");
        iniciarSesion.getVerContraseña().setSelected(false);      
        
        JOptionPane.showMessageDialog(null,"Su formulario ha sido limpiado con EXITO.", "Formulario Limpiado", JOptionPane.INFORMATION_MESSAGE);
        
        iniciarSesion.getIngresarCorreo().setText("");
        iniciarSesion.getIngresarPassword().setText("");
        iniciarSesion.getIngresarContraseña().setText("");

        
        if(!iniciarSesion.getVerContraseña().isSelected()){
        
            iniciarSesion.getIngresarPassword().setVisible(true);
            iniciarSesion.getIngresarContraseña().setVisible(false);
            
        }
        
    }
    
    public void VerContraseñaU(){
    
        if(iniciarSesion.getVerContraseña().isSelected()){
        
            iniciarSesion.getIngresarContraseña().setVisible(true);
            iniciarSesion.getIngresarPassword().setVisible(false);
            iniciarSesion.getIngresarContraseña().setText(iniciarSesion.getIngresarPassword().getText());
            
        }else{
            
            iniciarSesion.getIngresarContraseña().setVisible(false);
            iniciarSesion.getIngresarPassword().setVisible(true);
            iniciarSesion.getIngresarPassword().setText(iniciarSesion.getIngresarContraseña().getText());
            
        }
    
    }
    
    public void IngresarComoUsuario(){
        
        String UserUsuario = "admin";
        String PassContra = "administrador";

        
        if(iniciarSesion.getTipoDeCuentaUser().getSelectedItem().toString().equals("Administrador")){
            
            if(iniciarSesion.getIngresarCorreo().getText().equalsIgnoreCase(UserUsuario) && iniciarSesion.getIngresarPassword().getText().equalsIgnoreCase(PassContra)){

                iniciarSesion.ValidarAdmin();
                
                JOptionPane.showMessageDialog(null, "Bienvenid@ Administrador", "SESION INICIADA", JOptionPane.INFORMATION_MESSAGE);
                
                iniciarSesion.setVisible(false);
            
                iniciarSesion.getPrincipal().setVisible(false);
                
            }
        
        }else if(iniciarSesion.getTipoDeCuentaUser().getSelectedItem().toString().equals("Usuario")){
            
            if (iniciarSesion.getVerContraseña().isSelected()) {
                
                iniciarSesion.getIngresarPassword().setText(iniciarSesion.getIngresarContraseña().getText());
            
            }
            
            iniciarSesion.ValidarUsuario();
        
        }else if(iniciarSesion.getTipoDeCuentaUser().getSelectedItem().toString().equals("Incognito")){

            //iniciarSesion.getPrincipal().Construccion();
            
            JOptionPane.showMessageDialog(null, "Esta opcion estara disponible solamente en futuras versiones de SocialPOST", "PROXIMAMENTE", JOptionPane.INFORMATION_MESSAGE);
            
        }
    
    }

    public void ActivarCheckContraseña(KeyEvent evt){
        
        if(evt.getKeyCode() == evt.VK_INSERT){
            
            iniciarSesion.getVerContraseña().doClick();
            
        }
    
    }
    
    public void ElegirCuentaAdmin(){
    
        iniciarSesion.getTipoDeCuentaUser().setSelectedIndex(0);
        
        iniciarSesion.getIngresarCorreo().requestFocus();
    
    }
    
    public void ElegirCuentaUser(){
    
        iniciarSesion.getTipoDeCuentaUser().setSelectedIndex(1);
    
        iniciarSesion.getIngresarCorreo().requestFocus();
        
    }
    
    public void ElegirCuentaIncog(){
    
        iniciarSesion.getTipoDeCuentaUser().setSelectedIndex(2);
    
        iniciarSesion.getIngresarCorreo().requestFocus();
        
    }
    
}
