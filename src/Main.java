/**
 * 
 * @author Iván Castaño Fernández
 * @author Óscar Fernández Angulo
 *
 */
public class Main {

	public static void main(String[] args) {
		//Prueba que nos pasais en el enunciado de la practica.
		/*long tpo1,tpo2,tpo3,tpo4;
		int huella;
		System.out.println("PRUEBA CON STRING");
		tpo1 = System.currentTimeMillis();
		String cad = "";
		for(int i = 1; i < 60000; i++) {
			cad += "Este es un ejemplo de lo que puede ser una cadena de texto, en este caso estamos hablando de la linea numero "+i;
		}
		tpo2 = System.currentTimeMillis();
		huella = 0;
		for(int i = 0; i < cad.length();
			i++) {
			huella = huella*23 + cad.charAt(i);
		}
		tpo3 = System.currentTimeMillis();
		System.out.println("Concatenar: "+(tpo2
				-
				tpo1)+" mseg.");
		System.out.println("Recorrer: "+(tpo3
				-
				tpo2)+" mseg.");
		System.out.println("Huella = "+huella);
		System.out.println();
		System.out.println("PRUEBA CON ROPES");
		tpo1 = System.currentTimeMillis();
		Nodo rop = new Nodo("");
		for(int i = 1; i < 60000; i++) {
			rop = rop.concatenar(new Nodo("Este es un ejemplo de lo que puede ser una cadena de texto, en este caso estamos hablando de la linea numero "+i));
		}
		tpo2 = System.currentTimeMillis();
		rop = rop.balanceado();
		tpo3 = System.currentTimeMillis();
		huella = 0;
		for(int i = 0; i < rop.getLongitud(); i++) {
			huella = huella*23 + rop.accesoCaracter(i);
		}
		tpo4 = System.currentTimeMillis();
		System.out.println("Concatenar: "+(tpo2
				-
				tpo1)+" mseg.");
		System.out.println("Balancear: "+(tpo3
				-
				tpo2)+" mseg.");
		System.out.println("Recorrer: "+(tpo4
				-
				tpo3)+" mseg.");
		System.out.println("Huella = "+huella);


		*/

		Nodo a = new Nodo("ABC");
		Nodo b = new Nodo("DE");
		Nodo c = new Nodo("");
		Nodo d = new Nodo("FEG");
		Nodo raiz = Nodo.concatenar(Nodo.concatenar(a,Nodo.concatenar(b,c)),d);
		raiz=raiz.balanceado();
		System.out.println(raiz.pasaString());
	}

}
