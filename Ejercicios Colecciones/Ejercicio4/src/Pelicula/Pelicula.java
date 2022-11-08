package Pelicula;

import java.util.Comparator;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pelicula {

    private String tituloPelicula;
    private String directorPelicula;
    private Float duracionPelicula;

    public Pelicula(String tituloPelicula, String directorPelicula,Float duracionPelicula) {
        this.tituloPelicula = tituloPelicula;
        this.directorPelicula = directorPelicula;
        this.duracionPelicula = duracionPelicula;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "tituloPelicula=" + tituloPelicula + ", directorPelicula=" + directorPelicula + ", duracionPelicula=" + duracionPelicula + '}';
    }
 }
