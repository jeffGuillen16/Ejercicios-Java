
package main;

import ejercicio1.Service;
import ejercicio1.Perro;
import ejercicio1.Persona;
import java.util.Iterator;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Service P = new Service();
        Service M = new Service();
        Service A = new Service();
        P.crearPersona();
        M.crearMascota();
        Iterator<Perro> itMascota = M.Mascota.iterator(); //Iteramos el arrayList Mascota
        Iterator<Persona> itPersona = P.Person.iterator();//Iteramos el arrayList Persona
        int i = 0;
        System.out.println("Mascotas en adopción:");
        M.mostrarMascota();
        do {
            System.out.println("Ingrese el nombre del perro para adoptar");
            String esNombrePerro = scan.nextLine();
            while (itMascota.hasNext()) {
                if ((itMascota.next().getNombre()).equals(esNombrePerro)) {

                    itPersona.next().setPerro(M.Mascota.get(i));

                } else {
                    itPersona.next().setPerro(M.Mascota.get(i));
                }
            }
            i++;
        } while (itPersona.hasNext());

        P.mostrarPersona();;

    }

}
