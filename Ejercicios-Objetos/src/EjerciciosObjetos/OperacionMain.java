/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosObjetos;
import EjerciciosGuiaPoo.Operacion;

public class OperacionMain {

    public static void main(String[] args) {
        Operacion Objeto=new Operacion();
        Objeto.crearOperacion();
        System.out.println("Suma : " + Objeto.sumar());
        System.out.println("Resta: " + Objeto.restar());
        System.out.println("Multiplicar:" + Objeto.multiplicar() );
        System.out.println("Division : " + Objeto.division());

    }
    
}
