
package poo_11_arraylist_gestion_notas_kpqb;
//tambien importamos el paquete de nuestro proyecto y 
//llamamos el nombre de la clase GestionNotas
import java.util.Scanner;
import poo_11_arraylist_gestion_notas_kpqb.Notas.GestionNotas;

public class POO_11_ArrayList_gestion_notas_KPQB {

    public static void main(String[] args) {
         // instanciamos el objeto 
                GestionNotas gnotas=new GestionNotas();
		Scanner sc=new Scanner(System.in);
		int op;// opcione elegida por el usuario
		double notas;// variable para ir guardando la nota
                //generamos el menu
		do {
			System.out.println("1. ingresar nota ");
			System.out.println("2. ver dos medio ");
			System.out.println("3. ver Aprueba ");
			System.out.println("4. Salir ");
			op=Integer.parseInt(sc.nextLine());
		switch (op) {
		case 1:
			System.out.println("Ingrese nota: ");
			notas=Double.parseDouble(sc.nextLine());
			gnotas.guardarNota(notas);
			break;
		case 2:
			System.out.println("Ver bota media: "+gnotas.media());
			break;
		case 3:
			System.out.println("Ver nota aprobada: "+gnotas.aprobados());
			break;
		case 4:
			System.out.println("Usted a salido del menu");
			break;
		}
	}while (op!=4);
}
}