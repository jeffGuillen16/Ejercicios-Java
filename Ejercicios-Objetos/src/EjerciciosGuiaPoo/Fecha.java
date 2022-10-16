/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuiaPoo;
import java.util.Date;

public class Fecha {
    
    private Date fecha;//Atributo tipo Date

    public Fecha() {
        fecha = new Date(); //Esto es para que no se cree la fecha en null 
    }

    public Fecha(Date fecha) {
        this.fecha = fecha;
    }
    /*
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    */
     public void llenarFecha(Date fecha) {
        this.fecha = fecha; // Lo guardamos en el atributo
    }
    
     
    @Override
    public String toString() {
        return "Fecha{" + "fecha" + " Año : " + fecha.getYear() + " Mes : " + fecha.getMonth()+ " Dia : " + fecha.getDate() + '}';
    }
    
    
    
}
