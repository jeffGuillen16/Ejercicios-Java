/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuiaPoo;
import java.util.Scanner;
//Ejercicio 4 Rectangulo
public class Rectangulo {
       private int base;
       private int altura;
       
//Crear Rectangulo    
public void crearRectangulo(){
    Scanner Leer = new Scanner(System.in);
    System.out.println("Ingrese base");
    base=Leer.nextInt();
    System.out.println("Ingrese Altura");
    altura=Leer.nextInt();
    }
//Superficie Rectangulo
public int superficieRectangulo(){
    return base*altura;
}

//perimetro Rectangulo
public int perimetroRectangulo(){
    return (base+altura)*2;
    }

public void dibujarRectangulo(){
    for(int i=0;i<base;i++){
        for(int j=0;j<altura;j++){
        System.out.println("*");  
            }
        System.out.println();
        }
    }
//Metodo constructor
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
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
