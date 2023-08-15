package Herencia_de_Figuras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //utilizamos el Scanner para el ingreso de consola
        Scanner leer = new Scanner(System.in);
        int opcion;
        //utilizamos el do while es una estructura de control cíclica que 
        //permite ejecutar de manera repetitiva un bloque de instrucciones sin evaluar de forma inmediata una condición especifica,
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triangulo");
            System.out.println("3. Rectangulo");
            System.out.println("4. Paralelogramo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
           //para slecionar las opciones 
            opcion = leer.nextInt();
            //los case son las opciones que estan nuestro ejercicos
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double ladoCuadrado = leer.nextDouble();
                    //llamamos la clase Cuadrado y intacioamos 
                    Cuadrado cuadrado = new Cuadrado(ladoCuadrado);
                    //llamamos los metodos
                    cuadrado.calcularArea();
                    cuadrado.calcularPerimetro();
                    break;
                case 2:
                    System.out.print("Ingrese la base del triangulo: ");
                    double baseTriangulo = leer.nextDouble();
                    System.out.print("Ingrese la altura del triangulo: ");
                    double alturaTriangulo = leer.nextDouble();
                    //llamaos la clase triangulo donde instanciamos
                    Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
                
                    //llamos los metodos de la clase trinagulo
                    triangulo.calcularArea();
                    triangulo.calcularPerimetro();
                    break;
                case 3:
                    System.out.print("Ingrese la base del rectangulo: ");
                    double baseRectangulo = leer.nextDouble();
                    System.out.print("Ingrese la altura del rectangulo: ");
                    double alturaRectangulo = leer.nextDouble();
                    //llamamos la clase Rectangulo y intanciamos 
                    Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
                    //llamamos los metodos 
                    rectangulo.calcularArea();
                    rectangulo.calcularPerimetro();
                    break;
                case 4:
                    System.out.print("Ingrese la base del paralelogramo: ");
                    double baseParalelogramo = leer.nextDouble();
                    System.out.print("Ingrese la altura del paralelogramo: ");
                    double alturaParalelogramo = leer.nextDouble();
                    //llamaos la clase paralelogramo intanciomos y llamos la base y la altura de la clase
                    Paralelogramo paralelogramo = new Paralelogramo(baseParalelogramo, alturaParalelogramo);
                    //llamos los metodos de la clase paralelogramo
                    paralelogramo.calcularArea();
                    paralelogramo.calcularPerimetro();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        } while (opcion != 5);
    }
}
