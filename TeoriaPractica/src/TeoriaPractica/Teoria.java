/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeoriaPractica;

/**
 *
 * @author marco
 */
public class Teoria {
    private final String nombre;
    private static int edad;

  
    public Teoria(String nombre , int edad) {
        this.nombre=nombre;
        this.edad=edad;
    }

    public static void setEdad(int edad) {
        Teoria.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

  
      public int getEdad() {
        return edad;
    }
    
    
    
}
