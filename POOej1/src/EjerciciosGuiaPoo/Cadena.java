/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuiaPoo;
//Ejercicio 8
public class Cadena {
private String frase;    
private int longitud;

//Constructor Vacio por defecto
public void Cadena(){};
 
//Setters

public void setFrase(String frase,int longitud){
        this.frase=frase;
        this.longitud = longitud;
}
//Getters
    public String getFrase() {
        return frase;
    }


    public int getLongitud() {
        return longitud;
    }

/*
    a)
    Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
    ingresada.
     */
    public void mostrarVocales() {
        int contadorA=0;
        int contadorE=0;
        int contadorI=0;
        int contadorO=0;
        int contadorU=0;
        int resultadoTotal;
        //Substring(inicio,fin);->metodo Substring
        for (int i=0;i<this.longitud;i++){
            if(this.frase.substring(i, i+1).equals("a")){
                contadorA++;
            }
            if(this.frase.substring(i,  i+1).equals("e")){
                contadorE++;
            }
            
            if(this.frase.substring(i,  i+1).equals("i")){
                contadorI++;
            }
            
            if(this.frase.substring(i,  i+1).equals("o")){
                contadorO++;
            }
            
            if(this.frase.substring(i, i+1).equals("u")){
                contadorU++;
            }
        }
        resultadoTotal=contadorA+contadorE+contadorI+contadorO+contadorU;
        System.out.println("La cantidad total de vocales en la frase es : " + resultadoTotal );
    }
    
    /*b)Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por 
    ejemplo: Entrada: "casa blanca", Salida: "acnalb asac"*/
    
    public void invertirFrase(){
        
        String cadenaNueva="";
        for (int i=this.longitud-1;i>=0;i--){
            cadenaNueva += this.frase.substring(i,i+1);
                    }
      System.out.println("Cadena invertida "  + cadenaNueva );
    }
    /*c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
         contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: 
          Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces*/
    
    public void vecesRepetido(String letra){
        int contador=0;
        for(int i=0 ;i<this.frase.length();i++){
        if(this.frase.substring(i,i+1).equals(letra)){
            contador++;
        }
                  }
        System.out.println("Cantidad de veces que se repite la letra es :" + contador );
    }
    /*
    e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que 
    compone la clase con otra nueva frase ingresada por el usuario.
    */
    public void compararLongitud(String frase){
        
        if(this.frase.length()==frase.length()){
            System.out.println("Si es igual la longitud");
        }else {
            System.out.println("No es igual la longitud");
        }
    }
    
   /*
    f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con 
    una nueva frase ingresada por el usuario y mostrar la frase resultante
    */
    
    public void unirFrases(String frase){
        System.out.println("Cadena concatenada : " + this.frase.concat(frase));
    }
    /*
    g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
    encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la 
    frase resultante
    */
    
    public void reemplazar(String letra){
        String cadena=""; //Holaas
        for (int i=0;i<longitud;i++){
            
            if(!(this.frase.substring(i, i+1)).equals("a")){
            cadena+=this.frase.substring(i,i+1);
            }
            if(this.frase.substring(i, i+1).equals("a")){
                cadena+="*";
            }
        }
        System.out.println("candena reemplazada es : " + cadena  );
    }
    
    /*
    h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
    ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    */
    
    public void contiene(String letra){
        String resultado = "Falso , no contiene el resultado";
        for (int i=0;i<longitud;i++){
            if(this.frase.substring(i,i+1).equals(letra)){
                resultado="Verdadero , si contiene el resultado";
            }
        }
        System.out.println(resultado);
    }
}
