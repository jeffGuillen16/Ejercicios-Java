/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuiaPoo;
//Ejercicio 3 operacion Guia
import java.util.Scanner;

public class Operacion {
    //Atributos privados
    private int n1;
    private int n2;
    public  int suma;
    public int resta;
    public int multiplicacion;
    public float division;

    //a)Método constructor con todos los atributos pasados por parámetro.
    public Operacion(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    //b)Metodo constructor sin los atributos pasados por parámetro

    public Operacion() {
    }

    //c)Métodos get y set
    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    
    //d)Método para crear Operacion los atributos del objeto(los atributos del objeto
    
    public void crearOperacion(){
        int num1;
        int num2;
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese dos valores:");
        num1=Leer.nextInt();
        num2=Leer.nextInt();
        this.setN1(num1);
        this.setN2(num2);
    }
   
    //e)Método sumar(): calcular la suma de los números y devolver el resultado al main
    
    public int sumar(){
        return suma=n1+n2;
    }
    
    //f)Método restar(): calcular la resta de los números y devolver el resultado al main
    
    public int restar(){
        return resta=n1-n2;
    }
    
    /*g)Método multiplicar(): primero valida que no se haga una multiplicación por cero, si 
        fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si 
        no, se hace la multiplicación y se devuelve el resultado al main
    */
    
    public int multiplicar(){
    
        multiplicacion=n1*n2;
        
        if(multiplicacion==0){
            return 0; 
                } else {
        
            return multiplicacion;
        }
    }
   /*
    Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar 
una división por cero, el método devuelve 0 y se le informa al usuario el error se le 
informa al usuario. Si no, se hace la división y se devuelve el resultado al main
    */ 
    public float division(){
    
        division=n1/n2;
        
        if(division==0){
        return 0; 
            }
             else
            {
            return division;
             }
    }
}
