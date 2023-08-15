
package poo_u2_p16_polimorfismo;

import java.util.Scanner;

public class Poo_U2_P16_Polimorfismo {


    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        
        System.out.println("Ingrese el color de la figura:  ");
        String color=leer.next();
        System.out.println("Ingrese el lado del cuadrado:  ");
        double lado=leer.nextDouble();
        System.out.println("Ingrese la base del triangulo: " );
        int base=leer.nextInt();
        System.out.println("Ingrese la altura del triangulo: ");
        int altura=leer.nextInt();

    }
    
    /*aplicamos el moliporfismo
    //la grn ventaja de polimorfismo es la reutilizacion de codigo al folzarse a todas las clases a tener el mismo formato 
    esta exprecion  vale para cualquier subclases de Figura, cuyo objeto venga como parametros  
    */
    private static void mostrarDatosFigura(Figura f){  
        
        System.out.println("Color "+f.getColor());
        System.out.println("Superficie: "+f.superficie());
        
    }
}
