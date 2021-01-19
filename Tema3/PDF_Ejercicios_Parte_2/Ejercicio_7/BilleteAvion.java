
public class BilleteAvion {
	
	// Atributos:
	private String nombre;
	private String nif;
	private int modoVuelo;	// 0: Turista, 1: Business, 3: VIP
	
	private boolean catering;
	private boolean baño;
	private int numeroMaletas;
	
	// Constructores:
	public BilleteAvion(String nombre, String nif) {
		this.nombre = nombre;
		this.nif = nif;
	}
	
	public BilleteAvion(String nombre, String nif, int modoVuelo) {
		this.nombre = nombre;
		this.nif = nif;
		this.modoVuelo = modoVuelo;
	}
	
	// Métodos:
	public void setCatering(boolean valor) {
		catering = valor;
	}
	
	public boolean getCatering() {
		return catering;
	}
	
	public void setBaño(boolean valor) {
		baño = valor;
	}
	
	public boolean getBaño() {
		return baño;
	}
	
	public void setNumeroMaletas(int numero) {
		numeroMaletas = numero;
	}
	
	public int getNumeroMaletas() {
		return numeroMaletas;
	}
	
	// @Override
	
	public String toString() {
		return String.format("[Nombre: %s], [NIF: %s], [Modo de Vuelo: %d], "
				+ "[Catering: %b], [Baño: %b], [Numero de maletas: %d]", nombre, nif, modoVuelo
				, catering, baño, numeroMaletas);
	}
	
}
