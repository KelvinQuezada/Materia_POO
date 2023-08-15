/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leccionvehiculo;

/**
 *
 * @author antho
 */
public class Carro extends Vehiculo{
    //ATRIBUTOS
    private int puertas;
    private String tipoCombustible;
    private double precio;
    //constructores

    public Carro(String marca, String modelo, int ano, int puertas, String tipoCombustible, double precio) {
        super(marca, modelo, ano);
        this.puertas = puertas;
        this.tipoCombustible = tipoCombustible;
        this.precio = precio;
    }
    
    //metodos get  para mostrar datos 
    public int getPuertas() {
        return puertas;
    }
    // metodo set es modificar el valor de un atributo.
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    //metodos get  para mostrar datos 
    public String getTipoCombustible() {
        return tipoCombustible;
    }
    // metodo set es modificar el valor de un atributo.
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    //metodos get  para mostrar datos 
    public double getPrecio() {
        return precio;
    }
    // metodo set es modificar el valor de un atributo.
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
