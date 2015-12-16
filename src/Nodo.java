/**
 *
 * @author Iván Castaño Fernández
 * @author Óscar Fernández Angulo
 *
 */

import java.util.ArrayList;


public class Nodo {
	
	int altura;
	Nodo nodoDer;
	Nodo nodoIzq;
	int longitud;
	String texto;

	/**
	 * Constructor de los nodos internos.
	 * Calcula la altura y la longitud con los nodos.
	 * @param nodoIzq nodo izquierdo a concatenar.
	 * @param nodoDer nodo derecho a concatenar.
     */
	public Nodo(Nodo nodoIzq, Nodo nodoDer){
		this.nodoDer=nodoDer;
		this.nodoIzq=nodoIzq;
		longitud=nodoDer.getLongitud()+nodoIzq.getLongitud();
		
		if(nodoDer.getAltura()<nodoIzq.getAltura()){
			altura=nodoIzq.getAltura()+1;
		} else {
			altura=nodoDer.getAltura()+1;
		}
		
	}

	/**
	 * Constructor de los nodos externos (hojas).
	 * @param texto cadena de caracteres que deseamos guardar en el nodo.
     */
	public Nodo(String texto){
		this.texto=texto;
		longitud=texto.length();
		altura=0;
	}

	/**
	 * Acceso al caracter i-esimo.
	 * @param posicion del caracter que deseamos conocer.
	 * @return caracter i-esimo.
     */
	public char accesoCaracter(int posicion){
		if(this.getAltura()==0){
			return this.getTexto().charAt(posicion);
		} else {
			if (this.getNodoIzq().getLongitud()-1 >= posicion) {
				return this.getNodoIzq().accesoCaracter(posicion);
			} else {
				return this.getNodoDer().accesoCaracter(posicion - this.getNodoIzq().longitud);
			}
		}
	}

	/**
	 * Metodo que equilibra el arbol descendiente de la raiz que lo llama.
	 * @return nodo raiz del arbol equilibrado.
     */
	public Nodo balanceado(){
		Pila<Nodo> pila = new Pila();
		ArrayList<Nodo> lista =new ArrayList<>();
		Nodo aux;
		pila.insertar(this);
		while(!pila.estaVacia()){
			aux = pila.extraer();
			if(aux.getAltura()==0){
				lista.add(aux);
			} else {
				pila.insertar(aux.getNodoDer());
				pila.insertar(aux.getNodoIzq());
			}
		}
		return arbolizar(lista);

	}

	/**
	 * Convierte la lista de nodos que le pasas por parametro en un arbol equilibrado.
	 * @param lista de nodos ordenados.
	 * @return nodo raiz del arbol equilibrado.
     */
	private Nodo arbolizar(ArrayList<Nodo> lista){
		if(lista.size()==1){
			return lista.remove(0);
		} else {

			return new Nodo(arbolizar( new ArrayList<>(lista.subList(0, (int) (lista.size() / 2))) ),
					arbolizar(new ArrayList<> (lista.subList((int) (lista.size() / 2), lista.size()))));

		}
	}

	/**
	 * Concatena dos nodos.
	 * @param nodoIzq nodo que queremos tener en la posicion de la izquierda.
	 * @param nodoDer nodo que queremos tener en la posicion de la derecha.
     * @return devuelve el nodo raiz de los nodos concatenados.
     */
	public static Nodo concatenar(Nodo nodoIzq, Nodo nodoDer){
		return new Nodo(nodoIzq,nodoDer);
	}

	/**
	 * Concatena el nodo que lo llama, en la posicion de la izquierda, con el nodo que le pasas por parametro.
	 * @param nodoDer nodo que queremos tener en la posicion de la derecha.
	 * @return devuelve el nodo raiz de los nodos concatenados.
	 */
	public Nodo concatenar(Nodo nodoDer){
		return new Nodo(this,nodoDer);
	}

	public int getAltura() {
		return altura;
	}

	public int getLongitud() {
		return longitud;
	}

	public Nodo getNodoDer() {
		return nodoDer;
	}

	public Nodo getNodoIzq() {
		return nodoIzq;
	}

	public String getTexto() {
		return texto;
	}

	public String pasaString () {
		if(this.getAltura()==0){
			return this.getTexto();
		} else {
			return this.getNodoIzq().pasaString()+this.getNodoDer().pasaString();
		}
	}


}
