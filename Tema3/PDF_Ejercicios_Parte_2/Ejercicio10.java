
public class Ejercicio10 {

	// Sume todos los par�metros que le lleguen:
	public static int returnNumber(int...numbers) {
		
		int suma = 0;
		
		for (int numeros: numbers) {
			suma += numeros;
		}
		
		return suma;
	}
	
	
	// M�todo Principal:
	public static void main(String[] args) {
		
		System.out.println(Ejercicio10.returnNumber(10,20,30,50));
		System.out.println(Ejercicio10.returnNumber(3,5,10));
		

	}

}
