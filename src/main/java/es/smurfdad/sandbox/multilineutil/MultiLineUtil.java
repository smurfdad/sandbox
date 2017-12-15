package es.smurfdad.sandbox.multilineutil;

import static java.util.Objects.nonNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Utilidad para gestionar textos multilinea de tamaño fijo.
 */
public class MultiLineUtil {

    public static List<String> toMultiLine(String texto, int tamano) {
        assert tamano > 0;
        List<String> out = null;
        if (nonNull(texto)) {
            out = new ArrayList<>();
        }
        return out;
    }
}
