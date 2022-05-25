import java.util.ArrayList;
import java.util.List;

public class empresa {
	private String nombre;
	private String direccion;
	private List<bus> buses;

	public empresa(String nombre, String direccion, List<bus> buses) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.buses = buses;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String Nombre) {
		this.nombre = Nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String Direccion) {
		this.direccion = Direccion;
	}

	public List<bus> getBuses() {
		return buses;
	}

	public void setBuses(List<bus> buses) {
		this.buses = buses;
	}

	public void añadirBus() {
		this.buses.add(new bus("Celerio",2016, 5000000, 40000.4));
		this.buses.add(new bus("Celerio",2015, 5000000, 40000.4));
		this.buses.add(new bus("Celerio",2018, 5000000, 40000.4));
		this.buses.add(new bus("Celerio",2020, 5000000, 40000.4));
		this.buses.add(new bus("Celerio",2020, 5000000, 40000.4));
		this.buses.add(new bus("Celerio",2021, 5000000, 40000.4));
		this.buses.add(new bus("Celerio",2021, 5000000, 40000.4));
		this.buses.add(new bus("Celerio",2016, 5000000, 40000.4));
		this.buses.add(new bus("Celerio",2016, 5000000, 40000.4));
		this.buses.add(new bus("Celerio",2013, 5000000, 40000.4));
		this.buses.add(new bus("Celerio",2015, 5000000, 40000.4));

	}

}