/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuiaPoo;

//Ejercicio 10
import java.util.Arrays;


/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 
20.
*/
public class ClaseArrays {
    private double [] A = new double[50];
    private double [] B= new double[20];

    public ClaseArrays() {
    }
    //Incializar Arreglo A
    public void inicializarArregloA(){
        for (int i =0 ; i< 50 ; i++){
                
                A[i]+=(Math.random()*(50+50))-50;
                System.out.println("["+ (i+1) +"]"+A[i]);
        }
    }
    
    /*El arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
    ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 0.5.*/
    
    
    public void ordenarRellenar(){
    Arrays.sort(A);
    
    for (int i =0 ; i< 20 ; i++){
        if(i<10){
                B[i]=A[i];
        }   else {
            B[i]=0.5;
            }
            
        }
    
    }
    
    public void mostrarArrays(){
        
        System.out.println("---------Array A------------");
        for(int i=0;i<50;i++){
            System.out.println("["+ (i+1) +"]"+ A[i]);
        }
        
        System.out.println("---------Array B------------");
        for(int i=0;i<20;i++){
            System.out.println("["+ (i+1) +"]" + B[i]);
        }
    }
}
