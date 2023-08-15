/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Excepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antho
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese su nombre");
            String nombre =br.readLine();
            int div =8/2;
            System.out.println(div);
        } catch (IOException e) {
            
            e.printStackTrace();
        }catch (ArithmeticException es ){
            System.out.println("no puede imprimir cero");
        }
    }
    
}
