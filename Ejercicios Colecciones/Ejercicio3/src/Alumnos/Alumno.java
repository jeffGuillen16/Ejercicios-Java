package Alumnos;
import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Alumno {
    private String nombre;
    private ArrayList<Integer>notas;

    //Notas que es pasado como parametro es un ArrayList "this.notas"
    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas =  notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas.toString() + '}';
    }

   
    
    
}
