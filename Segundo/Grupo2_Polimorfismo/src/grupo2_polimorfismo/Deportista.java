/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo2_polimorfismo;

/**
 *
 * @author antho
 */
public abstract class Deportista {
    private String nombre;
    private int edad;
    private String disiplina;
    private String sexo;

    public Deportista(String nombre, int edad, String disiplina, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.disiplina = disiplina;
        this.sexo = sexo;
    }

    //creamos un nuevo metodo
    public abstract void entrenamiento();
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDisiplina() {
        return disiplina;
    }

    public void setDisiplina(String disiplina) {
        this.disiplina = disiplina;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
