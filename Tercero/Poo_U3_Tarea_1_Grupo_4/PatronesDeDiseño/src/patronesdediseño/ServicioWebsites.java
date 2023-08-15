/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesdediseño;

public class ServicioWebsites implements ServicioInformatico {
//creamos tres metodos que estan sobrescribiendo es nuestra clase interfaz de ServicioInformatico
    @Override
    public void asignarTrabajo() {
        System.out.println("El personal encargado del desarrollo de sitios web ha aceptado el trabajo.");
    }

    @Override
    public void indicarFechaEntrega() {
        System.out.println("El sitio web con Responsabilida Designara terminado el día 26/11/2023.");
    }

    @Override
    public void informarSobrePago() {
        System.out.println("El monto a pagar no incluye el pago por dominio y hosting.");
    }

}
