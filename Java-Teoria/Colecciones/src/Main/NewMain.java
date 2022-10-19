/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Service.Service;
import Colecciones.Jugador;
import java.util.Scanner;
public class NewMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        //Service Jugador = new Service();
        //Jugador.llenarObjeto();
        //Jugador.mostrar();     
        
        Jugador Objeto[] = new Jugador[2];
        
        for(int i=0 ; i < 2;i++){
        
        System.out.println("Ingrese pais");
        String pais = scan.nextLine();
        System.out.println("Ingrese nombre del jugador");
        String nombre = scan.nextLine();
        System.out.println("Ingrese edad del jugador");
        int edad= scan.nextInt();
        System.out.println("Ingrese altura el jugador");
        double altura = scan.nextDouble();
        
        Objeto [i] = new Jugador(pais,nombre,edad,altura);
        scan.nextLine();
        }
        
        for(int i=0 ; i < 2;i++){
            System.out.println(Objeto[i].getPais());
            System.out.println(Objeto[i].getNombre());
            System.out.println(Objeto[i].getAltura());
             System.out.println(Objeto[i].getEdad());
             
        }
        
        
        
    }
    
}
