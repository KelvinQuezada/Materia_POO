package Herencia_de_Figuras;

public class Paralelogramo extends Figura {
    //Atributo
    private double base;
    private double altura;
    //constructor
    public Paralelogramo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
//el @Override nos ayuda para realizar el calculo de la Area
    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("El area del paralelogramo es: " + area);
    }
//el @Override nos ayuda para realizar el calculo del perimetro
    @Override
    public void calcularPerimetro() {
        double perimetro = 2 * (base + altura);
        System.out.println("El perimetro del paralelogramo es: " + perimetro);
    }
}
