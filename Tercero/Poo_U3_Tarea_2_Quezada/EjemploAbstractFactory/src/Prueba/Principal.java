package Prueba;

import AbstractFactory.DesignFactory;
import AbstractFactory.ServicioFactory;
import AbstractFactory.ServicioInformatico;
import AbstractFactory.SoftwareFactory;
import AbstractFactory.WebsiteFactory;
import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     int opcion;
     do {  
          System.out.print(
                "MENU DE OPCIONES\n"
              + "---- -- -------->\n"
              + "1. Solicitar servicio de diseno grafico.\n"
              + "2. Solicitar desarrollo de software educacional.\n"
              + "3. Solicitar creacion de sitios web.\n"
              + "4. Cerrar programa.\n"
              + "Seleccione opcion: "
        );
          opcion=leer.nextInt();
          switch (opcion) {
             case 1:
                // Llamamos al método usarServicio pasando una nueva instancia de DesignFactory
                 usarServicio(new DesignFactory());
                 break;
             case 2:
                 // Llamamos al método usarServicio pasando una nueva instancia de SoftwareFactory
                 usarServicio(new SoftwareFactory());
                 break;
             case 3:
                 // Llamamos al método usarServicio pasando una nueva instancia de WebsiteFactory
                 usarServicio(new WebsiteFactory());
                 break;
             case 4:
                 System.out.println("A finalizado el programa ");
                 break;
             default:
                 System.out.println("A opcion es incorrecta ");                 
         }
    } while (opcion!=4);
    }

//creamos un metodo para usar un servicio
public static void usarServicio(ServicioFactory factory) {
    // Creamos una instancia de ServicioInformatico 
    //utilizando la fábrica dada
    ServicioInformatico servicio = factory.crearServicio();
    // Llamamos a los métodos de la interfaz 
    //ServicioInformatico en la instancia creada    
    servicio.asignarTrabajo();
    servicio.indicarFechaEntrega();
    servicio.informarSobrePago();
    }
}
    

    
    
    


