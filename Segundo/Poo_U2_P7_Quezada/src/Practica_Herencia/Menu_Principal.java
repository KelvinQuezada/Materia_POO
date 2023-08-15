
package Practica_Herencia;

import java.util.Scanner;


public class Menu_Principal {

    public static void main(String[] args) {

//instanciamos llamamos
    Automovil automo=new Automovil();
    Vehiculo vehiculo=new Vehiculo();
    Motocicleta motocicleta=new Motocicleta();

    //llamamos a los metodos para el automovil
    //llamamos el metodo del vehiculo que esta apagado
    //llamamos el metodo de encendido
    
    automo.encendido();
    automo.apagado();
   
    vehiculo.apagado();
    vehiculo.encendido();
    
    motocicleta.encendido();
    motocicleta.apagado();
    
    System.out.println("Damos a conocetr el encendido del automovil: "+automo.estado); 
    System.out.println("Damos a conocetr el encendido del automovil:: "+vehiculo.estado);
    System.out.println("Damos a conocetr el encendido del automovil: "+automo.estado);
    System.out.println("Damos a conocetr el encendido del automovil:: "+vehiculo.estado);
    System.out.println("Damos a conocetr el encendido del automovil:: "+motocicleta.estado); 
    System.out.println("Damos a conocetr el encendido del automovil: : "+motocicleta.estado); 
    
    }
    
}
