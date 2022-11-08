package Service;

import Pelicula.Pelicula;
import Utilidades.Comparadores2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Service {
    
    private Pelicula Peli ;
    private ArrayList<Pelicula> ListPelicula;

    public Service() {

        this.ListPelicula = new ArrayList();
                    }

    public void crearPelicula() {
        Scanner scan = new Scanner(System.in);
        String respuestaIngresar;
        do {
            System.out.println("*******Ingrese Pelicula*******");
            System.out.println("Ingrese Titulo de Pelicula");
            String esTitulo = scan.nextLine();
            System.out.println("Ingrese director de Pelicula");
            String esDirector = scan.nextLine();
            System.out.println("Ingrese duración de Pelicula");
            float duracionPelicula = scan.nextFloat();
            scan.nextLine();
            System.out.println("Desea Ingresar Otra Pelicula : S/N");
            respuestaIngresar = scan.nextLine();
            ListPelicula.add(new Pelicula(esTitulo, esDirector, duracionPelicula));

        } while (respuestaIngresar.equals("S"));
    }
    
    public void mostrarPelicula() {

        for (Pelicula cadena : ListPelicula) {
            System.out.println(cadena);
        }

    }
    
    public void mostrarPeliDuraUnaHora() {
        
        Iterator<Pelicula> it = ListPelicula.iterator();
        while (it.hasNext()) {
            this.Peli=it.next();
               if(Peli.getDuracionPelicula()> 1){
                System.out.println(Peli);
            }
        }

    }
    
      
     
    public void ordenarDescendente(){
                     Collections.sort(ListPelicula,Comparadores2.ordenarDuracionDesc);
                    for (Pelicula cadena : ListPelicula) {
                     System.out.println(cadena);
        }
    }   
    
      public void ordenarAsc(){
                     Collections.sort(ListPelicula,Comparadores2.ordenarDuracionDesc);
                    for (Pelicula cadena : ListPelicula) {
                     System.out.println(cadena);
        }
    }   
      public void ordenarDirector(){
                     Collections.sort(ListPelicula,Comparadores2.ordenarDirector);
                    for (Pelicula cadena : ListPelicula) {
                     System.out.println(cadena);
        }
    }   
      public void ordenarTituloPeli(){
                     Collections.sort(ListPelicula,Comparadores2.ordenarTitulo);
                    for (Pelicula cadena : ListPelicula) {
                     System.out.println(cadena);
        }
    }   
    
    
}
