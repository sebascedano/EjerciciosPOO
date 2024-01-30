package POOVI;

import javax.swing.JOptionPane;

public class CalculadoraImpuestos {
	public static void main(String[] args) {
	Producto producto1 = new Producto();
	producto1.setNombre(JOptionPane.showInputDialog("Nombre del producto"));
	producto1.setPrecio(Integer.parseInt(JOptionPane.showInputDialog("Precio del producto")));
	System.out.println("precio final del producto con el impuesto aplicado es "+producto1.Impuestocalculado());
	}
}


class Producto{
	private String nombre;
	private final double impuesto;
	private int precio;
	
	
	public Producto(){
	impuesto=21.0;
	nombre="Caramelo";
	precio=0;
	}

public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

public String getNombre() {
	return nombre;
}
public void setNombre(String producto) {
	this.nombre = producto;
}
public double Impuestocalculado() {
	return ((this.impuesto*this.precio)/100.0)+this.precio;
}
}