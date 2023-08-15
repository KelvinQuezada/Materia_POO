/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leccionvehiculo;

public class Vehiculo {
  //Creamos los atributos privado ya que puede ser accedido únicamente por la misma clase por nada más
    private String marca;
    private String modelo;
    private int ano;
    
    //constructores

    public Vehiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
        //metodos get  para mostrar datos 
    public String getMarca() {
        return marca;
    }
    // metodo set es modificar el valor de un atributo.
    public void setMarca(String marca) {
        this.marca = marca;
    }
    //metodos get  para mostrar datos 
    public String getModelo() {
        return modelo;
    }
    // metodo set es modificar el valor de un atributo.
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    //metodos get  para mostrar datos 
    public int getAno() {
        return ano;
    }
    // metodo set es modificar el valor de un atributo.
    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
