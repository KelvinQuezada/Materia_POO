/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesdediseño;

//tendremos una clase DesignFactory que sera implementada a la interface ServicioFactory
public class DesignFactory implements ServicioFactory {
//se crea un metodo para sobrescribiendo de la interfaz
//el método crearServicio() está definido en una clase que implementa la interfaz ServicioInformatico
    @Override
    public ServicioInformatico crearServicio() {
        return new ServicioTrabajo();
    }

}