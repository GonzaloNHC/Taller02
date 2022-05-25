public class bus {
	private String nombre;
	private int año, precio;
	private double kmRecorridos, cantidadCombustible;

	public bus(String nombre, int año, int precio, double kmRecorridos) {
		this.nombre = nombre;
		this.año = año;
		this.precio = precio;
		this.kmRecorridos = kmRecorridos;
		this.cantidadCombustible = cantidadCombustible;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public double getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	public double getCantidadCombustible() {
		return cantidadCombustible;
	}

	public void setCantidadCombustible(double cantidadCombustible) {
		this.cantidadCombustible = cantidadCombustible;
	}

	public String toString() {
		return ("\nNombre: " + this.nombre + "\nAño: " + this.año);
	}
}