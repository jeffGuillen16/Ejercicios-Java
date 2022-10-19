/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package limpiar.buffer;
import java.util.Scanner;
/*Limpiar buffer : 
*Cuando pido un valor entero por ejmplo 25 
*Luego doy enter , genero "\n" un espacio que es tomado por el siguiente String en el almacenamiento del buffer
*Para Limpiar solamento debo poner nextLine(); en la variable  almacena un caracter en blanco. 
*Esto es porque está leyendo el salto de línea que esta almacenado en dicho buffer
 */
public class LimpiarBuffer {
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        /*
        System.out.println("Ingrese edad");
        int edad = scan.nextInt();
        
        System.out.println("Ingrese nombre");
        String nombre = scan.nextLine();
        */
        
        /*No podemos ingresar el nombre por que en el buffer contiene "\n"
        y esto hace que en la siguiente linea el String lo lea como caracter para esto debemos
        Solucionarlo de manero que despues de agregar la variable int pongamos nextLine(); para que 
        nos tome como un caracter vacio en la siguiente linea
        */
        
        //LIMPIANDO BUFFER
        
        System.out.println("Ingrese edad");
        int edad = scan.nextInt();
        
        scan.nextLine();
        
        System.out.println("Ingrese nombre");
        String nombre = scan.nextLine();
    }
    
}
