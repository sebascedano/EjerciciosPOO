package EjerciciosPOOIl;

public class Automovil {
	private String marca;
	private String modelo;
	
	public Automovil() {
		marca="Suzuki";
		modelo="cd 2020";
	}
	public void establece_marca() {
		marca="Toyota";
	}
	public void establece_modelo() {
		modelo="GHR 2023";
	}
	public String dime_marca(){
    	return "La marca es "+marca;
    }
	public String dime_modelo(){
    	return "El modelo es "+modelo;
    }
}
