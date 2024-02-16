package examenlab5p2_andreflores;

import java.util.Date;

public class empleado extends Usuario {

    private String carrera;
    private String puestoLaboral;
    private int aniosTrabajando;

    public empleado(String carrera, String puestoLaboral, int aniosTrabajando, String nombre, String apellido, String contra, Date fechaNacimiento, String numId) {
        super(nombre, apellido, contra, fechaNacimiento, numId);
        this.carrera = carrera;
        this.puestoLaboral = puestoLaboral;
        this.aniosTrabajando = aniosTrabajando;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPuestoLaboral() {
        return puestoLaboral;
    }

    public void setPuestoLaboral(String puestoLaboral) {
        this.puestoLaboral = puestoLaboral;
    }

    public int getAniosTrabajando() {
        return aniosTrabajando;
    }

    public void setAniosTrabajando(int aniosTrabajando) {
        this.aniosTrabajando = aniosTrabajando;
    }

    @Override
    public String toString() {
        return "empleado{" + "carrera=" + carrera + ", puestoLaboral=" + puestoLaboral + ", aniosTrabajando=" + aniosTrabajando + '}';
    }

}
