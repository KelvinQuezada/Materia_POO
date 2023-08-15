package Abstracta;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el lado de la X: ");
        double x = leer.nextDouble();
        System.out.print("Ingrese el lado de la Y: ");
        double y = leer.nextDouble();
        System.out.print("Ingrese el primer numero de la Lado: ");
        double lado = leer.nextDouble();
        Cuadrado cuadrado = new Cuadrado(lado, x, y);
        cuadrado.calcularArea();
        cuadrado.equals(cuadrado);

    }

}
