package pe.com.pelispaceapp.dto;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="Categoria")
public class Categoria implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	@Column
	private String nombre;
	@Column
	private boolean activo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nombre=" + nombre + ", activo=" + activo + "]";
	}
	
}
