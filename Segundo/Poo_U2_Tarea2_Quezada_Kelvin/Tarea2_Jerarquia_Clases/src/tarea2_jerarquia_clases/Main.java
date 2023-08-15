
package tarea2_jerarquia_clases;

import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //El Scanner es para el ingreso de datos
        Scanner leer = new Scanner(System.in);
        //creamos una variabale tipo entera
        int opc;    
        //creamos un do-while para la creacion de menu 
        do{
        System.out.println("Bienvenidos al menu de Empleados");
        System.out.println("1. Director");
        System.out.println("2. Operario");
        System.out.println("3. Salir");
        opc=leer.nextInt();
        switch(opc){
            case 1:
                System.out.println("========================================");
                System.out.println("Ingrese los datos del Director:");
                System.out.println("========================================");
                leer.nextLine();
                System.out.print("Nombre: ");
                //ingresamos los nextLine para el ingreso de caracteres
                String nombreDirector = leer.nextLine();
                System.out.print("Edad: ");
                //ingresamos los nextInte para el ingreso de numeros enteros
                int edadDirector = leer.nextInt();
                System.out.print("Fecha de ingreso (AAAA-MM-DD): ");
                //ingresamos los LocalDate y el next para el ingreso de datos de fecha
                LocalDate fechaIngresoDirector = LocalDate.parse(leer.next());
                System.out.print("ingrese el salario anual: ");
                //ingresamos el nextDouble para almacenar numeros enteros y decimales
                double salarioDirector = leer.nextDouble();
                System.out.print("DEPARTAMENTO: ");
                String departamentoDirector = leer.next();
                System.out.print("NUMERO DE PERSONAS: ");
                int personalDirector = leer.nextInt();
                //llamamos a nuestra clase Director y cramos un nuevo objeto y llamamos los atributos de la clase
                Director director = new Director(nombreDirector, edadDirector, fechaIngresoDirector, 
                        salarioDirector,departamentoDirector, personalDirector);
                //llamamos a nuestro objeto y a nuesto metodo incentivar
                director.incentivar();
                System.out.println("========================================");
                System.out.println("Datos del Director");
                System.out.println("========================================");
                System.out.println("NOMBRE: "+director.getNombre());
                System.out.println("EDA: "+director.getEdad());
                System.out.println("FECHA INGRESO: "+director.getFechaIngresada());
                System.out.println("SALARIO ANUAL: "+director.getSalario());
                System.out.println("DEPARTAMENTO: "+director.getDepartamento());
                System.out.println("PERSONAS A CARGO: "+director.getPersonal());
                break;
            case 2: 
                System.out.println("========================================");
                 System.out.println("iNGRESO DE DATOS OPERARIO:");
                 System.out.println("========================================");
                System.out.print("NOMBRE: ");
                String nombreOperario = leer.nextLine();
                leer.nextLine();
                System.out.print("EDAD: ");
                int edadOperario = leer.nextInt();
                System.out.print("FECHA DE INGRESO (AAAA-MM-DD): ");
                LocalDate fechaIngresoOperario = LocalDate.parse(leer.next());
                System.out.print("SALARIO ANUAL: ");
                double salarioOperario = leer.nextDouble();
                System.out.print("NIVEL DE SEGURIDAD ENTRE (1 y 5): ");
                int nivelOperario = leer.nextInt();
                ////llamamos a nuestra clase Operario y cramos un nuevo objeto y llamamos los atributos de la clase
                Operario operario = new Operario(nombreOperario, edadOperario, 
                        fechaIngresoOperario, salarioOperario,nivelOperario);
                //llamamos nuestro dos metodos incentivar y actualizarNivel
                operario.incentivar();
                operario.actualizarNivel();
                 //imprimir los resultado
                System.out.println("========================================");
                 System.out.println("Datos del Operario");
                 System.out.println("========================================");
                 System.out.println("NOMBRE: "+operario.getNombre());
                 System.out.println("EDA: "+operario.getEdad());
                 System.out.println("FECHA INGRESO: "+operario.getFechaIngresada());
                 System.out.println("SALARIO ANUAL: "+operario.getSalario());
                 System.out.println("NIVEL: "+operario.getNivel());
                break;

            case 3:
                System.out.println("A finalizado");
                break;
            default:
                System.out.println("Esta opcion es invalidad vuelva a intentar");
        }
    }while(opc !=3);
           

           

             

    }
}






