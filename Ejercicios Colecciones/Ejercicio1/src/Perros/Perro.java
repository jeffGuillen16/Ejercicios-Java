package Perros;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Perro {

    private String Raza;

    public Perro() {
    }

    public Perro(String Raza) {
        this.Raza = Raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "Raza=" + Raza + '}';
    }

}
