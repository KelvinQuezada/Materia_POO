/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesdediseño;

//creamos una clase ServicioSoftwareEducacional implements ServicioInformatico ya que son
//interfaces que definen un conjunto de métodos que una clase que las implementa debe proporcionar.
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
