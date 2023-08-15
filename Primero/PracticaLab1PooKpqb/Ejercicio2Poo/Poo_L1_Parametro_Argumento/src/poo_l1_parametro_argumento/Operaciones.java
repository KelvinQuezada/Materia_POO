
package poo_l1_parametro_argumento;


public class Operaciones {
    int suma; int resta; int multiplicacion; int division;
    
    
    public void sumar (int nu1,int nu2){
        suma=nu1+nu2;
    }
    public void restar (int nu1,int nu2){
        resta=nu1-nu2;
    }
    public void multi (int nu1,int nu2){
        multiplicacion=nu1*nu2;
    }
    
    public void dividir (int nu1,int nu2){
        division=nu1/nu2;
    }
    
    //creamos un metodo para mostrar resultados
    
    public void resultados(){
        System.out.println("el resultado de la suma es: "+suma);
    }
    public void resultados2(){
        System.out.println("el resultado de la resta es: "+resta);
    }
    public void resultados3(){
        System.out.println("el resultado de la multiplicacion es: "+multiplicacion);
    }
    public void resultados4(){
        System.out.println("el resultado de la division es: "+division);
    }
}
