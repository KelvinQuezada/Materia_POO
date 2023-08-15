/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_u2_p14_interfases;


public class Cuadrado implements Figura, Dibujar {
	
	double lado;
	
	public Cuadrado(double lado) {
		this.lado=lado;
	}

	@Override
	public double calcularArea() {
		double resultado=lado*lado;
		return resultado;
	}

	@Override
	public void dibujar() {
		System.out.println("");
		
	}

}