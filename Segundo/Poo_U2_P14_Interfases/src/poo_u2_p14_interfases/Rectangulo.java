/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_u2_p14_interfases;

/**
 *
 * @author antho
 */

public class Rectangulo implements Figura, Dibujar{
	
	double base;
	double altura;
	
	public Rectangulo(double base, double altura) {
		this.altura=altura;
		this.base=base;
	}
	
	@Override
	public void dibujar() {
		System.out.println("vas a dibujar");
		
	}

	@Override
	public double calcularArea() {
		double resultado=base*altura;
		return resultado;
	}

}
