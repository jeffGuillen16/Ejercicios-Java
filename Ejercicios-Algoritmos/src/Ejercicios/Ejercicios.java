/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Ejercicio 1
        Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
        usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
        
        int minutos,
            dias=1440,    
            horas=60;
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresar tiempo minutos:");
        minutos=leer.nextInt();
        
        if(minutos>dias){
                    int operacionDias=(minutos/dias);
                    System.out.println("Dia " + operacionDias + " Horas "+ (minutos-(dias*operacionDias))/horas);
            }else{
                 System.out.println("Cantidad de horas durante el dia :"+(minutos/horas));
        }
        */
        /*Ejercicio2 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
          una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
          tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
        Scanner leer=new Scanner(System.in);
        int A,B,C,D,aux,aux2,aux3,aux4;
         
        System.out.println("Ingrese el dato A") ;
        A=leer.nextInt();
        System.out.println("Ingrese el dato B") ;
        B=leer.nextInt();
        System.out.println("Ingrese el dato C") ;
        C=leer.nextInt();
        System.out.println("Ingrese el dato D") ;
        D=leer.nextInt();
        aux=B;
        aux2=C;
        aux3=A;
        aux4=D;
        B=aux2;
        C=aux3;
        A=aux4;
        D=aux;
        
        System.out.println("A :"+A) ;
        System.out.println("B :"+B) ;
        System.out.println("C :"+C) ;
        System.out.println("D :"+D) ;
        */
         /*Ejemplo de aux
        int b=4,
             c=3,aux;
         aux=b;
         b=c;
         c=aux;
            System.out.println("b :"+b) ;
            System.out.println("c :"+c) ;
         */
         /*
         Ejercicio 3
         Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
         Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.*/
         /*String letra;
         System.out.println("Ingrese una letra : ");
         Scanner leer=new Scanner(System.in);
         letra=leer.nextLine();
         if(letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u")){
             System.out.println("La letra " + letra  +  " es una vocal : ");
                    }else {
                        System.out.println("La letra " + letra  + "no es una vocal : ");
         }
         
         Scanner leer=new Scanner(System.in);
         int edad,edad2;
         System.out.println("Ingrese edad:");
         edad=leer.nextInt();
         System.out.println("Ingrese edad 2:");
         edad2=leer.nextInt(); 
         */
         
        
        
         }
         
    }   

