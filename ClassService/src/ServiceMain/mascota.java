/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceMain;
import MascotaService.Mascota;
import ClassService.Perro;
/**
 *
 * @author marco
 */
public class mascota {

    public static void main(String[] args) {
        Mascota sm = new Mascota();
       
        Perro m1 = sm.crearMascota();
        System.out.println("es :" + m1.toString());
        // se pone null para que el objeto no ocupe memoria
        m1=null;
       
    }
}
