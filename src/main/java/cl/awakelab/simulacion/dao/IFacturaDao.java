package cl.awakelab.simulacion.dao;

import cl.awakelab.simulacion.modelo.Factura;

public interface IFacturaDao {

	public Factura obtenerFacturaPorId(int idfactura);
}
