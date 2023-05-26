package proyectoGrupo;

public class Coche extends Vehiculo implements Entregable {
	private String tipoCarroceria;
	private int capacidadPasajeros;

	public Coche(String marca, String modelo, int año, int precio) {
		super(marca, modelo, año, precio);
		this.tipoCarroceria = tipoCarroceria;
		this.capacidadPasajeros = capacidadPasajeros;
	}

	public String getTipoCarroceria() {
		return tipoCarroceria;
	}

	public void setTipoCarroceria(String tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}

	public int getCapacidadPasajeros() {
		return capacidadPasajeros;
	}

	public void setCapacidadPasajeros(int capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}

	@Override
	public String toString() {
		return "Coche - " + super.toString() + ", Tipo de Carrocería: " + tipoCarroceria + ", Capacidad de Pasajeros: "
				+ capacidadPasajeros;
	}

	@Override
	public void Entregar() {
		// TODO Auto-generated method stub
		
	}
}
