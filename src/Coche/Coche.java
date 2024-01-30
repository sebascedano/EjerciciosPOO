package Coche;

public class Coche {
		//1.Defino sus características
		        private int ruedas;
		        private int largo;
		        private int ancho;
		        private int motor;//lo pongo en cc
		        private int peso;
		        String color;
		/*2. Creo un método constructor
		Es un método especial que se encarga de dar
		estado inicial al objeto
		Para construir un método constructor, debemos usar el
		MISMO NOMBRE que la clase*/
		        
		        public Coche() {
		        //Empezamos a construir el estado inicial del coche
		                ancho=250;
		                largo=400;
		                ruedas=4;
		                motor=200;
		                peso=1900;
		                color="Blanco";
		        }
		        public String dime_motor(){
		        	return "el motor del coche tiene "+motor+"caballos de potencia";
		        }
		        
		        public void establece_color(){
		        	color= "Rojo";
		        }
		        
		        public String dime_color(){
		        	return "el color es "+color;
		        }
		        


    public static void main(String[] args) {
            //Esto es instanciar una clase
            //Esto es crear un ejemplar de una clase
            Coche Renault = new Coche();
            
            //Ahora quiero ver las características de este coche
            System.out.println("Mi coche tiene " + Renault.ruedas + " ruedas.");
    }
}