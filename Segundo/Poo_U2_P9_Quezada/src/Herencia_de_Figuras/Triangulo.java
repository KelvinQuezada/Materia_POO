package Herencia_de_Figuras;
//teemos la clase Triangulo que hereda de la clase Figura
public class Triangulo extends Figura {
    //Atributo
    private double base;
    private double altura;
//constructor 
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
//el @Override nos avida para el calculo de la Area
    @Override
    public void calcularArea() {
        double area = (base * altura) / 2;
        System.out.println("El area del triángulo es: " + area);
    }
    //el @Override nos avida para el calculo del Perimetro
    @Override
    public void calcularPerimetro() {
        // Implementa el cálculo del perímetro del triángulo
        
    }
}
