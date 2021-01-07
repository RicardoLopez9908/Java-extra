package juego;
import java.util.Scanner;

public class MainGetSet {
	
	//Creamos un metodo estatico (que solo usaremos en esta clase)
	public static void Imprimir(String sexo, String nombre, int edad) {
		System.out.println(sexo+" "+nombre+", su edad actual es de "+edad+" años" );
	}
	public static void main(String[] args) {
		
		//pedimos al usuario su nombre
		System.out.println("ingrese su nombre");
		Scanner input1 = new Scanner (System.in);
		String nombre= input1.nextLine();
				
		//pedimos al usuario su edad
		System.out.println("por favor, "+ nombre +", ingrese su edad del año pasado");
		Scanner input3 = new Scanner (System.in);
		int edad= input3.nextInt();
				
		GetSet objeto= new GetSet(nombre,edad);
		
		//pedimos nueva edad
		System.out.println("ingrese su edad actual");
		Scanner input4 = new Scanner (System.in);
		edad= input4.nextInt();
		
		//modificamos la edad
		objeto.setEdad(edad);
	
		//pedimos al usuario su sexo
		System.out.println("¿como le gustaria que lo/a llamen? (señor/señorita)");
		Scanner input2 = new Scanner (System.in);
		String sexo= input2.next();
		
		//modificamos su sexo
		while(objeto.setSexo(sexo)==false) {
			System.out.println("Por favor, ingrese la palabra señorita o señor (exactamente)");
			Scanner scan=new Scanner(System.in);
			sexo= scan.next();
		}
		
		//imprimir usando un metodo estatico
		MainGetSet.Imprimir(objeto.getSexo(),objeto.getNombre(),objeto.getEdad());		
	}

}
