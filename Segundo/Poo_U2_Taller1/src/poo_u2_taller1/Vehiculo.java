
package poo_u2_taller1;
public class Vehiculo {
    //Atributos
    String numPlaca;
    public String marca;
    public int numRuedas;
    private int estado;
    //constructores
    public Vehiculo (String numPlaca,String marca,
            int numRuedas,int estado){
        this.numPlaca=numPlaca;
        this.marca=marca;
        this.numRuedas=numRuedas;
        this.estado=estado;        
    }
  //metodos get y set
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }
        public String getNumPlaca() {
        return numPlaca;
    }
}
