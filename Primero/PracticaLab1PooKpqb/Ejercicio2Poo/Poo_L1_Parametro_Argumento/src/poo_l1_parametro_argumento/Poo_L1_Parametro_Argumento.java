
package poo_l1_parametro_argumento;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class Poo_L1_Parametro_Argumento {

    public static void main(String[] args) {
        //llamamos a la subclase de Operaciiones creamos una variable op1 para
        //realiizaremos la suma, resta,multi,division
        Operaciones op1=new Operaciones();
        int nu1=parseInt(JOptionPane.showInputDialog("Dame el primer numero"));
        int nu2=parseInt(JOptionPane.showInputDialog("Dame el segundo numero"));  
        op1.sumar(nu1,nu2); 
        op1.restar(nu1,nu2); 
        op1.multi(nu1,nu2); 
        op1.dividir(nu1,nu2); 
        ///llamar los resultados 
        op1.resultados();
        op1.resultados2();
        op1.resultados3();
        op1.resultados4();
    }
    
}
