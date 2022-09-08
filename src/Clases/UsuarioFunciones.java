
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
            
        }else if(TraerVariables.getContraseñaOcultaUE().getText().equals("")){
        
            TraerVariables.getContraseñaOcultaUE().setText("Escribir...");
                
            TraerVariables.getValidarCantidadDeContraseñaUE().setText("");
            
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

        }else if(TraerVariables.getContraseñaOcultaUE().getText().equals("")){
            
            TraerVariables.getContraseñaOcultaUE().setText("Escribir...");
                
            TraerVariables.getValidarCantidadDeContraseñaUE().setText("");
                
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
            
        }else if(TraerVariables.getContraseñaOcultaUE().getText().equals("")){
            
            TraerVariables.getContraseñaOcultaUE().setText("Escribir...");
                
            TraerVariables.getValidarCantidadDeContraseñaUE().setText("");
                
        }else if(TraerVariables.getSgUE().getText().equals("")){
        
            TraerVariables.getSgUE().setText("Escribir...");
            
        }
        
    
    }
    
    public void MouseClickContraseña(){
    
        if(TraerVariables.getContraseñaOcultaUE().getText().equals("Escribir...")){
            
            TraerVariables.getContraseñaOcultaUE().setText("");
        
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
            
        }else if(TraerVariables.getContraseñaOcultaUE().getText().equals("")){
            
            TraerVariables.getContraseñaOcultaUE().setText("Escribir...");
                
            TraerVariables.getValidarCantidadDeContraseñaUE().setText("");
                
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
    
    public void ValidarBtnEnterContraseñaOculta(KeyEvent evt){
        
        BloquearPegadoAltYShitf(evt);
        
        if(evt.getKeyCode() == evt.VK_ENTER){
            
            TraerVariables.getContraseñaEditado().doClick();
        
        }
    
    }
    
    public void ValidarBtnEnterTelefono(KeyEvent evt){
    
        BloquearPegadoAltYShitf(evt);
        
        if(evt.getKeyCode() == evt.VK_ENTER){
            
            TraerVariables.getTelAñadir().doClick();
        
        }
    
    } 
    
    public void ValidarBtnEnterDireccion(KeyEvent evt){
    
        BloquearPegadoAltYShitf(evt);
        
        if(evt.getKeyCode() == evt.VK_ENTER){
            
            TraerVariables.getDirAñadir().doClick();
        
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
    
    public void HabilitarYDeshabilitarAño(){
    
        if(TraerVariables.getAñoUE().getSelectedItem().toString().equals("Digitar")){
        
            TraerVariables.getIngresarAñoUE().setVisible(true);
            TraerVariables.getAñoSpinnerUE().setVisible(true);
            TraerVariables.getSeleccionarAñoUE().setVisible(true);
            TraerVariables.getAñoUE().setEnabled(false);
        
        }
        
        if(!TraerVariables.getAñoUE().getSelectedItem().toString().equals("Digitar")){
        
            TraerVariables.getIngresarAñoUE().setVisible(false);
            TraerVariables.getAñoSpinnerUE().setVisible(false);
            TraerVariables.getSeleccionarAñoUE().setVisible(false);
            TraerVariables.getAñoUE().setEnabled(true);
        
        }
    
    }
    
    public void AñadirAño(){
        
        int SpinnerValor = (Integer) TraerVariables.getAñoSpinnerUE().getValue();
        String SpinnerConvertido = String.valueOf(SpinnerValor);
        
        
        int nItems = TraerVariables.getAñoUE().getItemCount();
        boolean Existe = false;
        int i;
    
        if(TraerVariables.getAñoSpinnerUE().getValue().toString().equals("0")){
        
            JOptionPane.showMessageDialog(null, "Por favor ingrese un año valido.", "AÑO INVALIDO", JOptionPane.ERROR_MESSAGE);
            
        }else{
            
            TraerVariables.getIngresarAñoUE().setVisible(false);
            TraerVariables.getAñoSpinnerUE().setVisible(false);
            TraerVariables.getSeleccionarAñoUE().setVisible(false);
            TraerVariables.getAñoUE().setEnabled(true);
            
            for(i=0; i<nItems; i++){
            
                if(TraerVariables.getAñoUE().getItemAt(i).equals(SpinnerConvertido)){
        
                    Existe = true;
                    
                    break;
            
                }
            
            }
            
            if(!Existe){
                
                TraerVariables.getAñoUE().addItem(TraerVariables.getAñoSpinnerUE().getValue().toString());

                TraerVariables.getAñoUE().setSelectedIndex(nItems);
                
                JOptionPane.showMessageDialog(null, "Su año ha sido AÑADIDO a la Lista: Año, de manera EXITOSA.", "ENABUENAHORA", JOptionPane.INFORMATION_MESSAGE);
                
                TraerVariables.getAñoSpinnerUE().setValue(1000);
                
            }else{
                
                TraerVariables.getIngresarAñoUE().setVisible(true);
                TraerVariables.getAñoSpinnerUE().setVisible(true);
                TraerVariables.getSeleccionarAñoUE().setVisible(true);
                TraerVariables.getAñoUE().setEnabled(false);
            
                JOptionPane.showMessageDialog(null, "Ese año ya existe, por favor ingrese un año distinto.", "AÑO YA EXISTENTE", JOptionPane.INFORMATION_MESSAGE);
                
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
        TraerVariables.getAñoUE().setSelectedIndex(0);
        TraerVariables.getCorreoElectronicoUE().setText("");
        TraerVariables.getTipoCorreoUE().setSelectedIndex(0);
        TraerVariables.getExtencionUE().setSelectedIndex(0);
        TraerVariables.getContraseñaOcultaUE().setText(""); 
        TraerVariables.getVisualizarContraseñaUE().setText("");
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
        
        TraerVariables.getContraseñaOcultaUE().setText("Escribir...");
        /*
        Foto.setText(null);
        Portada.setText(null);
        Foto.setIcon(IconoPerfil);
        Portada.setIcon(IconoPortada);
        */
        TraerVariables.getSgUE().setText("Escribir...");
        
    }
    
    public void ValidadCantidadDeContraseñaConMouseFuera(MouseEvent evt){        

            
            if(!TraerVariables.getContraseñaOcultaUE().getText().equals("Escribir...")){
        
                if(TraerVariables.getContraseñaOcultaUE().getText().length() > CantidadMaximaDeCaracteres){
        
                    evt.consume();
            
                    //JOptionPane.showMessageDialog(null, "La cantidad maxima de caracteres que puedes ingresar para tu Contraseña es de 8 caracteres", "LIMITE EXCEDIDO", JOptionPane.ERROR_MESSAGE);
            
                    TraerVariables.getValidarCantidadDeContraseñaUE().setText(" *Maximo 8 caracteres");
                    
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

                        TraerVariables.getValidarCantidadDeContraseñaUE().setText("");

                    }

                });
                
                hilo.start();
            
                }else if(TraerVariables.getContraseñaOcultaUE().getText().length() < CantidadMinimaDeCaracteres){
            
                    //JOptionPane.showMessageDialog(null, "La cantidad minima de caracteres que puedes ingresar para tu Contraseña es de 4 caracteres", "LIMITE EXCEDIDO", JOptionPane.ERROR_MESSAGE);
            
                    TraerVariables.getValidarCantidadDeContraseñaUE().setText(" *Minimo 4 caracteres");
            
                }else{
        
                    TraerVariables.getValidarCantidadDeContraseñaUE().setText("");
        
                }
            
            }else{
            
                TraerVariables.getValidarCantidadDeContraseñaUE().setText("");
                
            }
        
    }
    
    public void ValidadCantidadDeContraseñaConTeclado(KeyEvent evt){        
        
            if(TraerVariables.getContraseñaOcultaUE().getText().length() > CantidadMaximaDeCaracteres){
        
                evt.consume();
            
                TraerVariables.getValidarCantidadDeContraseñaUE().setText(" *Maximo 8 caracteres");
                
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

                        TraerVariables.getValidarCantidadDeContraseñaUE().setText("");

                    }

                });
                
                hilo.start();
            
            }else if(TraerVariables.getContraseñaOcultaUE().getText().length() < CantidadMinimaDeCaracteres){
                        
                TraerVariables.getValidarCantidadDeContraseñaUE().setText(" *Minimo 4 caracteres");
            
            }else{
                
                TraerVariables.getValidarCantidadDeContraseñaUE().setText("");
            
            }
            
    }
    
    public void VisualizarTuContraseña(KeyEvent evt){
    
        TraerVariables.getVisualizarContraseñaUE().setText(TraerVariables.getContraseñaOcultaUE().getText());
        
    }
    
    public void VisualizarTuContraseñaClick(MouseEvent evt){
    
        TraerVariables.getVisualizarContraseñaUE().setText(TraerVariables.getContraseñaOcultaUE().getText());
        
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
