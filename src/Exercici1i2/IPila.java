package Exercici1i2;

/**
 *
 * @author Matias
 * @param <T>
 */
public interface IPila<T> {

    /**
     * Mètode que afegeix tipus genèric a la pila.
     *
     * @param t
     */
    public void afegir(T t);

    /**
     * Mètode que retorna un genèric i l'elimina de la pila.
     *
     * @return
     */
    public T treure();

    /**
     * Mètode que buida la pila.
     */
    public void buidar();

    /**
     * Metode que retorna la mida de la pila.
     *
     * @return
     */
    public int mida();

    /**
     * Mètode que converteix una pila genèrica a un array genèric.
     *
     * @param t
     * @return
     */
    public T[] toArray(Class<T> t);

}
