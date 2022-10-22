/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Service.Service;
public class NewMain {

    public static void main(String[] args) {
        
        //ArrayList 
        Service Jugador = new Service();
        Jugador.llenarObjeto();
        Jugador.mostrar();     
        //Jugador.eliminar();
        System.out.println("........ArrayList actualizado.....");
        // Jugador.arrayEliminaJugador();
        Jugador.mostrar(); 
        System.out.println("........ArrayList Ordenado.....");
        Jugador.ordenarLista();
        Jugador.mostrar();        
        System.out.println("........ArrayList actualizado.....");
        Jugador.eliminarTodoArrayList();
        /*  Array con Objetos
        Scanner scan = new Scanner (System.in);
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
        scan.nextLine();//Limpio el buffer "/n ya no se almacena en la siguiente linea"
        Objeto [i] = new Jugador(pais,nombre,edad,altura);
        
        }
        
        for(int i=0 ; i < 2;i++){
            System.out.println(Objeto[i].getPais());
            System.out.println(Objeto[i].getNombre());
            System.out.println(Objeto[i].getAltura());
             System.out.println(Objeto[i].getEdad());
             
        }
        
        */
        
    }
    
}
