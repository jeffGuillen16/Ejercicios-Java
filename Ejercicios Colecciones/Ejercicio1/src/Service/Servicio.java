/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Perros.Perro;
import java.util.ArrayList;
import java.util.Scanner;

public class Servicio {

    ArrayList<Perro> Razas;

    //Por defecto
    public Servicio() {
        this.Razas = new ArrayList();
    }

    public void listado() {

        String rp = "";
        Scanner Scan = new Scanner(System.in);

        do {
           
                System.out.println("Ingrese una Raza de perro:");
                String dato = Scan.nextLine();
                Razas.add(new Perro(dato));
                System.out.println("Desea ingresar otra Raza de perro  : S/N ");
                rp = Scan.nextLine();
        } while (rp.equals("S"));
    }

    public void mostrar() {
        System.out.println(Razas);
    }
}
