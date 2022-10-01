/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosObjetos;
import EjerciciosGuiaPoo.Cafetera;
/**
 *
 * @author marco
 */
public class CafeteriaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cafetera Objeto = new Cafetera(300,200);
       Objeto.llenarCafetera();
        System.out.println("Capacidad maxima actual es:" + Objeto.getCapacidadMaxima());
       Objeto.servirTaza(500);
       Objeto.vaciarCafetera();
       Objeto.agregarCafe(400);
    }
    
}
