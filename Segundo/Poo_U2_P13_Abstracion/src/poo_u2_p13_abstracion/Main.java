
package poo_u2_p13_abstracion;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el valor del radio: ");
        double r=leer.nextDouble();
        System.out.print("Ingrese el lado de la X: ");
        double x = leer.nextDouble();
        System.out.print("Ingrese el lado de la Y: ");
        double y = leer.nextDouble();
        System.out.print("Ingrese el primer numero de la Lado de circulo : ");
        double lado = leer.nextDouble();
        Circulo circulo=new Circulo(r,x,y);
        circulo.calcularArea();
        Cuadrado cuadrado = new Cuadrado(lado, x, y);
        cuadrado.calcularArea();
        cuadrado.equals(cuadrado);
        
        
        System.out.println("La area del circulo es: "+circulo.calcularArea());
        System.out.println("La area del cuadrado es: "+cuadrado.calcularArea());

    }

}