/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioclases;

import java.util.Scanner;


/**
 *
 * @author petee
 */
public class EjercicioClases {

    public static void main(String[] args) {
        // TODO code application logic here
        // llamamos la case carro
        Carro carro1= new Carro();
        Scanner entrada=new Scanner (System.in);
           
        System.out.println("Ingres el año del carro: ");
        carro1.nombre = entrada.nextLine();
        System.out.println("Ingres tu sexo (H=hombre y M=mujer): ");
        carro1.sexo=entrada.next().charAt(0);
        System.out.println("Ingres tu edad: ");
        carro1.edad= entrada.nextInt();
        
        if (carro1.sexo=='H'){//colocamos nuestra condicon de H de hombre
            System.out.println(carro1.nombre+" Eres un hombre: ");
            
        }else if(carro1.sexo=='M'){
             System.out.println(carro1.nombre+"Eres una Mujer: ");
            
        }

        if (carro1.edad<=18){
            System.out.println("Eres menor de edad: "+carro1.edad);
            
        }else{
            System.out.println("Eres mayor de edad: "+carro1.edad);
        }
        
        
        
        
        
        /**
        a1.precio = Integer.parseInt(JOptionPane.showInputDialog("Digiite un numero: "));
        
        if (a1.precio==a1.dato){
            JOptionPane.showMessageDialog(null, "El numero es 5; ");
            
        }else{
             JOptionPane.showMessageDialog(null,"El numero es diiferente de 5" );
        }
        */
//damos imprimir la clase principal        
        
    }
    
}
