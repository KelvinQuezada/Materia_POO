/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_l1_parametro_argumento;

/**
 *
 * @author ESPE
 */
public class Operaciones {
    int suma; int resta; int multiplicacion; int division;
    
    
    public void sumar (int nu1,int nu2){
        suma=nu1+nu2;
    }
    //creamos un metodo para mostrar resultados
    
    public void resultados(){
        System.out.println("el resultado de la suma es: "+suma);
    }
}
