package POOVI;

import javax.swing.JOptionPane;

public class ComprobadorEdad {

	public static void main(String[] args) {
		comprobacion comprobacion1=new comprobacion();
		comprobacion1.setNombre(JOptionPane.showInputDialog("Introduzca su nombre"));
		comprobacion1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduzca su edad")));
		System.out.println("Usted identificado como "+comprobacion1.getNombre()+" "+comprobacion1.comprobarEdad());
	}
	
	
static class comprobacion{
	private String nombre;
	private int edad;
	private final int edadmin;
	

	public comprobacion(){
		nombre="nom";
		edad=0;
		edadmin=18;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String comprobarEdad() {
		 if(this.edad>this.edadmin){
			return "es apto para votar.";
		}else {
			return "no es apto para votar.";
		}
	}

}
}
