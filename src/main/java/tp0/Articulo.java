package tp0;

public class Articulo implements Item{
	public String tipo = "articulo"; 
	public float precioActual;

	public float precioActual() {
		return precioActual;
	}
	
	public String tipo() {
		return tipo;
	}
	
	public Articulo(float precio) {
		precioActual = precio;
	}
	
	public void cambiarPrecio(float precioNuevo) {
		precioActual = precioNuevo;
	}

}
