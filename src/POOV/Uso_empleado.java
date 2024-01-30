package POOV;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class Uso_empleado {

	public static void main(String[] args) {
		empleado empleado1= new empleado("",0,0,0,0);
		empleado1.setNombre(JOptionPane.showInputDialog("Nombre del empleado"));
		empleado1.setSueldo(Double.parseDouble((JOptionPane.showInputDialog("Introduce el sueldo"))));
		
		System.out.println("Nombre: "+empleado1.dameNombre());
		System.out.println("Sueldo: "+empleado1.dameSueldo());
		System.out.println("Fecha de alta: "+empleado1.dameAlta_contrato());
		
		

	}

}

class empleado{
	public empleado(String nom, double sue, int año, int mes, int dia){
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario= new GregorianCalendar(año,mes-1,dia);
		alta_contrato=calendario.getTime();
	
	}
	public String dameNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double dameSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo=sueldo;
	}
	public void subeSueldo(double porcentaje) {
		double aumento=sueldo*porcentaje/100;
		sueldo += aumento;
	}
	public Date dameAlta_contrato() {
		return alta_contrato;
	}
	public void setAlta_contrato(Date alta_contrato) {
		this.alta_contrato = alta_contrato;
	}
	private String nombre;
	private double sueldo;
	private Date alta_contrato;
}