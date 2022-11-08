package Service;
import Alumnos.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Service {
    
    private ArrayList<Alumno>ListAlumno ;
    private Alumno alu ;
   
    public Service() {
        this.ListAlumno=new ArrayList();
       
    }

    public void crearObjeto() {

        Scanner scan = new Scanner(System.in);
        String respuestaIngresar;
        do {
            ArrayList<Integer> NotaAlumno = new ArrayList();
            System.out.println("*******Ingrese Objeto*******");
            System.out.println("Ingrese nombre");
            String nombre = scan.nextLine();
            System.out.println("Ingrese nota 1");
            int nota1 = scan.nextInt();
            NotaAlumno.add(nota1);
            System.out.println("Ingrese nota 2");
            int nota2 = scan.nextInt();
            NotaAlumno.add(nota2);
            System.out.println("Ingrese nota 3");
            int nota3 = scan.nextInt();
            NotaAlumno.add(nota3);
            scan.nextLine();
            System.out.println("Desea Ingresar Nuevo Objeto : S/N");
            respuestaIngresar = scan.nextLine();
            ListAlumno.add(new Alumno(nombre, NotaAlumno));

        } while (respuestaIngresar.equals("S"));
    }

     
        public void mostrar() {

        // System.out.println();
        for (Alumno Objeto : ListAlumno) {
            System.out.println(Objeto.toString());

        }

    }

    public void notaFinal() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese nombre de alumno:");
        String esNombre = scan.nextLine();
        Iterator<Alumno> it = ListAlumno.iterator();
        int suma = 0;
        while (it.hasNext()) {
                    this.alu = it.next();
            if (alu.getNombre().equals(esNombre)) {
                ArrayList<Integer> notas = alu.getNotas();
                suma = notas.stream().mapToInt(Integer::intValue).sum();

            }
        }

        System.out.println(suma / 3);

    }
    
   
}
