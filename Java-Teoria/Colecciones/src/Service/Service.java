/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import Colecciones.Jugador;
import java.util.ArrayList;
import java.util.Scanner;
public class Service {
     ArrayList<Jugador>ObjetoList=new ArrayList();
        
    public void llenarObjeto(){
        
       
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese pais");
        String pais = scan.nextLine();
        System.out.println("Ingrese nombre del jugador");
        String nombre = scan.nextLine();
        System.out.println("Ingrese edad del jugador");
        int edad= scan.nextInt();
        System.out.println("Ingrese altura el jugador");
        double altura = scan.nextDouble();
        ObjetoList.add(new Jugador(pais,nombre,edad,altura));
        
        
    }
    
    public void mostrar(){
        for (Jugador cadena : ObjetoList){
            System.out.println(cadena.getNombre());
            System.out.println(cadena.getEdad());
            System.out.println(cadena.getPais());
            System.out.println(cadena.getAltura());
            
        }
    }
}
