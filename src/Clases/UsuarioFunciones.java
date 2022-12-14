
package Clases;

import static Clases.RegistrarseFunciones.CantidadMaximaDeCaracteres;
import static Clases.RegistrarseFunciones.CantidadMinimaDeCaracteres;
import static Clases.RegistrarseFunciones.Caracteres;
import static Clases.RegistrarseFunciones.Entrar;
import static Clases.RegistrarseFunciones.Letras;
import static Clases.RegistrarseFunciones.Numeros;
import GUIS.IniciarSesion;
import UsuariosSocialPOST.Usuario;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class UsuarioFunciones {
    
    
    ImageIcon IconoPerfil = new ImageIcon(getClass().getResource("/Iconos/TradicionalUser-BigIcon.png"));
    
    ImageIcon IconoPortada = new ImageIcon(getClass().getResource("/Imagenes/FondoSocialPOST-Principal.jpg"));
    
    public UsuarioFunciones(Usuario TraerVariables) {
        
        this.TraerVariables = TraerVariables;
        
    }

    Usuario TraerVariables;
    
    public void MouseClickNombre(){
    
        if(TraerVariables.getNombreUE().getText().equals("Escribir...")){
            
            TraerVariables.getNombreUE().setText("");
            
        }
        
        if(TraerVariables.getApdoUE().getText().equals("")){
            
            TraerVariables.getApdoUE().setText("Escribir...");
        
        }else if(TraerVariables.getCorreoElectronicoUE().getText().equals("")){
        
            TraerVariables.getCorreoElectronicoUE().setText("Escribir...");
            
        }else if(TraerVariables.getContraseĆ±aOcultaUE().getText().equals("")){
        
            TraerVariables.getContraseĆ±aOcultaUE().setText("Escribir...");
                
            TraerVariables.getValidarCantidadDeContraseĆ±aUE().setText("");
            
        }else if(TraerVariables.getSgUE().getText().equals("")){
        
            TraerVariables.getSgUE().setText("Escribir...");
            
        }
    
    }
    
    public void MouseClickApdo(){
    
        if(TraerVariables.getApdoUE().getText().equals("Escribir...")){
            
            TraerVariables.getApdoUE().setText("");
            
        }
        
        if(TraerVariables.getNombreUE().getText().equals("")){
            
            TraerVariables.getNombreUE().setText("Escribir...");
        
        }else if(TraerVariables.getCorreoElectronicoUE().getText().equals("")){
        
            TraerVariables.getCorreoElectronicoUE().setText("Escribir...");

        }else if(TraerVariables.getContraseĆ±aOcultaUE().getText().equals("")){
            
            TraerVariables.getContraseĆ±aOcultaUE().setText("Escribir...");
                
            TraerVariables.getValidarCantidadDeContraseĆ±aUE().setText("");
                
        }else if(TraerVariables.getSgUE().getText().equals("")){
        
            TraerVariables.getSgUE().setText("Escribir...");
            
        }
    
    }
    
    public void MouseClickCorreo(){
    
        if(TraerVariables.getCorreoElectronicoUE().getText().equals("Escribir...")){
            
            TraerVariables.getCorreoElectronicoUE().setText("");
        
        }
        
        if(TraerVariables.getNombreUE().getText().equals("")){
        
            TraerVariables.getNombreUE().setText("Escribir...");
            
        }else if(TraerVariables.getApdoUE().getText().equals("")){
        
            TraerVariables.getApdoUE().setText("Escribir...");
            
        }else if(TraerVariables.getContraseĆ±aOcultaUE().getText().equals("")){
            
            TraerVariables.getContraseĆ±aOcultaUE().setText("Escribir...");
                
            TraerVariables.getValidarCantidadDeContraseĆ±aUE().setText("");
                
        }else if(TraerVariables.getSgUE().getText().equals("")){
        
            TraerVariables.getSgUE().setText("Escribir...");
            
        }
        
    
    }
    
    public void MouseClickContraseĆ±a(){
    
        if(TraerVariables.getContraseĆ±aOcultaUE().getText().equals("Escribir...")){
            
            TraerVariables.getContraseĆ±aOcultaUE().setText("");
        
        }
        
        if(TraerVariables.getNombreUE().getText().equals("")){
        
            TraerVariables.getNombreUE().setText("Escribir...");
            
        }else if(TraerVariables.getApdoUE().getText().equals("")){
        
            TraerVariables.getApdoUE().setText("Escribir...");
            
        }else if(TraerVariables.getCorreoElectronicoUE().getText().equals("")){
        
            TraerVariables.getCorreoElectronicoUE().setText("Escribir...");
            
        }else if(TraerVariables.getSgUE().getText().equals("")){
        
            TraerVariables.getSgUE().setText("Escribir...");
            
        }
    
    }
    
    public void MouseClickSlogan(){
    
        if(TraerVariables.getSgUE().getText().equals("Escribir...")){
            
            TraerVariables.getSgUE().setText("");
        
        }
        
        if(TraerVariables.getNombreUE().getText().equals("")){
        
            TraerVariables.getNombreUE().setText("Escribir...");
            
        }else if(TraerVariables.getApdoUE().getText().equals("")){
        
            TraerVariables.getApdoUE().setText("Escribir...");
            
        }else if(TraerVariables.getCorreoElectronicoUE().getText().equals("")){
        
            TraerVariables.getCorreoElectronicoUE().setText("Escribir...");
            
        }else if(TraerVariables.getContraseĆ±aOcultaUE().getText().equals("")){
            
            TraerVariables.getContraseĆ±aOcultaUE().setText("Escribir...");
                
            TraerVariables.getValidarCantidadDeContraseĆ±aUE().setText("");
                
        }
        
    }
    
    public void MouseClickTelefono(){
    
        if(TraerVariables.getTelefonoUA().getText().equals("Escribir...")){
            
            TraerVariables.getTelefonoUA().setText("");
        
        }
        
        if(TraerVariables.getDireccionUA().getText().equals("")){
        
            TraerVariables.getDireccionUA().setText("Escribir...");
            
        }else if(TraerVariables.getDescripcionAU().getText().equals("")){
        
            TraerVariables.getDescripcionAU().setText("Escribir...");
            
        }
        
    }
    
    public void MouseClickDireccion(){
    
        if(TraerVariables.getDireccionUA().getText().equals("Escribir...")){
            
            TraerVariables.getDireccionUA().setText("");
        
        }
        
        if(TraerVariables.getTelefonoUA().getText().equals("")){
        
            TraerVariables.getTelefonoUA().setText("Escribir...");
            
        }else if(TraerVariables.getDescripcionAU().getText().equals("")){
        
            TraerVariables.getDescripcionAU().setText("Escribir...");
            
        }
        
    }
    
    public void MouseClickDescripcion(){
    
        if(TraerVariables.getDescripcionAU().getText().equals("Escribir...")){
            
            TraerVariables.getDescripcionAU().setText("");
        
        }
        
        if(TraerVariables.getTelefonoUA().getText().equals("")){
        
            TraerVariables.getTelefonoUA().setText("Escribir...");
            
        }else if(TraerVariables.getDireccionUA().getText().equals("")){
        
            TraerVariables.getDireccionUA().setText("Escribir...");
            
        }
        
    }
    
    public void ValidarBtnEnterNombre(KeyEvent evt){
    
        BloquearPegadoAltYShitf(evt);
        
        if(evt.getKeyCode() == evt.VK_ENTER){
            
            TraerVariables.getNomEditador().doClick();
        
        }
    
    } 
    
    public void ValidarBtnEnterApdo(KeyEvent evt){
        
        BloquearPegadoAltYShitf(evt);
        
        if(evt.getKeyCode() == evt.VK_ENTER){
            
            TraerVariables.getApdoEditado().doClick();
        
        }
    
    }
    
    public void ValidarBtnEnterCorreo(KeyEvent evt){
        
        BloquearPegadoAltYShitf(evt);
        
        if(evt.getKeyCode() == evt.VK_ENTER){
            
            TraerVariables.getCorreoEditado().doClick();
            
        }
    
    }
    
    public void ValidarBtnEnterContraseĆ±aOculta(KeyEvent evt){
        
        BloquearPegadoAltYShitf(evt);
        
        if(evt.getKeyCode() == evt.VK_ENTER){
            
            TraerVariables.getContraseĆ±aEditado().doClick();
        
        }
    
    }
    
    public void ValidarBtnEnterTelefono(KeyEvent evt){
    
        BloquearPegadoAltYShitf(evt);
        
        if(evt.getKeyCode() == evt.VK_ENTER){
            
            TraerVariables.getTelAĆ±adir().doClick();
        
        }
    
    } 
    
    public void ValidarBtnEnterDireccion(KeyEvent evt){
    
        BloquearPegadoAltYShitf(evt);
        
        if(evt.getKeyCode() == evt.VK_ENTER){
            
            TraerVariables.getDirAĆ±adir().doClick();
        
        }
    
    }
    
    public void ValidarSolamenteLetras(KeyEvent evt){
        
        Letras = evt.getKeyChar();
        Entrar = evt.getKeyChar();
    
        if(!Character.isLetter(Letras)&& Letras != KeyEvent.VK_BACK_SPACE && Letras != KeyEvent.VK_SPACE && Letras != KeyEvent.VK_DELETE && Entrar != KeyEvent.VK_ENTER){
            
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar letras.", "ERROR DE DIGITACION", JOptionPane.ERROR_MESSAGE);
            
        }
    
    }
    
    public void ValidarSolamenteNumeros(KeyEvent evt){
        
        Numeros = evt.getKeyChar();
        Entrar = evt.getKeyChar();
    
        if(!Character.isDigit(Numeros)&& Numeros != KeyEvent.VK_BACK_SPACE && Numeros != KeyEvent.VK_SPACE && Numeros != KeyEvent.VK_DELETE && Entrar != KeyEvent.VK_ENTER){
            
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar Numeros.", "ERROR DE DIGITACION", JOptionPane.ERROR_MESSAGE);
            
        }
    
    }
    
    public void ValidarNumerosYLetras(KeyEvent evt){
    
        Caracteres = evt.getKeyChar();
        Entrar = evt.getKeyChar();
        
        if(!Character.isLetterOrDigit(Caracteres) && Caracteres != KeyEvent.VK_MINUS && Caracteres != KeyEvent.VK_UNDERSCORE && Caracteres != KeyEvent.VK_PERIOD && Caracteres != KeyEvent.VK_BACK_SPACE && Caracteres != KeyEvent.VK_SPACE && Caracteres != KeyEvent.VK_DELETE && Entrar != KeyEvent.VK_ENTER){
            
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar letras o numeros y ciertos caracteres tales como: '.' y '-'.", "ERROR DE DIGITACION", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
    public void BloquearPegadoAltYShitf(KeyEvent evt){
        
        if(evt.isControlDown()){
            
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "No puedes pegar, ni usar los demas atajos de teclado.\n\nPor favor digite un caracter valido.", "ĀæIntentas Trollearme?", JOptionPane.INFORMATION_MESSAGE);

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
    
    public void ValidarDiasDeFebrero(){
    
        String Dia29 = "29";
        String Dia30 = "30";
        String Dia31 = "31";
            
        int nItems = TraerVariables.getDiaUE().getItemCount();
        boolean Existe = false;
        int i;
        
        if(TraerVariables.getMesUE().getSelectedItem().toString().equals("Febrero")){
            
            if(TraerVariables.getDiaUE().getSelectedItem().toString().equals("29")||TraerVariables.getMesUE().getSelectedItem().toString().equals("30")||TraerVariables.getMesUE().getSelectedItem().toString().equals("31")){
            
                TraerVariables.getDiaUE().setSelectedItem("28");
            
            }
            
            TraerVariables.getDiaUE().removeItem("29");
            TraerVariables.getDiaUE().removeItem("30");
            TraerVariables.getDiaUE().removeItem("31");
            
        }
        
        if(!TraerVariables.getMesUE().getSelectedItem().toString().equals("Febrero")){
        
            for(i=0; i<nItems; i++){
            
                if(TraerVariables.getDiaUE().getItemAt(i).equals(Dia29)||TraerVariables.getDiaUE().getItemAt(i).equals(Dia30)||TraerVariables.getDiaUE().getItemAt(i).equals(Dia31)){
        
                    Existe = true;
                    
                    break;
            
                }
            
            }
            
            if(!Existe){
                
                TraerVariables.getDiaUE().addItem(Dia29);
                TraerVariables.getDiaUE().addItem(Dia30);
                TraerVariables.getDiaUE().addItem(Dia31);
                
            }
                
        }
    
    }
    
    public void HabilitarYDeshabilitarAĆ±o(){
    
        if(TraerVariables.getAĆ±oUE().getSelectedItem().toString().equals("Digitar")){
        
            TraerVariables.getIngresarAĆ±oUE().setVisible(true);
            TraerVariables.getAĆ±oSpinnerUE().setVisible(true);
            TraerVariables.getSeleccionarAĆ±oUE().setVisible(true);
            TraerVariables.getAĆ±oUE().setEnabled(false);
        
        }
        
        if(!TraerVariables.getAĆ±oUE().getSelectedItem().toString().equals("Digitar")){
        
            TraerVariables.getIngresarAĆ±oUE().setVisible(false);
            TraerVariables.getAĆ±oSpinnerUE().setVisible(false);
            TraerVariables.getSeleccionarAĆ±oUE().setVisible(false);
            TraerVariables.getAĆ±oUE().setEnabled(true);
        
        }
    
    }
    
    public void AĆ±adirAĆ±o(){
        
        int SpinnerValor = (Integer) TraerVariables.getAĆ±oSpinnerUE().getValue();
        String SpinnerConvertido = String.valueOf(SpinnerValor);
        
        
        int nItems = TraerVariables.getAĆ±oUE().getItemCount();
        boolean Existe = false;
        int i;
    
        if(TraerVariables.getAĆ±oSpinnerUE().getValue().toString().equals("0")){
        
            JOptionPane.showMessageDialog(null, "Por favor ingrese un aĆ±o valido.", "AĆO INVALIDO", JOptionPane.ERROR_MESSAGE);
            
        }else{
            
            TraerVariables.getIngresarAĆ±oUE().setVisible(false);
            TraerVariables.getAĆ±oSpinnerUE().setVisible(false);
            TraerVariables.getSeleccionarAĆ±oUE().setVisible(false);
            TraerVariables.getAĆ±oUE().setEnabled(true);
            
            for(i=0; i<nItems; i++){
            
                if(TraerVariables.getAĆ±oUE().getItemAt(i).equals(SpinnerConvertido)){
        
                    Existe = true;
                    
                    break;
            
                }
            
            }
            
            if(!Existe){
                
                TraerVariables.getAĆ±oUE().addItem(TraerVariables.getAĆ±oSpinnerUE().getValue().toString());

                TraerVariables.getAĆ±oUE().setSelectedIndex(nItems);
                
                JOptionPane.showMessageDialog(null, "Su aĆ±o ha sido AĆADIDO a la Lista: AĆ±o, de manera EXITOSA.", "ENABUENAHORA", JOptionPane.INFORMATION_MESSAGE);
                
                TraerVariables.getAĆ±oSpinnerUE().setValue(1000);
                
            }else{
                
                TraerVariables.getIngresarAĆ±oUE().setVisible(true);
                TraerVariables.getAĆ±oSpinnerUE().setVisible(true);
                TraerVariables.getSeleccionarAĆ±oUE().setVisible(true);
                TraerVariables.getAĆ±oUE().setEnabled(false);
            
                JOptionPane.showMessageDialog(null, "Ese aĆ±o ya existe, por favor ingrese un aĆ±o distinto.", "AĆO YA EXISTENTE", JOptionPane.INFORMATION_MESSAGE);
                
            }
            
        }
        
    }
    
    public void RestarContador(int Contador){
        
        Contador = Contador - Contador;
    
    }
    
    public void LimpiarRegistro(){
        
        TraerVariables.getNombreUE().setText("");
        TraerVariables.getApdoUE().setText("");
        TraerVariables.getGenerosGroupUE().clearSelection();
        TraerVariables.getDiaUE().setSelectedIndex(0);
        TraerVariables.getMesUE().setSelectedIndex(0);
        TraerVariables.getAĆ±oUE().setSelectedIndex(0);
        TraerVariables.getCorreoElectronicoUE().setText("");
        TraerVariables.getTipoCorreoUE().setSelectedIndex(0);
        TraerVariables.getExtencionUE().setSelectedIndex(0);
        TraerVariables.getContraseĆ±aOcultaUE().setText(""); 
        TraerVariables.getVisualizarContraseĆ±aUE().setText("");
        /*
        Foto.setIcon(null);
        Portada.setIcon(null);
        Foto.setText("Foto de Perfil");
        Portada.setText("Foto de Portada");
        */
        TraerVariables.getSgUE().setText("");
        
        JOptionPane.showMessageDialog(null,"Su formulario ha sido limpiado con EXITO.", "Formulario Limpiado", JOptionPane.INFORMATION_MESSAGE);
        
        TraerVariables.getNombreUE().setText("Escribir...");
        TraerVariables.getApdoUE().setText("Escribir...");
        TraerVariables.getCorreoElectronicoUE().setText("Escribir...");
        
        TraerVariables.getContraseĆ±aOcultaUE().setText("Escribir...");
        /*
        Foto.setText(null);
        Portada.setText(null);
        Foto.setIcon(IconoPerfil);
        Portada.setIcon(IconoPortada);
        */
        TraerVariables.getSgUE().setText("Escribir...");
        
    }
    
    public void ValidadCantidadDeContraseĆ±aConMouseFuera(MouseEvent evt){        

            
            if(!TraerVariables.getContraseĆ±aOcultaUE().getText().equals("Escribir...")){
        
                if(TraerVariables.getContraseĆ±aOcultaUE().getText().length() > CantidadMaximaDeCaracteres){
        
                    evt.consume();
            
                    //JOptionPane.showMessageDialog(null, "La cantidad maxima de caracteres que puedes ingresar para tu ContraseĆ±a es de 8 caracteres", "LIMITE EXCEDIDO", JOptionPane.ERROR_MESSAGE);
            
                    TraerVariables.getValidarCantidadDeContraseĆ±aUE().setText(" *Maximo 8 caracteres");
                    
                    Thread hilo = new Thread(new Runnable() {

                    int TimerContador = 2;

                    public void run() {

                        while (TimerContador > 0) {

                            TimerContador--;

                            try {
                                
                                Thread.sleep(1000);
                                
                            } catch (InterruptedException ex) {

                            }

                        }

                        TraerVariables.getValidarCantidadDeContraseĆ±aUE().setText("");

                    }

                });
                
                hilo.start();
            
                }else if(TraerVariables.getContraseĆ±aOcultaUE().getText().length() < CantidadMinimaDeCaracteres){
            
                    //JOptionPane.showMessageDialog(null, "La cantidad minima de caracteres que puedes ingresar para tu ContraseĆ±a es de 4 caracteres", "LIMITE EXCEDIDO", JOptionPane.ERROR_MESSAGE);
            
                    TraerVariables.getValidarCantidadDeContraseĆ±aUE().setText(" *Minimo 4 caracteres");
            
                }else{
        
                    TraerVariables.getValidarCantidadDeContraseĆ±aUE().setText("");
        
                }
            
            }else{
            
                TraerVariables.getValidarCantidadDeContraseĆ±aUE().setText("");
                
            }
        
    }
    
    public void ValidadCantidadDeContraseĆ±aConTeclado(KeyEvent evt){        
        
            if(TraerVariables.getContraseĆ±aOcultaUE().getText().length() > CantidadMaximaDeCaracteres){
        
                evt.consume();
            
                TraerVariables.getValidarCantidadDeContraseĆ±aUE().setText(" *Maximo 8 caracteres");
                
                Thread hilo = new Thread(new Runnable() {

                    int TimerContador = 2;

                    public void run() {

                        while (TimerContador > 0) {

                            TimerContador--;

                            try {
                                
                                Thread.sleep(1000);
                                
                            } catch (InterruptedException ex) {

                            }

                        }

                        TraerVariables.getValidarCantidadDeContraseĆ±aUE().setText("");

                    }

                });
                
                hilo.start();
            
            }else if(TraerVariables.getContraseĆ±aOcultaUE().getText().length() < CantidadMinimaDeCaracteres){
                        
                TraerVariables.getValidarCantidadDeContraseĆ±aUE().setText(" *Minimo 4 caracteres");
            
            }else{
                
                TraerVariables.getValidarCantidadDeContraseĆ±aUE().setText("");
            
            }
            
    }
    
    public void VisualizarTuContraseĆ±a(KeyEvent evt){
    
        TraerVariables.getVisualizarContraseĆ±aUE().setText(TraerVariables.getContraseĆ±aOcultaUE().getText());
        
    }
    
    public void VisualizarTuContraseĆ±aClick(MouseEvent evt){
    
        TraerVariables.getVisualizarContraseĆ±aUE().setText(TraerVariables.getContraseĆ±aOcultaUE().getText());
        
    }
    
    public void BtnEdit1ClickDentro(){
    
        TraerVariables.getEditBtn().setVisible(true);
    
    }
    
    public void BtnEdit1ClickFuera(){
    
        TraerVariables.getEditBtn().setVisible(false);
    
    }
    
    public void BtnEdit2ClickDentro(){
    
        TraerVariables.getEditBtn2().setVisible(true);
    
    }
    
    public void BtnEdit2ClickFuera(){
    
        TraerVariables.getEditBtn2().setVisible(false);
    
    }
   
}
