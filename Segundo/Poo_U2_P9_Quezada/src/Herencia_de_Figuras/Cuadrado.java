package Herencia_de_Figuras;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        double area = Math.pow(lado, 2);
        System.out.println("El area del cuadrado es: " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 4 * lado;
        System.out.println("El perimetro del cuadrado es: " + perimetro);
    }
}
