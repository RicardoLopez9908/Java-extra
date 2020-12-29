//importar el scanner para usarlo
import java.util.Scanner;
public class hola_mundo {

	public static void main(String[] args) {
		//declaramos las variables
		/*recordemos que podemos usar tambien:
		 * enteros: byte/short/int/long
		 * con coma: float/double*/
		String nombre;
		int edad;
		boolean valor;
				
		
		// pedimos el nombre
		System.out.println("hola ¿cual es tu nombre?");
		Scanner input = new Scanner (System.in);
		nombre= input.next();
		
		//pedimos la edad
		System.out.println(nombre + "¿cuantos años tenes?");
		Scanner input2 = new Scanner (System.in);
		edad= input2.nextInt();
		
		//pedimos el valor boolean
		System.out.println(edad + "¿true o false?");
		Scanner input3 = new Scanner (System.in);
		valor= input3.nextBoolean();
		
		//imprimo todas las variables
		System.out.println(nombre +" de "+ edad +" "+ valor );
	}

}
