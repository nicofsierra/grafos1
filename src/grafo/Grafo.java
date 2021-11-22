package grafo;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
	
	private List<Nodo> nodos;
	
	public Grafo() {}
	
	public void addNodo(Nodo nodo) {
		if( nodos == null) {
			nodos = new ArrayList<>();
		}
		nodos.add(nodo);
	}
	
	List<Nodo> getNodos(){
		return this.nodos;
	}

	@Override
	public String toString() {
		return "Grafo [nodos=" + nodos + "]";
	}			

}
