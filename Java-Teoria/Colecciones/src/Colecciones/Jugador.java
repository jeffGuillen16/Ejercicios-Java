/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;


public class Jugador {
   private String Pais;
   private String nombre;
   private int edad;
   private double altura;

    public Jugador() {
    }

    public Jugador(String Pais, String nombre, int edad, double altura) {
        this.Pais = Pais;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getPais() {
        return Pais;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    
  
   
    
}
