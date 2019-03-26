package pe.com.pelispaceapp.dao;

import java.util.List;
import pe.com.pelispaceapp.dto.Categoria;

public interface CategoriaDAO {
	
	Categoria get(int id);
	List<Categoria> list();
	boolean add(Categoria categoria);
	boolean update(Categoria categoria);
	boolean delete(Categoria categoria);
	List<Categoria> listActiveCategorias();
}
