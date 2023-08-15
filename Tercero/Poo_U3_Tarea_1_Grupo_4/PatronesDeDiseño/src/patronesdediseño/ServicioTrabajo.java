/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesdediseño;

public class ServicioTrabajo implements ServicioInformatico {
//creamos tres metodos que estan sobrescribiendo es nuestra clase interfaz de ServicioInformatico
    @Override
    public void asignarTrabajo() {
        System.out.println("El trabajado ha sido asignado a disenadores graficos disponibles.");
    }

    @Override
    public void indicarFechaEntrega() {
        System.out.println("Ellos han determinado terminar el trabajo como maximo para el dia 09/08/2023.");
    }

    @Override
    public void informarSobrePago() {
        System.out.println("Debe realizar el pago en efectivo al momento de recoger el logo completamente terminado.");
    }

}
