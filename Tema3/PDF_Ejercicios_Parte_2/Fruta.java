
public class Fruta {
	
	// Atributos:
	private String nombre;
	private String procedencia;
	private int numeroKilos;
	private double costeKilo;
	private double precioKilo;
	
	private static double beneficio;
	
	// Constructor:
	public Fruta(){
		
	}
	
	public Fruta(String nombre, String procedencia, int numeroKilos, double costeKilo, double precioKilo) {
		this.nombre = nombre;
		this.procedencia = procedencia;
		this.numeroKilos = numeroKilos;
		this.costeKilo = costeKilo;
		this.precioKilo = precioKilo;
	}
	
	public static double getBeneficio() {
		return beneficio;
	}
	
	//@Override
	public String toString() {
		return String.format
				("[Nombre: " + nombre + " | " + 
				"Procedencia: " + procedencia + " | " + 
				"N.Kilos: " + numeroKilos + " | " +
				"Coste-Kilo: " + costeKilo + " | " + 
				"Precio-Kilo: " + precioKilo + "]");
	}
	
	
	
	public void rebajar(double cantidad) {
		
		if ((precioKilo - cantidad) >= costeKilo) {
			precioKilo -= cantidad;
			System.out.println("Precio Kilo [Actualizado] : " + precioKilo);
		} else {
			System.out.println("No se puede rebajar el precio");
		}
	}
	
	public void vender(double cantidad) {
		
		if ((numeroKilos - cantidad) > 0) {
			numeroKilos -= cantidad;
		
			System.out.printf("Precio Compra: %.2f \n", (numeroKilos * costeKilo));
			System.out.println("Stock Restante: " + numeroKilos);
			
			beneficio = precioKilo - costeKilo;
			beneficio += beneficio;
	
		} else {
			
			System.out.println("No hay Stock suficiente");
		}
	}
	
	public static boolean procedencia(Fruta fruta1, Fruta fruta2) {
		
		boolean procedencia = false;
		
		if (fruta1.procedencia.equalsIgnoreCase(fruta2.procedencia)) {
			procedencia = true;
		}
		
		return procedencia;
	}
	
	
	
	
	// Método Principal:
	public static void main(String[] args) {
		
		// Damos de alta 3 Cargamentos:
		Fruta Manzana = new Fruta("Manzana", "Malaga", 100, 1.2, 2.2);
		Fruta Aguacate = new Fruta("Aguacate", "Peru", 200, 2.2, 3.2);
		Fruta Sandia = new Fruta("Sandia", "Huelva", 300, 0.56, 1.2);
		
		System.out.println(Manzana);
		System.out.println("---------------------------");
		System.out.println(Aguacate);
		System.out.println("---------------------------");
		System.out.println(Sandia);
		System.out.println("---------------------------");
		
		// Miramos la procedencia de los 2 primeros:
		System.out.println(Fruta.procedencia(Manzana, Aguacate));
		System.out.println("---------------------------");
		
		// Rebajamos el precio de la Sandia:
		Sandia.rebajar(.05);
		System.out.println("---------------------------");
		Manzana.vender(40);
		System.out.println("---------------------------");

		// Realizamos ventas de los 3 cargamentos:
		Manzana.vender(20);
		System.out.println("---------------------------");
		Aguacate.vender(40);
		System.out.println("---------------------------");
		Sandia.vender(200);
		System.out.println("---------------------------");
		
		// Devolvemos los beneficios del Almacen:
		System.out.printf("Beneficio: %.2f euros", Fruta.getBeneficio());
	
	}
	

}
