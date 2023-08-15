/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluación2_u2_quezada;
//tendremo una clase hija docente que llamaremos los atributo de la clase padre Persona 
public class Docente extends Persona{
//atributo para la clase Docente
    private boolean materia;
    private double horasTranajo;
//creamos los constructores y llamaremos los atributos de la clase padre llamada Persona 

    public Docente( String nombre, int edad, int cedula, int telefono, double sueldo,boolean materia, double horasTranajo) {
        super(nombre, edad, cedula, telefono, sueldo);
        this.materia = materia;
        this.horasTranajo = horasTranajo;
    }
	
	//creamos unmetodo para la experiencia
	public void experienciaDocente(boolean materia) {
	//nos dara a conocer que el docente si tiene materia	
            if(materia) {
		materia=true;
		System.out.println("El docente si tiene experiencia de las Materia  "+ materia);
		}else {
                //nos dara a conocer que el estudiante no tiene materia
			materia=false;
			System.out.println("El docente no tiene experiencia en las Materia"+materia);
		}
	}	   
	// Implementación del método abstracto para realizar el calculo del abono
        @Override
	public void sueltoTotal() {
            //nos dara a conocer si la horasTranajo es igual a 400 
		if(horasTranajo==400) {
			//calculamos el bono que tenemos 
			bono=(+sueldo*150);
			System.out.print("Uste tiene un abono de: "+ bono+ "por las horas de trabajo");
		//si la opcion horasTranajo>400 no tendra el abono solo tendra el precio
                }else if(horasTranajo>400) {       
                    System.out.print("Uste no tiene un abono solo tiene el sueldo de:"+sueldo);
                    bono+=0;
		}
	}
//creamos el metodo getter and setter
//los cuales nos ayudaran para el ingreso y salida de datos
    public boolean getMateria() {
        return materia;
    }

    public void setMateria(boolean materia) {
        this.materia = materia;
    }

    public double getHorasTranajo() {
        return horasTranajo;
    }

    public void setHorasTranajo(double horasTranajo) {
        this.horasTranajo = horasTranajo;
    }

   


}
	
	

