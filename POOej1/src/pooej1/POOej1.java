/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1;

import Entidad.Persona;

/**
 *
 * @author marco
 */
public class POOej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciación utilizando el constructor vacio
        Persona primerPersona= new Persona();
        
        //Instanciación utilizando el constructo por parametro
        Persona segundaPersona= new Persona("Mariano",94475330,23);
    
    }
}
