package consumoCoches;

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
}
