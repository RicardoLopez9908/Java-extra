package juego;

public class GetSet {

	private final String nombre;
	private int edad;
	private String sexo;
	
	public GetSet(String nombre,int edad){
	this.edad=edad;
	this.nombre=nombre;
	}
	
	//Creamos un Getter para "nombre"
	public String getNombre() {
		return nombre;
	}
	
	//Creamos un Getter para "edad"
	public int getEdad(){
		return edad;
	}
	
	//Creamos un Getter para "sexo"
	public String getSexo(){
		return sexo;
	}
	
	//Creamos un Setter para "edad"
	public void setEdad(int edad){
		this.edad=edad;
	}
	
	//Creamos un Setter para "sexo" con condiciones
	public Boolean setSexo(String sexo) {
		String parametro1="señorita";
		String parametro2="señor";
		sexo=sexo.toLowerCase();
		if (sexo.equals(parametro1) || sexo.equals(parametro2)) {
		this.sexo=sexo;
		return true;
		}
		else{
			return false;
		}
		
	}
	}
	



