package Main;
import Alumnos.Alumno;
import Service.Service;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<Alumno>ListAlumno = new ArrayList();
        
        Service Alumno = new Service();
        Alumno.crearObjeto(ListAlumno);
        Alumno.mostrar(ListAlumno);
       
               
    }
    
}
