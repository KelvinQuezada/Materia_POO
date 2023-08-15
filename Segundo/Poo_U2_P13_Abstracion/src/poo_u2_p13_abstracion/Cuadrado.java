/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_u2_p13_abstracion;

public class Cuadrado extends Figura{
	double lado;

	public Cuadrado() {
		
	}

	public Cuadrado(double lado,double x, double y) {
		super(x, y);
		this.lado=lado;
		// TODO Auto-generated constructor stub
	}



	@Override
	public double calcularArea() {
		double resul=lado*lado;
		return resul;
	}
	

}
