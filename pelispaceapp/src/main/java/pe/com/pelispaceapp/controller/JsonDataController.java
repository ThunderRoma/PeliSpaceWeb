package pe.com.pelispaceapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pe.com.pelispaceapp.dao.ProductoDAO;
import pe.com.pelispaceapp.dto.Producto;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {

	@Autowired
	private ProductoDAO productoDAO;
	
	@RequestMapping("/all/productos")
	@ResponseBody
	public List<Producto> getAllProducts() {
		return productoDAO.listActiveProducts();
				
	}
	
	@RequestMapping("/categoria/{id}/productos")
	@ResponseBody
	public List<Producto> getProductsByCategory(@PathVariable int id) {
		return productoDAO.listActiveProductsByCategory(id);		
	}
	
	@RequestMapping("/mv/productos")
	@ResponseBody
	public List<Producto> getMostrarProductosMasVistas() {		
		return productoDAO.getProductsByParam("vistas", 9);				
	}
		
//	@RequestMapping("/mp/productos")
//	@ResponseBody
//	public List<Producto> getMostrarProductosMasCompradas() {		
//		return productoDAO.getProductsByParam("compras", 9);				
//	}
}
