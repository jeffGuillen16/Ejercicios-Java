package ejercicio1;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Perro {
    private String nombre;
    private String raza;

    public Perro() {
    }

    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + '}';
    }
   
    
    
    
    }
