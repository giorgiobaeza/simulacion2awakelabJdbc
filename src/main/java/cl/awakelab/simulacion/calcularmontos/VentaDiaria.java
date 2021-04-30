package cl.awakelab.simulacion.calcularmontos;

public class VentaDiaria extends Venta{

	private int propina;

	public int getPropina() {
		return propina;
	}

	public void setPropina(int propina) {
		this.propina = propina;
	}

	@Override
	public String toString() {
		return "VentaDiaria [propina=" + propina + "], datos padre: " + super.toString();
	}

	public VentaDiaria() {
		super();
	}

	public VentaDiaria(int propina, String comprador, String fecha, int montoInicial) {
		super(comprador, fecha, montoInicial);
		this.propina = propina;
	}

	@Override
	public int calcularMonto() {
		int monto;
		int montoini = this.getMontoInicial();
		monto = (montoini + ((montoini * 19)/100)) + this.propina;
		return monto;
	}
	
	
}
