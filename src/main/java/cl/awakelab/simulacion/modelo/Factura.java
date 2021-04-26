package cl.awakelab.simulacion.modelo;

public class Factura {

	private int facturaid;
	private String cliente;
	private String fecha;
	private int subtotal;
	private int impuesto;
	private int total;
	
	public int getFacturaid() {
		return facturaid;
	}
	public void setFacturaid(int facturaid) {
		this.facturaid = facturaid;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}
	public int getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(int impuesto) {
		this.impuesto = impuesto;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Factura [facturaid=" + facturaid + ", cliente=" + cliente + ", fecha=" + fecha + ", subtotal="
				+ subtotal + ", impuesto=" + impuesto + ", total=" + total + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Factura() {
		super();
	}
	public Factura(int facturaid, String cliente, String fecha, int subtotal, int impuesto, int total) {
		super();
		this.facturaid = facturaid;
		this.cliente = cliente;
		this.fecha = fecha;
		this.subtotal = subtotal;
		this.impuesto = impuesto;
		this.total = total;
	}
	
	
}
