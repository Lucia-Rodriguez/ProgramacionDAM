
public class RestauranteMexicano {
	
	// Atributos:
	private double papas;
	private double chocos;
	
	// Constructor:
	public RestauranteMexicano(double papas, double chocos){
		this.papas = papas;
		this.chocos = chocos;
	}
	
	// M�todos:
	public static int getNumeroClientes(double papas, double chocos) {
		
		// 1KG Patatas = 3 Personas.
		// 1KG Chocos = 6 Personas.
		
		int numeroPapas = (int) (papas * 3);
		int numeroChocos = (int) (chocos * 6);
		
		return Math.min(numeroPapas, numeroChocos);
	}
	
	public void addChocos(double x) {
		// A�adimos chocos:
		chocos += x;
	}
	
	public void addPapas(double x) {
		// A�adir papas:
		papas += x;
	}
	
	public void showChocos() {
		System.out.println("Chocos en Stock: " + chocos);
	}
	
	public void showPapas() {
		System.out.println("Papas en Stock: " + papas);
	}
	
	// @Override
	
	public String toString() {
		return String.format("Numero de chocos: %.2f , Numero de papas: %.2f", chocos, papas);
	}
	
	
	// M�todo Principal:
	public static void main(String[] args) {
		
		RestauranteMexicano Ejemplo = new RestauranteMexicano(200,100);
		
		System.out.println(RestauranteMexicano.getNumeroClientes(200, 100));
		
		Ejemplo.showChocos();
		Ejemplo.showPapas();
		
		Ejemplo.addChocos(230.4);
		Ejemplo.addPapas(123.5);
	
		System.out.println(Ejemplo);
		
		
		
		
	}
}
