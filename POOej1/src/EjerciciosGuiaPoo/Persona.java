/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuiaPoo;
import java.util.Scanner;
//Ejercicio 7
/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo 
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro 
atributo, puede hacerlo. Los métodos que se implementarán son:
*/
public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private int peso;
    private double altura;
    
    public void Persona() {
    
    }

    public Persona(String nombre, int edad, String sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

   
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public int getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //Metodo crearPersona()
    
    public void crearPersona(){
        Scanner Leer = new Scanner(System.in);
        String sexo;
        System.out.println("Ingrese nombre :");
        this.nombre=Leer.nextLine();
        
        
        System.out.println("Ingrese edad :");
        this.edad=Leer.nextInt();
        
        
        System.out.println("Ingrese sexo :");
        sexo=Leer.nextLine();
        if(sexo=="H" ||sexo=="M" || sexo=="0"){
            this.sexo=sexo;
            }else{
            System.out.println("No es correcto el Sexo escrito");
        }
        
        
        System.out.println("Ingrese Peso :");
        this.peso=Leer.nextInt();
        
        
        System.out.println("Ingrese Altura :");
        this.altura=Leer.nextDouble();
        
    }
    
    //Método calcularIMC():
    
    public int calcularIMC(){
    double pesoIdeal;
    pesoIdeal=peso/(Math.pow(this.altura,2));
    int resultado=-1;
        if(pesoIdeal<20){
            resultado=-1;
            return resultado;
        }
        
        if(pesoIdeal>=20 && pesoIdeal<=25){
            resultado=0;
            return resultado;
        }
        
        if(pesoIdeal>25){
            resultado=1;
        }
        return resultado;
    }
    
   // Método esMayorDeEdad()
    
    public boolean esMayorDeEdad(){
        boolean esMayor = false;
        if(this.edad>18){
         esMayor=true;
        } 
            
        return esMayor;
    }
    
}
