/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluación2_u2_quezada;
//creamos la clase hija que va heredar los atributos de la clase Persona
public abstract class Persona {
	// Atributos
    private String nombre;
    private int edad;
    private int cedula;
    private int telefono;
    protected double sueldo;

    // Constructor que van heredar los atributos de la clase Persona
    public Persona(String nombre, int edad, int cedula, int telefono, double sueldo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.cedula = cedula;
		this.telefono = telefono;
		this.sueldo = sueldo;
	}

  //creamos el metodo getter and setter
  //los cuales nos ayudaran para el ingreso y salida de datos
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


// Método abstracto para calcular el sueldo total
	public abstract void sueltoTotal();
	double bono=(+sueldo*150);
    
}



