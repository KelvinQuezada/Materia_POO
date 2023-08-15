
package poo_u2_taller1;

public class Auto extends Vehiculo {
    //Atributos 
    private String transmision;
    private boolean parabrisason;
    private int multa;
//constructores
    public Auto(String numPlaca, String marca, int numRuedas, int estado) {
        super(numPlaca, marca, numRuedas, estado);
        this.numPlaca=numPlaca;
        this.marca=marca;
        this.numRuedas=numRuedas;
        this.transmision=transmision;
        this.multa=multa;  
    }
    //metodo para mostrar datos
    public void mostrarauto() {
  
        System.out.println("Tipo de Vehiculo: Auto");
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
//utilizamos los metodos get y set
    public void setMulta(int multa) {
        this.multa = multa;
    }
    
    public void addmulta(){
        this.multa ++;
    }
    
         public int getMulta() {
        return multa;
    }

    
}
