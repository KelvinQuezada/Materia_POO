
package poo_lab_operacion7;

import javax.swing.JOptionPane;

public class Operaciones {  
    // declarmos las variables tipo entero
    int num1,num2;int suma; int resta; int multiplicacion; int dividir;
    //generamos metodos, pedimos numero, nuestro el metodo publico
    public void capturarnumeros(){
        // pedir en pantalla numeros
        num1=Integer.parseInt(JOptionPane.showInputDialog("Deme un mero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Deme el segundo mero"));
    }
    // creamos los metodos para sumar metodos tipo public, sin retornar nada void no tiene retorno
    public void sumar(){
        suma=num1+num2;
    }
    // creamos los metodos para restar metodos tipo public, sin retornar nada void no tiene retorno
    public void restar(){
        resta=num1-num2;
    }
    // creamos los metodos para multiplicar metodos tipo public, sin retornar nada void no tiene retorno
    public void multiplicaciones(){
        multiplicacion=num1*num2;
    }
    // creamos los metodos para multiplicar metodos tipo public, sin retornar nada void no tiene retorno
    public void division(){
        dividir=dividir*dividir;
    }
    // creamos un mumero para mostrar resultado
    public void resultado(){
        System.out.println("el resultado de la suma es: "+ suma);
        System.out.println("el resultado de la resta es: "+ resta);
        System.out.println("el resultado de la multiplicacion es: "+ multiplicacion);
        System.out.println("el resultado de la Divivir es: "+ dividir);
    }
    
}
