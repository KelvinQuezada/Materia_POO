package poo_u2_tarea3_quezada;
//La clase hija va heredar los atributos de la clase Productos
class EstandarProducto extends Producto {
    //atributos
    private String seccion;
    //constructores
    public EstandarProducto(String nombre, double precio,
            String seccion, String seccion1) {
        super(nombre, precio);
        this.seccion = seccion;
    }
//metodos get y set
    public String getSeccion() {
        return seccion;
    }
    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
//creamos una metodo obtenerPrecioPedido con el @Override deonde vamos a realizar
    // el precioFinal mediante las unidades y si es mayor a 5 tendra un descuento del  10%
    @Override
    public double obtenerPrecioPedido(int unidades) {
    double precioFinal = super.obtenerPrecioPedido(unidades);
    //utilizamos una condicion inicializamos que sea mayor igual a 5 
    if (unidades >= 5) {
        precioFinal *= 0.9;
        System.out.println("Tendra un descuento de 10% si hay mas de 5 unidades");
    }
        return precioFinal;
    }
}