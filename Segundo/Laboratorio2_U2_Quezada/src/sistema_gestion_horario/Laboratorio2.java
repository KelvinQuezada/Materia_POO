
package sistema_gestion_horario;
import java.util.List;
//utilizamos el extends para hacer herencia del Laboratorio 
//que hereda los atributos de la clase
public class Laboratorio2 extends Laboratorio {
    //Atributo
    private String lugar;
    //constructor
    public Laboratorio2(String nombre, int capacidad, 
            List<String> equipos, String lugar) {
        super(nombre, capacidad, equipos);
        this.lugar = lugar;
    }
    //metodos get  para mostrar datos 
    public String getLugar() {
        return lugar;
    }  
}
