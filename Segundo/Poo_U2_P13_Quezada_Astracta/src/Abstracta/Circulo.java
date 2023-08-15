package Abstracta;

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
