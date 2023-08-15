
package sistema_gestion_horario;
import java.util.List;
public class Laboratorio {
    //Atributo
    private String nombre;
    private int capacidad;
    private List<String> equipos;
    //constructores
    public Laboratorio(String nombre, int capacidad, 
            List<String> equipos) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.equipos = equipos;
    }
        //metodos get  para mostrar datos 
    public String getNombre() {
        return nombre;
    }
        //metodos get  para mostrar datos 
    public int getCapacidad() {
        return capacidad;
    }
    public List<String> getEquipos() {
        return equipos;
    }
    public boolean verificarDisponibilidad(String horario) {

        return true;
    }
}
