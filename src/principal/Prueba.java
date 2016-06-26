package principal;

import java.util.ArrayList;

public class Prueba {
	private int id;
	private String descripcion;
	static ArrayList<Prueba> pruebas=new ArrayList<Prueba>();

	
	public Prueba(int id, String descripcion){
		this.id=id;
		this.descripcion=descripcion;
	}
	public String toString() {
		return id +" "+ descripcion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String escogerPrueba(){
		return "nada";
	}
	
	public void cargarPruebas(){
	String jugBebe1="El jugador debe beber un trago";
	Prueba jugadorBebe1=new Prueba(1, jugBebe1);
	pruebas.add(jugadorBebe1);
	
	String masAlto="El jugador más alto debe beber";
	Prueba jugadorMasAlto=new Prueba(2,masAlto);
	pruebas.add(jugadorMasAlto);
	
	String hermanos="El jugador que mas hermanos/as tenga debe beber (Un trago por cada hermano/a)";
	Prueba masHermanos=new Prueba(3, hermanos);
	pruebas.add(masHermanos);
	}
}
