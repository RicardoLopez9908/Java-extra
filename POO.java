package juego;
import javax.swing.JOptionPane;

public class POO {

//atributos del objeto
int numero1;
int numero2;
int suma;
int resta;
int multiplicacion;
int division;

//metodos:

public void pedirNumero(){
	numero1= Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
	numero2= Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
}
public void sumar(){
	suma= numero1+numero2;
}
public void restar(){
	resta= numero1-numero2;
}	

public void multiplicar(){
	multiplicacion= numero1*numero2;
}

public void dividir(){
	division= numero1/numero2;
}	

public void mostrarResultados(){
	System.out.println("el resultado de la suma es:"+ suma);
	System.out.println("el resultado de la resta es:"+ resta);
	System.out.println("el resultado de la division es:"+ division);
	System.out.println("el resultado de la multiplicacion es:"+ multiplicacion);
}	
}
