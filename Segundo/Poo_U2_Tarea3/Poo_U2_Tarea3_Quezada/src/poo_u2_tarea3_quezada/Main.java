package poo_u2_tarea3_quezada;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //creamos un scanner para el ingreso de datos
        Scanner leer = new Scanner(System.in);
       //creamos un arreglo de producto creamos un nuevo objeto damos el limite de 5 de nuestro producto
        Producto[] productos = new Producto[5];
    int opcion;
    do {
        System.out.print("===============================================");
        System.out.println("        \n Menu");
        System.out.print("===============================================");
        System.out.println("1. Registro de Productos");
        System.out.println("2. Mostrar informacion de los productos");
        System.out.println("3. Salir");
        System.out.print("===============================================");
        opcion = leer.nextInt();
        leer.nextLine(); // Limpiar el buffer de entrada
        switch (opcion) {
            case 1:
                /*creamos una condicional tipo for ya que es un bloque de codigo que se cumple una condicion 
                el int i es la inicializamos la variable 0 es el contador de numero repetitivo
                la condicion i <5 es menor que 5, la iteracion i++ es un bucle de incremento
                */
                for (int i = 0; i < 5; i++) {
                    System.out.println("Ingrese los datos del producto " + (i + 1) + ":");
                    System.out.print("Nombre: ");
                    String nombre = leer.nextLine();
                    leer.nextLine(); // Limpiar el buffer de entrada
                    System.out.print("Precio: ");
                    double precio = leer.nextDouble();
                    leer.nextLine(); // Limpiar el buffer de entrada

                    System.out.println("Es un producto estandar o ofertado? (E/O): ");
                    String tipoProducto = leer.nextLine();                   
                    //el equalsIgnoreCase compara la cadena de texto contra un objeto ignorando mayúsculas y minúsculas                    
                    if (tipoProducto.equalsIgnoreCase("E")) {
                        System.out.print("Seccion: ");
                        String seccion = leer.nextLine();
                        //llamamos a nuestro objeto producto y llamamos el indice [i] ya que indica la posición 
                        //específica en la que se almacenará la nueva instancia.
                        productos[i] = new EstandarProducto(nombre,precio,tipoProducto,seccion);
                    //el equalsIgnoreCase compara la cadena de texto contra un objeto ignorando mayúsculas y minúsculas
                    } else if (tipoProducto.equalsIgnoreCase("O")) {
                        System.out.print("Dias restantes para la oferta: ");
                        int dias = leer.nextInt();
                        productos[i] = new OfertaProducto(nombre, precio, dias);
                    }
                }             
                System.out.print("Ingrese el nomero de unidades pedidas: ");
                int unidadesPedidas = leer.nextInt();
                leer.nextLine(); // Limpiar el buffer de entrada

                double totalPedido = 0.0;
                /*creamos una condicion tipo for que indica el inicio de un bucle
                //(Producto producto : productos)  es la que se especifica la declaración del bucle y cómo se va a iterar sobre la colección "productos". 
                "Producto" es el tipo de elemento en la colección y "producto" es una variable que representa cada elemento individual mientras se itera.
                */
                for (Producto producto : productos) {
                    totalPedido += producto.obtenerPrecioPedido(unidadesPedidas);
                }

                System.out.println("Total del pedido: " + totalPedido);
                break;
            case 2:
                System.out.println("Informacion de los productos:");
                /*creamos una condicional tipo for ya que es un bloque de codigo que se cumple una condicion 
                el int i es la inicializamos la variable 0 es el contador de numero repetitivo
                la condicion i <5 es menor que 5, la iteracion i++ es un bucle de incremento
                */
                for (int i = 0; i < 5; i++) {
                    Producto producto = productos[i];
                    System.out.println("Producto " + (i + 1) + ": " + producto.getNombre());
                    System.out.println("Precio: " + producto.getPrecio());
                    if (producto instanceof EstandarProducto) {
                        EstandarProducto productoEstandar = (EstandarProducto) producto;
                        System.out.println("Seccion: " + productoEstandar.getSeccion());
                    } else if (producto instanceof OfertaProducto) {
                        OfertaProducto productoOfertado = (OfertaProducto) producto;
                        System.out.println("Dias restantes para la oferta: " + productoOfertado.getDias());
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("seleccione una opcion valida.");
                break;
            }
        } while (opcion != 3);
    }
}