/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosObjetos;
import java.util.Scanner;
import java.util.Date;
import EjerciciosGuiaPoo.Fecha;

public class FechaMain {

 
    public static void main(String[] args) {
       
        Fecha f = new Fecha ();
        
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Ingrese dia : ");
        byte dia = Leer.nextByte();
        
        System.out.println("Ingrese mes : ");
        byte mes = Leer.nextByte();
        
        System.out.println("Ingrese año : ");
        int anio = Leer.nextInt();
        
        Date fech = new Date();//Creamos el Objeto de typo Date
        
        fech.setDate(dia);//Seteamos el dia
        fech.setMonth(mes);
        fech.setYear(anio);
        
        f.llenarFecha(fech);
        
        //Muestro fecha
        System.out.println(f.toString());
        
        //Años de diferencia entre la fecha ingresada y la actual
        
        
        Date FechaActual = new Date();
        
        //System.out.println("Fecha actual : " + (FechaActual.getYear()+1900) );
        
        System.out.println("La diferencia de años es "  + ((FechaActual.getYear()+1900)- fech.getYear()) );
    }
    
}
