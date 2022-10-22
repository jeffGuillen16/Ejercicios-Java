/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;
import java.util.Comparator;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Jugador {

   
   private String Pais;
   private String nombre;
   private Integer edad;
   private Double altura;

    public Jugador() {
    }

    public Jugador(String Pais, String nombre, int edad, double altura) {
        this.Pais = Pais;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

   

    @Override
    public String toString() {
        return "Jugador{" + "Pais=" + Pais + ", nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + '}';
    }

 
    
  
   
    
}
