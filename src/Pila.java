import java.util.ArrayList;

/**
 *
 * @author Iván Castaño Fernández
 * @author Óscar Fernández Angulo
 *
 */
public class Pila<E> {
    ArrayList<E> elementos;

    public Pila() {
        elementos = new ArrayList<>();
    }

    public void insertar(E elemento) {
        elementos.add(elemento);
    }

    public E extraer() {
        if (this.estaVacia()) {
            return null;
        } else {
            return elementos.remove(elementos.size()-1);
        }
    }
    public boolean estaVacia(){
        return this.elementos.isEmpty();
    }
}