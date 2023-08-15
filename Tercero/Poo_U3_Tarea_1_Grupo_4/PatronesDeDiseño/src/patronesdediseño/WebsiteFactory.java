/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesdediseño;

public class WebsiteFactory implements ServicioFactory {
//sobrescribiendo un método de la interfaz
    @Override
    //el método crearServicio() está definido en una clase que implementa la interfaz ServicioInformatico
    public ServicioInformatico crearServicio() {
        return new ServicioWebsites();
    }

}
