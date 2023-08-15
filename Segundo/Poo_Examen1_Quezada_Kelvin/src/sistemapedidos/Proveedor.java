/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapedidos;

/**
 *
 * @author antho
 */
public class Proveedor {
    // creamos los atributos de la clase
    private String nombre;
// daremos a conocer los constructores 
    public Proveedor(String nombre) {
        this.nombre = nombre;
    }
// metodo get y set 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}