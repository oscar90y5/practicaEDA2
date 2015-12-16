import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Iván Castaño Fernández
 * @author Óscar Fernández Angulo
 *
 */

/**
 * Pila generica
 * @param <E> tipo generico utilizado en la pila.
 */
public class Pila<E> {
    ArrayList<E> elementos;

    public Pila() {
        elementos = new ArrayList<>();
    }

    /**
     * Inserta un elemento en la pila.
     * @param elemento que queremos introducir.
     */
    public void insertar(E elemento) {
        elementos.add(elemento);
    }

    /**
     * Extrae un elemento de la pila.
     * @return elemento en la posicion mas alta de la pila.
     */
    public E extraer() {
        if (this.estaVacia()) {
            return null;
        } else {
            return elementos.remove(elementos.size()-1);
        }
    }

    /**
     * Metodo que indica si la pila esta vacia.
     * @return devuelve true si esta vacia.
     */
    public boolean estaVacia(){
        return this.elementos.isEmpty();
    }
}