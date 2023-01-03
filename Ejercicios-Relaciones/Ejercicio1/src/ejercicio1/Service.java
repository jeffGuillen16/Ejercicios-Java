package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;


public class Service {

    public ArrayList<Persona> Person;
    public ArrayList<Perro>Mascota;

    public Service() {

        this.Person = new ArrayList();//Inicializamos los arraylist
        this.Mascota = new ArrayList();
    }

    public void crearPersona() {
        int i = 1;
        String respuestaIngresar;
        Scanner scan = new Scanner(System.in);

        do {

            System.out.println("**********Ingrese persona " + i + ":***********");
            
            
            System.out.println("Ingrese nombre de la persona");
            String nombre = scan.nextLine();

            System.out.println("Ingrese apellido de la persona");
            String apellido = scan.nextLine();
      
           
            
            System.out.println("Desea Ingresar Nuevo Objeto : S/N");
            respuestaIngresar = scan.nextLine();
            
            Person.add(new Persona(nombre, apellido));
            i++;
        } while (respuestaIngresar.equals("S"));

    }

    public void crearMascota() {
        
        int i = 1;
        String respuestaIngresar;
        Scanner scan = new Scanner(System.in);

        do {

            System.out.println("**********Ingrese Mascota " + i + ":***********");

            System.out.println("Ingrese nombre del perro");
            String nombre = scan.nextLine();

            System.out.println("Ingrese raza del perro");
            String raza = scan.nextLine();


            
            System.out.println("Desea Ingresar Nuevo Objeto : S/N");
            respuestaIngresar = scan.nextLine();

            Mascota.add(new Perro(nombre,raza));
            
            i++;
        } while (respuestaIngresar.equals("S"));

    }

    public void mostrarMascota(){
        System.out.println(Mascota);
    }
   
    public void mostrarPersona(){
        System.out.println(Person);
    }
   
}