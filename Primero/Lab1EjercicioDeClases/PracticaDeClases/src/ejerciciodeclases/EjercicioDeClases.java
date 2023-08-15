//Ejerciicio
package ejerciciodeclases;

import java.util.Scanner;

 class EjercicioDeClases {

    //Creamos la clase
    
    public static void main(String[] args) {
        // Declaramos los Objeto 1
        //llamamos la clase Gato y creamos una instancia de tipo objeto  
        Gato gato1 =new Gato();
        // el Scanner es para obtener entrada de datos
        Scanner entrada=new Scanner (System.in);
        gato1.nombre="Imary";
        gato1.raza="runo";
        gato1.color="negro";
        gato1.edad=3;
        gato1.genero="Femenino";
        
        //Objeto 2
        //llamamos la clase Carro y creamos una instancia de tipo objeto
        Carro carro1= new Carro();
        carro1.marca="Mavesa";
        carro1.color2="Negro";
        carro1.modelo="Carro 4x4 ";
        
        
        
        //Objetivo 3
        ////llamamos la clase Persona y creamos una instancia de tipo objeto
        Persona persona1=new Persona();
        //persona1.nombre3="Kelvin";
        //persona1.edad2=23;
        //persona1.genero2="Hombre";
        persona1.Nacionalidad="Ecuatoriano";
        persona1.cedula=235019692;
        //Daremos a conocer la case Gato y utiilizamos el  System.out.println es para imprimir donde llamaremos 
        //la instancia del objeto y lo concatenamos con el signo +
        System.out.println("==================");
        System.out.println("Clase de Gatos");
        System.out.println("==================");
        System.out.println("El nombre de la mascota es " + gato1.nombre + ", Su tipo de raza es "
                +gato1.raza +", su color es "+gato1.color
                + ", tiene "+gato1.edad+" años"+", el tipo de genero es "+ gato1.genero);
        //Daremos a conocer la case Carro y utiilizamos el  System.out.println es para imprimir donde llamaremos 
        //la instancia del objeto y lo concatenamos con el signo +
        System.out.println("==================");
        System.out.println("Clase de Carro ");
        System.out.println("==================");
        System.out.println("La Marca de nuestro carro es "+ carro1.marca+", el color del auto es "+ 
                carro1.color2+", el modelo del auto movil es "+ carro1.modelo);
        // daremos a conocer la entrada datos
        System.out.println("Ingres el año del carro: ");
        carro1.año=entrada.nextInt(); 
        System.out.println("Ingres el preco del automovil $");
        carro1.Precio=entrada.nextInt();
        System.out.println("El año del carro que compro es: "+carro1.año);
        System.out.println("El precio del carro que compro es de $: "+carro1.Precio);
       
        //Daremos a conocer la case Persona y utiilizamos el  System.out.println es para imprimir donde llamaremos 
        //la instancia del objeto y lo concatenamos con el signo +
        System.out.println("==================");
        System.out.println("Clase de Persona ");
        System.out.println("==================");
        System.out.println("Ingres Su nombre: ");
        persona1.nombre3= entrada.nextLine();
        System.out.println("");
        System.out.println("Ingres tu genero (H=hombre y M=mujer): ");
        persona1.sexo =entrada.nextLine();
        System.out.println("Ingres tu edad: ");
        persona1.edad2= entrada.nextInt();  
        if (persona1.sexo=="Hombre"){//colocamos nuestra condicon de  Hombre
            System.out.println(persona1.nombre3+" Eres un hombre: ");
        }else if(persona1.sexo=="Mujer"){//colocamos nuestra condicon de  Mujer
             System.out.println(persona1.nombre3+"Eres una Mujer: ");   
        }
        if (persona1.edad2<=18){// le damos a conocer una condicion que apartir de 18 años es mayor de edad
            System.out.println("Eres menor de edad: "+persona1.edad2);    
        }else{
            System.out.println("Eres mayor de edad: "+persona1.edad2);
        }
        System.out.println(" Años, su nacionalidad es "+ persona1.Nacionalidad+ 
                "su numero de cedula es "+ persona1.cedula); 
    } 
}
