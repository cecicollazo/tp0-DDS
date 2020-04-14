package tp0;

public class Servicio implements Item {
	private String tipo = "servicio";
	private float precioActual;
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getPrecioActual() {
		return precioActual;
	}

	public void setPrecioActual(float precioActual) {
		this.precioActual = precioActual;
	}

	public Servicio(float precio) {
		this.precioActual = precio;
	}
	
	public void cambiarPrecio(float precioNuevo) {
		this.precioActual = precioNuevo;
	}
}
