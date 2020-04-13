package tp0;

public class Servicio implements Item {
	public String tipo = "servicio";
	public float precioActual;
	
	public float precioActual() {
		return precioActual;
	}
	
	public String tipo() {
		return tipo;
	}
	
	public Servicio(float precio) {
		precioActual = precio;
	}
	
	public void cambiarPrecio(float precioNuevo) {
		precioActual = precioNuevo;
	}
}
