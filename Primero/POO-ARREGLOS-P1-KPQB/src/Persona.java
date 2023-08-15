/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author antho
 */

    
public class Persona {
    private String[] nombres;
    
    public Persona(String[] nombres) {
        this.nombres = nombres;
    }

    public void mostrarPersonas() {
        System.out.println("Nombres de las personas ingresadas:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
    
    
}