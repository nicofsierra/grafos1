package main;

import grafo.Arista;
import grafo.Grafo;
import grafo.Nodo;

public class Main {

	public static Grafo getNombres() {
		
		//agrego nodos
		Nodo a = new Nodo("a");
		Nodo b = new Nodo("b");
		Nodo c = new Nodo("c");
		Nodo d = new Nodo("d");
		Nodo e = new Nodo("e");
		
		//agrego aristas
		a.addArista(new Arista(a,b,50));
		a.addArista(new Arista(a,d,200));
		a.addArista(new Arista(a,e,100));
		b.addArista(new Arista(b,c,60));
		b.addArista(new Arista(b,d,70));
		c.addArista(new Arista(c,d,80));
		e.addArista(new Arista(d,e,40));
		
		
		Grafo grafo = new Grafo();
		
		grafo.addNodo(a);
		grafo.addNodo(b);
		grafo.addNodo(c);
		grafo.addNodo(d);
		grafo.addNodo(e);

		return grafo;
	}
	
	public static void main(String[] args) {
		
		
		Grafo grafo = getNombres();
		//grafo.mostrarGrafo();

        System.out.println(grafo);
       
	}

}
