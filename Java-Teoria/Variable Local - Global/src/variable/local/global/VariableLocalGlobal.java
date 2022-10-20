/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variable.local.global;

/**
 *
 * @author marco
 */
public class VariableLocalGlobal {

    public static void main(String[] args) {
            
        int i = 4; 
        
        System.out.println(i);
        System.out.println("---------Antes del for---------");
        System.out.println();
        System.out.println("--------Durante el for------");
        for (i=0; i<3 ;i++)
        {
            System.out.println(i);
        }
        
        System.out.println("-------Despues del for----------");
        
      //Como vemos cuando declaramos variable globales son afectandas durante el proceso
      //Varian su dato durante el proceso
        
        System.out.println(i);
    }
    
}
