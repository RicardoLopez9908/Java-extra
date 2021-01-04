package clases;

public class ejecutar {

	public static void main(String[] args) {
		
		//Creamos un objeto Persona con 3 atributos 
		Persona p1= new Persona("Ricky",21,"Marron");
		p1.ImprimirTodo();	

		//Creamos otro objeto con el mismo nombre
		//"Persona" pero con 1 parametro
		Persona p2= new Persona(41554354);
		p2.ImprimirDni();
}}
