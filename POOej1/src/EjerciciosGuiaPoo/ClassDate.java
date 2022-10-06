
package EjerciciosGuiaPoo;
import java.util.Date;
public class ClassDate {
    private Date fecha;

    public ClassDate(Date fecha) {
        this.fecha = fecha;
    }

       
    public ClassDate() {
        fecha = new Date(); //Esto para que no se cree la fecha en null
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
    
}
