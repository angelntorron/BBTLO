package principal;
import java.io.IOException;
import java.util.Random;
//Borrar jugador y actualizar posiciones
import java.util.Scanner;

public class Juego {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String [] args){
		menuInicio();

	}
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
			menuInicio();
		case 4:
			System.out.print("\033[H\033[2J");
			start();
		}
	}
	public static void menuBorrarJugador(){
		System.out.println("Introduzca la posición del jugador que quiera borrar");
		int borrar=sc.nextInt();
		//sc.nextLine();
		if(borrar<Jugador.jugadores.size()+1){
			sc.nextLine();
			Jugador.borrarJugador(borrar);
			
		}
		else{
			System.out.println("No hay ningún jugador en esa posición");
		}
	}
	public static void start(){
		Prueba.cargarPruebas();
		System.out.println("Empieza el juego . . .");
		esperar(1);
		turno();	
		
	}
	
	public static void turno(){
		while(true){
			for(int i=0;i<Jugador.jugadores.size();i++){
				System.out.print("\033[H\033[2J");
				String jugador=Jugador.jugadores.get(i).toString();
				int numeroAleatorio = (int) (Math.random()*Prueba.pruebas.size());
				int numeroAleatorio2 = (int)Math.floor(Math.random()*(3-1+1)+1);
				//System.out.println(numeroAleatorio);
				String prueba=Prueba.pruebas.get(numeroAleatorio).toString();
				System.out.println(" Turno de: "+jugador+"\n Bebe "+numeroAleatorio2+"\n  "+prueba);
				sc.nextLine();
				//System.out.flush();
				
				
			}
		}
		
		
	}
	public static void esperar (int segundos) {
		try {
			Thread.sleep (segundos*1000);
		} 
		catch (Exception e) {
	
		}
	}
}
