/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciodeclases;

/**
 *
 * @author ESPE
 */
public class EjercicioDeClases {

    //Creamos la clase
    
    public static void main(String[] args) {
        // TODO code application logic here
        // Objeto 1
        Gato gato1 =new Gato();
        gato1.nombre="Imary";
        gato1.raza="runo";
        gato1.color="negro";
        gato1.edad=3;
        gato1.genero="Masculino";
        
        //Objeto 2
        Carro carro1= new Carro();
        carro1.marca="Mavesa";
        carro1.color2="Negro";
        carro1.año=2023;
        carro1.modelo="Carro 4x4 ";
        carro1.Precio=25000;
        
        
        //Objetivo 3
        Persona persona1=new Persona();
        persona1.nombre3="Kelvin";
        persona1.edad2=23;
        persona1.genero="Hombre";
        persona1.Nacionalidad="Ecuatoriano";
        persona1.cedula=235019692;
        
        
        
        
        System.out.println("==================");
        System.out.println("Clase de Gatos");
        System.out.println("==================");
        System.out.println(gato1.nombre);
        System.out.println(gato1.raza);
        System.out.println(gato1.color);
        System.out.println(gato1.edad);
        System.out.println(gato1.genero);
        System.out.println("==================");
        System.out.println("Clase de Carro ");
        System.out.println("==================");
        System.out.println(carro1.marca);
        System.out.println(carro1.color2);
        System.out.println(carro1.año);
        System.out.println(carro1.modelo);
        System.out.println(carro1.Precio);
        System.out.println("==================");
        System.out.println("Clase de Persona ");
        System.out.println("==================");
        System.out.println(persona1.nombre3);
        
    }
    
}
