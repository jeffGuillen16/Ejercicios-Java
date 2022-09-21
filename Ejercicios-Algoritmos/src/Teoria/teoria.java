/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teoria;

/**
 *
 * @author marco
 */
import java.util.Scanner;
public class teoria {
    /*Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada 
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se 
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las 
vocales acentuadas) se mantienen sin cambios.
    
    Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
    La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10
    
    a=@ e=# i=$ o=% u=*
    */
    public static void main(String[] args){
//*****************Ejercicio de teoria sin retorno************************************************
/*
    Scanner Leer= new Scanner(System.in);
    String text;
    String textoCodificado;
    System.out.println("Ingrese texto :");
    text=Leer.nextLine();
    textoCodificado=retornoString(text);
    System.out.println(textoCodificado);
*/
//*****************Ejercicio de teoria con retorno************************************************
/*Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando 
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del 
segundo, sino informe que no lo son.

    Scanner Leer= new Scanner(System.in);
    int n1,n2;
    System.out.println("Ingrese dos numeros:");
    n1=Leer.nextInt();
    n2=Leer.nextInt();
    esMultiplo(n1,n2);
*/

//**************Ejercicio de teoria arreglos***********
/*Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y 
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante
*/
int dim;
String nombre;
Scanner Leer=new Scanner(System.in);
System.out.println("Ingrese cantidad de compañeros");
dim=Leer.nextInt();
String[] equipo=new String[dim];
               System.out.println("Ingrese jugadores:");
               nombre=Leer.nextLine();
                for(int i=0;i<dim;i++){ 
                nombre=Leer.nextLine();
                equipo[i]=nombre;
              }
    
 //*********Imprimir Nombres*********   
            System.out.println("Jugadores.");
       for(int i=0;i<dim;i++){
            System.out.println("Jugador nro "+i + " : " +equipo[i]);
        }
    }
    
    public static void esMultiplo(int n1 , int n2){
        if((n1%n2)==0){
            System.out.println("Es multiplo");
        }else {
            System.out.println("No es multiplo");
        }
    }
    
    
    public static String retornoString(String text){
        String cadena="";
        String letra;
        for(int i=0; i<text.length();i++){
            letra=(text.substring(i,i+1)).toLowerCase();    
            if(letra.equals("a")){
                 letra="@";
                  }
                if(letra.equals("e")){
                    letra="#";
                    }
                    if(letra.equals("i")){
                        letra="$";
                        }
                    if(letra.equals("o")){
                        letra="%";
                        }
                if(letra.equals("u")){
                        letra="*";
                        }
                 cadena=cadena.concat(letra);
        }
       
         return cadena;
    }
    }



