import java.util.ArrayList;

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
		Nodo nodo4 = new Nodo("huevos.");
		Nodo nodo5 = new Nodo("huevos.");
		Nodo nodo6 = new Nodo("huevos.");
		Nodo nodo7 = new Nodo("huevos.");
		Nodo nodo8 = new Nodo("huevos.");


		Nodo raiz1 = new Nodo(nodo7,nodo8);
		Nodo raiz2 = new Nodo(nodo6,raiz1);
		Nodo raiz3 = new Nodo(nodo5,raiz2);
		Nodo raiz4 = new Nodo(nodo4,raiz3);
		Nodo raiz5 = new Nodo(nodo3,raiz4);
		Nodo raiz6 = new Nodo(nodo2,raiz5);
		Nodo raiz = new Nodo(nodo1,raiz6);

		System.out.println(""+raiz.getAltura());

		raiz=raiz.balanceado();

		System.out.println(""+raiz.getAltura());

	}

}
