package Exercicis3i4;

import Exercici1i2.IPila;
import java.lang.reflect.Array;

public class PilaGenerica<T> implements IPila<T> {

    private Node node = null;
    private int mida = 0;

    /**
     * Metode que afegeix el tipus que li arriba per parametre i l'afegeix.
     *
     * @param t
     */
    @Override
    public void afegir(T t) {
        node = new Node(node, t);
        mida++;
    }

    /**
     * Metode que treu un tipus generic de la pila i torna el seu valor
     *
     * @return
     */
    @Override
    public T treure() {
        T valor = null;
        if (node != null) {
            valor = (T) node.t;
            node = node.pare;
            mida--;
        }
        return valor;
    }

    /**
     * Metode que buida la pila generica
     */
    @Override
    public void buidar() {
        node = null;
        mida = 0;
    }

    /**
     * Metode que torna la mida de la pila
     *
     * @return
     */
    @Override
    public int mida() {
        return mida;
    }

    /**
     * Mètode que li arriba un tipus generic i el retorna en array generic
     *
     * @param t
     * @return
     */
    @Override
    public T[] toArray(Class<T> t) {
        T[] llista = (T[]) Array.newInstance(t, mida);
        int x = mida;
        Node aux = node;
        while (aux != null) {
            llista[--x] = (T) aux.t;
            aux = aux.pare;
        }
        return llista;
    }

    //Clase interna Node
    private class Node<T> {

        Node pare;
        T t;

        /**
         * Constructor de node
         *
         * @param node
         * @param t
         */
        private Node(Node node, T t) {
            this.pare = node;
            this.t = t;
        }
    }
}
