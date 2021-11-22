package grafo;

import java.util.ArrayList;
import java.util.List;

public class Nodo {
	
	private String nombre;
	private List<Arista> aristas;
	
	public Nodo(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Arista> getAristas() {
		return aristas;
	}

	public void addArista(Arista arista) {
		if( aristas == null) {
			aristas = new ArrayList<>();
		}
		aristas.add(arista);
	}

	@Override
	public String toString() {
		return "Nodo [nombre=" + nombre + ", aristas=" + aristas + "]";
	}
	
}
