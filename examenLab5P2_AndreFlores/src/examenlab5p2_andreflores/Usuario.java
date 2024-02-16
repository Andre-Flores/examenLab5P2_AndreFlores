
package examenlab5p2_andreflores;

import java.util.Date;

public class Usuario {
    private String nombre;
    private String apellido;
    private String contra;
    private Date fechaNacimiento;
    private String numId;

    public Usuario(String nombre, String apellido, String contra, Date fechaNacimiento, String numId) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contra = contra;
        this.fechaNacimiento = fechaNacimiento;
        this.numId = numId;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumId() {
        return numId;
    }

    public void setNumId(String numId) {
        this.numId = numId;
    }

   
    
    
}
