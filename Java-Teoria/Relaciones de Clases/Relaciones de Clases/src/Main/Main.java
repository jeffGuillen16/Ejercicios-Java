
package Main;
import Persona.Persona;
import DNI.DNI;
public class Main {

    public static void main(String[] args) {

        DNI dni = new DNI();
        dni.setNumero(94475330);
        dni.setSerie('c');
        Persona persona = new Persona();
        persona.setDNI(dni);//Seteamos un DNI
        
    }
    
}
