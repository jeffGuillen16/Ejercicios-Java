package Main;
import Service.Service;
public class Main {
    
    public static void main(String[] args) {
    Service Pelicula = new Service();
    Pelicula.crearPelicula();
        System.out.println("***********Muestro pelis************");
    Pelicula.mostrarPelicula();
        System.out.println("\nPelis mas de una hora");
    Pelicula.mostrarPeliDuraUnaHora();
        System.out.println("\n*********Pelis con duracion descendente*********");
    Pelicula.ordenarDescendente();
        System.out.println( "\n*********Pelis Orden por director*********");
    Pelicula.ordenarDirector();
        System.out.println("\n*********Pelis Orden por Titulo*********");
    Pelicula.ordenarTituloPeli();
    }
    
}
