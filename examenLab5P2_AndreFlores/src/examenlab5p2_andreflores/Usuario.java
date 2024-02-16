package examenlab5p2_andreflores;

import java.util.Date;
import java.util.Random;

public class Usuario {

    private String nombre;
    private String apellido;
    private String contra;
    private Date fechaNacimiento;
    private String sexo;
    private String departamento;
    private String numId;

    public Usuario(String nombre, String apellido, String contra, Date fechaNacimiento, String sexo, String departamento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contra = contra;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.departamento = departamento;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNumId() {
        return asignarId(departamento, fechaNacimiento);
    }

    public void setNumId(String numId) {
        this.numId = numId;
    }

    public String asignarId(String departamento, Date fechaNacimiento) {
        String identidad = "";
        String municipio = "";
        Random random = new Random();
        if (departamento.equalsIgnoreCase("francisco Morazan")) {

            int numero = random.nextInt(3);
            int numero2 = random.nextInt(9);
            municipio += numero;
            municipio += numero2;
            int numeroFinal = random.nextInt(10000, 99999);
            identidad = "01" + municipio + (fechaNacimiento.getYear() + 1900) + numeroFinal;
        } else if (departamento.equalsIgnoreCase("cortes")) {
            int numero = random.nextInt(2);
            int numero2 = random.nextInt(3);
            municipio += numero;
            municipio += numero2;
            int numeroFinal = random.nextInt(10000, 99999);
            identidad = "02" + municipio + (fechaNacimiento.getYear() + 1900) + numeroFinal;
        } else if (departamento.equalsIgnoreCase("comayaguela")) {
            int numero = random.nextInt(3);
            int numero2 = random.nextInt(2);
            municipio += numero;
            municipio += numero2;
            int numeroFinal = random.nextInt(10000, 99999);
            identidad = "03" + municipio + (fechaNacimiento.getYear() + 1900) + numeroFinal;
        }
        return identidad;
    }

}
