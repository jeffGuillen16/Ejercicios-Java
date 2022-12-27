/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Info;

public class NewMain {

     public static void main(String[] args) {

        DNI dni = new DNI();
        dni.setNumero(94475330);
        dni.setSerie('c');
        Persona persona = new Persona();
        persona.setDNI(dni);//Seteamos un DNI
    }
    
    
}
