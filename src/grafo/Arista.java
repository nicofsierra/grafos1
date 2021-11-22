package grafo;

public class Arista {

	private Nodo origen;
	private Nodo destino;
	private Integer valor;
	
	public Arista(Nodo origen,Nodo destino,Integer valor) {
		this.origen = origen;
		this.destino = destino;
		this.valor = valor;
	}

	public Nodo getOrigen() {
		return origen;
	}

	public void setOrigen(Nodo origen) {
		this.origen = origen;
	}

	public Nodo getDestino() {
		return destino;
	}

	public void setDestino(Nodo destino) {
		this.destino = destino;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Arista [origen=" + origen.getNombre() + ", destino=" + destino.getNombre() + ", valor=" + valor + "]";
	}
	
	
	
}
