package cl.awakelab.simulacion.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.awakelab.simulacion.dao.DetallefacturaDao;
import cl.awakelab.simulacion.dao.FacturaDao;
import cl.awakelab.simulacion.modelo.Detallefactura;
import cl.awakelab.simulacion.modelo.Factura;

@Controller
public class FacturaControlador {
		
	@Autowired
	FacturaDao fd;
	
	@Autowired
	DetallefacturaDao dd;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String Inicio() {
		return "inicio";
	}
	
	@RequestMapping(value="/detallefactura", method=RequestMethod.POST)
	public String Detalle(Model model, @RequestParam ("facturaid") int facturaid) {
		Factura detallefac = fd.obtenerFacturaPorId(facturaid);
		model.addAttribute("detfac", detallefac);
		List<Detallefactura> ldetallefac = dd.obtenerDetallePorId(facturaid);
		model.addAttribute("ldetfac", ldetallefac);
		
		return "detalle";
	}
	
}
