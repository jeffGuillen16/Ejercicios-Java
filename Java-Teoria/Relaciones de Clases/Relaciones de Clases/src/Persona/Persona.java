package Persona;
import lombok.Getter;
import lombok.Setter;
import DNI.DNI;

@Getter
@Setter
public class Persona {

    private String nombre;
    private String apellido;
    private DNI dni;
    
    public void setDNI(DNI dni){
    
    this.dni=dni;
    }
    
    public DNI getDNI(){
    
        return dni;
        
        
    }
}
