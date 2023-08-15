/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia_2;

/**
daremos a conocer la clase deportista que hereda de la clase Persona
 */

public class Deportista extends Persona {
    String deporte;
    //creamos los constructores
    public Deportista(String nombre, String deporte){
        super(nombre);
        this.deporte = deporte;
    }
    // cremos los metodos get y setg
    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    
    public String getDeporte() {
        return deporte;
    }
}