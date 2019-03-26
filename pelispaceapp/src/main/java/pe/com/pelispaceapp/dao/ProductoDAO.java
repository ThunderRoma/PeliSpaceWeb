package pe.com.pelispaceapp.dao;

import java.util.List;

import pe.com.pelispaceapp.dto.Producto;

public interface ProductoDAO {

	Producto get(int productoId);
	List<Producto> list();	
	boolean add(Producto producto);
	boolean update(Producto producto);
	boolean delete(Producto producto);

	List<Producto> getProductsByParam(String param, int count);	
	
	// business methods
	List<Producto> listActiveProducts();	
	List<Producto> listActiveProductsByCategory(int categoriaId);
	List<Producto> getLatestActiveProducts(int count);
	
}
