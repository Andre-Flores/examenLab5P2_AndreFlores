package examenlab5p2_andreflores;

import java.util.Date;

public class tramite {

    private String nombreTramite;
    private String descripcion;
    private Date fechaEnviado;
    private String numId;

    public tramite(String nombreTramite, String descripcion, Date fechaEnviado, String numId) {
        this.nombreTramite = nombreTramite;
        this.descripcion = descripcion;
        this.fechaEnviado = fechaEnviado;
        this.numId = numId;
    }

    public String getNombreTramite() {
        return nombreTramite;
    }

    public void setNombreTramite(String nombreTramite) {
        this.nombreTramite = nombreTramite;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaEnviado() {
        return fechaEnviado;
    }

    public void setFechaEnviado(Date fechaEnviado) {
        this.fechaEnviado = fechaEnviado;
    }

    public String getNumId() {
        return numId;
    }

    public void setNumId(String numId) {
        this.numId = numId;
    }

    @Override
    public String toString() {
        return "nombre del Tramite: " + nombreTramite + ", descripcion: " + descripcion + ", fecha Enviado: " + fechaEnviado + ", numero de identidad del duenio:" + numId ;
    }

    
}
