/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuiaPoo;
import java.util.Scanner;
//Ejercicio 4 RectanguloClase
public class RectanguloClase {
       private int base;
       private int altura;

//Crear RectanguloClase    
public void crearRectangulo(){
    Scanner Leer = new Scanner(System.in);
    System.out.println("Ingrese base");
    base=Leer.nextInt();
    System.out.println("Ingrese Altura");
    altura=Leer.nextInt();
    }
//Superficie RectanguloClase
public int superficieRectangulo(){
    return base*altura;
}

//perimetro RectanguloClase
public int perimetroRectangulo(){
    return (base+altura)*2;
    }

public void dibujarRectangulo(){
    //Parte superior
    for(int i=0;i<base;i++){
        System.out.print("*");  
            }
    System.out.println();
    
    //Parte medio
    for (int i=0;i<altura-2;i++){
        System.out.print("*");
       for(int j=1;j<base-1;j++){
           System.out.print(" ");
       }        
        System.out.println("*");
    }
    
    //Parte inferior
    
    for(int i=0;i<base;i++){
        System.out.print("*");  
            }
        
        
    }
//Metodo constructor
    public RectanguloClase(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public RectanguloClase() {
    }
    
//Setter 

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
//Getter

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
    

}
