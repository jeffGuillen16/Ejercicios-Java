/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuiaPoo;
import java.time.LocalDate;
import java.util.Date;

/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la 
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase 
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al 
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date, 
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se 
puede conseguir instanciando un objeto Date con constructor vacío. 
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date()

 */

public class Fecha {
private LocalDate fecha;

    public Fecha() {
    }

    public Fecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    


   
}
