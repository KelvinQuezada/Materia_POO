
package evaluación2_u2_quezada;
//creamos la clase hija que va heredar los atributos de la clase Persona
public class Administrativo extends Persona{
	//atributo creamos un tipo boolean para comparar verdadero y falso
	private boolean encargadoOfi;
        private double diasTrabajo;
//creamos los constructores y llamaremos los atributos de la clase padre llamada Persona
	public Administrativo(String nombre, int edad, int cedula, int telefono, double sueldo, boolean encargadoOfi,double diasTrabajo) {
		super(nombre, edad, cedula, telefono, sueldo);
		this.encargadoOfi = encargadoOfi;
                this.diasTrabajo=diasTrabajo;
	}
	//creamos el metodo getter and setter
	//los cuales nos ayudaran para el ingreso y salida de datos
        
	public boolean getEncargadoOfi() {
		return encargadoOfi;
	}

    public double getDiasTrabajo() {
        return diasTrabajo;
    }

    public void setDiasTrabajo(double diasTrabajo) {
        this.diasTrabajo = diasTrabajo;
    }

	public void setEncargado(boolean encargadoOfi) {
		this.encargadoOfi = encargadoOfi;
	}
//creamos un metodo experienciaEncargada
	public void experienciaEncargada(Boolean encargadoOfi) {
		if(encargadoOfi) {
			encargadoOfi=true;
		System.out.println("El Administrador tiene experiencia "+encargadoOfi);
		}else {
			encargadoOfi=false;
			System.out.println("El Administrador no expereincia"+encargadoOfi);
		}
	}
        
        
	// Implementación del método abstracto para realizar el calculo del abono
	@Override
	public void sueltoTotal() {
		if(diasTrabajo==650) {
			bono=(+sueldo*150);
			System.out.print("El sueldo con los creditos es: "+bono);
		}else if(diasTrabajo>6) {
                    System.out.println("no tendra el creditos del abono" +sueldo);
			sueldo+=0;
		}
	
	}

	

}

	

	
	


