/**
 * 
 * @author Iván Castaño Fernández
 * @author Óscar Fernández Angulo
 *
 */
public class Main {

	public static void main(String[] args) {
		Nodo nodo1 = new Nodo("Comeme ");
		Nodo nodo2 = new Nodo("los ");
		Nodo nodo3 = new Nodo("huevos.");
		Nodo casiRaiz = Nodo.concatenar(nodo1,nodo2);
		Nodo raiz = new Nodo(casiRaiz,nodo3);

		System.out.println(raiz.accesoCaracter(0));
		System.out.println(raiz.accesoCaracter(4));
		System.out.println(raiz.accesoCaracter(7));
		System.out.println(raiz.accesoCaracter(10));
		System.out.println(raiz.accesoCaracter(11));
		System.out.println(raiz.accesoCaracter(17));
	}

}
