package consumoCoches;

import java.io.*;

public class principal {

	public static void main(String[] args) {
		consumo miconsumo=new consumo();
		miconsumo.introducirdatos();
		int opcion=0;
		do {
			menu();
			opcion=opcion();
			enrutamiento(opcion,miconsumo);
		}while(opcion!=4);
	}



	private static void enrutamiento(int opcion, consumo miconsumo) {
		switch(opcion) {
		case 1:
			System.out.println("Ha empleado en el viaje "+ miconsumo.getTiempo());
			break;
		case 2:
			System.out.println("El consumo medio en litros por 100 kms es " + miconsumo.consumoMedio());
			break;
		case 3:
			System.out.println("El consumo medio en euros por 100 kms es " + miconsumo.consumoEuros());
			break;
		case 4:
			System.out.println("Ha seleccionado salir del programa");
			break;
			default:
				System.out.println("La opción no existe, introduce del 1 al 4");
			break;
		}		
	}

	private static int opcion() {
		int opcion=0;
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("Escoja una opción (1 a 4)");
			try {
				try {
					opcion=Integer.parseInt(leer.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}catch(NumberFormatException ex) {
				System.out.println("Por favor, introduce un número, no un carácter");
				opcion=-1;
			}
		}while(opcion<=0 || opcion>4);
		return opcion;
	}

	private static void menu() {
		System.out.println("Seleccione una de entre las siguientes opciones");
		System.out.println("1.- Calcular el tiempo empleado en el viaje");
		System.out.println("2.- Calcular el consumo medio en litros");
		System.out.println("3.- Calcular el consumo medio en euros");
		System.out.println("4.- Salir");
	}
	
}
