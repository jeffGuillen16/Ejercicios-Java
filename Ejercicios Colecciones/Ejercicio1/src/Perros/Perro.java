/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perros;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Perro {

    ArrayList<String> EsDeRaza;

    //Por defecto
    public Perro() {
        this.EsDeRaza = new ArrayList(); //Inicializa el nuevo ArrayList
    }

    public void listarArrayList() {
        String RespuestaUsuario = "";
        Scanner Scan = new Scanner(System.in);

        do {
            System.out.println("Ingrese una Raza de perro:");
            String razaIngresada = Scan.nextLine();
            EsDeRaza.add(razaIngresada);//Añado a Lista
            System.out.println("Desea ingresar otra Raza de perro  : S/N ");
            RespuestaUsuario = Scan.nextLine();
        } while (RespuestaUsuario.equals("S"));
    }

    //Muestro la lista de ArrayList
    public void mostrarList() {
        System.out.println(EsDeRaza);
    }

    public void buscarPerro() {

        boolean valorUsuario=false;
        Scanner Scan = new Scanner(System.in);
        System.out.print("¿Que Raza de perro desea Eliminar? :");
        String razaEliminar = Scan.nextLine();
        Iterator<String> it = EsDeRaza.iterator();

        while (it.hasNext()) {
            if (it.next().equals(razaEliminar)) {
                it.remove();
                valorUsuario = true;
            }

        }

        if (valorUsuario = false) {
            System.out.println("No , se encontro la raza");
        }

        this.mostrarList();
    }

}
