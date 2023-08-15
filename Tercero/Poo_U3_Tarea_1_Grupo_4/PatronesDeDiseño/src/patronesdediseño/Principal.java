/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronesdediseño;

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
                 usarServicio(new DesignFactory());
                 break;
             case 2:
                 usarServicio(new SoftwareFactory());
                 break;
             case 3:
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
//creamos un metodo pública y estática que recibe un objeto de tipo ServicioFactory como argumento. 
//La función se encarga de utilizar el factory para obtener un objeto ServicioInformatico y luego realizar algunas acciones relacionadas con ese servicio.
//https://www.youtube.com/watch?v=xNsPGA7zrVQ

public static void usarServicio(ServicioFactory factory) {
    //el ServicioInformatico es una clase interface que resive informacion  
    ServicioInformatico servicio = factory.crearServicio();
        servicio.asignarTrabajo();
        servicio.indicarFechaEntrega();
        servicio.informarSobrePago();
    }
}
    
