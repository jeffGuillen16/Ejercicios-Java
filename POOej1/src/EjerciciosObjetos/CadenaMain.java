/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosObjetos;
import EjerciciosGuiaPoo.Cadena;
/**
 *
 * @author marco
 */
public class CadenaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Cadena Objeto = new Cadena();
    Objeto.setFrase("holaa",5);
    Objeto.mostrarVocales();
    Objeto.invertirFrase();
    Objeto.vecesRepetido("a");
    Objeto.unirFrases("avion");
    Objeto.reemplazar("a");
    Objeto.compararLongitud("holaaa");
    Objeto.contiene("a");
    }
    
}
