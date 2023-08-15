
package Practica_Herencia;

public class Motocicleta extends Vehiculo {
    //atributo
    boolean patada;
    //metodos el @Override nos dara a conocer debe anular un 
    //método de una superclase
@Override
//daremos a conocer el numero de ruedas por medio de un public 
        //void del metodo set 
public void setNumeroRuedas(int rueda){
    numRueda=rueda;
}
//creamos los pubic void de la clase encendido donde le diremos 
//que si el vehiculo esta encendido sea tru
public void encendido(){
    encendido=true;
    estado="Vehiculo El vehiculo Motocicleta esta encendido";
}
//creamos los pubic void de la clase apagado donde le diremos 
//que si el vehiculo esta apagado sea false 
public void apagado(){
    encendido=false;
    estado="El vehiculo Motocicleta esta apagado";
}
    }
