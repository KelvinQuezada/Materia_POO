package AbstractFactory;
// Definición de la clase DesignFactory que implementa la 
//interfaz ServicioFactory
public class DesignFactory implements ServicioFactory {
    // Sobrescribir el método crearServicio() de la interfaz
    @Override
    public ServicioInformatico crearServicio() {
        // Crear y devolver una instancia de ServicioDesign
        return new ServicioDesign();
    }
}
