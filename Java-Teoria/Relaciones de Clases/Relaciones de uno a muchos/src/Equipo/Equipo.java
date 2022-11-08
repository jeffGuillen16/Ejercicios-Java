
package Equipo;

import Jugador.Jugador;
import java.util.ArrayList;

public class Equipo {

    private ArrayList<Jugador> jug;

    public ArrayList<Jugador> getJug() {
        return jug;
    }

    public void setJug(ArrayList<Jugador> jug) {
        this.jug = jug;
    }

    public void mostrar (){
    
        for(Jugador cadena : jug){
        
                System.out.println(cadena);
        }
            
    }
    
}
