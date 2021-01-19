// Ejercicio 9:

public class NumeroParametros {
	
	public static void pruebaParametros(String...args) {
		
		// Hacemos la primera iteración para sacar el total de argumentos:
		int suma = 0;
		for (String cont: args) {
			suma += 1;
		}
		
		System.out.println("El numero de parametros es " + suma);
		
		// Segunda Iteración para que nos muestre [Posicion : Valor]
		for (int k=0; k<args.length; k++) {
			System.out.printf("Posición %d : %s \n", k, args[k]);
		}
	}
	
	// Método Main
	public static void main(String[] args) {
		
		// Llamamos al método sin crear una instancia del objeto gracias al Static:
		NumeroParametros.pruebaParametros("Luis", "Maria", "Guadalupe");
	}
}