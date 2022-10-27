package Service;
import Alumnos.Alumno;
import java.util.ArrayList;
import java.util.Scanner;
public class Service {
    
    private ArrayList<Alumno>ListAlumno ;
   
    public Service() {
        this.ListAlumno=new ArrayList();
       
    }

    
     public void crearObjeto(ArrayList<Alumno>ListAlumno){
        
        Scanner scan = new Scanner (System.in);
        String respuestaIngresar;
        do{
            ArrayList<Integer>NotaAlumno = new ArrayList();
            System.out.println("*******Ingrese Objeto*******");
            System.out.println("Ingrese nombre");
            String nombre = scan.nextLine();
            System.out.println("Ingrese nota 1");
            Integer nota1 = scan.nextInt();
            NotaAlumno.add(nota1);
            System.out.println("Ingrese nota 2");
            Integer nota2 = scan.nextInt();
            NotaAlumno.add(nota2);
            System.out.println("Ingrese nota 3");
            Integer nota3 = scan.nextInt();
            NotaAlumno.add(nota3);
            scan.nextLine();
            System.out.println("Desea Ingresar Nuevo Objeto : S/N");
            respuestaIngresar = scan.nextLine();
            ListAlumno.add(new Alumno(nombre,NotaAlumno));
            
        }        while(respuestaIngresar.equals("S"));
        }
    
        //Recorremos un ArraList con For each
        public void mostrar(ArrayList<Alumno>ListAlumno) {
            
            for (Alumno Objeto : ListAlumno) {
            System.out.println(Objeto.toString());
                    
        }
            
        
        
    }  
        public void notaFinal(){
             Scanner scan = new Scanner (System.in);
             System.out.println("Ingrese nombre de alumno:");
             String esNombre = scan.nextLine();
             
             
             
             
             
        }
        
    
}
