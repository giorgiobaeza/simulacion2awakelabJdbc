package cl.awakelab.simulacion.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.awakelab.simulacion.dao.DetallefacturaDao;
import cl.awakelab.simulacion.modelo.Detallefactura;

@RestController
public class RestControlador {
	
	@Autowired
	DetallefacturaDao dd;
	
	@RequestMapping(value="/RestDetalle/{id}",method=RequestMethod.GET, headers = "Accept=application/json")
	public List<Detallefactura> obtenerDetalleRest(@PathVariable ("id") int idfactura){
		List<Detallefactura> ldetallefac = dd.obtenerDetallePorId(idfactura);
		
		return ldetallefac;
		
	}
	
}
