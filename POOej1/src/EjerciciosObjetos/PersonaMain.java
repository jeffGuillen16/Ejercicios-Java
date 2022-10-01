/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosObjetos;
import EjerciciosGuiaPoo.Persona;
/**
 *
 * @author marco
 */
public class PersonaMain {

    public static void main(String[] args) {
        Persona Persona1= new Persona("Mario",24,70,1.68);
        Persona1.calcularIMC();
        
        System.out.println("--------");
        Persona Persona2= new Persona("Mati",19,100,1.70);
        Persona2.calcularIMC();
        
        System.out.println("--------");
        Persona Persona3= new Persona("Mari",20,30,1.50);
        Persona3.calcularIMC();
        
        System.out.println("--------");
        Persona Persona4= new Persona("Juli",20,68,1.70);
        Persona4.calcularIMC();
    }
    
}
