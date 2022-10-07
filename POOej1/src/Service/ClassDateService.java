/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import EjerciciosGuiaPoo.Fecha;
import java.util.Scanner;
import java.util.Date;

public class ClassDateService {
        Scanner Leer = new Scanner(System.in);    
        Fecha f = new Fecha ();
        Date fech = new Date();//Creamos el Objeto de typo Date
        
        public void muestroFechaIngresada(){
        
        System.out.println("Ingrese dia : ");
        byte dia = Leer.nextByte();
        
        System.out.println("Ingrese mes : ");
        byte mes = Leer.nextByte();
        
        System.out.println("Ingrese año : ");
        int anio = Leer.nextInt();
        
       
        // Ordenar con class Date
        
        fech.setDate(dia);//Seteamos el dia
        fech.setMonth(mes);
        fech.setYear(anio);
        
        f.llenarFecha(fech);
        
        //Muestro fecha
        System.out.println(f.toString());
        
        }
        
        public void FechaActual(){
        Date FechaActual = new Date();
        
        //System.out.println("Fecha actual : " + (FechaActual.getYear()+1900) );
        
        System.out.println("La diferencia de años es "  + ((FechaActual.getYear()+1900)- fech.getYear()) );
        }
        
}
