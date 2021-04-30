package cl.awakelab.simulacion.calcularmontos;

import java.util.ArrayList;
import java.util.List;

public class DemoConsola {

	public static void main(String[] args) {
		
		List<InterfaceVentas> lventas = new ArrayList<InterfaceVentas>();
		
		VentaDiaria vd1 = new VentaDiaria(6000,"CC","10/02/21",55000); 
		VentaDiaria vd2 = new VentaDiaria(7500,"OO","11/02/21",70000);
		VentaDiaria vd3 = new VentaDiaria(9000,"MM","12/02/21",99000);
		VentaDiaria vd4 = new VentaDiaria(9000,"PP","13/02/21",88800);
		
		lventas.add(vd1);
		lventas.add(vd2);
		lventas.add(vd3);
		lventas.add(vd4);
		
		VentaExtra ve1 = new VentaExtra(10,"RR","10/02/21",40000);
		VentaExtra ve2 = new VentaExtra(20,"AA","11/02/21",55000);
		VentaExtra ve3 = new VentaExtra(15,"DD","12/02/21",50000);
		VentaExtra ve4 = new VentaExtra(30,"OO","13/02/21",70000);

		lventas.add(ve1);
		lventas.add(ve2);
		lventas.add(ve3);
		lventas.add(ve4);
		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		int cont4 = 0;
		int totalventadiaria = 0;
		int totalventaextra = 0;
		for (int i = 0; i < lventas.size(); i++) {
			
			if(lventas.get(i).getClass().getSimpleName().equals("VentaDiaria")) {
				cont1 += 1;
				System.out.println("Venta diaria " + cont1 +": Inicial " + ((Venta) lventas.get(i)).getMontoInicial() + ", propina " + ((VentaDiaria) lventas.get(i)).getPropina() + ", total " + lventas.get(i).calcularMonto());			
				System.out.println();
				totalventadiaria += lventas.get(i).calcularMonto();
				int pcmontoinicial = (int) ((((Venta) lventas.get(i)).getMontoInicial()) * 0.10);
				if (((VentaDiaria)lventas.get(i)).getPropina() >= pcmontoinicial) {
					cont3 += 1;
				}
			}
			else if(lventas.get(i).getClass().getSimpleName().equals("VentaExtra")) {
				cont2 += 1;
				int impuestofijo = (((Venta) lventas.get(i)).getMontoInicial()*19)/100; 
				System.out.println("Venta Extra " + cont2 +": Inicial " + ((Venta) lventas.get(i)).getMontoInicial() + ", impuesto adicional " + impuestofijo + ", total " + lventas.get(i).calcularMonto());			
				System.out.println();
				totalventaextra += lventas.get(i).calcularMonto();
				int pcimpuestoad = (((Venta) lventas.get(i)).getMontoInicial()*((int) (((VentaExtra)lventas.get(i)).getImpuestoAdicional())))/100;
				if(impuestofijo > pcimpuestoad) {
					cont4 += 1;
				}
			}
	
		}
		System.out.println("Monto total venta diaria: " + totalventadiaria);
		System.out.println();
		System.out.println("Monto total venta extra: " + totalventaextra);
		System.out.println();
		System.out.println("Monto total de venta: " + (totalventaextra + totalventadiaria));
		System.out.println();
		System.out.println("Ventas diarias con propina igual o superior al 10% de monto inicial: " + cont3);
		System.out.println();
		System.out.println("Ventas extras con porcentaje impuesto fijo (19%) mayor a impuesto\r\n"
				+ "adicional de ventas: " + cont4);
		
	}

}
