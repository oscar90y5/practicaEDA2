
public class Nodo {
	
	int altura;
	Nodo nodoDer;
	Nodo nodoIzq;
	int longitud;
	String texto;
	
	//Constructor de los nodos internos(ramas).
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
	
	//Constructor de los nodos externos(hojas).
	public Nodo(String texto){
		this.texto=texto;
		longitud=texto.length();
		altura=0;
	}
	
	//metodo para acceder al caracter i-esimo
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
	
	//devuelve un arbol equilibrado del arbol que "desciende" de la raiz que le pasas
	public Nodo balanceado(Nodo raiz){
		return new Nodo("patata");	//no me mola que me salgan errores xD
	}
	
	//concatenacion opcion 1 (esta me mola mas):
	public static Nodo concatenar(Nodo nodoIzq, Nodo nodoDer){
		return new Nodo(nodoIzq,nodoDer);
	}
	
	//concatenacion opcion 2:
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


}
