package poo_u2_p16_polimorfismo;

//utilizamos la clase obstracta
public abstract class Figura {
    //Atributos 
    private String color;
    //constructor 
    public Figura(String color) {
        super();
        this.color = color;
    }
    
    //creamos un meytodo para calcular la superficie
    
    public abstract double superficie();
    
    public String getColor(){
        return color;
    }
    
    
    
    
}
