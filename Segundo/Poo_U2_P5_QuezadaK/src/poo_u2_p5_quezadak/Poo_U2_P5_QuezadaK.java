
package poo_u2_p5_quezadak;
import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Poo_U2_P5_QuezadaK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException  {
        // TODO code application logic here
       // TODO code application logic here
       try (BufferedReader br =new BufferedReader(new FileReader("C:\\Poo_P5\\Practica5"));
          BufferedWriter bw =new BufferedWriter(new FileWriter("C:\\Poo_P5\\Practica5.txt"));){
           bw.write("Este es una prueba de usuario Buffered ");
           bw.newLine();
           bw.write("Seguimos usando Buffered ");
           bw.newLine();
           bw.write("Hola a todos ");
           bw.flush();
           
           String linea =br.readLine();
           while (linea !=null){
               System.out.print(linea);
               linea=br.readLine();
           }
           }catch(IOException e){
    System.out.println("Error "+e);
}
    }
}