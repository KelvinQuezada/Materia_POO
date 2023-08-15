/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutoria8arreglos;

import java.util.Scanner;

/**
 *
 * @author antho
 */
public class Tutoria8Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer =new Scanner(System.in);
        int opcion;
        do {  
            System.out.println("Menu de arreglos");
            System.out.println("1. Registro de datos");
            System.out.println("2. Ingresos de numeros");
            System.out.println("3. Salir");
            opcion=leer.nextInt();
            switch (opcion) {
                case 1:
                    registroDatos();
                    break;
                case 2:
                    ingresosNumeros();
                    break;
                    
                case 3:
                    System.out.println("A finalizado el programa");
                    break;
                default:
                    System.out.println("LA OPCION ES INCORRECTA");
            }
            
        } while (opcion!=3);
    }
    static void registroDatos(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de persona que va a rregistrar");
        int canPersonas=leer.nextInt();
        //creamos arreglos para el ingreso de datos como nombres,edades,direcciones
        String [] nombres=new String[canPersonas];
        int [] edades=new int[canPersonas];
        String [] direcciones=new String[canPersonas];
        
        for (int i = 0; i <canPersonas ; i++) {
            System.out.println("-> Personas "+(i+1)+" :");
            System.out.println("Nombre:");
            String nombre=leer.nextLine();
            nombres[i]=nombre;
            leer.nextLine();//limpiar el buffer
            System.out.println("Edad: ");
            int edad=leer.nextInt();
            edades [i]=edad;
            leer.nextLine();
            System.out.println("Direccion: ");
            String direccion=leer.nextLine();
            direcciones[i]=direccion;
            leer.nextLine();
        }
        System.out.println("===========================");
        System.out.println("Registro de datos");
        System.out.println("===========================");
        for (int i = 0; i < canPersonas; i++) {
            System.out.println("DATOS DE PERSONAS "+(i+1)+" :");
            System.out.println("NOMBRE: "+nombres[i]);
            System.out.println("EDAD: "+edades[i]);
            System.out.println("DIRECCION: "+direcciones[i]);       
        }
    }
    
    static void ingresosNumeros(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que vamos a ingresar");
        int n=leer.nextInt();
        //creamos un arreglos para el ingreso de numero
        int[] numeros =new int[n];
        /*
        se utiliza para recorrer un arreglo o realizar una serie de iteraciones, comenzando 
        desde el primer elemento del arreglo y avanzando hasta el elemento en la posición n - 1
        */
        for (int i = 0; i < n; i++) {
            System.out.println("INGRESE EL NUMERO "+(i+1)+" :");
            numeros[i]=leer.nextInt();
        }
        /*
        se utiliza para recorrer un arreglo en orden inverso, comenzando 
        desde el último elemento y avanzando hacia el primero.
        */
        System.out.println("Los numeros ingresados en orden son: ");
        for (int i = n-1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
    
}
