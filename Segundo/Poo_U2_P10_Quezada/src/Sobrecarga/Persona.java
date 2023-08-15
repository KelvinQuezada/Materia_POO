
package Sobrecarga;

public class Persona {
    //Atributo
    String nombre;
    int edad;
    int cedula;
    //constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //sobrecarga
    public Persona(int cedula){
        this.cedula=cedula;
    }
    //creamos un metodo
    public void jugar(){
        System.out.println("Mi nombre es "+nombre+" Voy a jugar");
    }
    //sobrecarga del metodo
    public void jugar(String juego){
        System.out.println("Voy a jugar "+juego+ " me gusta mucho.");
    }
    
}
