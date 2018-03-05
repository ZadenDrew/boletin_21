package boletin_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


/**
 *
 * @author andrea
 */
public class EscribeFichero {

    PrintWriter pw = null;
    String linea = null;
    File fich = new File("palabras.txt");

    public EscribeFichero() {

    }

    public void escribe() {
        try {
            pw = new PrintWriter(new FileOutputStream(fich, true));
            for (int i = 0; i < Boletin_21.lista.size(); i++) {
              //  linea = lista.get(i + 1);
                pw.println((i + 1) + "º -> " + Boletin_21.lista.get(i));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado.....\n");
        } finally {

            pw.close();
        }
    }
}
