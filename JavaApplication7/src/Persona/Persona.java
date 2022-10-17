//Metodo toString 
// Función : Transformar el objeto en cadena de texto
package Persona;
public class Persona {
    private String nombre ;
    private int edad ;
    private int dni ;
    
    //Constructor vacio
    public Persona(){
        
    }

    public Persona(String nombre, int edad, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }
    


  
    /*
    @Override //para sobreescrictura
    public String toString(){
        return "Su nombre es " + this.nombre + ", tiene " + this.edad + ", su dni es " + this.dni;
    }
    */
    
}
