
public class BilleteAvion {
	
	// Atributos:
	private String nombre;
	private String nif;
	private int modoVuelo;	// 0: Turista, 1: Business, 3: VIP
	
	private boolean catering;
	private boolean ba�o;
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
	
	// M�todos:
	public void setCatering(boolean valor) {
		catering = valor;
	}
	
	public boolean getCatering() {
		return catering;
	}
	
	public void setBa�o(boolean valor) {
		ba�o = valor;
	}
	
	public boolean getBa�o() {
		return ba�o;
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
				+ "[Catering: %b], [Ba�o: %b], [Numero de maletas: %d]", nombre, nif, modoVuelo
				, catering, ba�o, numeroMaletas);
	}
	
}
