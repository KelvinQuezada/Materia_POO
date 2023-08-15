package evaluación2_u2_quezada;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer=new Scanner(System.in);
    int opcion;
    
    do {
    	System.out.print("Menu Principal");
        System.out.print("1. Docente");
        System.out.print("2. Tecnico");
        System.out.print("3. Administrativo");
        System.out.print("4. Limpieza");
        System.out.print("5. salir");
        opcion=leer.nextInt();
        switch (opcion) {
	    	case 1: 
		        System.out.print("Docente");
		        leer.nextLine();//lipiar el buffer
		        System.out.print("----------------------------------------");
		        leer.nextLine();//lipiar el buffer
		        System.out.println("Ingrese el nombre: ");
		        String nombre=leer.next();
		        System.out.println("Ingrese la Edad: ");
		        int edad=leer.nextInt();
		        System.out.println("Ingrese la cedula: ");
		        int cedula=leer.nextInt();
		        System.out.println("Ingrese telefono: ");
		        int telefono=leer.nextInt();
		        System.out.println("Ingrese el sueldo: ");
		        double sueldo=leer.nextDouble();
		        System.out.println("El docente da materia (true/false): ");
		        boolean materia=leer.nextBoolean();
		        System.out.println("Ingrese las horas que da clases: ");
		        double horasTranajo=leer.nextDouble();
		        Docente docente=new Docente(nombre, edad, cedula, telefono, sueldo, materia, horasTranajo);
		        System.out.println("Datos Impresos de Docente: ");
		        System.out.println("Nombre: "+docente.getNombre());
		        System.out.println("EDA: "+docente.getEdad());
		        System.out.println("CEDULA: "+docente.getCedula());
		        System.out.println("TELEFONO: "+docente.getTelefono());
		        System.out.println("SUELDO: "+docente.getSueldo());
		        System.out.println("MATERIA: "+docente.getMateria());
		        docente.experienciaDocente(materia);
		        System.out.println("HORA DE CLASES: "+docente.getHorasTranajo());
		        docente.sueltoTotal();
		        leer.nextLine();
	            break;
	    	case 2:
	        
	        System.out.print("Tecnico");
	        System.out.print("----------------------------------------");
	        System.out.println("Ingrese el nombre: ");
	        String nombre1=leer.next();
	        System.out.println("Ingrese la Edad: ");
	        int edad1=leer.nextInt();
	        System.out.println("Ingrese la cedula: ");
	        int cedula1=leer.nextInt();
	        System.out.println("Ingrese telefono: ");
	        int telefono1=leer.nextInt();
	        System.out.println("Ingrese el sueldo: ");
	        double sueldo1=leer.nextDouble();
	        System.out.println("El tecnico tiene experiencia (true/false) ");
	        boolean experiencia=leer.nextBoolean();	
	        //llamamos nuestra clase Administrativo creamos un numeo objeto admi y llamamos todo los atributos de la clase
	        Tecnico tecnico=new Tecnico(nombre1, edad1, cedula1,telefono1,sueldo1,experiencia);	
	        //imprimimos los datos
	        System.out.println("Datos Impresos de Tecnico: ");
	        System.out.println("Nombre: "+tecnico.getNombre());
	        System.out.println("EDA: "+tecnico.getEdad());
	        System.out.println("CEDULA: "+tecnico.getCedula());
	        System.out.println("TELEFONO: "+tecnico.getTelefono());	
	        System.out.println("SUELDO: "+tecnico.getSueldo());	
	        System.out.println("EXPERIENCIA: "+tecnico.getExperiencia());	
	        tecnico.experiencia(true);
	        tecnico.sueltoTotal();
	        leer.nextLine();
	            break;
	    	case 3: 
	            System.out.print("----------------------------------------");
	            System.out.print(" Administrativo");
	            System.out.print("----------------------------------------");
	            System.out.println("Ingrese el nombre: ");
	            String nombre2=leer.next();
	            System.out.println("Ingrese la Edad: ");
	            int edad2=leer.nextInt();
	            System.out.println("Ingrese la cedula: ");
	            int cedula2=leer.nextInt();
	            System.out.println("Ingrese telefono: ");
	            int telefono2=leer.nextInt();
	            System.out.println("Ingrese el sueldo: ");
	            double sueldo2=leer.nextDouble();
	            System.out.println("Esta encargado de oficina (true/false): ");
	            boolean encargadoOfi=leer.nextBoolean();
	            System.out.println("Indrese cuantos dias trabajo: ");
	            double diasTrabajo=leer.nextDouble();
	            //llamamos nuestra clase Administrativo creamos un numeo objeto admi y llamamos todo los atributos de la clase
	            Administrativo admi=new Administrativo(nombre2, edad2, cedula2, telefono2, sueldo2,encargadoOfi,diasTrabajo);
	            //imprimimos los datos
	            System.out.println("Datos Impresos de Administrativo: ");
	            System.out.println("Nombre: "+admi.getNombre());
	            System.out.println("EDA: "+admi.getEdad());
	            System.out.println("CEDULA: "+admi.getCedula());
	            System.out.println("TELEFONO: "+admi.getTelefono());
	            System.out.println("SUELDO: "+admi.getSueldo());
	            System.out.println("ENCARGADO: "+admi.getEncargadoOfi());
	            admi.experienciaEncargada(encargadoOfi);
	            System.out.println("DIAS TRABAJO: "+admi.getDiasTrabajo());
	            admi.sueltoTotal();
	            break;
	    	case 4:
	            System.out.print("----------------------------------------");
	            System.out.print(" Limpieza");
	            System.out.print("----------------------------------------");
	            System.out.println("Ingrese el nombre: ");
	            String nombre3=leer.next();
	            System.out.println("Ingrese la Edad: ");
	            int edad3=leer.nextInt();
	            System.out.println("Ingrese la cedula: ");
	            int cedula3=leer.nextInt();
	            System.out.println("Ingrese telefono: ");
	            int telefono3=leer.nextInt();
	            System.out.println("Ingrese el sueldo: ");
	            double sueldo3=leer.nextDouble();
	            System.out.println("Es encargado de limpieza (true/false): ");
	            Boolean limpiar=leer.nextBoolean();	
	            //llamamos nuestra clase Administrativo creamos un numeo objeto admi y llamamos todo los atributos de la clase
	            Limpieza lim=new Limpieza(nombre3, edad3, cedula3, telefono3, sueldo3, limpiar);
	            //imprimimos los datos
	            System.out.println("Nombre: "+lim.getNombre());
	            System.out.println("EDA: "+lim.getEdad());
	            System.out.println("CEDULA: "+lim.getCedula());
	            System.out.println("TELEFONO: "+lim.getTelefono());	
	            System.out.println("SUELDO: "+lim.getSueldo());	
	            System.out.println("Encargado de limpieza: "+lim.isLimpiar());	
	            lim.limpiarAria(true);
	            lim.sueltoTotal();
	            	break;
	            default:
	            	System.out.println("La opcion es incorrecta");
            }		
    	}while(opcion!=5);
    }

}

