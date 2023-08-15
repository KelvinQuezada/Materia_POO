package Abstracta;

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
