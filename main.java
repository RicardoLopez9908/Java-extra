package juego;
import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int x[][];
		x = new int[5][7];
		int z[][];
		z = new int[5][7];
		
		for (int i=0; i<x.length;i++) {
			for (int j=0; j<x[i].length;j++) {
			System.out.println("por favor ingrese un numero para fila "+i+"columna "+j+"\n");
			Scanner input = new Scanner (System.in);
			x[i][j]= input.nextInt();}
		}
		for (int i=0; i<x.length;i++) {
		System.out.println(Arrays.toString(x[i]));
		}
		//ponemos nuetro array en orden:
		for (int i=0; i<z.length;i++) {
			for (int j=0; j<z[i].length;j++) {
			int a= z[i].length-j-1;
			z[i][j]= x[i][a];}}
		
		System.out.println("nuestro array en inversa:\n");
		for (int i=0; i<z.length;i++) {
			System.out.println(Arrays.toString(z[i]));
			
	}

}}
