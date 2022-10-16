/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosObjetos;
import EjerciciosGuiaPoo.CuentaBancaria;
/**
 *
 * @author marco
 */
public class CuentaBancariaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria Objeto = new CuentaBancaria();
        Objeto.crearObjetoCuenta();
        System.out.println("Podes sacar solo : "+Objeto.extraccionRapida());
    }
    
}
