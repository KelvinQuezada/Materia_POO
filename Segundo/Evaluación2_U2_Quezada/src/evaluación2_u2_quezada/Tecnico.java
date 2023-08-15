package evaluación2_u2_quezada;
public class Tecnico extends Persona{
	// Constructor
	private boolean experiencia;

	public Tecnico(String nombre, int edad, int cedula, int telefono, double sueldo,Boolean experiencia) {
		super(nombre, edad, cedula, telefono, sueldo);
                this.experiencia=experiencia;
	}
	//creamos el metodo getter and setter
	//los cuales nos ayudaran para el ingreso y salida de datos
	public boolean getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(boolean experiencia) {
		this.experiencia = experiencia;
	}
	//creamos un metodo con condiciones para conocer si el tecnico tiene experiencia o no
	public void experiencia(boolean experiencia) {
		if(experiencia) {
			experiencia=true;
		System.out.println("Esta Tecnico tiene experiencia de la limpieza");
		}else {
			experiencia=false;
			System.out.println("no esta limpiando");
		}
	}
	// Implementación del método abstracto para realizar el calculo del abono
	@Override
	public void sueltoTotal() {
		// TODO Auto-generated method stub
			if(experiencia=true) {
				sueldo+=420;
				System.out.println("El sueldo del abono es de "+sueldo);
			}else if(experiencia=false) {
				System.out.println("El su sueldo sin abono es "+sueldo);
				sueldo+=0;
			}
		
	}
}
