/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Perros.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Servicio {

    ArrayList<Perro> Razas;

    //Por defecto
    public Servicio() {
        this.Razas = new ArrayList(); //Inicializa el nuevo ArrayList
    }

    public void listado() {
        String rp = "";
        Scanner Scan = new Scanner(System.in);

        do {
            System.out.println("Ingrese una Raza de perro:");
            String dato = Scan.nextLine();
            Razas.add(new Perro(dato));//Añado a Lista
            System.out.println("Desea ingresar otra Raza de perro  : S/N ");
            rp = Scan.nextLine();
        } while (rp.equals("S"));
    }

    //Muestro la lista de ArrayList
    public void mostrar() {
        System.out.println(Razas);
    }

    public void buscarPerro() {
        boolean valor = false;
        Scanner Scan = new Scanner(System.in);
        System.out.print("¿Que Raza de perro desea Eliminar? :");
        String dato = Scan.nextLine();
        Iterator<Perro> it = Razas.iterator();
        while (it.hasNext()) {
            if (it.next().getRaza().equals(dato)) {
                it.remove();
                valor = true;
            }

        }

        if (valor == false) {
            System.out.println("No , se encontro la raza");
        }
        this.mostrar();
    }

}
