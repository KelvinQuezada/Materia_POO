
package sistema_gestion_horario;
public class Asignatura {
    //Atributos
    private String nombre;
    private String horario;
    private Laboratorio laboratorio;
//constructores
    public Asignatura(String nombre, String horario, 
            Laboratorio laboratorio) {
        this.nombre = nombre;
        this.horario = horario;
        this.laboratorio = laboratorio;
    }
        //metodos get  para mostrar datos 
    public String getNombre() {
        return nombre;
    }
        //metodos get  para mostrar datos 
    public String getHorario() {
        return horario;
    }
        //metodos get  para mostrar datos 
    public Laboratorio getLaboratorio() {
        return laboratorio;
    }
}
