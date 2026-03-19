package pilaycoladinamica;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cola cola = new Cola();

        System.out.print("Ingresa una cadena: ");
        String cadena = sc.nextLine();

        String invertida = cola.invertirCadena(cadena);

        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + invertida);
    }
}