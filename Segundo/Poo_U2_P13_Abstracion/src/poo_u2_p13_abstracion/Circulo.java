/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_u2_p13_abstracion;

public class Circulo extends Figura{

	double r;
	
	public Circulo() {

	}

	public Circulo(double r,double x, double y) {
		super(x, y);
		this.r=r;

	}

	@Override
	public double calcularArea() {
		double pi=3.14;
		double resul=pi*r*r;
		return resul;
	}
	
}