/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosObjetos;
import EjerciciosGuiaPoo.Matematica;
import java.util.Scanner;
/**
 *
 * @author marco
 */
public class MatematicaMain {

  
    public static void main(String[] args) {
        Matematica Objeto = new Matematica();
        Scanner Leer = new Scanner (System.in);
        double i;
        double f;
        int j=0;

        System.out.println("Ingrese el valor Inical");
        i = Leer.nextDouble();
        
        System.out.println("Ingrese el valor Final");
        f = Leer.nextDouble();
        
        double numeroAleatorio1 = (Math.random()*f)+i;
        
        Objeto.setNum1(numeroAleatorio1);
        
        System.out.println("--------------");
        System.out.println("Ingrese el valor Inical");
        i = Leer.nextDouble();
        
        System.out.println("Ingrese el valor Final");
        f = Leer.nextDouble();
        
        double numeroAleatorio2 = (Math.random()*f)+i;
        Objeto.setNum2(numeroAleatorio2);
        
        System.out.println("-----Valores random------");
        System.out.println("primer valor : " + Objeto.getNum1());
        System.out.println("primer valor : " + Objeto.getNum2());
        
        System.out.println("*********Valor mayor**********");
        System.out.println("Valor mayor es " + Objeto.devolverMayor());
    
        System.out.println("******Potencia**********");
        Objeto.calcularPotencia();
        
        System.out.println("******Raiz cuadrada**********");
        Objeto.calculaRaiz();
        
    }
    
}
