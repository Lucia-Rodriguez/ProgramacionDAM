// Ejercicio 5

import java.util.Arrays;
import java.util.Collections;

public class Alumno {

	// Atributos:
	private String matricula;
	private double nota1;
	private double nota2;
	private double nota3;
	private static int aprobados;
	private static double resultadoNotaMedia;
	private static double getNotaMedia;
	
	
	// Constructor:
	Alumno(double nota1, double nota2, double nota3){
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
				
	// Métodos de la Clase:
	public static double notaMedia(Alumno alumno) {
		resultadoNotaMedia = (alumno.nota1 + alumno.nota2 + alumno.nota3) / 3;
		return resultadoNotaMedia;
	}
	
	public double notaMedia() {
		
		getNotaMedia = (nota1 + nota2 + nota3) / 3;
		
		if (getNotaMedia >= 5) {
			sumaAprobados();
		}
		return getNotaMedia;
	}
	
	public static void notaMediaSort(Alumno alumno1, Alumno alumno2, Alumno alumno3) {
		
		double[] sorted = {alumno1.notaMedia(), alumno2.notaMedia(), alumno3.notaMedia()};
		double[] sortedInvertido = new double[3];
		
		Arrays.sort(sorted);
		
		for (int k=0, j=2; k<=2; k++, j--) {
			sortedInvertido[k] = sorted[j];
		}
		
		for (double alumno: sortedInvertido) {
			System.out.printf("Notas ordenadas: %.2f \n" , alumno);
		}
	}
	
	public static void sumaAprobados() {
		aprobados += 1;
	}
	
	public static int getSumaAprobados() {
		return aprobados;
	}
	
	
	public static void main(String[] args) {
		
		// Creamos los objetos:
		Alumno Arturo = new Alumno(9.9, 8.9, 8.5);
		Alumno Lorena = new Alumno(7.5, 8.1, 9.5);
		Alumno Pamela = new Alumno(2.3, 3.9, 4);
		
		// Les sacamos la nota media:
		System.out.printf( "Nota media Lucia -> %.2f \n", Alumno.notaMedia(Pamela));
		System.out.printf( "Nota media Ruben -> %.2f \n", Alumno.notaMedia(Arturo));
		System.out.printf( "Nota media Carol -> %.2f \n", Alumno.notaMedia(Lorena));
		
		System.out.println("----------------------------------");
		
		// Los ordenamos de menos a más nota media:
		notaMediaSort(Arturo, Lorena, Pamela);
		
		System.out.println("----------------------------------");
		
		// Vemos los que han aprobado:
		System.out.println("Numero de aprobados: " + Alumno.getSumaAprobados());
		
		System.out.println("----------------------------------");
	}
}
