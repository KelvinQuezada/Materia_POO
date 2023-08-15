
package poo_l1_parametro_argumento;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class Poo_L1_Parametro_Argumento {

    
    public static void main(String[] args) {
        
        Operaciones op1=new Operaciones();
        int nu1=parseInt(JOptionPane.showInputDialog("Dame el primer numero"));
        int nu2=parseInt(JOptionPane.showInputDialog("Dame el segundo numero"));
        
        op1.sumar(nu1,nu2);
        
        op1.resultados();
        
        

    }
    
}
