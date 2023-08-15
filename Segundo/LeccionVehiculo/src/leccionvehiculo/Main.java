
package leccionvehiculo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner es para el ingreso de datos
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la mcarca del Vehiculo: ");
        String marca=leer.nextLine();
        System.out.println("Ingrese el modelo del Vehiculo: ");
        String modelo=leer.nextLine();
        System.out.println("Ingrese el año del Vehiculo: ");
        int ano=leer.nextInt();
        System.out.println("Ingrese el numero de puerta de carros: ");
        int puertas=leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el tipo de combustible del carro: ");
        String tipoCombustible=leer.nextLine();
        System.out.println("Ingrese el precio del carro: ");
        double precio=leer.nextDouble();
        System.out.println("Ingrese el cilindrada de la motocicleta:  ");
        int ciclindrada=leer.nextInt();
        System.out.println("la motocicleta tiene marcha (true/flase): ");
        boolean tieneMarcha=leer.nextBoolean();
        System.out.println("ingres el color de la motocicleta: ");
        String color=leer.nextLine();
        //Llamaos la clase Carro creamos el objeto y llamamos los atributos de la clase princicpal Vehiculo y los atributos de la clase Carro
        Carro carro = new Carro(marca,modelo,ano,puertas,tipoCombustible,precio);
        //Llamaos la clase Motocicleta creamos el objeto y llamamos los atributos de la clase princicpal Vehiculo y los atributos de la clase Motocicleta
        Motocicleta motocicleta =new Motocicleta(marca,modelo,ano,ciclindrada,tieneMarcha,color);
        System.out.println("============================");
        System.out.println("La informacion del carrro");
        System.out.println("============================");
        //llamos todo los metodos de la clase Carro para imprimir 
        System.out.println("Marca: "+carro.getMarca());
        System.out.println("Modelo: "+carro.getModelo());
        System.out.println("Año: "+carro.getAno());
        System.out.println("Puertas: "+carro.getPuertas());
        System.out.println("Tipo de combustible: "+carro.getTipoCombustible());
        System.out.println("Pecio: "+carro.getPrecio());
        System.out.println("============================");
        System.out.println("La informacion del la Motocicleta");
        System.out.println("============================");
        //llamos todo los metodos de la clase Motocicleta para imprimir 
        System.out.println("Marca: "+motocicleta.getMarca());
        System.out.println("Modelo: "+motocicleta.getModelo());
        System.out.println("Año: "+motocicleta.getAno());
        System.out.println("Cilindrada: "+motocicleta.getCiclindrada());
        System.out.println("Tipo de combustible: "+motocicleta.getMarca());
        System.out.println("Color: "+motocicleta.getColor());
    }
    
}
