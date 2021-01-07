package juego;
import java.util.Scanner;

public class MainCuadrilatero {

	public static void main(String[] args) {
	
	float lado1;
	float lado2;
	
	System.out.println("por favor, introduzca el lado 1 del cuadrado");
	Scanner input1 = new Scanner(System.in);
	lado1= input1.nextFloat();
	
    System.out.println("por favor, intromduzca el lado 2 del cuadrado");	
	Scanner input2 = new Scanner(System.in);
	lado2= input2.nextFloat();
	
	
	if (lado1==lado2) {
		Cuadrilatero objeto1 = new Cuadrilatero(lado1);
		
		System.out.println("el perimetro del cuadrilatero es "+ objeto1.Perimetro());
		
		System.out.println("el area del cuadrilatero es "+ objeto1.Area());
		}
	
	else {
		Cuadrilatero objeto1= new Cuadrilatero(lado1,lado2);
		
		System.out.println("el perimetro del cuadrilatero es "+ objeto1.Perimetro());
		
		System.out.println("el area del cuadrilatero es "+ objeto1.Area());
		}
}
}
