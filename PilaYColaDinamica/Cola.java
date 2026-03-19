package PilaYColaDinamica;
public class Cola {

    // Método para invertir cadena 
    public String invertirCadena(String cadena) {
        Pila pila = new Pila();

        // Insertar los caracteres
        for (int i = 0; i < cadena.length(); i++) {
            pila.insertar(cadena.charAt(i));
        }

        // Retirar y concatenar
        String invertida = "";
        while (!pila.vacio()) {
            invertida += pila.retirar();
        }

        return invertida;
    }
}