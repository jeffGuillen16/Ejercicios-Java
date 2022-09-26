/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosObjetos;

import EjerciciosGuiaPoo.Libro;

/*
//Ejercicio de aprendizaje extra 1)
public class EjerciciosObjetosMain {

    public static void main(String[] args) {
       Cancion objeto=new Cancion();
       objeto.SetCancion("Celebra la vida", "Axel");
        System.out.println("El titulo de la canción es: " + objeto.GetTitulo());     
        System.out.println("El autor de la canción es: " + objeto.GetAutor());
        
    }
        }
 */
public class EjerciciosObjetosMain {

    public static void main(String[] args) {
        Libro objeto=new Libro(23232,"movidick","cesar",23);
        objeto.informeLibro();
        Libro objeto2=new Libro();
        Libro objeto3=new Libro();
        objeto3.cargarLibro();
        objeto3.informeLibro();

    }
}
