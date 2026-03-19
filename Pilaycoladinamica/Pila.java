package Pilaycoladinamica;
public class Pila {

    // Clase Nodo interna
    private class Nodo {
        char dato;
        Nodo siguiente;

        public Nodo(char dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo tope;

    // Constructor
    public Pila() {
        tope = null;
    }

    // Insertar (push)
    public void insertar(char dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    // Retirar (pop)
    public char retirar() {
        if (vacio()) {
            System.out.println("La pila está vacía");
            return '\0';
        }
        char dato = tope.dato;
        tope = tope.siguiente;
        return dato;
    }

    // Verificar si está vacía
    public boolean vacio() {
        return tope == null;
    }

    // Mostrar pila
    public void mostrar() {
        Nodo aux = tope;
        while (aux != null) {
            System.out.print(aux.dato + " -> ");
            aux = aux.siguiente;
        }
        System.out.println("NULL");
    }
}