/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuiaPoo;
//Ejercicio 9
public class Matematica {
private static double num1;
private static double num2;

    //Constructor por defecto Vacio
    public Matematica() {
    }
    
    //Constructor parametrizado
    
    public Matematica(double n1 ,double n2){
        this.num1 = n1;
        this.num2 = n2;
    }
    
    //Getters

    public static double getNum1() {
        return num1;
    }

    public static double getNum2() {
        return num2;
    }

 
    

    //Setters

    public static void setNum1(double num1) {
        Matematica.num1 = num1;
    }

    public static void setNum2(double num2) {
        Matematica.num2 = num2;
    }
   
    
    

    //a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    
    public double devolverMayor(){
       double valorMayor;
       if(this.getNum1()>this.getNum2()){
           valorMayor=this.getNum1();
       }else {
           valorMayor=this.getNum2();
       }
       return valorMayor ;
    }
    
    /*
    b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado 
    al menor número. Previamente se deben redondear ambos valores
    */
    
    public void calcularPotencia(){
        
        double mayor = this.devolverMayor();
        double menor = 0 ;
        
        if(this.devolverMayor()!= this.num1){
            menor=this.num1;
        }
        
        if(this.devolverMayor()!=this.num2){
            menor=this.num2;
        }
       
        double valorPotencia;
        valorPotencia = (double) Math.pow((Math.round(mayor)),(Math.round(menor)));
         System.out.println("La potencia es : " + valorPotencia);
        //c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. 
        //Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número
        
       }
    
        public void calculaRaiz(){
            double menor=0;
            double valorPositivo;
            double raiz;
            if(this.devolverMayor()!= this.num1){
            menor=this.num1;
        }
        
        if(this.devolverMayor()!=this.num2){
            menor=this.num2;
        }
        valorPositivo= Math.abs(menor);
        
        raiz = Math.sqrt(valorPositivo);
            System.out.println("La raiz cuadrada es " + raiz);
        }
}
