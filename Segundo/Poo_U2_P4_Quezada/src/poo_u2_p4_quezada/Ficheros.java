/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_u2_p4_quezada;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Ficheros {


    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        BufferedReader br =new BufferedReader(new FileReader("C:\\Poo1\\Tarea.txt"));
        String linea;
        try {
            while((linea=br.readLine())!=null){
               System.out.println(linea);
            }
        }catch(IOException ex){
            
        }
        
    }
    
}
