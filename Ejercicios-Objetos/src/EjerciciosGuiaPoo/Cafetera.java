/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuiaPoo;

/**
 *
 * @author marco
 */

//Ejercicio 6
public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;
   //Constructor vacio por defect  
    public Cafetera() {
    }
    
    //Constructor con parametros
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera(){
        this.capacidadMaxima=this.cantidadActual;
    }
    
   /*
    Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
    tamaño de la taza y simula la acción de servir la taza con la capacidad indicada.Si la 
    cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El 
    método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
    cuanto quedó la taza.
    */
    public void servirTaza(int tamanioTazaVacia ){
       if(tamanioTazaVacia<this.cantidadActual){
           System.out.println("Se lleno la taza");
            }else{
           System.out.println("La taza quedo " + this.cantidadActual);
       }
    }
                
    //Método vaciarCafetera(): pone la cantidad de café actual en cero
    
    public void  vaciarCafetera(){
        this.cantidadActual=0;          
        }
    
    /*
     Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
    recibe y se añade a la cafetera la cantidad de café indicada.
    */
    
    public void agregarCafe(int cantidadCafe){
        this.cantidadActual=cantidadCafe;
    }
}
