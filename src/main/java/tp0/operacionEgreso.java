package tp0;

import java.util.*;

public class operacionEgreso {
	ArrayList<Item> items;
	float costo;
	boolean operacionCerrada = false;
	boolean generaRemito = false;
	
	public void cargarItem(Item item) {
		if (!operacionCerrada) {
			items.add(item);
		}
	}
	
	public float calcularValor() {
		if (!operacionCerrada) {
			costo = 0;
			items.stream().forEach((Item item) -> costo += item.precioActual());
			return costo;
		}
		else {
			return costo;	
		}
	}
	
	public void cerrarOperacion() {
		operacionCerrada = true;
	}
	
	public void verificarSiGeneraRemito() {
		if (items.stream().allMatch((Item item) -> item.tipo() == "articulo")) {
			generaRemito = true;
		}
	}
}
