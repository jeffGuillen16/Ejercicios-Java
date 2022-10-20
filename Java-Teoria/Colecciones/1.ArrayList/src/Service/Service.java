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
        /*
        System.out.println("Ingrese pais");
        String pais = scan.nextLine();
        System.out.println("Ingrese nombre del jugador");
        String nombre = scan.nextLine();
        System.out.println("Ingrese edad del jugador");
        int edad= scan.nextInt();
        System.out.println("Ingrese altura el jugador");
        double altura = scan.nextDouble();
        */
    
    ObjetoList.add(new Jugador("Argentina","Messi",35,1.71));
    ObjetoList.add(new Jugador("Argentina","Dimaria",35,1.85));
    ObjetoList.add(new Jugador("Argentina","Lavessi",37,1.83));
    ObjetoList.add(new Jugador("Argentina","Marcos Rojo",32,1.89));
        
        
    }
    //Iterar todos los elementos del ArrayList
    public void mostrar(){
        int i=1;
        for (Jugador Objeto : ObjetoList){
            System.out.println(".......Ingrese jugador" + i +  "..........") ;
            System.out.println(Objeto.getNombre());
            System.out.println(Objeto.getEdad());
            System.out.println(Objeto.getPais());
            System.out.println(Objeto.getAltura());
            i++;
            
        }
    }
    
    //Borrar elementos del ArrayList
    
    public void eliminar(){
            
        ObjetoList.remove(ObjetoList.size()-1);
        
        }
    
    
}
