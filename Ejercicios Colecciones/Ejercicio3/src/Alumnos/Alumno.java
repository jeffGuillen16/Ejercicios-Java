package Alumnos;
import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Alumno {

    public static Object stream(ArrayList<Alumno> ListAlumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String nombre;
    private ArrayList<Integer>notas;

    //Notas que es pasado como parametro es un ArrayList "this.notas"
    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre; 
        this.notas =  notas; // Pasa notas de tipo ArrayList 
    }

    public Alumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas.toString() + '}';
    }

    
 
   
    
    
}
