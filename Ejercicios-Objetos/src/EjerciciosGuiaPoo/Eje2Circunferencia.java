/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuiaPoo;
import java.util.Scanner;
/**
 *
 * @author marco
 */
public class Eje2Circunferencia {
    //atributo
    private double radio;
    
    //método constructor Vacio
    public Eje2Circunferencia (){
    }
    
    //método constructor
    public Eje2Circunferencia(double radio){
        this.radio=radio;
    }
    
    //Método set
    public void setRadio(double radio){
        this.radio=radio;
    }
    
    //Método get
    public double getRadio(){
        return radio;
    }
    
    //Método Crear una circunferencia
    public void crearCircunferencia(){
        Scanner Leer= new Scanner(System.in);
        System.out.println("Ingrese el radio");
        radio=Leer.nextFloat();
        
    }
    
    //Método retorna Area
    public double area(){
        double area;
        final double PI=3.14;
        area=PI * Math.pow(radio,2);
        return area;
    }
    
    //Método retorna perimetro
    public double perimetro(){
        double perimetro;
        final double PI=3.14;
        perimetro=2*PI*radio;
        return perimetro;
    }
    
    
}
