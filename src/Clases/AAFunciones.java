/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import GUIS.Registrarse;
import static GUIS.Registrarse.Foto;
import static GUIS.Registrarse.GeneroGroup;
import static GUIS.Registrarse.Portada;
import static GUIS.Registrarse.Siguiente;
import Plegables.AgregarAño1;
import Plegables.AñadirAdministrador;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ING. JULIAN SEQUEDA
 */
public class AAFunciones {
    
    AñadirAdministrador traer;

    public AAFunciones(AñadirAdministrador traer) {
        this.traer = traer;
    }
    
    ImageIcon IconoPerfil = new ImageIcon(getClass().getResource("/Iconos/TradicionalUser-BigIcon.png"));
    
    ImageIcon IconoPortada = new ImageIcon(getClass().getResource("/Imagenes/FondoSocialPOST-Principal.jpg"));
    
    
    public static char Letras;
    public static char Numeros;
    public static char Caracteres;
    public static char Entrar;
    
    public static int CantidadMinimaDeCaracteres = 3;
        
    public static int CantidadMaximaDeCaracteres = 7;
    
    
    public void MouseClickNombre(){
    
        if(traer.getNom().getText().equals("Escribir...")){
            
            traer.getNom().setText("");
            
        }
        
        if(traer.getApdo().getText().equals("")){
            
            traer.getApdo().setText("Escribir...");
        
        }else if(traer.getCorreo().getText().equals("")){
        
            traer.getCorreo().setText("Escribir...");
            
        }else if(traer.getContraseñaOculta().getText().equals("")){
            
            traer.getContraseñaOculta().setText("Escribir...");
                
            traer.getValidarCantidadDeContraseña().setText("");
                
        }else if(traer.getIngresarSlogan().getText().equals("")){
        
            traer.getIngresarSlogan().setText("Escribir...");
            
        }
    
    }
    
    public void MouseClickApdo(){
    
        if(traer.getApdo().getText().equals("Escribir...")){
            
            traer.getApdo().setText("");
            
        }
        
        if(traer.getNom().getText().equals("")){
            
            traer.getNom().setText("Escribir...");
        
        }else if(traer.getCorreo().getText().equals("")){
        
            traer.getCorreo().setText("Escribir...");            
            
        }else if(traer.getContraseñaOculta().getText().equals("")){
            
            traer.getContraseñaOculta().setText("Escribir...");
                
            traer.getValidarCantidadDeContraseña().setText("");
                
        }else if(traer.getIngresarSlogan().getText().equals("")){
        
            traer.getIngresarSlogan().setText("Escribir...");
            
        }

    }
    
    public void MouseClickCorreo(){
    
        if(traer.getCorreo().getText().equals("Escribir...")){
            
            traer.getCorreo().setText("");
        
        }
        
        if(traer.getNom().getText().equals("")){
        
            traer.getNom().setText("Escribir...");
            
        }else if(traer.getApdo().getText().equals("")){
        
            traer.getApdo().setText("Escribir...");
            
        }else if(traer.getContraseñaOculta().getText().equals("")){
            
            traer.getContraseñaOculta().setText("Escribir...");
                
            traer.getValidarCantidadDeContraseña().setText("");
                
        }else if(traer.getIngresarSlogan().getText().equals("")){
        
            traer.getIngresarSlogan().setText("Escribir...");
            
        }
    
    }
    
    public void MouseClickContraseñaOculta(){
    
        if(traer.getContraseñaOculta().getText().equals("Escribir...")){
            
            traer.getContraseñaOculta().setText("");
        
        }
        
        if(traer.getNom().getText().equals("")){
        
            traer.getNom().setText("Escribir...");
            
        }else if(traer.getApdo().getText().equals("")){
        
            traer.getApdo().setText("Escribir...");
            
        }else if(traer.getCorreo().getText().equals("")){
        
            traer.getCorreo().setText("Escribir...");
            
        }else if(traer.getIngresarSlogan().getText().equals("")){
        
            traer.getIngresarSlogan().setText("Escribir...");
            
        }
    
    }
    
    public void MouseClickContraseñaVisible(){
        
        if(traer.getContraseñaVisible().getText().equals("Escribir...")){
            
            traer.getContraseñaVisible().setText("");
        
        }
        
        if(traer.getNom().getText().equals("")){
        
            traer.getNom().setText("Escribir...");
            
        }else if(traer.getApdo().getText().equals("")){
        
            traer.getApdo().setText("Escribir...");
            
        }else if(traer.getCorreo().getText().equals("")){
        
            traer.getCorreo().setText("Escribir...");
            
        }else if(traer.getIngresarSlogan().getText().equals("")){
        
            traer.getIngresarSlogan().setText("Escribir...");
            
        }
    
    }
    
    public void MouseClickSlogan(){
    
        if(traer.getIngresarSlogan().getText().equals("Escribir...")){
            
            traer.getIngresarSlogan().setText("");
        
        }
        
        if(traer.getNom().getText().equals("")){
        
            traer.getNom().setText("Escribir...");
            
        }else if(traer.getApdo().getText().equals("")){
        
            traer.getApdo().setText("Escribir...");
            
        }else if(traer.getCorreo().getText().equals("")){
        
            traer.getCorreo().setText("Escribir...");
            
        }else if(traer.getContraseñaOculta().getText().equals("")){
            
            traer.getContraseñaOculta().setText("Escribir...");
                
            traer.getValidarCantidadDeContraseña().setText("");
                
        }
        
    }
    
    public void ValidarBtnEnterNombre(KeyEvent evt){
    
        BloquearPegadoAltYShitf(evt);
        
        if(evt.getKeyCode() == evt.VK_ENTER){
            
            traer.getApdo().requestFocus();
            
            if(traer.getApdo().getText().equals("Escribir...")){
            
                traer.getApdo().setText("");
                
                if(traer.getNom().getText().equals("")){
                
                    traer.getNom().setText("Escribir...");
                
                }
            
            }
        
        }
    
    } 
    
    public void ValidarBtnEnterApdo(KeyEvent evt){
        
        BloquearPegadoAltYShitf(evt);
        
        if(evt.getKeyCode() == evt.VK_ENTER){
            
            traer.getCorreo().requestFocus();
            
            if(traer.getCorreo().getText().equals("Escribir...")){
            
                traer.getCorreo().setText("");
                
                if(traer.getApdo().getText().equals("")){
                
                   traer.getApdo().setText("Escribir...");
                
                }
            
            }
        
        }
    
    }
    
    public void ValidarBtnEnterCorreo(KeyEvent evt){
        
        BloquearPegadoAltYShitf(evt);
        
        if(evt.getKeyCode() == evt.VK_ENTER){
            
                traer.getContraseñaOculta().requestFocus();
            
                if(traer.getContraseñaOculta().getText().equals("Escribir...")){
                    
                    traer.getContraseñaOculta().setText("");
                    
                    if(traer.getCorreo().getText().equals("")){
                
                        traer.getCorreo().setText("Escribir...");
                
                    }
                
                }
            
        }
    
    }
    
    public void ValidarBtnEnterContraseñaOculta(KeyEvent evt){
        
        BloquearPegadoAltYShitf(evt);
        
        if(evt.getKeyCode() == evt.VK_ENTER){
            
            Siguiente.doClick();
        
        }
    
    }
    
    public void ValidarBtnEnterContraseñaVisible(KeyEvent evt){
        
        BloquearPegadoAltYShitf(evt);
        
        if(evt.getKeyCode() == evt.VK_ENTER){
            
            Siguiente.doClick();
        
        }
    
    }
    
    public void ValidarSolamenteLetras(KeyEvent evt){
        
        Letras = evt.getKeyChar();
        Entrar = evt.getKeyChar();
    
        if(!Character.isLetter(Letras)&& Letras != KeyEvent.VK_BACK_SPACE && Letras != KeyEvent.VK_SPACE && Letras != KeyEvent.VK_DELETE && Entrar != KeyEvent.VK_ENTER){
            
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar letras.", "ERROR DE DIGITACION", JOptionPane.ERROR_MESSAGE);
            
        }else if(evt.getKeyCode() == evt.VK_ENTER){
            
            Registrarse.Siguiente.doClick();
        
        }
    
    }
    
    public void ValidarSolamenteNumeros(KeyEvent evt){
        
        Numeros = evt.getKeyChar();
        Entrar = evt.getKeyChar();
    
        if(!Character.isDigit(Numeros)&& Numeros != KeyEvent.VK_BACK_SPACE && Numeros != KeyEvent.VK_SPACE && Numeros != KeyEvent.VK_DELETE && Entrar != KeyEvent.VK_ENTER){
            
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar Numeros.", "ERROR DE DIGITACION", JOptionPane.ERROR_MESSAGE);
            
        }else if(evt.getKeyCode() == evt.VK_ENTER){
            
            Registrarse.Siguiente.doClick();
        
        }
    
    }
    
    public void ValidarNumerosYLetras(KeyEvent evt){
    
        Caracteres = evt.getKeyChar();
        Entrar = evt.getKeyChar();
        
        if(!Character.isLetterOrDigit(Caracteres) && Caracteres != KeyEvent.VK_MINUS && Caracteres != KeyEvent.VK_UNDERSCORE && Caracteres != KeyEvent.VK_PERIOD && Caracteres != KeyEvent.VK_BACK_SPACE && Caracteres != KeyEvent.VK_SPACE && Caracteres != KeyEvent.VK_DELETE && Entrar != KeyEvent.VK_ENTER){
            
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar letras o numeros y ciertos caracteres tales como: '.' y '-'.", "ERROR DE DIGITACION", JOptionPane.ERROR_MESSAGE);
            
        }else if(evt.getKeyCode() == evt.VK_ENTER){
            
            Registrarse.Siguiente.doClick();
        
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
            
        int nItems = traer.getDia().getItemCount();
        boolean Existe = false;
        int i;
        
        if(traer.getMes().getSelectedItem().toString().equals("Febrero")){
            
            if(traer.getDia().getSelectedItem().toString().equals("29")||traer.getDia().getSelectedItem().toString().equals("30")||traer.getDia().getSelectedItem().toString().equals("31")){
            
                traer.getDia().setSelectedItem("28");
            
            }
            
            traer.getDia().removeItem("29");
            traer.getDia().removeItem("30");
            traer.getDia().removeItem("31");
            
        }
        
        if(!traer.getMes().getSelectedItem().toString().equals("Febrero")){
        
            for(i=0; i<nItems; i++){
            
                if(traer.getDia().getItemAt(i).equals(Dia29)||traer.getDia().getItemAt(i).equals(Dia30)||traer.getDia().getItemAt(i).equals(Dia31)){
        
                    Existe = true;
                    
                    break;
            
                }
            
            }
            
            if(!Existe){
                
                traer.getDia().addItem(Dia29);
                traer.getDia().addItem(Dia30);
                traer.getDia().addItem(Dia31);
                
            }
                
        }
    
    }
    
    public void HabilitarYDeshabilitarAño(){
    
        if(traer.getAño().getSelectedItem().toString().equals("Digitar")){
        
            traer.getAñoSpinner().setVisible(true);
            traer.getAño().setEnabled(false);
            traer.getIngresarAño().setVisible(true);
            traer.getSeleccionarAño().setVisible(true);
            
        }
    
    }
    
    public void AñadirAño(){
        
        int SpinnerValor = (Integer) traer.getAñoSpinner().getValue();
        String SpinnerConvertido = String.valueOf(SpinnerValor);
        
        
        int nItems = traer.getAño().getItemCount();
        boolean Existe = false;
        int i;
    
        if(traer.getAñoSpinner().getValue().toString().equals("0")){
        
            JOptionPane.showMessageDialog(null, "Por favor ingrese un año valido.", "AÑO INVALIDO", JOptionPane.ERROR_MESSAGE);
            
        }else{
            
            for(i=0; i<nItems; i++){
            
                if(traer.getAño().getItemAt(i).equals(SpinnerConvertido)){
        
                    Existe = true;
                    
                    break;
            
                }
            
            }
            
            if(!Existe){
                
                traer.getAño().addItem(traer.getAñoSpinner().getValue().toString());

                traer.getAño().setSelectedIndex(nItems);
                
                JOptionPane.showMessageDialog(null, "Su año ha sido AÑADIDO a la Lista: Año, de manera EXITOSA.", "ENABUENAHORA", JOptionPane.INFORMATION_MESSAGE);
                
                traer.getAñoSpinner().setValue(1000);
                
                traer.getAñoSpinner().setVisible(false);
                traer.getSeleccionarAño().setVisible(false);
                traer.getIngresarAño().setVisible(false);
                traer.getAño().setEnabled(true);
                
            }else{
            
                JOptionPane.showMessageDialog(null, "Ese año ya existe, por favor ingrese un año distinto.", "AÑO YA EXISTENTE", JOptionPane.INFORMATION_MESSAGE);
                
            }
            
        }
        
    }
    
    public void VerContraseña(){
    
            
        traer.getContraseñaVisible().setVisible(false);
        traer.getContraseñaOculta().setVisible(true);
        traer.getContraseñaOculta().setText(traer.getContraseñaVisible().getText());

    
    }
    
    public void RestarContador(int Contador){
        
        Contador = Contador - Contador;
    
    }
    
    public void LimpiarRegistro(){
        
        traer.getNom().setText("");
        traer.getApdo().setText("");
        GeneroGroup.clearSelection();
        traer.getDia().setSelectedIndex(0);
        traer.getMes().setSelectedIndex(0);
        traer.getAño().setSelectedIndex(0);
        traer.getCorreo().setText("");
        traer.getTipoCorreo().setSelectedIndex(0);
        traer.getExtencion().setSelectedIndex(0);
        traer.getContraseñaOculta().setText("");
        traer.getContraseñaVisible().setText("");     
        Foto.setIcon(null);
        Portada.setIcon(null);
        Foto.setText("Foto de Perfil");
        Portada.setText("Foto de Portada");
        traer.getIngresarSlogan().setText("");
        //traer.setAprovado(true);
        //System.out.println("Restablecer booleano: "+traer.isAprovado());
        
        JOptionPane.showMessageDialog(null,"Su formulario ha sido limpiado con EXITO.", "Formulario Limpiado", JOptionPane.INFORMATION_MESSAGE);
        
        traer.getNom().setText("Escribir...");
        traer.getApdo().setText("Escribir...");
        traer.getCorreo().setText("Escribir...");
        
        traer.getHombre().setSelected(true);
        traer.getContraseñaOculta().setText("Escribir...");
        Foto.setText(null);
        Portada.setText(null);
        Foto.setIcon(IconoPerfil);
        Portada.setIcon(IconoPortada);
        traer.getIngresarSlogan().setText("");
        
    }
    
    public void ValidadCantidadDeContraseñaConMouseFuera(MouseEvent evt){        
            
            if(!traer.getContraseñaOculta().getText().equals("Escribir...")){
        
                if(traer.getContraseñaOculta().getText().length() > CantidadMaximaDeCaracteres){
        
                    evt.consume();
            
                    //JOptionPane.showMessageDialog(null, "La cantidad maxima de caracteres que puedes ingresar para tu Contraseña es de 8 caracteres", "LIMITE EXCEDIDO", JOptionPane.ERROR_MESSAGE);
            
                    traer.getValidarCantidadDeContraseña().setText(" *Maximo 8 caracteres");
                    
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

                        traer.getValidarCantidadDeContraseña().setText("");

                    }

                });
                
                hilo.start();
            
                }else if(traer.getContraseñaOculta().getText().length() < CantidadMinimaDeCaracteres){
            
                    //JOptionPane.showMessageDialog(null, "La cantidad minima de caracteres que puedes ingresar para tu Contraseña es de 4 caracteres", "LIMITE EXCEDIDO", JOptionPane.ERROR_MESSAGE);
            
                    traer.getValidarCantidadDeContraseña().setText(" *Minimo 4 caracteres");
            
                }else{
        
                    traer.getValidarCantidadDeContraseña().setText("");
        
                }
            
            }else{
            
                traer.getValidarCantidadDeContraseña().setText("");
                
            }

        
    }
    
    public void ValidadCantidadDeContraseñaConTeclado(KeyEvent evt){        
        
            if(traer.getContraseñaOculta().getText().length() > CantidadMaximaDeCaracteres){
        
                evt.consume();
            
                traer.getValidarCantidadDeContraseña().setText(" *Maximo 8 caracteres");
                
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

                        traer.getValidarCantidadDeContraseña().setText("");

                    }

                });
                
                hilo.start();
            
            }else if(traer.getContraseñaOculta().getText().length() < CantidadMinimaDeCaracteres){
                        
                traer.getValidarCantidadDeContraseña().setText(" *Minimo 4 caracteres");
            
            }else{
                
                traer.getValidarCantidadDeContraseña().setText("");
            
            }
    
    }
  
}
