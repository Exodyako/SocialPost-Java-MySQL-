
package Clases;

import GUIS.Registrarse;
import static GUIS.Registrarse.Foto;
import static GUIS.Registrarse.GeneroGroup;
import static GUIS.Registrarse.Portada;
import static GUIS.Registrarse.Siguiente;
import Plegables.AgregarAño1;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class RegistrarseFunciones {
    
    public RegistrarseFunciones(Registrarse registrarse) {
        
        this.registrarse = registrarse;
        
    }
    
    public Registrarse getRegistrarse(){
        
        return registrarse;
        
    }
    
    Registrarse registrarse; 
    
    AgregarAño1 AñoPlegable;
    
    ImageIcon IconoPerfil = new ImageIcon(getClass().getResource("/Iconos/TradicionalUser-BigIcon.png"));
    
    ImageIcon IconoPortada = new ImageIcon(getClass().getResource("/Imagenes/FondoSocialPOST-Principal.jpg"));
    
    
    public static char Letras;
    public static char Numeros;
    public static char Caracteres;
    public static char Entrar;
    
    public static int CantidadMinimaDeCaracteres = 3;
        
    public static int CantidadMaximaDeCaracteres = 7;
    
    
    public void MouseClickNombre(){
    
        if(registrarse.getNom().getText().equals("Escribir...")){
            
            registrarse.getNom().setText("");
            
        }
        
        if(registrarse.getApdo().getText().equals("")){
            
            registrarse.getApdo().setText("Escribir...");
        
        }else if(registrarse.getCorreo().getText().equals("")){
        
            registrarse.getCorreo().setText("Escribir...");
            
        }else if(!registrarse.getMostrarContraseña().isSelected()){
            
            if(registrarse.getContraseñaOculta().getText().equals("")){
            
                registrarse.getContraseñaOculta().setText("Escribir...");
                
                registrarse.getValidarCantidadDeContraseña().setText("");
                
            }
        
        }else if(registrarse.getMostrarContraseña().isSelected()){
        
            if(registrarse.getContraseñaVisible().getText().equals("")){
        
                registrarse.getContraseñaVisible().setText("Escribir...");
                
                registrarse.getValidarCantidadDeContraseña().setText("");
            
            }
            
        }
    
    }
    
    public void MouseClickApdo(){
    
        if(registrarse.getApdo().getText().equals("Escribir...")){
            
            registrarse.getApdo().setText("");
            
        }
        
        if(registrarse.getNom().getText().equals("")){
            
            registrarse.getNom().setText("Escribir...");
        
        }else if(registrarse.getCorreo().getText().equals("")){
        
            registrarse.getCorreo().setText("Escribir...");
            
        }else if(!registrarse.getMostrarContraseña().isSelected()){
            
            if(registrarse.getContraseñaOculta().getText().equals("")){
            
                registrarse.getContraseñaOculta().setText("Escribir...");
                
                registrarse.getValidarCantidadDeContraseña().setText("");
                
            }
        
        }else if(registrarse.getMostrarContraseña().isSelected()){
        
            if(registrarse.getContraseñaVisible().getText().equals("")){
        
                registrarse.getContraseñaVisible().setText("Escribir...");
                
                registrarse.getValidarCantidadDeContraseña().setText("");
            
            }
            
        }
    
    }
    
    public void MouseClickCorreo(){
    
        if(registrarse.getCorreo().getText().equals("Escribir...")){
            
            registrarse.getCorreo().setText("");
        
        }
        
        if(registrarse.getNom().getText().equals("")){
        
            registrarse.getNom().setText("Escribir...");
            
        }else if(registrarse.getApdo().getText().equals("")){
        
            registrarse.getApdo().setText("Escribir...");
            
        }else if(!registrarse.getMostrarContraseña().isSelected()){
            
            if(registrarse.getContraseñaOculta().getText().equals("")){
            
                registrarse.getContraseñaOculta().setText("Escribir...");
                
                registrarse.getValidarCantidadDeContraseña().setText("");
                
            }
        
        }else if(registrarse.getMostrarContraseña().isSelected()){
        
            if(registrarse.getContraseñaVisible().getText().equals("")){
        
                registrarse.getContraseñaVisible().setText("Escribir...");
                
                registrarse.getValidarCantidadDeContraseña().setText("");
            
            }
            
        }
    
    }
    
    public void MouseClickContraseñaOculta(){
    
        if(registrarse.getContraseñaOculta().getText().equals("Escribir...")){
            
            registrarse.getContraseñaOculta().setText("");
        
        }
        
        if(registrarse.getNom().getText().equals("")){
        
            registrarse.getNom().setText("Escribir...");
            
        }else if(registrarse.getApdo().getText().equals("")){
        
            registrarse.getApdo().setText("Escribir...");
            
        }else if(registrarse.getCorreo().getText().equals("")){
        
            registrarse.getCorreo().setText("Escribir...");
            
        }
    
    }
    
    public void MouseClickContraseñaVisible(){
        
        if(registrarse.getContraseñaVisible().getText().equals("Escribir...")){
            
            registrarse.getContraseñaVisible().setText("");
        
        }
        
        if(registrarse.getNom().getText().equals("")){
        
            registrarse.getNom().setText("Escribir...");
            
        }else if(registrarse.getApdo().getText().equals("")){
        
            registrarse.getApdo().setText("Escribir...");
            
        }else if(registrarse.getCorreo().getText().equals("")){
        
            registrarse.getCorreo().setText("Escribir...");
            
        }
    
    }
    
    public void ValidarBtnEnterNombre(KeyEvent evt){
    
        BloquearPegadoAltYShitf(evt);
        
        if(evt.getKeyCode() == evt.VK_ENTER){
            
            registrarse.getApdo().requestFocus();
            
            if(registrarse.getApdo().getText().equals("Escribir...")){
            
                registrarse.getApdo().setText("");
                
                if(registrarse.getNom().getText().equals("")){
                
                    registrarse.getNom().setText("Escribir...");
                
                }
            
            }
        
        }
    
    } 
    
    public void ValidarBtnEnterApdo(KeyEvent evt){
        
        BloquearPegadoAltYShitf(evt);
        
        if(evt.getKeyCode() == evt.VK_ENTER){
            
            registrarse.getCorreo().requestFocus();
            
            if(registrarse.getCorreo().getText().equals("Escribir...")){
            
                registrarse.getCorreo().setText("");
                
                if(registrarse.getApdo().getText().equals("")){
                
                   registrarse.getApdo().setText("Escribir...");
                
                }
            
            }
        
        }
    
    }
    
    public void ValidarBtnEnterCorreo(KeyEvent evt){
        
        BloquearPegadoAltYShitf(evt);
        
        if(evt.getKeyCode() == evt.VK_ENTER){
            
            if(registrarse.getMostrarContraseña().isSelected()){
            
                registrarse.getContraseñaVisible().requestFocus();
            
                if(registrarse.getContraseñaVisible().getText().equals("Escribir...")){
            
                    registrarse.getContraseñaVisible().setText("");
                    
                    if(registrarse.getCorreo().getText().equals("")){
                
                        registrarse.getCorreo().setText("Escribir...");
                
                    }
            
                }
            
            }else if(!registrarse.getMostrarContraseña().isSelected()){
            
                registrarse.getContraseñaOculta().requestFocus();
            
                if(registrarse.getContraseñaOculta().getText().equals("Escribir...")){
                    
                    registrarse.getContraseñaOculta().setText("");
                    
                    if(registrarse.getCorreo().getText().equals("")){
                
                        registrarse.getCorreo().setText("Escribir...");
                
                    }
                
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
            
        int nItems = registrarse.getDia().getItemCount();
        boolean Existe = false;
        int i;
        
        if(registrarse.getMes().getSelectedItem().toString().equals("Febrero")){
            
            if(registrarse.getDia().getSelectedItem().toString().equals("29")||registrarse.getDia().getSelectedItem().toString().equals("30")||registrarse.getDia().getSelectedItem().toString().equals("31")){
            
                registrarse.getDia().setSelectedItem("28");
            
            }
            
            registrarse.getDia().removeItem("29");
            registrarse.getDia().removeItem("30");
            registrarse.getDia().removeItem("31");
            
        }
        
        if(!registrarse.getMes().getSelectedItem().toString().equals("Febrero")){
        
            for(i=0; i<nItems; i++){
            
                if(registrarse.getDia().getItemAt(i).equals(Dia29)||registrarse.getDia().getItemAt(i).equals(Dia30)||registrarse.getDia().getItemAt(i).equals(Dia31)){
        
                    Existe = true;
                    
                    break;
            
                }
            
            }
            
            if(!Existe){
                
                registrarse.getDia().addItem(Dia29);
                registrarse.getDia().addItem(Dia30);
                registrarse.getDia().addItem(Dia31);
                
            }
                
        }
    
    }
    
    public void HabilitarYDeshabilitarAño(){
    
        if(registrarse.getAño().getSelectedItem().toString().equals("Digitar")){
        
            AñoPlegable = new AgregarAño1(registrarse, true, this);
            AñoPlegable.setVisible(true);
        
        }
    
    }
    
    public void AñadirAño(){
        
        int SpinnerValor = (Integer) AñoPlegable.getAñoSpinner().getValue();
        String SpinnerConvertido = String.valueOf(SpinnerValor);
        
        
        int nItems = registrarse.getAño().getItemCount();
        boolean Existe = false;
        int i;
    
        if(AñoPlegable.getAñoSpinner().getValue().toString().equals("0")){
        
            JOptionPane.showMessageDialog(null, "Por favor ingrese un año valido.", "AÑO INVALIDO", JOptionPane.ERROR_MESSAGE);
            
        }else{
            
            for(i=0; i<nItems; i++){
            
                if(registrarse.getAño().getItemAt(i).equals(SpinnerConvertido)){
        
                    Existe = true;
                    
                    break;
            
                }
            
            }
            
            if(!Existe){
                
                registrarse.getAño().addItem(AñoPlegable.getAñoSpinner().getValue().toString());

                registrarse.getAño().setSelectedIndex(nItems);
                
                JOptionPane.showMessageDialog(null, "Su año ha sido AÑADIDO a la Lista: Año, de manera EXITOSA.", "ENABUENAHORA", JOptionPane.INFORMATION_MESSAGE);
                
                AñoPlegable.getAñoSpinner().setValue(1000);
                
                AñoPlegable.dispose();
                
            }else{
            
                JOptionPane.showMessageDialog(null, "Ese año ya existe, por favor ingrese un año distinto.", "AÑO YA EXISTENTE", JOptionPane.INFORMATION_MESSAGE);
                
            }
            
        }
        
    }
    
    public void VerContraseña(){
    
        if(registrarse.getMostrarContraseña().isSelected()){
        
            registrarse.getContraseñaVisible().setVisible(true);
            registrarse.getContraseñaOculta().setVisible(false);
            registrarse.getContraseñaVisible().setText(registrarse.getContraseñaOculta().getText());
            
        }else{
            
            registrarse.getContraseñaVisible().setVisible(false);
            registrarse.getContraseñaOculta().setVisible(true);
            registrarse.getContraseñaOculta().setText(registrarse.getContraseñaVisible().getText());
            
        }
    
    }
    
    public void RestarContador(int Contador){
        
        Contador = Contador - Contador;
    
    }
    
    public void LimpiarRegistro(){
        
        registrarse.getNom().setText("");
        registrarse.getApdo().setText("");
        GeneroGroup.clearSelection();
        registrarse.getDia().setSelectedIndex(0);
        registrarse.getMes().setSelectedIndex(0);
        registrarse.getAño().setSelectedIndex(0);
        registrarse.getCorreo().setText("");
        registrarse.getTipoCorreo().setSelectedIndex(0);
        registrarse.getExtencion().setSelectedIndex(0);
        registrarse.getContraseñaOculta().setText("");
        registrarse.getContraseñaVisible().setText("");
        registrarse.getMostrarContraseña().setSelected(false);      
        Foto.setIcon(null);
        Portada.setIcon(null);
        Foto.setText("Foto de Perfil");
        Portada.setText("Foto de Portada");
        registrarse.getIngresarSlogan().setText("");
        registrarse.getMostrarSlogan().setText("Tu Slogan...");
        registrarse.setAprovado(true);
        System.out.println("Restablecer booleano: "+registrarse.isAprovado());
        
        JOptionPane.showMessageDialog(null,"Su formulario ha sido limpiado con EXITO.", "Formulario Limpiado", JOptionPane.INFORMATION_MESSAGE);
        
        registrarse.getNom().setText("Escribir...");
        registrarse.getApdo().setText("Escribir...");
        registrarse.getCorreo().setText("Escribir...");

        
        if(!registrarse.getMostrarContraseña().isSelected()){
        
            registrarse.getContraseñaOculta().setVisible(true);
            registrarse.getContraseñaVisible().setVisible(false);
            
        }
        
        registrarse.getHombre().setSelected(true);
        registrarse.getContraseñaOculta().setText("Escribir...");
        Foto.setText(null);
        Portada.setText(null);
        Foto.setIcon(IconoPerfil);
        Portada.setIcon(IconoPortada);
        registrarse.getIngresarSlogan().setText("");
        registrarse.getMostrarSlogan().setText("");
        
    }
    
    public void ValidadCantidadDeContraseñaConMouseFuera(MouseEvent evt){        
        
        if(!registrarse.getMostrarContraseña().isSelected()){
            
            if(!registrarse.getContraseñaOculta().getText().equals("Escribir...")){
        
                if(registrarse.getContraseñaOculta().getText().length() > CantidadMaximaDeCaracteres){
        
                    evt.consume();
            
                    //JOptionPane.showMessageDialog(null, "La cantidad maxima de caracteres que puedes ingresar para tu Contraseña es de 8 caracteres", "LIMITE EXCEDIDO", JOptionPane.ERROR_MESSAGE);
            
                    registrarse.getValidarCantidadDeContraseña().setText(" *Maximo 8 caracteres");
                    
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

                        registrarse.getValidarCantidadDeContraseña().setText("");

                    }

                });
                
                hilo.start();
            
                }else if(registrarse.getContraseñaOculta().getText().length() < CantidadMinimaDeCaracteres){
            
                    //JOptionPane.showMessageDialog(null, "La cantidad minima de caracteres que puedes ingresar para tu Contraseña es de 4 caracteres", "LIMITE EXCEDIDO", JOptionPane.ERROR_MESSAGE);
            
                    registrarse.getValidarCantidadDeContraseña().setText(" *Minimo 4 caracteres");
            
                }else{
        
                    registrarse.getValidarCantidadDeContraseña().setText("");
        
                }
            
            }else{
            
                registrarse.getValidarCantidadDeContraseña().setText("");
                
            }
        
        }else if(registrarse.getMostrarContraseña().isSelected()){
            
            if(!registrarse.getContraseñaVisible().getText().equals("Escribir...")){
            
                if(registrarse.getContraseñaVisible().getText().length() > CantidadMaximaDeCaracteres){
        
                    evt.consume();
            
                    //JOptionPane.showMessageDialog(null, "La cantidad maxima de caracteres que puedes ingresar para tu Contraseña es de 8 caracteres", "LIMITE EXCEDIDO", JOptionPane.ERROR_MESSAGE);
            
                    registrarse.getValidarCantidadDeContraseña().setText(" *Maximo 8 caracteres");
                    
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

                        registrarse.getValidarCantidadDeContraseña().setText("");

                    }

                });
                
                hilo.start();
            
                }else if(registrarse.getContraseñaVisible().getText().length() < CantidadMinimaDeCaracteres){
            
                    //JOptionPane.showMessageDialog(null, "La cantidad minima de caracteres que puedes ingresar para tu Contraseña es de 4 caracteres", "LIMITE EXCEDIDO", JOptionPane.ERROR_MESSAGE);
            
                    registrarse.getValidarCantidadDeContraseña().setText(" *Minimo 4 caracteres");
            
                }else{
                        
                    registrarse.getValidarCantidadDeContraseña().setText("");
                        
                }
        
            }else{
            
                registrarse.getValidarCantidadDeContraseña().setText("");
                
            }
                
        }
        
    }
    
    public void ValidadCantidadDeContraseñaConTeclado(KeyEvent evt){        
        
        if(!registrarse.getMostrarContraseña().isSelected()){
        
            if(registrarse.getContraseñaOculta().getText().length() > CantidadMaximaDeCaracteres){
        
                evt.consume();
            
                registrarse.getValidarCantidadDeContraseña().setText(" *Maximo 8 caracteres");
                
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

                        registrarse.getValidarCantidadDeContraseña().setText("");

                    }

                });
                
                hilo.start();
            
            }else if(registrarse.getContraseñaOculta().getText().length() < CantidadMinimaDeCaracteres){
                        
                registrarse.getValidarCantidadDeContraseña().setText(" *Minimo 4 caracteres");
            
            }else{
                
                registrarse.getValidarCantidadDeContraseña().setText("");
            
            }
            
        }else if(registrarse.getMostrarContraseña().isSelected()){
            
            if(registrarse.getContraseñaVisible().getText().length() > CantidadMaximaDeCaracteres){
        
                evt.consume();
            
                registrarse.getValidarCantidadDeContraseña().setText(" *Maximo 8 caracteres");
                
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

                        registrarse.getValidarCantidadDeContraseña().setText("");

                    }

                });
                
                hilo.start();
            
            }else if(registrarse.getContraseñaVisible().getText().length() < CantidadMinimaDeCaracteres){
                        
                registrarse.getValidarCantidadDeContraseña().setText(" *Minimo 4 caracteres");
            
            }else{
                
                registrarse.getValidarCantidadDeContraseña().setText("");
            
            }
        
        }
    
    }

    
}
