package Exercicis3i4;

import java.util.Arrays;

public class ManipularFigures {

    /**
     * Mètode que li arriba una pila de figures i retorna la mitja.
     *
     * @param figura
     * @return
     */
    public double mitjanaPerimetres(PilaGenerica<Figura> figura) {
        double mitjana = 0;
        for (Figura i : figura.toArray(Figura.class)) {
            mitjana += i.calcularPerimetre();
        }
        return mitjana / figura.mida();
    }

    /**
     * Mètode que li arriba un array i el torna ordenat
     *
     * @param <T>
     * @param t
     * @return
     */
    public <T> T[] arrayOrdenat(T[] t) {
        Arrays.sort(t);
        return t;
    }

}
