/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_u2_p6_quezada;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

/**
 *
 * @author ESPE
 */
public class Poo_U2_P6_Quezada {

    public static void main(String[] args) {
           List<Persona> persona = new ArrayList<Persona>();
        persona.add(new Persona("Kelvin", "44444", "kelvin@gmail.com"));
        persona.add(new Persona("JAVIER J", "1234567", "javier@hotmail.com"));
        persona.add(new Persona("Veronica L", "2222222", "vero@gmail.com"));
        persona.add(new Persona("Veronica L", "2222222", "vero@gmail.com"));
        
        
        ExportarCSV(persona);
        
        ImportarCSV();
    }
    
    public static void ExportarCSV(List<Persona> persona) {
        String salidaArchivo = "Persona1.csv"; // Nombre del archivo
        boolean existe = new File(salidaArchivo).exists(); // Verifica si existe
        
        // Si existe un archivo llamado asi lo borra
        if(existe) {
            File archivoPersona = new File(salidaArchivo);
            archivoPersona.delete();
        }
        
        try {
            // Crea el archivo
            CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true), ',');
            
            // Datos para identificar las columnas
            salidaCSV.write("Nombre");
            salidaCSV.write("Telefono");
            salidaCSV.write("Email");
            
            salidaCSV.endRecord(); // Deja de escribir en el archivo
            
            // Recorremos la lista y lo insertamos en el archivo
            for(Persona user : persona) {
                salidaCSV.write(user.getNombre());
                salidaCSV.write(user.getTelefono());
                salidaCSV.write(user.getEmail());
                
                salidaCSV.endRecord(); // Deja de escribir en el archivo
            }
            
            salidaCSV.close(); // Cierra el archivo
            
        } catch(IOException e) {
            e.printStackTrace();
        }    
    }
    
    public static void ImportarCSV() {
        try{
            List<Persona> persona = new ArrayList<Persona>(); // Lista donde guardaremos los datos del archivo
            
            CsvReader leerPersona = new CsvReader("Persona.csv");
            leerPersona.readHeaders();
            
            // Mientras haya lineas obtenemos los datos del archivo
            while(leerPersona.readRecord()) {
                String nombre = leerPersona.get(0);
                String telefono = leerPersona.get(1);
                String email = leerPersona.get(2);
                
                persona.add(new Persona(nombre, telefono, email)); // Añade la informacion a la lista
            }
            
            leerPersona.close(); // Cierra el archivo
            
            // Recorremos la lista y la mostramos en la pantalla
            for(Persona user : persona) {
                System.out.println(user.getNombre() + " , "
                    + user.getTelefono() + " , "
                    +user.getEmail());
            }
            
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    }
        
       
