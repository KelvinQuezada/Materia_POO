package AbstractFactory;
// Definición de la clase ServicioSoftwareEducacional que implementa la interfaz ServicioInformatico
public class ServicioSoftwareEducacional implements ServicioInformatico {
    @Override
    public void asignarTrabajo() {
        System.out.println("Nuestros programadores han sido informados del programa que deben realizar.");
    }
    @Override
    public void indicarFechaEntrega() {
        System.out.println("Se ha fijado como fecha de entrega el dia 01/10/2023.");
    }
    @Override
    public void informarSobrePago() {
        System.out.println("El monto a pagar sera proporcional a la cantidad de estudiantes que haran uso del software.");
    }

}
