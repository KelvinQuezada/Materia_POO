
package poo_metodo_de_valores;

public class Operacionesmetodovalor {
    //Aqui esta declarando la funcion sumar 
    public int sumar(int nu1,int nu2){
        int suma=nu1+nu2;
        return suma;   
    }
    //Aqui esta declarando la funcion resta
    public int restar(int nu1,int nu2){
        int resta=nu1-nu2;
        return resta; 
    }
    //Aqui esta declarando la funcion multiplicacion
    public int multiplicacion(int nu1,int nu2){
        int multi=nu1*nu2;
        return multi; 
    }
    //Aqui esta declarando la funcion division
    public int division(int nu1,int nu2){
        int dividir=nu1/nu2;
        return dividir; 
    }
    //creamos cuatro metodos para mostrar resltados como variables 
    //locales le pasamos como pararmetros 
    public void resultados(int suma){
        System.out.println("El resultado de la suma es: "+suma);
    }
    public void resultados2(int resta){
        System.out.println("El resultado de la resta es: "+resta);
    }
    public void resultados3(int multi){
        System.out.println("El resultado de la multiplicacion es: "+multi);
    }
    public void resultados4(int dividir){
        System.out.println("El resultado de la multiplicacion es: "+dividir);
    }
    
}
