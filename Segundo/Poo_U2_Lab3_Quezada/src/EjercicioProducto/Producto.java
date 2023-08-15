package EjercicioProducto;
//Clase Principal 
public class Producto {
	//creamos los atributos para difinir las variables 
	 private String nombre;
	 private int precio;
//creamos los constructores de la clase principal 
	 public Producto(String nombre,int precio) {
		 this.nombre=nombre;
		 this.precio=precio;
		 
	 }
// creamos los metodos get para mostrar datos o set es para modificar el valor de un atributo
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		precio = precio;
	}
	
	 //creamos un metodo para realizar una multiplicacion del pedido 
    public double obtenerPrecioPedido(int unidadesPedidas) {
        return unidadesPedidas*precio ;
    }

}
