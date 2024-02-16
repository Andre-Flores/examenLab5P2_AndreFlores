
package examenlab5p2_andreflores;

import java.util.ArrayList;
import java.util.Date;

public class civil extends Usuario {
    public ArrayList <tramite> listaTramites;

    public civil(String nombre, String apellido, String contra, Date fechaNacimiento, String sexo, String departamento) {
        super(nombre, apellido, contra, fechaNacimiento, sexo, departamento);
    }

   

    

    

    public ArrayList<tramite> getListaTramites() {
        return listaTramites;
    }

    public void setListaTramites(ArrayList<tramite> listaTramites) {
        this.listaTramites = listaTramites;
    }
    
}
