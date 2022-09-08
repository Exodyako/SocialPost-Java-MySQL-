
package Clases;

import java.io.Serializable;

public class Usuarios implements Serializable{
    
    private String  NombreR, ApellidoR, GenerosR, FechaR, CorreoR, ContraseñaOcultaR, ContraseñaVisibleR, ImgPerfil, ImgPortada, SloganR,telefono,direccion,descripcion, Post;

    public void setPost(String Post) {
        this.Post = Post;
    }

    public String getPost() {
        return Post;
    }

    public String getContraseñaVisibleR() {
        return ContraseñaVisibleR;
    }

    public void setContraseñaVisibleR(String ContraseñaVisibleR) {
        this.ContraseñaVisibleR = ContraseñaVisibleR;
    }

    public Usuarios(String ContraseñaVisibleR) {
        this.ContraseñaVisibleR = ContraseñaVisibleR;
    }

    public Usuarios(String NombreR, String ApellidoR, String GenerosR, String FechaR, String CorreoR, String ContraseñaOcultaR, String ImgPerfil, String ImgPortada, String SloganR, String telefono, String direccion, String descripcion,String Post) {
        this.NombreR = NombreR;
        this.ApellidoR = ApellidoR;
        this.GenerosR = GenerosR;
        this.FechaR = FechaR;
        this.CorreoR = CorreoR;
        this.ContraseñaOcultaR = ContraseñaOcultaR;
        this.ImgPerfil = ImgPerfil;
        this.ImgPortada = ImgPortada;
        this.SloganR = SloganR;
        this.telefono = telefono;
        this.direccion = direccion;
        this.descripcion = descripcion;
        this.Post=Post;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

    public String getSloganR() {
        return SloganR;
    }

    public void setSloganR(String SloganR) {
        this.SloganR = SloganR;
    }

    public String getNombreR() {
        return NombreR;
    }

    public void setNombreR(String NombreR) {
        this.NombreR = NombreR;
    }

    public String getApellidoR() {
        return ApellidoR;
    }

    public void setApellidoR(String ApellidoR) {
        this.ApellidoR = ApellidoR;
    }

    public String getGenerosR() {
        return GenerosR;
    }

    public void setGenerosR(String GenerosR) {
        this.GenerosR = GenerosR;
    }

    public String getFechaR() {
        return FechaR;
    }

    public void setFechaR(String FechaR) {
        this.FechaR = FechaR;
    }

    public String getCorreoR() {
        return CorreoR;
    }

    public void setCorreoR(String CorreoR) {
        this.CorreoR = CorreoR;
    }

    public String getContraseñaOcultaR() {
        return ContraseñaOcultaR;
    }

    public void setContraseñaOcultaR(String ContraseñaOcultaR) {
        this.ContraseñaOcultaR = ContraseñaOcultaR;
    }


    public String getImgPerfil() {
        return ImgPerfil;
    }

    public void setImgPerfil(String ImgPerfil) {
        this.ImgPerfil = ImgPerfil;
    }

    public String getImgPortada() {
        return ImgPortada;
    }

    public void setImgPortada(String ImgPortada) {
        this.ImgPortada = ImgPortada;
    }
    
     
     
}
