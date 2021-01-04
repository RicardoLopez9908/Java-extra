package clases;

public class Persona {

//atributos:
//les agregue acceso "public" a estos atributos, para poder modificarlos aunque este trabajando en otro paquete
	public String nombre;
	public int edad;
	public int dni;
	public String ColorDePelo;

//creamos el metodo contructor:
public Persona(String nombre, int edad, String ColorDePelo){
this.nombre=nombre;
this.edad=edad;
this.ColorDePelo=ColorDePelo;	
}

//creamos otro metodo constructor (sobrecarga de metodos)
//se diferencia por los parametros que le asignamos
public Persona(int dni){
this.dni=dni;	
}

//creamos un metodo de imprimir en pantalla:

public void ImprimirTodo () {
	System.out.println("el nombre de la persona es: "+ nombre +"\nsu edad es de "+ edad +" años\n"+"y el color de su pelo es "+ ColorDePelo);
}
public void ImprimirDni () {
	System.out.println("el numero de dni es: " + dni);
}
}
