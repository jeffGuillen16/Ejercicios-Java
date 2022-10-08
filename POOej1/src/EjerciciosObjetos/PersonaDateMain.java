
package EjerciciosObjetos;
import EjerciciosGuiaPoo.PersonaDate;


public class PersonaDateMain {

    public static void main(String[] args) {
        
            PersonaDate f = new PersonaDate();
           
            f.crearPersona();
            f.calcularEdad();
            System.out.println(f.menorQue(30));
            System.out.println(f.toString());
        
    }
    
}
