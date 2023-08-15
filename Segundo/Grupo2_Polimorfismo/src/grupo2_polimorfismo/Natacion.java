/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo2_polimorfismo;

/**
 *
 * @author antho
 */
public class Natacion extends Deportista {
private String estilo;

    public Natacion( String nombre, int edad, String disiplina, String sexo,String estilo) {
        super(nombre, edad, disiplina, sexo);
        this.estilo = estilo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public void entrenamiento() {
         System.out.println("Es el deporte trabaja la mayoria los musculos del cuerpo ");
    }

       public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("EDA: "+getEdad());
        System.out.println("DISIPLINA: "+getDisiplina());
        System.out.println("SEXO: "+getSexo());
        System.out.println("ESTILO: "+getEstilo());
    }
    
}
