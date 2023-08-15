
package Practica_Herencia;
//clase hija Automovil

public class Automovil extends Vehiculo {
    //atributo
    boolean parabrisas;
//creamos los metodos get y set 
//el @Override nos dara a conocer debe anular un método de una superclase


@Override
public void setNumeroRuedas(int rueda){
    numRueda=rueda;
}
/*creamos los pubic void de la clase encendido donde le diremos que si el 
vehiculo esta encendido sea tru*/
public void encendido(){
    encendido=true;
    estado="El Automovil esta encendido";
}
/*creamos los pubic void de la clase apagado donde le diremos que si el 
vehiculo esta apagado sea false */
public void apagado(){
    encendido=false;
    estado="El Automovil esta apagado";
}
}
