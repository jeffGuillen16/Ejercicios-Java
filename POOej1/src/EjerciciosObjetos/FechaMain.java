/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosObjetos;
import java.util.Scanner;
import java.util.Date;
import EjerciciosGuiaPoo.Fecha;
import Service.ClassDateService;

public class FechaMain {

 
    public static void main(String[] args) {
       
        ClassDateService f=new ClassDateService();
        
        f.muestroFechaIngresada();
       
        //Años de diferencia entre la fecha ingresada y la actual
        f.FechaActual();
        
        
    }
    
}
