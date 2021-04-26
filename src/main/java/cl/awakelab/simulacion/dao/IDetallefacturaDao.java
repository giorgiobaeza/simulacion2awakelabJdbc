package cl.awakelab.simulacion.dao;

import java.util.List;

import cl.awakelab.simulacion.modelo.Detallefactura;

public interface IDetallefacturaDao {

	public List<Detallefactura> obtenerDetallePorId(int idfactura);
}
