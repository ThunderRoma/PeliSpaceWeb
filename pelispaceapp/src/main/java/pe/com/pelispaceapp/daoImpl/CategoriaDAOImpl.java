package pe.com.pelispaceapp.daoImpl;

import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.com.pelispaceapp.dao.CategoriaDAO;
import pe.com.pelispaceapp.dto.Categoria;
import pe.com.pelispaceapp.dto.Producto;

@Repository("categoriaDAO")
@Transactional
public class CategoriaDAOImpl implements CategoriaDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Categoria get(int id) {
		return sessionFactory.getCurrentSession().get(Categoria.class, Integer.valueOf(id));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Categoria> list() {
		
		String selectActiveCategory = "FROM Categoria WHERE activo = :activo";
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		query.setParameter("activo", true);
		return query.getResultList();
	}

	@Override
	public boolean add(Categoria categoria) {
		try {
			// add the category to the database table
			sessionFactory.getCurrentSession().persist(categoria);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Categoria categoria) {
		try {
			// add the category to the database table
			sessionFactory.getCurrentSession().update(categoria);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(Categoria categoria) {
		
		categoria.setActivo(false);
		try {
			// add the category to the database table
			sessionFactory.getCurrentSession().update(categoria);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}	
	}

	@Override
	public List<Categoria> listActiveCategorias() {
		String selectActiveCategoria = "FROM Categoria WHERE activo = :activo";
		return sessionFactory
				.getCurrentSession()
					.createQuery(selectActiveCategoria, Categoria.class)
						.setParameter("activo", true)
							.getResultList();
	}
}
