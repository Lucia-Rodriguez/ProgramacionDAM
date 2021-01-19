// Ejercicio 10:

import java.util.*;

public class Numeros {

	// Atributos:
	private int valor;
	private static int resultado;
	private static ArrayList<Numeros> listaNumeros;
	
	// Constructor:
	Numeros(int valor){
		this.valor = valor;
	}
	
	// Métodos:
	public static void setSuma(ArrayList<Numeros> listaNumeros) {
		
		for (Numeros nums: listaNumeros) {
			resultado += nums.valor;
		}
	}
	
	public static int getSuma() {
		return resultado;
	}
	
	public static void main(String[] args) {
		
		// Creamos los objetos:
		Numeros PrimerNumero = new Numeros(20);
		Numeros SegundoNumero = new Numeros(10);
		Numeros TercerNumero = new Numeros(110);
		Numeros CuartoNumero = new Numeros(80);
		
		// Creamos la lista:
		listaNumeros = new ArrayList<Numeros>();
		
		listaNumeros.add(PrimerNumero);
		listaNumeros.add(SegundoNumero);
		listaNumeros.add(TercerNumero);
		listaNumeros.add(CuartoNumero);
		
		// Sumamos los objetos de la lista:
		Numeros.setSuma(listaNumeros);
		System.out.println(Numeros.getSuma());
		
		
		// TLDR: Creas los objetos con un valor, los añades a la lista y llamas al metodo para que lo sume.

	}
}
