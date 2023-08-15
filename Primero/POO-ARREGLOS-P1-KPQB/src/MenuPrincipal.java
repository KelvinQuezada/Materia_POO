
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author antho
 */
public class MenuPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try(Scanner teclado = new Scanner(System.in)) {
            System.out.println("\t==================================");
            System.out.println("\t\tPRUEBA DE ARREGLOS");
            System.out.println("\t==================================");
            System.out.println("1. ARREGLO DE UNA OPERACON ");
            System.out.println("2. ARREGLOS PERSONA");
            System.out.println("3.SALIR");
            System.out.print("Ingrese opcion (1 a 3 ): ");
            System.out.print("Ingrese su opción:");
            int opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("\t==================================");
                    System.out.print("Ingrese cuntas valores va a ingresar?:");
                    int cantidadNotas = teclado.nextInt();
                    double[] notas = new double[cantidadNotas];
                    
                    for (int i = 0; i < cantidadNotas; i++) {
                        System.out.println("NOTA #" + (i + 1) );
                        notas[i] = teclado.nextDouble();
                    }
                    
                    OperacionNotas opcionOperacion = new OperacionNotas(notas);

                    double mayor = opcionOperacion.obtenerMayor();
                    System.out.println("El numero mayor es: " + mayor);
                    double menor = opcionOperacion.obtenerNotas();
                    System.out.println("El numero menor es: " + menor);
                    double sumaTotal = opcionOperacion.obtenerTotal();
                    System.out.println("La suma total es: " + sumaTotal);
                    break;
                case 2:
                    
                    System.out.print("Ingrese un numero de cuantas personas va a ingresar: ");
                    int cantidadPersonas = teclado.nextInt();
                    teclado.nextLine(); 
                    
                    String[] nombres = new String[cantidadPersonas];
                    for (int i = 0; i < cantidadPersonas; i++) {
                        System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
                        nombres[i] = teclado.nextLine();
                    }
                    Persona personas = new Persona(nombres);
                    personas.mostrarPersonas();
                    break;
                case 3:
                   
                    System.out.println("[GRACIAS POR INGRESAR AL MENU]");
                    break;
                default:
                    System.out.println("[LA OPCION INGRESADA ES INCORRETA]");
                   
                    break;
            }
        }
    }
}

