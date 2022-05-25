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
		this.buses.add(new bus("Mercedes-Benz",2016, 5000000, 40000.4));
		this.buses.add(new bus("Mercedes-Benz",2015, 5000000, 40000.4));
		this.buses.add(new bus("Mercedes-Benz",2018, 5000000, 40000.4));
		this.buses.add(new bus("Mercedes-Benz",2020, 5000000, 40000.4));
		this.buses.add(new bus("Mercedes-Benz",2020, 5000000, 40000.4));
		this.buses.add(new bus("Mercedes-Benz",2021, 5000000, 40000.4));
		this.buses.add(new bus("Mercedes-Benz",2021, 5000000, 40000.4));
		this.buses.add(new bus("Mercedes-Benz",2016, 5000000, 40000.4));
		this.buses.add(new bus("Mercedes-Benz",2016, 5000000, 40000.4));
		this.buses.add(new bus("Mercedes-Benz",2013, 5000000, 40000.4));
		this.buses.add(new bus("Mercedes-Benz",2015, 5000000, 40000.4));
		this.buses.add(new bus("Mercedes-Benz",2015, 5000000, 40000.4));
		this.buses.add(new bus("Mercedes-Benz",2015, 5000000, 40000.4));

	}

	public void añadirBus(String nombre, int año) throws BusNoEcontradoException {
		for (bus bus : this.buses) {
			if (bus.getNombre().equals(nombre) && bus.getAño() == año) {
				this.buses.remove(bus);
				return;
			}
		}

		throw new BusNoEcontradoException();
	}


}
