/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MascotaService;
import ClassService.Perro;
import java.util.Scanner;
public class Mascota {
    Scanner Leer = new Scanner(System.in);
    
    public Perro crearMascota(){
        System.out.println("Nombre del perro : " );
        String nombre =Leer.next();
        
        System.out.println("Ingrese raza del perro : ");
        String raza = Leer.next();
        
     
        System.out.println("Ingrese color del perro : ");
        String color = Leer.next();
        
        return new Perro(nombre , color , raza);
    }

  
}
 
