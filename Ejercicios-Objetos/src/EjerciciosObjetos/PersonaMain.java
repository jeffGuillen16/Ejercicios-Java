/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosObjetos;
import EjerciciosGuiaPoo.Persona;
/**
 *
 * @author marco
 */
public class PersonaMain {

    public static void main(String[] args) {
        int [] vectorPersonas=new int[4];
        boolean[] vectPersonasEdad=new boolean[4];
        
        Persona Persona1= new Persona("Mario",24,"H",70,1.68);
        System.out.println(Persona1.calcularIMC());
        if(Persona1.esMayorDeEdad()==true){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        vectorPersonas[0]=Persona1.calcularIMC();
        vectPersonasEdad[0]=Persona1.esMayorDeEdad();
        
        
        System.out.println("--------");
        Persona Persona2= new Persona("Mati",19,"H",100,1.70);
        System.out.println(Persona2.calcularIMC());
        if(Persona2.esMayorDeEdad()==true){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        vectorPersonas[1]=Persona2.calcularIMC();
        vectPersonasEdad[1]=Persona2.esMayorDeEdad();
        
        System.out.println("--------");
        Persona Persona3= new Persona("Mari",10,"O",30,1.50);
        System.out.println(Persona3.calcularIMC());
        if(Persona3.esMayorDeEdad()==true){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        vectorPersonas[2]=Persona3.calcularIMC();
        vectPersonasEdad[2]=Persona3.esMayorDeEdad();
        
        
        System.out.println("--------");
        Persona Persona4= new Persona("Juli",12,"M",68,1.70);
        System.out.println(Persona4.calcularIMC());
        if(Persona4.esMayorDeEdad()==true){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        vectorPersonas[3]=Persona4.calcularIMC();
        vectPersonasEdad[3]=Persona4.esMayorDeEdad();
        
        System.out.println("-------Calculos de porcentajes de Peso-------");
        int contPesoIdeal=0;
        int contPesoDebajoIdeal=0;
        int contPesoEncimaIdeal=0;
        int contEdadMayor=0;
        int contEdadMenor=0;
        
        int i=0;
        
            System.out.print("Cantidad de personas con peso ideal: ");
            while(i<vectorPersonas.length){
                if(vectorPersonas[i]==0){
                    contPesoIdeal++;
                    
                }
                i++;
            }
            System.out.println(contPesoIdeal);
        int j=0;
            System.out.print("Cantidad de personas por debajo del peso ideal: ");
            while(j<vectorPersonas.length){
                if(vectorPersonas[j]==-1){
                    contPesoDebajoIdeal++;
                   
                }
                j++;
            }
             System.out.println(contPesoDebajoIdeal);
            
            int k=0;
            System.out.print("Cantidad de personas por encima del peso ideal: ");
            while(k<vectorPersonas.length){
                if(vectorPersonas[k]==1){
                    contPesoEncimaIdeal++;
                   
                }
                k++;
            }
           System.out.println(contPesoEncimaIdeal);
             
           
            System.out.println("");
            
             System.out.println("-------Cantidad de Personas con edad mayor a 18------");
           int l=0;
             while(l<vectPersonasEdad.length){
              if(vectPersonasEdad[l]==true){
                contEdadMayor++;
                
              }           
               if(vectPersonasEdad[l]==false){
                contEdadMenor++;
                
              }           
               l++;   
            }
             System.out.println("Cantidad de personas mayores a 18 : " + contEdadMayor);
            
              System.out.println("Cantidad de Personas con edad menor a 18 :" + contEdadMenor++);
       
        }
 
      
    }
    
   
