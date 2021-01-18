
public class PPT {

	// Atributos:
	private static int numero;
	
	// Constructor:
	public PPT(){
		
	}
	
	// Métodos de la Clase:
	
	public static void gamePPT() {
		// Rango 3 mínimo 1:
		numero = (int) (Math.random() * 3) + 1;
		
		switch (numero) {
			case 1: System.out.println("Piedra"); break;
			case 2: System.out.println("Papel"); break;
			case 3: System.out.println("Tijera");; break;
		}
	}
	
	public static void main(String[] args) {
		
		gamePPT();
	}
}
