
package poo_metodo_de_valores;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class POO_Metodo_de_Valores {

    public static void main(String[] args) {
        //llamamos a la subclase de Operaciiones creamos una variable op1 para
        //realiizaremos la suma, resta,multiplicacion,division
        Operacionesmetodovalor op1=new Operacionesmetodovalor();
        int nu1=parseInt(JOptionPane.showInputDialog("Dame el primer numero"));
        int nu2=parseInt(JOptionPane.showInputDialog("Dame el segundo numero"));
        int suma=op1.sumar(nu1,nu2);
        int resta=op1.restar(nu1,nu2);
        int multi=op1.multiplicacion(nu1,nu2);
        int dividir=op1.division(nu1,nu2); 
        ///llamar los resultados de la suma,resta,multi,dividir
        op1.resultados(suma);
        op1.resultados2(resta);
        op1.resultados3(multi);
        op1.resultados4(dividir);    
    }
    
}
