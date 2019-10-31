package modelos;

public class Clientes {

	private int numeroCliente;
	private String nombre;
	private String poblacion;
	
	public Clientes(int numeroCliente,String nombre,String poblacion) {
		this.numeroCliente=numeroCliente;
		this.nombre=nombre;
		this.poblacion=poblacion;
	}

	@Override
	public String toString() {
		return "Clientes [numeroCliente=" + numeroCliente + ", nombre=" + nombre + ", poblacion=" + poblacion + "]";
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	
	
	
}
