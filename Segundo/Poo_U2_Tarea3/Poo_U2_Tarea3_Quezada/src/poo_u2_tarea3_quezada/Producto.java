package poo_u2_tarea3_quezada;
//clase padre
class Producto {
    //creamos los atributos para difinir las variables
    private String nombre;
    private double precio;
//creamos los constructores donde llamaremos todo los atributos de la clase Producto 
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
//creamos los metodos get es para mostrar datos 
    public String getNombre() {
        return nombre;
    }
//creamos los metodos set es para modificar el valor de un atributo
    public double getPrecio() {
        return precio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
//creamos nuestro metodo para obtenerPrecioPedido(int unidades)
//realizamos una operacion de unidades*precio 
    public double obtenerPrecioPedido(int unidades) {
        return unidades * precio;
    }
}