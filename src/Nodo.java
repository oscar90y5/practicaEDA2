
public class Nodo {
	
	int altura;
	Nodo nodoDer;
	Nodo nodoIzq;
	int longitud;
	String texto;
	
	//Constructor de los nodos internos(ramas).
	public Nodo(Nodo nodoDer, Nodo nodoIzq){
		this.nodoDer=nodoDer;
		this.nodoIzq=nodoIzq;
		longitud=nodoDer.longitud+nodoIzq.longitud;
		
		if(nodoDer.altura<nodoIzq.altura){
			altura=nodoIzq.altura+1;
		} else {
			altura=nodoDer.altura;
		}
		
	}
	
	//Constructor de los nodos externos(hojas).
	public Nodo(String texto){
		this.texto=texto;
		longitud=texto.length();
		altura=0;
	}
	
	//metodo para acceder al caracter i-esimo
	public void accesoCaracter(int posicion){
		
	}
	
	//devuelve un arbol equilibrado del arbol que "desciende" de la raiz que le pasas
	public Nodo balanceado(Nodo raiz){
		return new Nodo("patata");	//no me mola que me salgan errores xD
	}
	
	//concatenacion opcion 1 (esta me mola mas):
	public static Nodo concatenar1(Nodo nodoDer, Nodo nodoIzq){
		return new Nodo(nodoDer,nodoIzq);
	}
	
	//concatenacion opcion 2:
	public Nodo concatenar2(Nodo nodoIzq){
		return new Nodo(this,nodoIzq);
	}
}
