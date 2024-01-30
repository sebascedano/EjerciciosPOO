package POOIV;

import java.util.Iterator;

public class Estudiantes {
	private String [] nombre;
	private int []edad;
	private String []grado;
	
	public Estudiantes(){
		nombre = new String[3];
		edad = new int[3];
		grado = new String [3];
		
		
		
	}
	
public void getNombre() {
		for (int i =0; i<2;i++) {		
		System.out.println(nombre[i]);
		}
}
	public void setNombre(String nombre) {
		for (int i =0; i<2;i++) {		
			this.nombre[i] = nombre;
			}
	}


	public void getEdad() {
		for (int i =0; i<2;i++) {		
		System.out.println(edad[i]);
		}
	}


	public void setEdad(int edad) {
		for (int i =0; i<2;i++) {		
			this.edad[i] = edad;
			}
	}


	public void getGrado() {
		for (int i =0; i<2;i++) {		
		System.out.println(grado[i]);
		}
	}


	public void setGrado(String grado) {
		for (int i =0; i<2;i++) {		
			this.grado[i] = grado;
			}
	}

}
