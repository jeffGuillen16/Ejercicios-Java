/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeGuia;
/**
 *
 * @author marco
 */
import java.util.Scanner;
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Ejercicio 9 **Condicionales**
        Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase 
        es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que 
        diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar 
        la función Substring y equals() de Java.
        
        Scanner Leer= new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String frase = Leer.nextLine();
        if((frase.substring(0,1)).equals("A")){ 
                System.out.println("Es correcto.");
            } else {
                System.out.println("No es correcto");    
                    }*/
        
        /*Ejercicio 10
        Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
        números al usuario hasta que la suma de los números introducidos supere el límite inicial.
        
        Scanner Leer=new Scanner(System.in);
        System.out.println("Ingrese un valor limite positivo:");
        int limite=Leer.nextInt();
        int num,suma=0;
        System.out.println("***************");
        System.out.println("Ingrese numeros.");
        
        while(suma<limite){
            num=Leer.nextInt();
            suma+=num;
            }
    
        System.out.println("***************");
        System.out.println("Suma de nros." + suma);*/
        
        /*Ejercicio 11)
           Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
           pantalla el siguiente menú:
        
        int opc;
        Scanner Leer= new Scanner (System.in);
       
        do{
        System.out.println("***Menu***");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        System.out.println("Elija opción:");
        opc=Leer.nextInt();
        
        if(opc==1){
           int n1,n2,suma;
           System.out.println("Ingrese dos valores");
           n1=Leer.nextInt();
           n2=Leer.nextInt();
           suma=n1+n2;
           System.out.println("La suma es. " + suma);
        }
        
           if(opc==2){
           int n1,n2,resta;
           System.out.println("Ingrese dos valores");
           n1=Leer.nextInt();
           n2=Leer.nextInt();
           resta=n1-n2;
           System.out.println("La suma es. " + resta);
        }
           
           
           if(opc==3){
           int n1,n2,multiplicar;
           System.out.println("Ingrese dos valores");
           n1=Leer.nextInt();
           n2=Leer.nextInt();
           multiplicar=n1*n2;
           System.out.println("La suma es. " + multiplicar);
        }
           
           if(opc==4){
           int n1,n2,dividir;
           System.out.println("Ingrese dos valores");
           n1=Leer.nextInt();
           n2=Leer.nextInt();
           dividir=n1/n2;
           System.out.println("La suma es. " + dividir);
        }
       
        }while(opc!=5);    
        */
        /*
        //Ejercicio 12.
        Scanner Leer=new Scanner(System.in);
        String cadena;
        int contadorCorrectas=0;
        int contadorIncorrectas=0;
        do{
        System.out.println("Ingrese cadena:");
        cadena=Leer.nextLine();
        if((cadena.length()==5) && (cadena.substring(0,1).equals("X")) && (cadena.substring(4,5).equals("O")) ){
                contadorCorrectas++;
                    } 
        //nextLine()->Hace avanzar a la siguiente linea "/n", que genera un caracter en el buffer cada vez que usar un enter
                if(cadena.length()!=5){
                     contadorIncorrectas++;
                  }
        }
        while(!(cadena.equals("&&&&&")));
           System.out.println("****Cant Formato Correctas.*****");
           System.out.println(contadorCorrectas);
           
           System.out.println("****Cant Formato Incorrectas.*****");    
           System.out.println(contadorIncorrectas);
    
         */
        //Ejercicio 13
            int nElemento;
            int i=0;
            Scanner Leer=new Scanner(System.in);
            System.out.println("Ingrese cant. Elementos cuadrado:");
            nElemento=Leer.nextInt();
            //Parte superior
            while(i<nElemento){
                System.out.print("*");
                i++;
                }
            
            System.out.println();
            //Parte del medio
              for ( int p=0;p<nElemento-2;p++){
                System.out.print("*");
                 for(int k=1;k<nElemento-1;k++){
                 System.out.print(" ");
       }        
        System.out.println("*");
                  
    }
   
            int j=0;
            
            //Parte inferior
            while(j<nElemento){
                System.out.print("*");
                j++;
                }
         }    
    }
    
