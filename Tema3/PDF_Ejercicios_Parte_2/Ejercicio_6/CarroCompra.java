import java.util.*;

public class CarroCompra {
	
	// Atributos Carro de la Compra:
	private String nombre;
	private String direccion; 
	private String nif;
	
	// Creamos una lista dinámica donde almacenaremos los productos:
	ArrayList<Productos> listaProductos = new ArrayList<Productos>();
	
	// Importe total de la compra:
	private double getImporteTotal;
	
	// Constructor:
	public CarroCompra(String nombre, String direccion, String nif) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.nif = nif;
	}
	
	// Métodos de la Clase:
	public void añadirProducto(Productos producto) {
		listaProductos.add(producto);
	}
	
	public void eliminarProducto(Productos producto) {
		listaProductos.remove(producto);
	}
	
	public void getProductos() {
		
		for (Productos prod: listaProductos) {
			System.out.println(prod);
		}
	}
	
	public void pagarProductos() {
		for (Productos prod: listaProductos) {
			System.out.printf("Precio Base: %.2f, Precio Final: %.2f \n", prod.getPrecioBase(), prod.getPrecioFinal());
		}
		
		for (Productos prod: listaProductos) {
			getImporteTotal += prod.getPrecioFinal();
		}
		
		System.out.printf("Precio Final de Compra: %.2f \n", getImporteTotal);
	}

}
