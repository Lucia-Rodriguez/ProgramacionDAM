public class Ejercicio11 {

	// Primer M�todo:
	public static int returnNumber(int...numbers) {
		
		int suma = 0;
		
		for (int numeros: numbers) {
			suma += numeros;
		}
		
		return suma;
	}
	
	// Segundo M�todo:
	public static double returnNumber(double numeroUno, double numeroDos, int...restoNumeros) {
		
		double primeraSuma = numeroUno + numeroDos;
		int sumaRestoNumeros = 0;
		
		for (int nums: restoNumeros) {
			sumaRestoNumeros += nums;
		}
		
		return primeraSuma + sumaRestoNumeros;
	}
	
	
	// M�todo Principal:
	public static void main(String[] args) {
		
		System.out.println(Ejercicio11.returnNumber(10.4, 20.8, 20, 10, 30));
		
	}

}
