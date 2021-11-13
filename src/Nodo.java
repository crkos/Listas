public class Nodo {
	private int dato;
	private Nodo sig;
	
	//Constructor del nodo
	public Nodo() {
		dato = 0;
		sig = null;
	}
	
	//Constructor del nodo que recibe el dato
	public Nodo(int dato) {
		this.dato = dato;
		sig = null;
	}

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public Nodo getSig() {
		return sig;
	}

	public void setSig(Nodo sig) {
		this.sig = sig;
	}
	
}
