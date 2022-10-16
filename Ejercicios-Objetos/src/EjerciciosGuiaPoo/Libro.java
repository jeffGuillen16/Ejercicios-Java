/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuiaPoo;
import java.util.Scanner;
/*
//Ejercicio de aprendizaje extra 1)
public class Cancion{
    private String titulo="";
    private String autor="";
   
    public void SetCancion(String titulo , String autor){
        this.titulo=titulo;
        this.autor=autor;
    }
    
    public String GetTitulo(){
        return titulo;
    }
    
    public String GetAutor(){
    return autor;}
}
*/
//Ejercicio1
    public class Libro {
    public int ISBN;
    public String Titulo;
    public String Autor;
    public int numPag;
    
   
    public Libro(int ISBN,String Titulo,String Autor,int numPag){
        this.Autor=Autor;
        this.ISBN=ISBN;
        this.Titulo=Titulo;
        this.numPag=numPag;
    }
    
    public Libro(){
    }

   
    public void cargarLibro(){
        Scanner Leer= new Scanner(System.in);
        System.out.println("Ingrese el ISBN del libro: ");
        ISBN=Leer.nextInt();
        
        Leer.nextLine();
        
        System.out.println("Ingrese el Titulo : ");
        Titulo=Leer.nextLine();
        
        System.out.println("Ingrese el Autor : ");
        Autor=Leer.nextLine();
        
        System.out.println("Ingrese cantidad de paginas: ");
        numPag=Leer.nextInt();
        
    }
        
        
        
        public void informeLibro(){
        System.out.println(Autor +","+Titulo+ " , " + numPag + "," + ISBN);
    } 
}            
