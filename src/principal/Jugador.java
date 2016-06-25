package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Jugador {
	private String nombre;
	private int posicion;
	private int puntuacion;
	static Scanner sc=new Scanner(System.in);
	public static int contadorJugadores;
	static ArrayList<Jugador> jugadores=new ArrayList<Jugador>();
	public Jugador(String nombre, int posicion, int puntuacion){
		this.nombre=nombre;
		this.posicion=posicion;
		this.puntuacion=puntuacion;
	}
	public Jugador(String nombre, int posicion){
		this.nombre=nombre;
		this.posicion=posicion;
	}
	public Jugador(){
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	
	public String toString() {
		return "\nNombre: "+nombre+"\nPosición: "+posicion+"\n";
	}

	public static void agregarJugadores() {
			
			//System.out.println("Introduzca el número de jugadores");
			//int numeroJugadores=sc.nextInt();
			//sc.nextLine();
			//for(int i=1;i==numeroJugadores;i++){
				System.out.println("Introduzca el nombre del jugador ");
				String nombre=sc.nextLine();
				int posicion=jugadores.size()+1;
				
				Jugador jugador=new Jugador(nombre, posicion);
				jugadores.add(jugador);
				
			//}
		
	}
	
	public static void imprimirJugadores(){
		
		
		String s=jugadores.toString();
		
		System.out.println(s);
		
	}
	public static void borrarJugador(int borrar) {
		if((jugadores.isEmpty()==false)){
			jugadores.remove(borrar-1);
			/*for(int i=borrar;i<jugadores.size();i++){
				jugadores.set(borrar-1, jugadores.get(borrar));
			}*/
			organizarArrayJugadores();
		}
		else{
			System.out.println("No hay ningún jugador");
		}
			
	}
	public static void organizarArrayJugadores(){
		//Object[] jugadoresArray=jugadores.toArray();
		//jugadoresArray[i]=jugadoresArray[i+1];
		for(int i=0;i<jugadores.size();i++){
			jugadores.get(i).setPosicion(i-1);
			//que es esto
		}
	}
	
	
	
}
