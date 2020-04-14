package tp0;

import java.util.*;

public class OperacionEgreso {
	private ArrayList<Item> items;
	private float costo;
	private boolean operacionCerrada = false;
	private boolean generaRemito = false;

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	public boolean isOperacionCerrada() {
		return operacionCerrada;
	}

	public void setOperacionCerrada(boolean operacionCerrada) {
		this.operacionCerrada = operacionCerrada;
	}

	public boolean isGeneraRemito() {
		return generaRemito;
	}

	public void setGeneraRemito(boolean generaRemito) {
		this.generaRemito = generaRemito;
	}
	
	public void cargarItem(Item item) {
		if (!this.isOperacionCerrada()) {
			this.getItems().add(item);
		}
	}
	
	public float calcularValor() {
		if (!this.isOperacionCerrada()) {
			this.costo = 0;
			this.getItems().stream().forEach((Item item) -> this.setCosto(this.getCosto() + item.getPrecioActual()));
			return this.costo;
		}
		else {
			return this.costo;	
		}
	}
	
	public void cerrarOperacion() {
		this.setOperacionCerrada(true);
	}
	
	public void verificarSiGeneraRemito() {
		if (this.getItems().stream().allMatch((Item item) -> item.getTipo() == "articulo")) {
			this.setGeneraRemito(true);
		}
	}

}
