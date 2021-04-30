package cl.awakelab.simulacion.calcularmontos;

public class Venta implements InterfaceVentas{

	private String comprador;
	private String fecha;
	private int montoInicial;
	
	public String getComprador() {
		return comprador;
	}


	public void setComprador(String comprador) {
		this.comprador = comprador;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public int getMontoInicial() {
		return montoInicial;
	}


	public void setMontoInicial(int montoInicial) {
		this.montoInicial = montoInicial;
	}


	@Override
	public String toString() {
		return "Venta [comprador=" + comprador + ", fecha=" + fecha + ", montoInicial=" + montoInicial + "]";
	}


	public Venta() {
		super();
	}


	public Venta(String comprador, String fecha, int montoInicial) {
		super();
		this.comprador = comprador;
		this.fecha = fecha;
		this.montoInicial = montoInicial;
	}


	@Override
	public int calcularMonto() {
		// TODO Auto-generated method stub
		return 0;
	}

}
