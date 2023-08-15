package sistema_gestion_horario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //ingresamos el sacanner para el ingreso de consola
        Scanner leer = new Scanner(System.in);
        //creamos el Liss para mostrar las lista de los arreglos ArrayList
        List<Laboratorio> laboratorios = new ArrayList<>();
        System.out.print("Ingrese la cantidad de laboratorios a agregar: ");
        int numLaboratorios = leer.nextInt();
        //for (inicializamos, dondicion, aumento o decremento)
        for (int i = 0; i < numLaboratorios; i++) {
            System.out.println("Laboratorio #" + (i + 1));
            System.out.print("Ingrese el nombre del laboratorio: ");
            String nombre = leer.next();
            System.out.print("Ingrese la capacidad del laboratorio: ");
            int capacidad = leer.nextInt();
            System.out.print("Ingrese la cantidad de equipos del laboratorio:");
            int numEquipos = leer.nextInt();
            //llamaremos el List para la lsita del arreglo de los equipos
            List<String> equipos = new ArrayList<>();
            //for (inicializamos, dondicion, aumento o decremento)
            for (int j = 0; j < numEquipos; j++) {
                System.out.print("Ingrese el nombre del equipo #" + (j + 1) + ": ");
                String equipo = leer.next();
                //nos permite añadir un elemto al final del ArrayList
                equipos.add(equipo);
            }
            System.out.println("Seleccione el tipo de laboratorio:");
            System.out.println("1. Laboratorio1");
            System.out.println("2. Laboratorio2");
            int tipo = leer.nextInt();
            //llamamos el nombre de la clase Principal Laboratorio y el objeto 
            //laboratorio
            Laboratorio laboratorio;
            //creamos el if para comparar el tipo de numero que sea igual 1
            if (tipo == 1) {
                System.out.print("Ingrese el espacio del Laboratorio1: ");
                String espacio = leer.next();
                //llamamos al objeto laboratorio y llamamos al la clase hija 
                //Laboratorio1 con sus atributos de la clase principal Laboratorio 
                // y la clase secundaria Laboratorio1
                laboratorio = new Laboratorio1(nombre, capacidad, equipos, espacio);
            } else {
                System.out.print("Ingrese el lugar del Laboratorio2: ");
                String lugar = leer.next();
                //llamamos al objeto laboratorio y llamamos al la clase hija 
                //Laboratorio1 con sus atributos de la clase principal Laboratorio 
                // y la clase secundaria Laboratorio2
                laboratorio = new Laboratorio2(nombre, capacidad, equipos, lugar);
            }
            //nos permite añadir un elemto al final del ArrayList
            laboratorios.add(laboratorio);
        }
        System.out.print("Ingrese la cantidad de asignaturas a agregar: ");
        int numAsignaturas = leer.nextInt();
        //Llamamos el arreglo List de Asignatura del arreglo ArrayList
        List<Asignatura> asignaturas = new ArrayList<>();
        //for (inicializamos, dondicion, aumento o decremento)
        for (int i = 0; i < numAsignaturas; i++) {
            System.out.println("Asignatura #" + (i + 1));
            System.out.print("Ingrese el nombre de la asignatura: ");
            String nombre = leer.next();
            System.out.print("Ingrese el horario de la asignatura: ");
            String horario = leer.next();

            System.out.println("Seleccione el laboratorio asignado para la asignatura:");
            //for (inicializamos, condicion, el size nos devuelve un entero con 
            //el tamaño de la lista, aumento o decremento)
            for (int j = 0; j < laboratorios.size(); j++) {
                //nos dara el incremento del laboratorio y llamamos al metodo getNombre
                System.out.println((j + 1) + ". " + laboratorios.get(j).getNombre());
            }
             
            int labIndex = leer.nextInt() - 1;
            //llamaremos a la clase principal laboratorio y creamos el objeto 
            //y llamaos el metodo 
            Laboratorio laboratorio = laboratorios.get(labIndex);
            //llamaremos a la clase principal Asignatura y creamos el objeto y llamaos 
            //los atributos de la clase asignatura 
            Asignatura asignatura = new Asignatura(nombre, horario, laboratorio);
            //nos permite añadir un elemto al final del ArrayList
            asignaturas.add(asignatura);
        }
        //imprimimos todos los metodos de la clase y instanciamos.
        System.out.println("Información de los laboratorios:");
        for (Laboratorio laboratorio : laboratorios) {
            System.out.println("Nombre: " + laboratorio.getNombre());
            System.out.println("Capacidad: " + laboratorio.getCapacidad());
            System.out.println("Equipos: " + laboratorio.getEquipos());
            if (laboratorio instanceof Laboratorio1) {
                System.out.println("Espacio: " + ((Laboratorio1) laboratorio).getEspacio());
            } else if (laboratorio instanceof Laboratorio2) {
                System.out.println("Lugar: " + ((Laboratorio2) laboratorio).getLugar());
            }
            System.out.println();
            } 

                leer.close();
            }
         }
  