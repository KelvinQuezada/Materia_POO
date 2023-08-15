
package tarea2_jerarquia_clases;
//la libreria LocalDate guarda la fecha de una etapa año-mes-dia
import java.time.LocalDate;
//Clase Padre
public abstract class Empleado {
  //Atributos de la clase   
    private String nombre;
    public int edad;
    private LocalDate fechaIngreso;
    private double salario;
    //acceso protegido
    //creamos una constante estatica 
    protected static final double BONO = 2000.0;
//creamos los contructores donde llamaremos todos los atributos de la clase Empleado
    public Empleado(String nombre, int edad, LocalDate fechaIngreso, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
    }
    //creamos un metodo abstract tipo vacio
    public abstract void incentivar();
    //el metodo get nos devuelve el valor de Nombre
    public String getNombre() {
        return nombre;
    }
    //el metodo set no devuelve nada solo establece datos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public LocalDate getFechaIngresada() {
        return fechaIngreso;
    }
    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
