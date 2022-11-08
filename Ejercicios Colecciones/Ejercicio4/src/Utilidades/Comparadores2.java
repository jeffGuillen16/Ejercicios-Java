package Utilidades;

import Pelicula.Pelicula;
import java.util.Comparator;

public class Comparadores2 {

    public static Comparator<Pelicula> ordenarDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getDuracionPelicula().compareTo(p1.getDuracionPelicula());
        }
    };

    public static Comparator<Pelicula> ordenarDuracionAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getDuracionPelicula().compareTo(p1.getDuracionPelicula());
        }

    };
    public static Comparator<Pelicula> ordenarTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTituloPelicula().compareTo(p2.getTituloPelicula());
        }

    };
    public static Comparator<Pelicula> ordenarDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirectorPelicula().compareTo(p2.getDirectorPelicula());
        }

    };
    
    
}
