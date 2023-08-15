
package poo_u2_taller1;

public class Poo_U2_Taller1 {
    public static void main(String[] args) {
    //llamamos todos La clase Auto y creamos el objeto y llamaremos todos 
    //los atributos de la clase.
    Auto auto = new Auto("JAA3077", "Foton", 4, 0);
    //llamamos todos mos metodos de la clases auto
    auto.mostrarauto();
    auto.onofparabtisas();
    auto.addmulta();
    System.out.println("Multa: " + auto.getMulta());
    System.out.println("============================");
    //llamamos la clase Camion y damos a conocer el objeto 
    Camion camion = new Camion("PAQ892", "Hyundai", 6, 0);
    //llamamos todos mos metodos de la clases camion
    camion.mostrarcamion();
    camion.onofparabtisas();
    camion.setColor("Blanco");
    camion.setCarga(400.0);
    System.out.println("Color: " + camion.getColor());
    System.out.println("Carga: " + camion.getCarga());
    }
}
    
