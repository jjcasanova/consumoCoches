package consumoCoches;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class consumo {

	private double kilometros, litros, vmed, pgas;
	
	public consumo() {
		// TODO Auto-generated constructor stub
	}
	
	protected String getTiempo() {
		double tiempo=(kilometros*60)/vmed;
		String duracion=null;
		int horas, minutos;
		horas=(int)tiempo/60;
		minutos=(int)tiempo%60;
		duracion=horas + " horas y " + minutos + " minutos"; 
		return duracion;
	}
	
	protected double consumoMedio() {
		double consumomedio=(litros*100)/kilometros;
		return consumomedio;
	}
	
	protected double consumoEuros() {
		double consumoeuros=consumoMedio()*pgas;
		return consumoeuros;
	}
	
	protected void setKilometros(double kilometros) {
		this.kilometros=kilometros;
	}
	
	protected void setLitros(double litros) {
		this.litros=litros;
	}
	
	protected void setVmed(double vmed) {
		this.vmed=vmed;
	}
	
	protected void setPgas(double pgas) {
		this.pgas=pgas;
	}

	 protected void introducirdatos() {
		double kms, vmed, litros, pgas;
		consumo miconsumo=new consumo();
		do {
			System.out.println("Introduce los kms recorridos. Entre 1 y 1500");
			kms=introducirdato();
		}while(kms<=0 || kms>=1500);
		this.kilometros=kms;
		do {
			System.out.println("Introduce la velocidad media. entre 1 y 200 kms/h");
			vmed=introducirdato();
		}while(vmed<=0 || vmed>200);
		this.vmed=vmed;
		do {
			System.out.println("Introduce los litros consumidos");
			litros=introducirdato();
		}while(litros<=0 || litros>100);
		this.litros=litros;
		do {
			System.out.println("Introduce el precio de la gasolina");
			pgas=introducirdato();
		}while(pgas<=0 || pgas>100);
		this.pgas=pgas;
	}

	private static double introducirdato() {
		double dato=0;
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		try {
			dato=Double.parseDouble(leer.readLine());
		}catch(NumberFormatException ex) {
			System.out.println("Por favor, introduce un número, no un carácter. Vuelva a meter el dato");
		}catch(IOException ex) {
			
		}
		return dato;
	}
}
