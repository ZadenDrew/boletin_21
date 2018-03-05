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

    public Metodos() {
    }

    public void pedirDatos() {

        for (int i = 0; i < 5; i++) {

            Boletin_21.linea = JOptionPane.showInputDialog("Introduzca la palabra " + (i + 1));

            Boletin_21.lista.add(i, linea);
            System.out.println(lista.get(i));
        }
    }

    public void ordenarArray() {

        Collections.sort(lista);

    }

}
