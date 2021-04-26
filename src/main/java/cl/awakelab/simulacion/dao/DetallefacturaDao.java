package cl.awakelab.simulacion.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.awakelab.simulacion.modelo.Detallefactura;

public class DetallefacturaDao implements IDetallefacturaDao{

	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	@Override
	public List<Detallefactura> obtenerDetallePorId(int idfactura) {
		String query = "SELECT ROWNUM AS iddetalle,df.factura_facturaid AS idfactura, df.producto_productoid AS idproducto, p.nombre, p.valor, df.cantidad \r\n"
				+ "FROM detallefactura df\r\n"
				+ "LEFT JOIN producto p ON df.producto_productoid = p.productoid\r\n"
				+ "WHERE df.factura_facturaid = "+ idfactura +"\r\n"
				+ "ORDER BY p.nombre";
					return template.query(query,new RowMapper<Detallefactura>(){
						public Detallefactura mapRow(ResultSet rs, int row) throws SQLException {
						Detallefactura df = new Detallefactura();
						df.setIddetalle(rs.getInt(1));
						df.setIdfactura(rs.getInt(2));
						df.setIdproducto(rs.getInt(3));
						df.setNombreproducto(rs.getString(4));
						df.setPrecio(rs.getInt(5));
						df.setCantidad(rs.getInt(6));
							return df;
						}
					});
	}

}
