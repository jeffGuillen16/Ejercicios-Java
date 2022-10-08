/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuiaPoo;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author marco
 */
public class PersonaDate {

    private String nombre;
    private Date fechaNacimiento;

    //Constructor Vacio
    public PersonaDate() {

    }

    //Constructor Parametrizado
    public PersonaDate(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void crearPersona() {

        Scanner scan = new Scanner(System.in);
        byte dia, mes;
        int anio;
        Date f = new Date();
        System.out.println("Ingrese nombre : ");
        String nombre = scan.nextLine();
        System.out.println("Ingrese la fecha de nacimiento : ");
        System.out.print("Ingrese dia : ");
        dia = scan.nextByte();
        System.out.println("Ingrese Mes : ");
        mes = scan.nextByte();
        System.out.println("Ingrese Año : ");
        anio = scan.nextInt();

        //Ordeno la fecha
        f.setDate(dia);
        f.setMonth(mes);
        f.setYear(anio);

        //Ingreso los datos a la clase Objeto PersonaDate
        this.setNombre(nombre); // Ingreso el nombre
        this.setFechaNacimiento(f); //Ingreso el Date

    }

    //Metodo Calcular
    public void calcularEdad() {
        int edadActual;
        Date f = new Date();
        edadActual = (f.getYear() + 1900) - (getFechaNacimiento().getYear());
        System.out.println("La edad Acual es : " + edadActual);
    }

    // menorQue(int edad)
    public boolean menorQue(int edad) {
        boolean x = false;
        if (edad < (this.getFechaNacimiento().getYear())) {
            x = true;
        }
        return x;
    }
    
    // mostrarPersona(int edad);

    @Override
    public String toString() {
        return "PersonaDate{" + "nombre=" + nombre + ", fechaNacimiento=" + this.getFechaNacimiento().getDate()+ '/' +this.getFechaNacimiento().getMonth() + '/'  + this.getFechaNacimiento().getYear()+ '}';
    }
    
    
}
