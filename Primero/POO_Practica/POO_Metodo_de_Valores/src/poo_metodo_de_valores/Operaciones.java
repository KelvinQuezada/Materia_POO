/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_metodo_de_valores;

/**
 *
 * @author ESPE
 */
public class Operaciones {
    
    public int sumar(int nu1,int nu2){
        int suma=nu1+nu2;
        return suma;
        
    }
    
    public int restar(int nu1,int nu2){
        int resta=nu1-nu2;
        return resta;
        
    }
    //creamos u metodo para mostrar resltados como variables locales le pasamos como pararmetros 
    public void resultados(int suma){
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+suma);
    }
}
