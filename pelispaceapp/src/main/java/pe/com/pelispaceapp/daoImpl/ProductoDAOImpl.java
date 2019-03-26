package pe.com.pelispaceapp.daoImpl;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pe.com.pelispaceapp.dao.ProductoDAO;
import pe.com.pelispaceapp.dto.Producto;

@Repository("productoDAO")
@Transactional
public class ProductoDAOImpl implements ProductoDAO{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Producto get(int productoId) {
		try {			
			return sessionFactory
					.getCurrentSession()
						.get(Producto.class, Integer.valueOf(productoId));			
		}
		catch(Exception ex) {		
			ex.printStackTrace();			
		}
		return null;
	}

	@Override
	public List<Producto> list() {
		return sessionFactory
				.getCurrentSession()
					.createQuery("FROM Producto" , Producto.class)
						.getResultList();
	}

	@Override
	public boolean add(Producto producto) {
		try {			
			sessionFactory
					.getCurrentSession()
						.persist(producto);
			return true;
		}
		catch(Exception ex) {		
			ex.printStackTrace();			
		}		
		return false;
	}

	@Override
	public boolean update(Producto producto) {
		try {			
			sessionFactory
					.getCurrentSession()
						.update(producto);
			return true;
		}
		catch(Exception ex) {		
			ex.printStackTrace();			
		}		
		return false;	
	}

	@Override
	public boolean delete(Producto producto) {
		
		try {
			producto.setActivo(false);
			// call the update method
			return this.update(producto);
		}
		catch(Exception ex) {		
			ex.printStackTrace();			
		}		
		return false;
	}

	@Override
	public List<Producto> getProductsByParam(String param, int count) {
		
		String query = "FROM Producto WHERE activo = true ORDER BY " + param + " DESC";
		return sessionFactory
					.getCurrentSession()
					.createQuery(query,Producto.class)
					.setFirstResult(0)
					.setMaxResults(count)
					.getResultList();
	}

	@Override
	public List<Producto> listActiveProducts() {
		String selectActiveProducts = "FROM Producto WHERE activo = :activo";
		return sessionFactory
				.getCurrentSession()
					.createQuery(selectActiveProducts, Producto.class)
						.setParameter("activo", true)
							.getResultList();
	}

	@Override
	public List<Producto> listActiveProductsByCategory(int categoriaId) {
		String selectActiveProductsByCategory = "FROM Producto WHERE activo = :activo AND categoriaId = :categoriaId";
		return sessionFactory
				.getCurrentSession()
					.createQuery(selectActiveProductsByCategory, Producto.class)
						.setParameter("activo", true)
						.setParameter("categoriaId",categoriaId)
							.getResultList();
	}

	@Override
	public List<Producto> getLatestActiveProducts(int count) {
		return sessionFactory
				.getCurrentSession()
					.createQuery("FROM Producto WHERE activo = :activo ORDER BY id", Producto.class)
						.setParameter("activo", true)
							.setFirstResult(0)
							.setMaxResults(count)
								.getResultList();
	}
	
	

}
