package PRUEBAS;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados trabajador1 = new Empleados("Loli");
		Empleados trabajador2 = new Empleados("Otro");
	System.out.println(trabajador1.devuelveDatos());
	System.out.println(trabajador2.devuelveDatos());
	}

}
class Empleados{
	
	private final String nombre;
	private String seccion;
	
	public Empleados(String nom) {
		nombre=nom;
		seccion="administración";
		
		
	}

	public String devuelveDatos() {
		return "El nombre es "+this.nombre+" y la seccion es "+this.seccion;
	}

	public void cambiaSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getNombre() {
		return nombre;
	}

}