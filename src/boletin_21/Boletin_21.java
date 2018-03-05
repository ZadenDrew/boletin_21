package boletin_21;

import java.util.ArrayList;

/**
 *
 * @author andrea
 */
public class Boletin_21 {

    static String linea;
    static ArrayList<String> lista;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EscribeFichero escribe = new EscribeFichero();
        Metodos met = new Metodos();
        met.pedirDatos();
        met.ordenarArray();
        escribe.escribe();
    }

}
