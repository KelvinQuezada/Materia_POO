/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_metodo_de_valores;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author ESPE
 */
public class POO_Metodo_de_Valores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operaciones op1=new Operaciones();
        int nu1=parseInt(JOptionPane.showInputDialog("Dame el primer numero"));
        int nu2=parseInt(JOptionPane.showInputDialog("Dame el segundo numero"));
        
        int suma=op1.sumar(nu1,nu2);
        int resta=op1.restar(nu1,nu2);
        
        op1.resultados(suma);
        op1.resultados(resta);
        
    }
    
}
