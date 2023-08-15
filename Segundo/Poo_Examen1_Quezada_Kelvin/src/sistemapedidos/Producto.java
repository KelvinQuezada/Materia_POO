/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapedidos;

/**
 *
 * @author antho
 */
public class Producto {
    // daremos a conocer los atributos de la clase Producto
    private String nombre;
// tendremos los constructores
    public Producto(String nombre) {
        this.nombre = nombre;
    }
// creamos los metodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}