
package Clases;

import GUIS.IniciarSesion;
import static GUIS.Registrarse.Foto;
import static GUIS.Registrarse.Portada;
import ImportarExportar.CargarFoto;
import ImportarExportar.CargarFoto2;
import UsuariosSocialPOST.Usuario;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;



public class CargarArchivos {
    
    private String urlPerfil;
    private String urlPortada;
    
    Usuario fotos;
    
    public CargarArchivos(Usuario fotos) {
        
        this.fotos = fotos;
        
    }

    public String getUrlPerfil() {
        return urlPerfil;
    }

    public String getUrlPortada() {
        return urlPortada;
    }
    
    
    public void CargarFotoDePerfilParaSocial(){
    
        File Fichero;
        
        int Resultado;
        
        CargarFoto FC = new CargarFoto();
        
        FileNameExtensionFilter Filtro = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");
        
        FC.CargarFotos.setFileFilter(Filtro);
        
        Resultado = FC.CargarFotos.showOpenDialog(null);
        
        if(JFileChooser.APPROVE_OPTION == Resultado){
        
            Fichero = FC.CargarFotos.getSelectedFile();
            
            try {
                
                ImageIcon Iconito = new ImageIcon(Fichero.toString());
                
                Icon Icono = new ImageIcon(Iconito.getImage().getScaledInstance(Foto.getWidth(), Foto.getHeight(), Image.SCALE_DEFAULT));
                
                Foto.setText(null);
                
                Foto.setIcon(null);
                
                Foto.setIcon(Icono);
                
                urlPerfil=Fichero.getPath();
                
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar tu foto"+e);
                
            }
            
        }
        
    }
    
    public void CargarFotoDePortadaParaSocial(){
    
        File Fichero2;
        
        int Resultado2;
        
        CargarFoto2 FC2 = new CargarFoto2();
        
        FileNameExtensionFilter Filtro2 = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");
        
        FC2.CargarPortadas.setFileFilter(Filtro2);
        
        Resultado2 = FC2.CargarPortadas.showOpenDialog(null);
        
        if(JFileChooser.APPROVE_OPTION == Resultado2){
        
            Fichero2 = FC2.CargarPortadas.getSelectedFile();
            
            try {
                
                ImageIcon Iconito2 = new ImageIcon(Fichero2.toString());
                
                Icon Icono2 = new ImageIcon(Iconito2.getImage().getScaledInstance(Portada.getWidth(), Portada.getHeight(), Image.SCALE_DEFAULT));
                
                Portada.setText(null);
                
                Portada.setIcon(null);
                
                Portada.setIcon(Icono2);
                urlPortada=Fichero2.getPath();
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar tu foto"+e);
                
            }
            
        }
        
    }
    
    
    public void CargarFoto(String ruta,JLabel campo){  
        
        System.out.println(ruta);
        
        File Fichero= new File(ruta);
        
        System.out.println(Fichero.toString());
        
            try {                
                
                ImageIcon Iconito = new ImageIcon(Fichero.toString());                
                Icon Icono = new ImageIcon(Iconito.getImage().getScaledInstance(campo.getWidth(), campo.getHeight(), Image.SCALE_DEFAULT));
                
                campo.setText(null);
                campo.setIcon(null);
                campo.setIcon(Icono);
                
            } catch (Exception e) {                
                
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar tu foto "+e);
                
            }
             
    }
    
    public void CargarFotoDePerfilParaSocial2(){
    
        File Fichero;
        
        int Resultado;
        
        CargarFoto FC = new CargarFoto();
        
        FileNameExtensionFilter Filtro = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");
        
        FC.CargarFotos.setFileFilter(Filtro);
        
        Resultado = FC.CargarFotos.showOpenDialog(null);
        
        if(JFileChooser.APPROVE_OPTION == Resultado){
        
            Fichero = FC.CargarFotos.getSelectedFile();
            
            try {
                
                ImageIcon Iconito = new ImageIcon(Fichero.toString());
                
                Icon Icono = new ImageIcon(Iconito.getImage().getScaledInstance(fotos.getFotoUsuario().getWidth(), fotos.getFotoUsuario().getHeight(), Image.SCALE_DEFAULT));
                
                fotos.getFotoUsuario().setText(null);
                
                fotos.getFotoUsuario().setIcon(null);
                
                fotos.getFotoUsuario().setIcon(Icono);
                
                urlPerfil=Fichero.getPath();
                
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar tu foto"+e);
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            
        }
        
    }
    
    public void CargarFotoDePortadaParaSocial2(){
    
        File Fichero2;
        
        int Resultado2;
        
        CargarFoto2 FC2 = new CargarFoto2();
        
        FileNameExtensionFilter Filtro2 = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");
        
        FC2.CargarPortadas.setFileFilter(Filtro2);
        
        Resultado2 = FC2.CargarPortadas.showOpenDialog(null);
        
        if(JFileChooser.APPROVE_OPTION == Resultado2){
        
            Fichero2 = FC2.CargarPortadas.getSelectedFile();
            
            try {
                
                ImageIcon Iconito2 = new ImageIcon(Fichero2.toString());
                
                Icon Icono2 = new ImageIcon(Iconito2.getImage().getScaledInstance(fotos.getPortadaUsuario().getWidth(), fotos.getPortadaUsuario().getHeight(), Image.SCALE_DEFAULT));
                
                fotos.getPortadaUsuario().setText(null);
                
                fotos.getPortadaUsuario().setIcon(null);
                
                fotos.getPortadaUsuario().setIcon(Icono2);
                urlPortada=Fichero2.getPath();
                
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar tu foto"+e);
                
            }
            
        }
        
    }
    
}
