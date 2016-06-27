package principal;

import java.util.ArrayList;

public class Prueba {
	private int id;
	private String descripcion, nombre;
	static ArrayList<Prueba> pruebas=new ArrayList<Prueba>();

	
	public Prueba(int id, String nombre, String descripcion){
		this.id=id;
		this.descripcion=descripcion;
		this.nombre=nombre;
	}
	public String toString() {
		return nombre+" \n"+descripcion;
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
	
	public static void cargarPruebas(){
	String jugBebe1="El jugador debe beber un trago";
	Prueba jugadorBebe1=new Prueba(1, "UN TRAGO", jugBebe1);
	pruebas.add(jugadorBebe1);
	
	String masAlto="Los dos jugadores más altos deben beber";
	Prueba jugadorMasAlto=new Prueba(2,"LAS DOS TORRES",masAlto);
	pruebas.add(jugadorMasAlto);
	
	String hermanos="El jugador que mas hermanos tenga debe beber (Un trago por cada hermano)";
	Prueba masHermanos=new Prueba(3,"HERMANOS", hermanos);
	pruebas.add(masHermanos);
	
	String tinder="Todos los que hayan pillado por Tinder deben beber";
	Prueba tindertinder=new Prueba(4,"TINDER", tinder);
	pruebas.add(tindertinder);
	
	String tRex="El jugador debe tener sus brazos pegados al cuerpo durante una ronda";
	Prueba rex=new Prueba(5,"TREX", tRex);
	pruebas.add(rex);
	
	String ojosSerpiente="Los jugadores que le miren a los ojos deberán beber (Durante una ronda)";
	Prueba serpiente=new Prueba(6,"OJOS DE SERPIENTE",ojosSerpiente);
	pruebas.add(serpiente);
	
	String alarma="Se pondrá una alarma de 5 minutos, cuando suene el jugador que tenga el turno debe beber";
	Prueba alarm=new Prueba(7,"ALARMA", alarma);
	pruebas.add(alarm);
	
	String yoNunca="El jugador empieza una ronda de yo nunca";
	Prueba nunca=new Prueba(8,"YO NUNCA", yoNunca);
	pruebas.add(nunca);
	
	String discrepo="El jugador debe empezar diciendo una palabra cualquiera, el jugador de la derecha dirá una palabra relacionada y asi "
			+ "sucesivamente, si alguno de los jugadores dice una palabra que no esté relacionada (se somete a votación entre todos"
			+ " los participantes) deberá beber ";
	Prueba discrep=new Prueba(9,"DISCREPO", discrepo);
	pruebas.add(discrep);
	
	String cartera="Los jugadores deben beber una por cada billete que tengan en su cartera";
	Prueba pudientes=new Prueba(10,"PUDIENTES",cartera);
	pruebas.add(pudientes);

	String mimo="El jugador deberá realizar una mímica de una película y los otros deberán adivinar."
			+ " Si la aciertan el mimo deberá beber "
			+ "en caso contrario beberán todos los demás";
	Prueba mimica =new Prueba(11,"MIMO",mimo);
	pruebas.add(mimica);

	String impuntual="El que haya llegado último a las copas debe beber";
	Prueba impuntuable=new Prueba(12,"IMPUNTUAL",impuntual);
	pruebas.add(impuntuable);

	String esCosaDeDos="Con el jugador de su derecha deberá cruzar los brazos y beber en esa posición ";
	Prueba entrelazados=new Prueba(13,"ES COSA DE DOS",esCosaDeDos);
	pruebas.add(entrelazados);

	String regla="El jugador pondrá una nueva norma para toda la partida ";
	Prueba regla1=new Prueba(14,"REGLA",regla);
	pruebas.add(regla1);
	/*
	String =" ";
	Prueba =new Prueba(,,);
	pruebas.add();

	String =" ";
	Prueba =new Prueba(,,);
	pruebas.add();

	String =" ";
	Prueba =new Prueba(,,);
	pruebas.add();

	String =" ";
	Prueba =new Prueba(,,);
	pruebas.add();

	String =" ";
	Prueba =new Prueba(,,);
	pruebas.add();

	String =" ";
	Prueba =new Prueba(,,);
	pruebas.add();
	
	*/
	}
}
