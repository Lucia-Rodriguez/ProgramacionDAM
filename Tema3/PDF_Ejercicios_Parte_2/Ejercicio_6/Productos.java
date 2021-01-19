
public class Productos {
	
	// Atributos:
	private String nombre;
	private double precioBase;
	private int tipoIVA;	// 10, 17 ó 21
	
	private double precio_final;
	
	// Constructor:
	Productos (String nombre, double precioBase, int tipoIVA) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.tipoIVA = tipoIVA;
	}
	
	//@Override
	public String toString() {
		return String.format("Nombre: %s \nPrecio: %.2f \nIVA: %d \n", nombre, precioBase, tipoIVA);
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	public double getTipoIVA() {
		return tipoIVA;
	}
	
	public double getPrecioFinal() {
		precio_final = precioBase - (precioBase * tipoIVA / 100);
		return precio_final;
	}

}
