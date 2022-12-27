
package Ejercicio2Teoria;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Jugador {
    private String nombre ;
    private String apellido;
    private String posicion;
    private Integer numero;

    public Jugador() {
    }

      
    public Jugador(String nombre, String apellido, String posicion, Integer numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apellido=" + apellido + ", posicion=" + posicion + ", numero=" + numero + '}';
    }

   
    
    
    
}
