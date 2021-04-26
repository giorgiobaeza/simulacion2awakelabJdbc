package cl.awakelab.simulacion.modelo;

public class Detallefactura {

	private int iddetalle;
	private int idfactura;
	private int idproducto;
	private String nombreproducto;
	private int precio;
	private int cantidad;
	
	public Detallefactura(int iddetalle, int idfactura, int idproducto, String nombreproducto, int precio,
			int cantidad) {
		super();
		this.iddetalle = iddetalle;
		this.idfactura = idfactura;
		this.idproducto = idproducto;
		this.nombreproducto = nombreproducto;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public Detallefactura() {
		super();
	}
	@Override
	public String toString() {
		return "Detallefactura [iddetalle=" + iddetalle + ", idfactura=" + idfactura + ", idproducto=" + idproducto
				+ ", nombreproducto=" + nombreproducto + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	public int getIddetalle() {
		return iddetalle;
	}
	public void setIddetalle(int iddetalle) {
		this.iddetalle = iddetalle;
	}
	public int getIdfactura() {
		return idfactura;
	}
	public void setIdfactura(int idfactura) {
		this.idfactura = idfactura;
	}
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public String getNombreproducto() {
		return nombreproducto;
	}
	public void setNombreproducto(String nombreproducto) {
		this.nombreproducto = nombreproducto;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
