package ejercicio1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Persona {

    private String nombre;
    private String apellido;

    private Perro perro;

    public Persona() {
    }

    ;

    public Persona(String nombre, String apellido, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.perro = perro;
    }

   

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;

    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", perro=" + perro + '}';
    }

   
}
