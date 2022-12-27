
package Main;
import Ejercicio2Teoria.Jugador;
import Ejercicio2Teoria.Equipo;
import java.util.ArrayList;

public class NewMain {

    
    public static void main(String[] args) {
       ArrayList<Jugador>jug=new ArrayList();
       Jugador jugador1 = new Jugador("Pedro","Bustamante","Centro",8);
       Jugador jugador2 = new Jugador("Rocio","Daiana","Lateral",4);
       Jugador jugador3 = new Jugador("CR7","Ronaldo","Portero",5);
       Jugador jugador4 = new Jugador("Messi","Leionel","Delantero",10);
       jug.add(jugador1);
       jug.add(jugador2);
       jug.add(jugador3);
       jug.add(jugador4);
       Equipo equipo = new Equipo();
       equipo.setJug(jug);
       equipo.mostrar();
    }
    
}
