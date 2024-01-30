package POOVI;

import javax.swing.JOptionPane;

public class ConversorTemperatura {

	public static void main(String[] args) {
		Conversion conversion1 = new Conversion();
		conversion1.setTemperatura(Double.parseDouble(JOptionPane.showInputDialog("Introduzca la temperatura a convertir de ºC a ºF")));
	}
class Conversion{
	private double temperatura;
	private final double conversion;
	private final int ajuste;
	
	public Conversion(){
		temperatura=0.0;
		conversion=1.8;
		ajuste=32;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public double realizarConversion(){
		return this.temperatura*conversion+ajuste;
	}
}

}
