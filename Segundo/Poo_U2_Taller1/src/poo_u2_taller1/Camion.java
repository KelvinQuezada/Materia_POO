
package poo_u2_taller1;
public class Camion extends Vehiculo{
    //Atriuto de la clase Persona
   private boolean parabrisason;
   public String color;
   private double carga;
//constructores
    public Camion(String numPlaca, String marca, int numRuedas, int estado) {
        super(numPlaca, marca, numRuedas, estado);
        this.numPlaca=numPlaca;
        this.marca=marca;
        this.numRuedas=numRuedas;
        this.color=color;
        this.carga=carga;    
    }
//metodo para mostrar datos     
    public void mostrarcamion() {
        
        System.out.println("Tipo de Vehiculo: Camion");
        System.out.println("Placa : " + numPlaca);
        System.out.println("Marca : " + marca);
        System.out.println("Numero de Ruedas: " + numRuedas);
    }
    //metodo para parabisas que nos dara a conocer si los parabrisas estan 
    //encendido o apagados con una doncicion if else       
        public void onofparabtisas(){
        if(this.parabrisason){
            this.parabrisason=false;
            System.out.println("Los parabrisas estan apagado");
        }else{
            this.parabrisason=true;
            System.out.println("Los parabrisas estan encendidos");
        }
    }
       //metodo get y set 
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
}
