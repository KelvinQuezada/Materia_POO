package EjercicioProducto;
//utilizamos lo que es herencia donde llamaremos la clase padre producto 
public class ofertaProducto extends Producto {
    //creamos los atributos 
	private int dias;
	//creamos los constructores para llamar los atributos de la clase Productos y tambien llamaremos 
	//el atributo dia de la clase ofertaProducto
    public ofertaProducto(String nombre, int precio, int dias) {
		super(nombre, precio);
		this.dias = dias;
	}
 // creamos los metodos get para mostrar datos o set es para modificar el valor de un atributo
	public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
//utilizamos otro metodos un tipo double para obtener el precio del pedido llamamos el metodo de la clase Producto 
    @Override
    public double obtenerPrecioPedido(int unidadesPedidas) {
        double precioFinal = super.obtenerPrecioPedido(unidadesPedidas);
        //utilizamos condicionales tipo if para dias que es igual a 1 y tendremos el calculo del precio final dependiendo los dias
        if (dias == 1) {
        	 // Aplicar 20% de descuento
            precioFinal *= 0.8;
        } else if (dias == 2 || dias == 3) {
        	// Aplicar 15% de descuento
            precioFinal *= 0.85; 
        } else if (dias > 3) {
        	// Aplicar 10% de descuento
            precioFinal *= 0.9; 
        }
        //llamo la precio por medio de recionFinal
        return precioFinal;
    }
}



