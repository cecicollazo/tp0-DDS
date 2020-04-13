package tp0;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestOperacionDeEgreso {
	private operacionEgreso operacion;
	private Articulo pantalon;
	private Articulo remera;
	private Servicio delivery;
	
	@Before
	public void init() {
		this.operacion = new operacionEgreso();
		this.pantalon = new Articulo(2300);
		this.remera = new Articulo(700);
		this.delivery = new Servicio(200);
		operacion.cargarItem(pantalon);
		operacion.cargarItem(remera);
	}


	@Test
	public void calcularValorDeItems() {
		Assert.assertEquals(3000, operacion.calcularValor());
	}
	
	@Test
	public void noCambiaElPrecioDeLaOperacionSiEstaCerrada() {
		operacion.cerrarOperacion();
		operacion.cargarItem(delivery);
		Assert.assertEquals(3000, operacion.calcularValor());
	}
	
	@Test
	public void noCambiaElPrecioDeLaOperacionSiEstaCerradaSiCambiaElPrecioDelArticulo() {
		operacion.cerrarOperacion();
		pantalon.cambiarPrecio(2500);
		Assert.assertEquals(3000, operacion.calcularValor());
	}
	
	@Test
	public void noGeneraRemitoConAlgunServicio() {
		operacion.cargarItem(delivery);
		operacion.verificarSiGeneraRemito();
		Assert.assertFalse(operacion.generaRemito);
	}
	
	@Test
	public void generaRemitoConTodosArticulos() {
		operacion.verificarSiGeneraRemito();
		Assert.assertTrue(operacion.generaRemito);
	}
}
