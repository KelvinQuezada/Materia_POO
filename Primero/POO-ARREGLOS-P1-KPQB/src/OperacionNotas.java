/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author antho
 */
public class OperacionNotas {
    
private double[] notas;
    public OperacionNotas(double[] notas) {
        this.notas = notas;
    }
    
    public double obtenerMayor() {
        double mayor = notas[0];
        
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
        }
        
        return mayor;
    }
    
    public double obtenerNotas() {
        double mejor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < mejor) {
                mejor = notas[i];
            }
        }
        return mejor;
    }
    

    
    public double obtenerTotal() {
        double suma = 0;     
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }        
        return suma;
    }
}
