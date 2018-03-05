package boletin_21;

import static boletin_21.Boletin_21.linea;
import static boletin_21.Boletin_21.lista;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author andrea
 */
public class Metodos {

    public void pedirDatos() {

        for (int i = 0; i < 5; i++) {

            linea = JOptionPane.showInputDialog("Introduzca la palabra " + (i + 1));

            lista.add(linea);

        }
    }

    public void ordenarArray() {

        Collections.sort(lista);

    }

}
