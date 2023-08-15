package EjercicioProducto;
//La clase hija va heredar los atributos de la clase Productos
public class EstandarProducto extends Producto{
	//Atributo
	private String seccion;
	//creamos los constructores para llamar los atributos de la clase Productos y tambien llamaremos 
	//el atributo dia de la clase EstandarProducto
    public EstandarProducto(String nombre, int precio,String seccion) {
		super(nombre, precio);
		this.seccion=seccion;
	}
 // creamos los metodos get para mostrar datos o set es para modificar el valor de un atributo
	public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
//utilizamos un metodo para obtener Precio de las unidades 
    @Override
    public double obtenerPrecioPedido(int unidadesPedidas) {
    	//daremos a conocer un double ya que almacena numero decimales para calcular el precio final 
        double precioFinal = super.obtenerPrecioPedido(unidadesPedidas);
        //utilizamos una condicion tipo if donde dira que unidades es mayor a 5
        if (unidadesPedidas >= 5) {
        	//
            precioFinal *= 0.9; 
        }
        return precioFinal;
    }
}