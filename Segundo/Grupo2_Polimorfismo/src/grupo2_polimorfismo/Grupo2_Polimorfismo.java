/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grupo2_polimorfismo;

import java.util.Scanner;

/**
 *
 * @author antho
 */
public class Grupo2_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
            String nombre,disiplina,sexo;
            int edad;
           System.out.println("Escoja una opcion ");  
           System.out.println("1 natacion");  
           System.out.println("2. Atletismo");
           int opc1=entrada.nextInt();
           switch (opc1){
               case 1:
                    System.out.println("Ingrese los datos ");
                    System.out.println("Nombre: ");
                    nombre=entrada.next();
                    System.out.println("2. EDA");
                    edad=entrada.nextInt();
                    System.out.println("Disiplina");
                    disiplina=entrada.next();
                    System.out.println("Sexo");
                    sexo=entrada.next();
                    System.out.println("Prueba");
                    String prueba=entrada.next();
                    Atletismo atl=new Atletismo(nombre, edad,  disiplina,  sexo, prueba);
                   atl.entrenamiento();
                   atl.mostrarDatos();
                    break;
               case 2:
                   System.out.println("Ingrese los datos ");
                    System.out.println("Nombre: ");
                    nombre=entrada.next();
                    System.out.println("2. EDA");
                    edad=entrada.nextInt();
                    System.out.println("Disiplina");
                    disiplina=entrada.next();
                    System.out.println("Sexo");
                    sexo=entrada.next();
                    System.out.println("Estilo");
                    String estilo=entrada.next();
                    Natacion nat=new Natacion(nombre, edad,  disiplina,  sexo, estilo);
                   nat.entrenamiento();
                   nat.mostrarDatos();
                    break;
           }
    }
    
}
