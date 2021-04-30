package cl.awakelab.simulacion.calcularmontos;

public class VentaExtra extends Venta{

	private int impuestoAdicional;
	
	public int getImpuestoAdicional() {
		return impuestoAdicional;
	}

	public void setImpuestoAdicional(int impuestoAdicional) {
		this.impuestoAdicional = impuestoAdicional;
	}

	@Override
	public String toString() {
		return "VentaExtra [impuestoAdicional=" + impuestoAdicional + "], datos padre: " + super.toString();
	}

	public VentaExtra() {
		super();
	}

	public VentaExtra(int impuestoAdicional, String comprador, String fecha, int montoInicial) {
		super(comprador, fecha, montoInicial);
		this.impuestoAdicional = impuestoAdicional;
	}

	@Override
	public int calcularMonto() {
		int monto;
		int impuesto;
		int montofinal;
		monto = (this.getMontoInicial() + ((this.getMontoInicial() * 19)/100));
		impuesto = ((this.getMontoInicial()*this.impuestoAdicional)/100);
		montofinal = monto+impuesto;
		return montofinal;
	}
	
	

}
