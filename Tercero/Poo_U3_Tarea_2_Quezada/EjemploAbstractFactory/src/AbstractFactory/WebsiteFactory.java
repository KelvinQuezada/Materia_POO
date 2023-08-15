package AbstractFactory;
// Definición de la clase WebsiteFactory que implementa la
//interfaz ServicioFactory
public class WebsiteFactory implements ServicioFactory {
// Sobrescribir el método crearServicio() de la interfaz
    @Override
    public ServicioInformatico crearServicio() {
 // Crear y devolver una instancia de ServicioWebsites
        return new ServicioWebsites();
    }
}
