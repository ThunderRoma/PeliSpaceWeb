package pe.com.pelispaceapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pe.com.pelispaceapp.exception.ProductNotFoundException;
import pe.com.pelispaceapp.dao.CategoriaDAO;
import pe.com.pelispaceapp.dao.ProductoDAO;
import pe.com.pelispaceapp.dto.Categoria;
import pe.com.pelispaceapp.dto.Producto;

@Controller
public class PageController {
	
	private static final Logger logger = LoggerFactory.getLogger(PageController.class);

	@Autowired
	private CategoriaDAO categoriaDAO;
	
	@Autowired
	private ProductoDAO productoDAO;
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index(@RequestParam(name="logout",required=false)String logout) {
		ModelAndView mv = new ModelAndView("index");		
		mv.addObject("title","Home Us");
		mv.addObject("name","HOME");
		mv.addObject("titleHead","PeliSpace - Home");
		
		logger.info("Inside PageController index method - INFO");
		logger.debug("Inside PageController index method - DEBUG");
		
		mv.addObject("categorias", categoriaDAO.list());
		mv.addObject("userClickHome",true);
		return mv;
	}
	
	@RequestMapping(value = "/about")
	public ModelAndView about() {		
		ModelAndView mv = new ModelAndView("index");		
		mv.addObject("title","About Us");
		mv.addObject("name","ABOUT");
		mv.addObject("titleHead","Innovatek - About");
		mv.addObject("userClickAbout",true);
		return mv;				
	}	
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {		
		ModelAndView mv = new ModelAndView("index");		
		mv.addObject("title","Contact Us");
		mv.addObject("name","CONTACT");
		mv.addObject("titleHead","Innovatek - Contact");
		mv.addObject("userClickContact",true);
		return mv;				
	}	
	
	@RequestMapping(value = "/gallery")	
	public ModelAndView gallery() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("tittle", "Gallery Us");
		mv.addObject("name","GALLERY");
		mv.addObject("titleHead","PeliSpace - Gallery");
		mv.addObject("userClickGallery", true);
		return mv;
	}
	
	@RequestMapping(value = "/categoria/{id}/productos")
	public ModelAndView showCategoriaProductos(@PathVariable("id") int id) {		
		ModelAndView mv = new ModelAndView("index");
		
		Categoria categoria = null;
		categoria = categoriaDAO.get(id);
		mv.addObject("title",categoria.getNombre());
		mv.addObject("titleHead","PeliSpace - Peliculas");
		mv.addObject("categorias", categoriaDAO.list());
		mv.addObject("categoria", categoria);
		mv.addObject("userClickCategoryProducts",true);
		return mv;				
	}	
	
	@RequestMapping(value = "/ver/{id}/pelicula") 
	public ModelAndView showSingleProduct(@PathVariable int id) throws ProductNotFoundException {
		
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("titleHead","PeliSpace - Detalle");
		
		Producto producto = productoDAO.get(id);
		if(producto == null) throw new ProductNotFoundException();
		
		// update the view count
		producto.setVistas(producto.getVistas() + 1);
		productoDAO.update(producto);
		//---------------------------
		
		mv.addObject("title", producto.getNombre());
		mv.addObject("producto", producto);
		mv.addObject("categorias", categoriaDAO.list());
		mv.addObject("userClickShowProduct", true);
		return mv;
		
	}
	
	
}
