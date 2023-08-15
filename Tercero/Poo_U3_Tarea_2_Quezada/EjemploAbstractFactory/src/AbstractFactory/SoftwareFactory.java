package AbstractFactory;
// Definición de la clase SoftwareFactory que implementa la 
//interfaz ServicioFactory
public class SoftwareFactory implements ServicioFactory {
// Sobrescribir el método crearServicio() de la interfaz
    @Override
    public ServicioInformatico crearServicio() {
// Crear y devolver una instancia de ServicioSoftwareEducacional
        return new ServicioSoftwareEducacional();
    }
}
