/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia_2;
//clase Principal llamada Persona
public class Persona {
    String nombre;
  //constructore  
    public Persona(String nombre){
        this.nombre = nombre;
    }
    //metodos get y set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
}