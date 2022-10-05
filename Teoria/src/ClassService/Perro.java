/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassService;


public class Perro {
    private String nombre;
    private int edad;
    private String color;
    private String raza;
    private int peso;

    public Perro() {
    }

    public Perro(String nombre, String color, String raza) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
    }
    
   
    
    public Perro(String nombre,  int edad, String color ,String raza, int peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.peso = peso;
        
    
    }

    @Override//-> Indica sobre escritura
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", edad=" + edad + ", color=" + color + ", raza=" + raza + ", peso=" + peso + '}';
    }

   
   
    
    
    
    
    
}
