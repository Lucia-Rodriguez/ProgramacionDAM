
public class Main {

	public static void main(String[] args) {
		
		// Creamos el objeto de la clase:
		BilleteAvion ViajeAEscocia = new BilleteAvion("Ruben", "02212", 0);
		
		// Definimos los valores de los métodos:
		ViajeAEscocia.setBaño(true);
		ViajeAEscocia.setCatering(false);
		ViajeAEscocia.setNumeroMaletas(1);
		
		// Hacemos un return de los valores:
		System.out.println(ViajeAEscocia);
		
	}

}
