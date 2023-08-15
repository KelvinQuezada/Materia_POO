/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leccionvehiculo;

/**
 *
 * @author antho
 */
public class Motocicleta extends Vehiculo{
    private int ciclindrada;
    private boolean tieneMarcha;
    private String color;
    
    //constructores 

    public Motocicleta(String marca, String modelo, int ano,int ciclindrada, boolean tieneMarcha, String color) {
        super(marca, modelo, ano);
        this.ciclindrada = ciclindrada;
        this.tieneMarcha = tieneMarcha;
        this.color = color;
    }
    
    //metodos get  para mostrar datos 

    public int getCiclindrada() {
        return ciclindrada;
    }
    // metodo set es modificar el valor de un atributo.
    public void setCiclindrada(int ciclindrada) {
        this.ciclindrada = ciclindrada;
    }
    //metodos get  para mostrar datos 
    public boolean isTieneMarcha() {
        return tieneMarcha;
    }
    // metodo set es modificar el valor de un atributo.
    public void setTieneMarcha(boolean tieneMarcha) {
        this.tieneMarcha = tieneMarcha;
    }
    //metodos get  para mostrar datos 
    public String getColor() {
        return color;
    }
    // metodo set es modificar el valor de un atributo.
    public void setColor(String color) {
        this.color = color;
    }
    
    
}
