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
		//int hola=Prueba.pruebas.size();
		
		System.out.println("Empieza el juego . . .");
		//System.out.println(hola);
		//System.out.println(Prueba.pruebas.toString());
		esperar(1);
		turno();	
		
	}
	
	public static void turno(){
		while((Prueba.pruebas.isEmpty()==false)){
		//do{
			for(int i=0;i<Jugador.jugadores.size();i++){
				System.out.print("\033[H\033[2J");
				String jugador=Jugador.jugadores.get(i).toString();
				int numeroAleatorio = (int) (Math.random()*Prueba.pruebas.size());
				int numeroAleatorio2 = (int)Math.floor(Math.random()*(3-1+1)+1);
				//System.out.println(numeroAleatorio);
				String prueba=Prueba.pruebas.get(numeroAleatorio).toString();
				
				System.out.println(" Turno de: "+jugador+"\n Bebe"+numeroAleatorio2+"\n\n  "+prueba);
				Prueba.pruebas2.add(Prueba.pruebas.get(numeroAleatorio));
				Prueba.pruebas.remove(numeroAleatorio);
				
				sc.nextLine();
				//System.out.flush();
				
				
			}
		}
		//while((Prueba.pruebas.isEmpty()==false));
		if(Prueba.pruebas.isEmpty()==true){
			System.out.print("\033[H\033[2J");
			System.out.println("MODO HARDCORE ON");
			for(int i=0;i<4;i++){
				System.out.println(".");
				esperar(1);
			}
			sc.nextLine();
			while(true){
				
				for(int i=0;i<Jugador.jugadores.size();i++){
					System.out.print("\033[H\033[2J");
					String jugador=Jugador.jugadores.get(i).toString();
					int numeroAleatorio = (int) (Math.random()*Prueba.pruebas2.size());
					int numeroAleatorio2 = (int)Math.floor(Math.random()*(4-(8+1))+8);
					//System.out.println(numeroAleatorio);
					String prueba=Prueba.pruebas2.get(numeroAleatorio).toString();
					
					System.out.println(" Turno de: "+jugador+"\n Bebe "+numeroAleatorio2+"\n\n  "+prueba);
					sc.nextLine();
				}
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
