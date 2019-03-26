package pe.com.pelispaceapp.dto;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.*;
import org.springframework.web.multipart.MultipartFile;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Producto")
public class Producto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String codigo; 
	@Column
	private String nombre;
	@Column
	private String descripcion;
	@Column
	private String audio;
	@Column
	private String genero_ids;
	@Column
	private String genero_descripcion;
	@Column
	private String calidad;
	@Column
	private String imagen;
	@Column
	private String anio;
	@Column
	private String duracion;
	@Column
	private String video1;
	@Column
	private String video2;
	@Column
	private String video3;
	@Column
	private String trailer;
	@Column
	private String descarga;
	@Column
	private String titulo_original;
	@Column
	private String imagen_fondo;
	@Column
	private String adulto;
	@Column
	private boolean activo;
	@Column
	private boolean estreno;
	@JsonIgnore
	@Column
	private int categoriaId;
	@Column
	private int vistas;
	@Column
	private int likes;
	@Column
	private int estrellas;
	@Transient
	private MultipartFile file;
	
	public Producto(){
		this.codigo = "COD" + UUID.randomUUID().toString().substring(26).toUpperCase();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

	public String getGenero_ids() {
		return genero_ids;
	}

	public void setGenero_ids(String genero_ids) {
		this.genero_ids = genero_ids;
	}

	public String getGenero_descripcion() {
		return genero_descripcion;
	}

	public void setGenero_descripcion(String genero_descripcion) {
		this.genero_descripcion = genero_descripcion;
	}

	public String getCalidad() {
		return calidad;
	}

	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getVideo1() {
		return video1;
	}

	public void setVideo1(String video1) {
		this.video1 = video1;
	}

	public String getVideo2() {
		return video2;
	}

	public void setVideo2(String video2) {
		this.video2 = video2;
	}

	public String getVideo3() {
		return video3;
	}

	public void setVideo3(String video3) {
		this.video3 = video3;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public String getDescarga() {
		return descarga;
	}

	public void setDescarga(String descarga) {
		this.descarga = descarga;
	}

	public String getTitulo_original() {
		return titulo_original;
	}

	public void setTitulo_original(String titulo_original) {
		this.titulo_original = titulo_original;
	}

	public String getAdulto() {
		return adulto;
	}

	public void setAdulto(String adulto) {
		this.adulto = adulto;
	}

	public int getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(int categoriaId) {
		this.categoriaId = categoriaId;
	}

	public int getVistas() {
		return vistas;
	}

	public void setVistas(int vistas) {
		this.vistas = vistas;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getEstrellas() {
		return estrellas;
	}

	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public boolean isEstreno() {
		return estreno;
	}

	public void setEstreno(boolean estreno) {
		this.estreno = estreno;
	}

	public String getImagen_fondo() {
		return imagen_fondo;
	}

	public void setImagen_fondo(String imagen_fondo) {
		this.imagen_fondo = imagen_fondo;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", audio=" + audio + ", genero_ids=" + genero_ids + ", genero_descripcion=" + genero_descripcion
				+ ", calidad=" + calidad + ", imagen=" + imagen + ", anio=" + anio + ", duracion=" + duracion
				+ ", video1=" + video1 + ", video2=" + video2 + ", video3=" + video3 + ", trailer=" + trailer
				+ ", descarga=" + descarga + ", titulo_original=" + titulo_original + ", imagen_fondo=" + imagen_fondo
				+ ", adulto=" + adulto + ", activo=" + activo + ", estreno=" + estreno + ", categoriaId=" + categoriaId
				+ ", vistas=" + vistas + ", likes=" + likes + ", estrellas=" + estrellas + "]";
	}

	

	

	
}
