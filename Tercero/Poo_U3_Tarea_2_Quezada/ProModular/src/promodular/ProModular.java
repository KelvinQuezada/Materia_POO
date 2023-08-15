package promodular;

import java.util.Scanner;

public class ProModular {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        //llamaremos nuestras variables 
        double pmi,pmf,pa,aum;
        //creamos nuestra variable
        int cant_personas,maxper;
        String cate;
        System.out.println("Ingrese la categoria A, B, C, D");
        cate=leer.next();
        System.out.println("Ingrese la cantidad de personas: ");
        cant_personas=leer.nextInt();
        //validamos nuestros modulos
        maxper=MaximoPersonas(cate);
        pmi=PagoMensual(cate);
        aum=CalcAumento(cate);
        //creamos una condicional donde la cantidad de persona es mayor a maxper 
        //entonces el pmf=pmi mas a la cantida de persona - maxper se multiplica por el aum
        if (cant_personas > maxper) {
            pmf=pmi+((cant_personas-maxper)*aum);
            //oh sino el pmf es =pmi
        } else {
            pmf=pmi;
        }
        //calculamos el pago anual
        pa=pmf*12;
        // Llamamos a la función para imprimir los resultados
        Imprimir(pmi, pmf, pa);        
    }
    
/*Esta funcion calcula y devuelve el numero maximo de personas permitidas en una categoria especificada.
Recibe como entrada el codigo de categoría 'cate' y devuelve el numero maximo de personas 'maxper'*/
    static int MaximoPersonas(String cate){
        // Inicializa la variable que almacenara el numero maximo de personas permitidas.
        int maxper=0;
        // Utiliza un switch para asignar el valor correcto de 'maxper' segun la categoría especificada.
        switch(cate){
            // Nos dara a conocer las categoría 
            case "A": maxper=8;break;
            case "B": maxper=6;break;
            case "C": maxper=4;break;
            case "D": maxper=2;break;
           
        }
        // Devuelve el numero maximo de personas permitidas segun la categoria especificada.
        return maxper;
    }
/*Esta funcion calcula y devuelve el numero maximo de PagoMensual permitidas en una categoria especificada.
Recibe como entrada el codigo de categoría 'cate' y devuelve el numero maximo de pagoMenusal 'maxper'*/
    static double PagoMensual(String cate){
        double pm=0;
        switch(cate){
            case "A": pm=40.00;break;
            case "B": pm=30.00;break;
            case "C": pm=20.00;break;
            case "D": pm=10.00;break;      
        }
         // Devuelve el numero maximo de personas permitidas segun la categoria especificada.
        return pm;
    }
    
    static double CalcAumento(String cate){
        double aum=0;
        switch(cate){
            case "A": aum=8.00;break;
            case "B": aum=8.00;break;
            case "C": aum=5.00;break;
            case "D": aum=5.00;break;
        }
        return aum;
    }
    //creamos un modulo para imprimir
    static void Imprimir(double pmi,double pmf,double pa){
        System.out.println("\nEl monto mensual iniciar a pagar es: "+pmi+
                           "\nEl monto mensual final a pagar es  : "+pmf+
                           "\nEl monto mensual a pagar es        :"+pa);
    }
}
