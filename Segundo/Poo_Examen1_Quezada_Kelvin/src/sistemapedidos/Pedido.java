/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapedidos;

/**
 *
 * @author antho
 */
public class Pedido {
    //daremos a conocer los atributos de la clase contara como private ya que 
    //puede ser accedido únicamente por la misma clase por nada má
    private Producto producto;
    private Proveedor proveedor;
    private double precioUnitario;
    private int unidades;
// creamos los constructores de la clase donde dara a conocer los atributos de la clase
    public Pedido(Producto producto, Proveedor proveedor, double precioUnitario, int unidades) {
        this.producto = producto;
        this.proveedor = proveedor;
        this.precioUnitario = precioUnitario;
        this.unidades = unidades;
    }
// cremoas los metodos de la clase con los metodos get y set 

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

// por medio del double calcularTotal realizaremos el calculo de nuesto ejercicio  
    public double calcularTotal() {
        return precioUnitario * unidades;
    }
}

