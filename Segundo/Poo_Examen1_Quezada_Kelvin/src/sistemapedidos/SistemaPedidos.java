/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemapedidos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaPedidos {
    /*Daremos a conocer el private static Scanner scanner = new Scanner(System.in); es para establecer los datos ingresados solo de esta clase
    creamos tres arrelos para los productos, proveedores y pedidos por medio de ArrayList donde  
    */
    private static Scanner scanner = new Scanner(System.in);
    private static List<Producto> productos = new ArrayList<>();
    private static List<Proveedor> proveedores = new ArrayList<>();
    private static List<Pedido> pedidos = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
//utilizaremos un condicional do - while donde es un bucle que se repite mientras que se cumple una determinada condición
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Ingresar productos");
            System.out.println("2. Ingresar proveedores");
            System.out.println("3. Nuevo pedido");
            System.out.println("4. Mostrar pedido con mas unidades");
            System.out.println("5. Mostrar total facturado");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            //llamaremos todos los public void que realizamos en nuestra clase ya que se almacena en la misma clase 
            switch (opcion) {
                case 1:
                    ingresarProductos();
                    break;
                case 2:
                    ingresarProveedores();
                    break;
                case 3:
                    nuevoPedido();
                    break;
                case 4:
                    mostrarPedidoMayor();
                    break;
                case 5:
                    mostrarTotalFacturado();
                    break;
                case 6:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 6);
    }



    public static void ingresarProductos() {
        // realizaremos el ingreso de cantidad de producto en la cual scanner sera un ArrayList donde se podra ingresar numeros enteros
        System.out.print("Ingrese la cantidad de productos : ");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        for (int i = 0; i < cantidadProductos; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            String nombreProducto = scanner.nextLine();
            // llamamos el ArrayList de nuestro productos 
            Producto producto = new Producto(nombreProducto);
            productos.add(producto);
        }
    }

    public static void ingresarProveedores() {
         // realizaremos el ingreso de cantidad de producto en la cual scanner sera un ArrayList donde se podra ingresar numeros enteros
        System.out.print("Ingrese la cantidad de proveedores a registrar: ");
        int cantidadProveedores = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        for (int i = 0; i < cantidadProveedores; i++) {
            System.out.print("Ingrese el nombre del proveedor " + (i + 1) + ": ");
            String nombreProveedor = scanner.nextLine();
            // llamamos el ArrayList de nuestro productos 
            Proveedor proveedor = new Proveedor(nombreProveedor);
            proveedores.add(proveedor);
        }
    }

    /*daremos a conocer un public static void nuevoPedido son los atributos donde 
    indica que el metodo no retorna ningun valor
    
    */
    public static void nuevoPedido() {
        /*daremos a conocer los ArrayList productos ingresados y los ArrayList proveedores Devuelve  si
        el valor 1 (true) si hay un campo vacío; de lo contrario, devuelve el valor 0 (false). 
        
        */
        if (productos.isEmpty() || proveedores.isEmpty()) {
            System.out.println("Debe ingresar al menos un producto y un proveedor antes de realizar un pedido.");
            return;
        }
        /*mediante el for mostraremos la lista de los productos mediante un ArrayList que fuimos ingresados por el metodo get
        el size Nos devuelve un entero con el tamaño de la lista
        */
        System.out.println("Lista de productos:");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println((i + 1) + ". " + productos.get(i).getNombre());
        }
        //establecemos una variable de tipo entero para almacenar numeros enteros
        System.out.print("Ingrese el número del producto: ");
        int numProducto = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        //mediante el condicional for mostraremos la lista de los proveedores con el metodo get 
        System.out.println("Lista de proveedores:");
        for (int i = 0; i < proveedores.size(); i++) {
            System.out.println((i + 1) + ". " + proveedores.get(i).getNombre());
        }
        //daremos a conocer una variable de tipo entero para almacenar nuemros enteros
        System.out.print("Ingrese el número del proveedor: ");
        int numProveedor = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese el precio unitario: ");
        double precioUnitario = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese la cantidad de unidades: ");
        int unidades = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        //llamaremos a nuestra clase Producto y establecemos una varible nueva para que llamaemos los atributos de la la clase Producto
        //donde mostraremos los productos y proveedores 
        Producto producto = productos.get(numProducto - 1);
        Proveedor proveedor = proveedores.get(numProveedor - 1);
        // llemaremos los atributos de la clase Pedidos 
        Pedido pedido = new Pedido(producto, proveedor, precioUnitario, unidades);
        pedidos.add(pedido);
    }
/*  llamaremos los atributos de la clase pedidos y utilizamos el isEmpty ya que devuelve  si
    el valor 1 si es verdadero utilizamos condicionales como el if - else - for llamamos la clase Pedido creamos un metodo llamado 
    pedidoMayor utilizamos el metodo get para llamar los atributos de la clase
    */
    public static void mostrarPedidoMayor() {
        if (pedidos.isEmpty()) {
            System.out.println("No se han registrado pedidos.");
        } else {
            Pedido pedidoMayor = pedidos.get(0);
            // Nos devuelve un entero con el tamaño de la lista
            for (int i = 1; i < pedidos.size(); i++) {
                Pedido pedido = pedidos.get(i);
                //comparamos el pedido si es mayor que el pedidoMayor
                if (pedido.getUnidades() > pedidoMayor.getUnidades()) {
                    //tenemos el resultado de nuestra operacion 
                    pedidoMayor = pedido;
                }
            }
//Imprimira los resutados del sistema de producto
            System.out.println("=======================================================");
            System.out.println("Pedido con mas unidades:");
            System.out.println("Proveedor: " + pedidoMayor.getProveedor().getNombre());
            System.out.println("Producto: " + pedidoMayor.getProducto().getNombre());
            System.out.println("Precio unitario: " + pedidoMayor.getPrecioUnitario());
            System.out.println("Unidades: " + pedidoMayor.getUnidades());
            System.out.println("=======================================================");
        }
    }
// realizaremos un total factura donde bamos a utilizar la condicional for para llamar nuestra clase Pedido y como llamamos a nuestra nueva variablle 
    //llamamos los ArrayList llamado pedidos
    public static void mostrarTotalFacturado() {
        double totalFactura = 0;
        for (Pedido pedido : pedidos) {
            totalFactura += pedido.calcularTotal();
        }
        //imprimimos los resultados del total factura
        System.out.println("Total factura: " + totalFactura);
    }
}