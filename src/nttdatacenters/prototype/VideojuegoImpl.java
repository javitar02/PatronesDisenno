package nttdatacenters.prototype;

//Clase videojuego que implementa la interfaz IVideojuego
public class VideojuegoImpl implements IVideojuego {
	//Atributos
	private String nombre;
	private int edicion;
	
	//Constructor
	public VideojuegoImpl() {
		nombre = "FIFA";
	}
	
	//Getters-Setters
	public String getNombre() {
		return nombre;
	}

	public int Edicion() {
		return edicion;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}

	//Método implementado de la interfaz donde se clona a partir del prototipo
	@Override
	public IVideojuego clonar() {
		VideojuegoImpl vj = null;
		
		try {
			vj = (VideojuegoImpl) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return vj;
	}

	//To string
	@Override
	public String toString() {
		return "Videojuego [nombre=" + nombre + ", edicion=" + edicion + "]";
	}
	

}
