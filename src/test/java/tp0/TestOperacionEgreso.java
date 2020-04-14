package tp0;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestOperacionEgreso {
	private OperacionEgreso operacion;
	private Articulo pantalon;
	private Articulo remera;
	private Servicio delivery;

	public OperacionEgreso getOperacion() {
		return operacion;
	}

	public void setOperacion(OperacionEgreso operacion) {
		this.operacion = operacion;
	}

	public Articulo getPantalon() {
		return pantalon;
	}

	public void setPantalon(Articulo pantalon) {
		this.pantalon = pantalon;
	}

	public Articulo getRemera() {
		return remera;
	}

	public void setRemera(Articulo remera) {
		this.remera = remera;
	}

	public Servicio getDelivery() {
		return delivery;
	}

	public void setDelivery(Servicio delivery) {
		this.delivery = delivery;
	}

	@Before
	public void init() {
		operacion = new OperacionEgreso();
		pantalon = new Articulo(2300);
		remera = new Articulo(700);
		delivery = new Servicio(200);
		this.getOperacion().cargarItem(pantalon);
		this.getOperacion().cargarItem(remera);
	}

	//La operacion de egreso debe poder calcular su valor en base a los items que contiene.
	
	@Test
	public void calcularValorDeItems() {
		assertEquals(3000, this.getOperacion().calcularValor());
	}
	
	//Una vez que la operacion esta cerrada, no se le puede cambiar el precio
	
	@Test
	public void noCambiaElPrecioDeLaOperacionSiEstaCerradaYLeAgregoUnItem() {
		this.getOperacion().cerrarOperacion();
		this.getOperacion().cargarItem(delivery);
		assertEquals(3000, this.getOperacion().calcularValor());
	}
	
	@Test
	public void noSeAgreganItemsAUnaOperacionCerrada() {
		this.getOperacion().cerrarOperacion();
		this.getOperacion().cargarItem(delivery);
		assertEquals(2, this.getOperacion().getItems().stream().count());
	}
	
	//Tenga en cuenta que pasa si se cambia el precio de un articulo
	
	@Test
	public void noCambiaElPrecioDeLaOperacionSiEstaCerradaSiCambiaElPrecioDelArticulo() {
		this.getOperacion().cerrarOperacion();
		this.getPantalon().cambiarPrecio(2500);
		assertEquals(3000, this.getOperacion().calcularValor());
	}
	
	//La operacion de compra genera el documento remito, solo si todos los items son articulos (no servicios).
	
	@Test
	public void noGeneraRemitoConAlgunServicio() {
		this.getOperacion().cargarItem(delivery);
		this.getOperacion().verificarSiGeneraRemito();
		assertFalse(this.getOperacion().isGeneraRemito());
	}
	
	@Test
	public void generaRemitoConTodosArticulos() {
		this.getOperacion().verificarSiGeneraRemito();
		assertTrue(this.getOperacion().isGeneraRemito());
	}
	
}
