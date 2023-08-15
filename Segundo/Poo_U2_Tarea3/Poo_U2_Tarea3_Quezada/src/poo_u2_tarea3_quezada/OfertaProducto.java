
package poo_u2_tarea3_quezada;
//utilizamos lo que es herencia donde llamaremos la clase padre producto en si clase hija 
class OfertaProducto extends Producto {
    private int dias;
    public OfertaProducto(String nombre, double precio, int dias) {
        super(nombre, precio);
        this.dias = dias;
    }
    public int getDias() {
        return dias;
    }
    public void setDias(int dias) {
        this.dias = dias;
    }
    @Override
    public double obtenerPrecioPedido(int unidades) {
        // creamos una variable double precio Final utilizamos el super para implementación de la clase padre.
        //La variable "unidades" que se pasa como argumento al método representa la cantidad de unidades del pedido.
        double precioFinal = super.obtenerPrecioPedido(unidades);
        if (dias == 1) {     
            precioFinal *= 0.8; // Aplicar descuento del 20% si queda 1 día
            System.out.println("Tiene el 20% de descuanto");
        // verifica si la variable "dias" es igual a 2 o igual a 3. Si alguna de estas dos condiciones se cumple
        } else if (dias == 2 || dias == 3) {
            precioFinal *= 0.85; // Aplicar descuento del 15% si quedan 2 o 3 días
            System.out.println("Tiene el 15% de descuanto");
        } else if (dias > 3) {
            precioFinal *= 0.9; // Aplicar descuento del 10% si quedan más de 3 días
            System.out.println("Tiene el 10% de descuanto");
        }
        //tendremos el precio final 
        return precioFinal;
    }
}