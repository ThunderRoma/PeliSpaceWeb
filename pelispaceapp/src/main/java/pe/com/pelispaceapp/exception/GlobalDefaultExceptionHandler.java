package pe.com.pelispaceapp.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {

	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handlerNoHandlerFoundException() {
		
		ModelAndView mv = new ModelAndView("error");
		
		mv.addObject("errorTitle", "La página no esta construida!");
		
		mv.addObject("errorDescription", "La página que estás buscando no está disponible ahora!");
		
		mv.addObject("title", "404 Error Pagina");
		
		return mv;
	}
	
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ModelAndView handlerProductNotFoundException() {
		
		ModelAndView mv = new ModelAndView("error");
		
		mv.addObject("errorTitle", "Producto no disponible!");
		
		mv.addObject("errorDescription", "El producto que está buscando no está disponible!");
		
		mv.addObject("title", "Producto No disponible");
		
		return mv;
	}
		
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handlerException(Exception ex) {
		
		ModelAndView mv = new ModelAndView("error");
		
		mv.addObject("errorTitle", "Contacte con su Administrador!!");
		
		
		/* only for debugging your application*/
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		
		ex.printStackTrace(pw);
						
		mv.addObject("errorDescription", sw.toString());
		
		mv.addObject("title", "Error");
		
		return mv;
	}
			
	
}
