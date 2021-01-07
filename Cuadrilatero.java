package juego;

public class Cuadrilatero {

private float lado1;
private float lado2;

//Creamos el metodo constructor con 2 lados

public Cuadrilatero(float lado1 ,float lado2){
	this.lado1=lado1;
	this.lado2=lado2;
}
//Creamos el metodo constructor con 1 lado

public Cuadrilatero(float lado1){
	this.lado1= this.lado2= lado1;
}

//Creamos el Getter lado1

public float getLado1() {
	return lado1;
}

//Creamos el Getter lado2
public float getLado2() {
	return lado2;
}

//Creamos el Setter lado1

public void setLado1(float lado1) {
	this.lado1=lado1;
}

//Creamos el Setter lado2
public void setLado2(float lado2) {
	this.lado2=lado2;
}

//Metodo para obtener el area:

public float Area(){
	float Area= lado1*lado2;
	return Area;
}

//Metodo para obtener el perimetro:

public float Perimetro(){
	float Perimetro= 2*(lado1+lado2);
	return Perimetro;
}

	}
