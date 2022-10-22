/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Colecciones.Jugador;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Service {

    ArrayList<Jugador> ObjetoList ;

    public Service() {
        this.ObjetoList = new ArrayList();
    }

    
    
    public void llenarObjeto() {

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

        ObjetoList.add(new Jugador("Argentina", "Messi", 35, 1.71));
        ObjetoList.add(new Jugador("Argentina", "Dimaria", 35, 1.85));
        ObjetoList.add(new Jugador("Argentina", "Lavessi", 37, 1.83));
        ObjetoList.add(new Jugador("Argentina", "Marcos Rojo", 32, 1.89));

    }

    //Recorremos un ArraList con For each
    public void mostrar() {
            for (Jugador Objeto : ObjetoList) {
            System.out.println(Objeto.toString());
            
        }
    }

    //Borrar uno por uno los elementos del ArrayLis
    public void eliminar() {
        ObjetoList.remove(ObjetoList.size() - 1);
        
    }

    //Elimino todos los elemento del ArrayList - Usando iterator   
    public void arrayEliminaJugador() {
    Iterator<Jugador> it = ObjetoList.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equals("Messi")) {
                it.remove();
            }
        }
    }
    
    public void eliminarTodoArrayList(){
        System.out.println("Se elimino todos los datos");
        Iterator<Jugador> it = ObjetoList.iterator();
        //ObjetoList.clear();
            while(it.hasNext()){
                it.next();
                it.remove();
            }

    
    }
    
    //Comparator
    public static Comparator <Jugador> compararEdad = new Comparator<Jugador>(){
            @Override
            public int compare(Jugador t, Jugador t1) {
                return t.getEdad().compareTo(t1.getEdad());
        }
        
    };
    
    public void ordenarLista(){
                   
                     ObjetoList.sort(this.compararEdad);
    }
    
    
            
    
}
