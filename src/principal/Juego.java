package principal;
//Borrar jugador y actualizar posiciones
import java.util.Scanner;

public class Juego {
	static Scanner sc=new Scanner(System.in);

	public static void menuInicio(){
		System.out.println("Seleccione la opción que quiere realizar:"+"\n1.Agregar jugador"+"\n2.Ver jugadores creados"+
							"\n3.Borrar jugador"+"\n4.Empezar juego");
		int opcionInicio=sc.nextInt();
		sc.nextLine();
		
		switch(opcionInicio){
		case 1: 
			Jugador.agregarJugadores();
			menuInicio();
		case 2:
			Jugador.imprimirJugadores();
			menuInicio();
		case 3:
			menuBorrarJugador();
			
		case 4:
			//Start();
		}
	}
	public static void menuBorrarJugador(){
		System.out.println("Introduzca la posición del jugador que quiera borrar");
		int borrar=sc.nextInt();
		//sc.nextLine();
		if(borrar<Jugador.jugadores.size()+1){
			sc.nextLine();
			Jugador.borrarJugador(borrar);
			menuInicio();
		}
		else{
			System.out.println("No hay ningún jugador en esa posición");
		}
	}
	public static void main(String [] args){
		menuInicio();

	}
}
