
package Clases;

import UsuariosSocialPOST.Administrador;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class AdministradorFunciones {

    Administrador Traer;
    
    public AdministradorFunciones(Administrador Traer) {

        this.Traer = Traer;
        
    }
    
    public void MouseClickBuscardor(){
    
        if(Traer.getBuscador().getText().equals("Buscar...")){
        
            Traer.getBuscador().setText("");
        
        }
        
        
    }
    
    public void MouseClickFueraBuscador(){
    
        if(Traer.getBuscador().getText().equals("")){
        
            Traer.getBuscador().setText("Buscar...");
        
        }
    
    }
    
    public void MouseClickDentroBuscador(){
    
        if(Traer.getBuscador().getText().equals("")){
        
            Traer.getBuscador().setText("Buscar...");
        
        }
    
    }
    
    public void TecladoBuscador(KeyEvent evt){
    
        BloquearPegadoAltYShitf(evt);
        
        if(evt.getKeyCode() == evt.VK_ENTER){
            
            Traer.getBuscar().doClick();
        
        }
        
        if(Traer.getBuscador().getText().equals("Buscar...")){
        
            Traer.getBuscador().setText("");
        
        }
        
    }
    
    public void BloquearPegadoAltYShitf(KeyEvent evt){
        
        if(evt.isControlDown()){
            
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "No puedes pegar, ni usar los demas atajos de teclado.\n\nPor favor digite un caracter valido.", "¿Intentas Trollearme?", JOptionPane.INFORMATION_MESSAGE);

        }
        
        if(evt.isAltDown()){
            
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "No puedes usar el Alt.\n\nPor favor digite un caracter valido.", "CARACTER NO VALIDO", JOptionPane.ERROR_MESSAGE);
            
        }
        
        if(evt.isAltGraphDown()){
            
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "No puedes usar el Alt Gr.\n\nPor favor digite un caracter valido.", "CARACTER NO VALIDO", JOptionPane.ERROR_MESSAGE);
            
        }
    
    }
    
}
