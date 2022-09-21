/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

public class Persona {
    public String nombre;
    public int dni;
    public int edad;
    
    public Persona(){
       System.out.println("Hi everyOne");
           
    }
    
    // contructor
    public Persona(String nombre,int dni,int edad){
        this.nombre=nombre;
        this.dni=dni;
        this.edad=edad;
        
       System.out.println("My name is " + this.nombre + " , I am " + 
               this.edad + "years old and my Id is " + this.dni +".");
    }
}
