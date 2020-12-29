package juego;

public class mainPOO {

	public static void main(String[] args) {
		//creando un objeto:
		POO objeto = new POO();
		
		//ejecutar metodos:
		objeto.pedirNumero();
		objeto.sumar();
		objeto.restar();
		objeto.multiplicar();
		objeto.dividir();
		objeto.mostrarResultados();
	
		//crear objeto que solicita argumentos:
		
		POOparametros numero = new POOparametros();
	
		//ejecutar metodos con argumentos de la clase POOparametros:
		
		numero.sumarArgumentos(23,44);
		numero.restarArgumentos(67, 44);
		numero.multiplicarArgumentos(22, 5);
		numero.dividirArgumentos(34,55);
	
		System.out.println("suma de argumentos: "+ numero.suma);
		System.out.println("resta de argumentos: "+ numero.resta);
		System.out.println("division de argumentos: "+ numero.division);
		System.out.println("multiplicacion de argumentos: "+ numero.multiplicacion);
	
		
		//creando un objeto que use return:
		POO_return operacion = new POO_return();
		
		//imprimo en pantalla los returns de la clase POO_return
		System.out.println("la suma usando return es de: "+ operacion.sumarR(3, 5));
		System.out.println("la resta usando return es de: "+ operacion.restarR(3, 5));
		System.out.println("la division usando return es de: "+ operacion.dividirR(3, 5));
		System.out.println("la multiplicacion usando return es de: "+ operacion.multiplicarR(3, 5));
	}

}
