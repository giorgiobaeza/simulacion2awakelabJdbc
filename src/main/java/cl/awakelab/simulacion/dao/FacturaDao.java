package cl.awakelab.simulacion.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import cl.awakelab.simulacion.modelo.Factura;

public class FacturaDao implements IFacturaDao{

	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	@Override
	public Factura obtenerFacturaPorId(int idfactura) {
		String sql = "SELECT f.facturaid, f.cliente, to_char(f.fecha, 'DD-MM-YYYY') AS fecha, \r\n"
				+ "SUM(df.cantidad * p.valor) AS subtotal, \r\n"
				+ "CAST(SUM(df.cantidad * p.valor * 0.19)AS INT) AS impuesto,\r\n"
				+ "CAST(SUM(df.cantidad * p.valor * 1.19)AS INT) AS total\r\n"
				+ "FROM factura f\r\n"
				+ "LEFT JOIN detallefactura df ON f.facturaid = df.factura_facturaid\r\n"
				+ "LEFT JOIN producto p ON df.producto_productoid = p.productoid\r\n"
				+ "WHERE f.facturaid = ?\r\n"
				+ "GROUP BY f.facturaid, f.cliente, to_char(f.fecha, 'DD-MM-YYYY')\r\n"
				+ "ORDER BY f.facturaid";
		
		return template.queryForObject(sql, new Object[]{idfactura}, (rs, rowNum) ->
		new Factura(
				rs.getInt("facturaid"),
				rs.getString("cliente"),
				rs.getString("fecha"),
				rs.getInt("subtotal"),
				rs.getInt("impuesto"),
				rs.getInt("total")
			));
	}

}
