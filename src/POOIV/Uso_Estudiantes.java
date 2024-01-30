package POOIV;
import javax.swing.JOptionPane;

public class Uso_Estudiantes {

	public static void main(String[] args) {
		
	Estudiantes estudiante1 = new Estudiantes();
	int i;	
	for(i=0; i<2;i++) {

		estudiante1.setNombre(JOptionPane.showInputDialog("Introduce nombre del estudiante"));
		estudiante1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del estudiante")));
		estudiante1.setGrado(JOptionPane.showInputDialog("Introduce grado del estudiante"));
		
		System.out.println("Nombre: "+estudiante1.getNombre());
		System.out.println("Edad: "+estudiante1.getEdad());
		System.out.println("Grado: "+estudiante1.getGrado());
	}
}
}
