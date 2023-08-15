/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_u2_p16_polimorfismo;


public class Cuadrado extends Figura{
    double lado;


    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double superficie() {
        double resul=lado*lado;
        return resul;
    }
	
    
}
