
public class Empleado {

	// Atributos:
	private String nombre;
	private int edad;
	private int numeroEmpleado;
	private int salario;
	
	// Constructor Vacío:
	Empleado(){
		
	}
	
	// Constructor con Argumentos:
	Empleado(String nombre, int edad, int numeroEmpleado, int salario){
		this.nombre = nombre;
		this.edad = edad;
		this.numeroEmpleado = numeroEmpleado;
		this.salario = salario;
	}
	
	// Getters:
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}
	
	public int getSalario() {
		return salario;	
	}
	
	//Setters:
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setAge(int edad) {
		this.edad = edad;
	}
	
	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	// Métodos de la Clase:
	
	public int plus(int dinero) {
		if (edad > 40) {
			salario += dinero;
		}
		
		return salario;
	}
	
	public int plus(int dinero, int retencion) {
		
		if (edad > 40) {
			salario = salario + dinero - (dinero * retencion / 100);
		}
		
		return salario;
	}
}
