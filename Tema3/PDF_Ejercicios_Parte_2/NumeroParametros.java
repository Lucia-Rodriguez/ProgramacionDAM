// Ejercicio 9:

public class NumeroParametros {
	
	public static void pruebaParametros(String...args) {
		
		// Hacemos la primera iteraci�n para sacar el total de argumentos:
		int suma = 0;
		for (String cont: args) {
			suma += 1;
		}
		
		System.out.println("El numero de parametros es " + suma);
		
		// Segunda Iteraci�n para que nos muestre [Posicion : Valor]
		for (int k=0; k<args.length; k++) {
			System.out.printf("Posici�n %d : %s \n", k, args[k]);
		}
	}
	
	// M�todo Main
	public static void main(String[] args) {
		
		// Llamamos al m�todo sin crear una instancia del objeto gracias al Static:
		NumeroParametros.pruebaParametros("Luis", "Maria", "Guadalupe");
	}
}