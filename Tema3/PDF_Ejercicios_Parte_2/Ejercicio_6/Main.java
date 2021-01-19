
public class Main {

	public static void main(String[] args) {
			
		// Creamos productos con diferentes IVA:
		Productos Cereales = new Productos("Special K", 3.45, 10);
		Productos Afeitar = new Productos("Gillet", 4.5, 21);
		Productos Pan = new Productos("Centeno", 1, 17);
		
		// Añadimos los productos al Carro de la Compra:
		
		// 1. Creamos el Carro:
		CarroCompra CompraJueves = new CarroCompra("Ruben", "C/ Sin Nombre", "02292045M");
		
		// 2. Añadimos los productos al Carro:
		CompraJueves.añadirProducto(Cereales);
		CompraJueves.añadirProducto(Pan);
		
		// 3. Vemos los elementos que tenemos en el carro:
		CompraJueves.getProductos();
		
		// 4. Borramos un producto:
		CompraJueves.eliminarProducto(Pan);
		
		// 5. Comprobamos que se ha eliminado el producto:
		CompraJueves.getProductos();
		
		// 6. Decidimos pagar los productos de arriba:
		CompraJueves.pagarProductos();
		
	}

}
