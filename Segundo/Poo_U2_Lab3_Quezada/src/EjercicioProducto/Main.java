package EjercicioProducto;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		//utilizamos el metodo Scanner para el ingreso de datos 
		Scanner leer=new Scanner(System.in);
		System.out.println("Ingrese el nombre del producto: ");
		String nombre=leer.next();
		System.out.println("Ingrese el precio:  ");
		int precio=leer.nextInt();
		System.out.println("Ingrese seccion: ");
		String seccion=leer.next();
		System.out.println("Ingrese el dia:  ");
		int dia=leer.nextInt();
		//llamamos los atributos de la clase padre Producto y tambien llamamos su atributo de sus calses EstandarProducto
		EstandarProducto estandarPro=new EstandarProducto(nombre,precio,seccion);
		//llamamos los atributos de la clase padre Producto y tambien llamamos su atributo de sus calses ofertaProducto
		ofertaProducto OfeProducto=new ofertaProducto(nombre,precio,dia);
		//imporimimos los resultados llamamos los metodos get
		System.out.println("Su nombre es: "+estandarPro.getNombre());
		System.out.println("Su precio es: "+estandarPro.getPrecio());
		System.out.println("Su seccion es: "+estandarPro.getSeccion());
		System.out.println("El valor total de descuento: "+estandarPro.obtenerPrecioPedido(dia)+" por el dia que ingreso");
		System.out.println("El valor total del producto es: "+estandarPro.obtenerPrecioPedido(precio));
        
    }
}
