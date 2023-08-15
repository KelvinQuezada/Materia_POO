/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluación2_u2_quezada;
//creamos la clase hija que va heredar los atributos de la clase Persona
public class Limpieza extends Persona{
  //creamos atributos  
private boolean limpiar;
//creamos metodo que van heredar los atributos de la clase Persona
	public Limpieza(String nombre, int edad, int cedula, int telefono, double sueldo, boolean limpiar) {
		super(nombre, edad, cedula, telefono, sueldo);
		this.limpiar = limpiar;
	}
	//creamos el metodo getter and setter
	//los cuales nos ayudaran para el ingreso y salida de datos 
	public boolean isLimpiar() {
		return limpiar;
	}

	public void setLimpiar(boolean limpiar) {
		this.limpiar = limpiar;
	}

	public void limpiarAria(boolean limpiar) {
		if(limpiar) {
			limpiar=true;
		System.out.println("Esta limpiando");
		}else {
			limpiar=false;
			System.out.println("no esta limpiando");
		}
		
	}
	// Implementación del método abstracto para realizar el calculo del abono
	@Override
	public void sueltoTotal() {
		System.out.println("Ingrese el valor para el merito ");
		if(limpiar=true) {
			bono=(+sueldo*2);
			System.out.println("tiene un sueldo de"+bono);
		}else if(limpiar=false) {
			System.out.println("NO tiene nungun precio solo el sueldo ");
		}sueldo+=0;
	}



}

