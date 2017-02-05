package Exercici1i2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author Matias
 * @param <T>
 */
public class InfoClasse<T> {

    private Class<?> t;

    /**
     * Constructor de "InfoClasse"
     *
     * @param t
     */
    public InfoClasse(Class<?> t) {
        this.t = t;
    }

    public InfoClasse(T t) {
        this.t = t.getClass();
    }

    /**
     * Mètode per obtenir el nom de la superclasse
     *
     * @return
     */
    public String obtenirSuperClass() {
        return t.getSuperclass().getName();
    }

    /**
     * Mètode per obtenir el nom de la classe complet
     *
     * @return
     */
    public String obtenirClasseCompleta() {
        return t.getCanonicalName();
    }

    /**
     * Obtenir només el nom de la classe
     *
     * @return
     */
    public String obtenirNomesClasse() {
        return t.getSimpleName();
    }

    /**
     * Array de fields declarats
     *
     * @return
     */
    public Field[] arrayAtribsField() {
        return t.getDeclaredFields();
    }

    /**
     * Array de mètodes
     *
     * @return
     */
    public Method[] arrayMetodes() {
        return t.getDeclaredMethods();
    }

    /**
     * Array dels noms dels atributs.
     *
     * @return
     */
    public String[] arrayNomAtributs() {
        Field[] atrib = arrayAtribsField();
        String[] nomAtributs = new String[atrib.length];
        for (int i = 0; i < nomAtributs.length; i++) {
            nomAtributs[i] = atrib[i].getName();
        }
        return nomAtributs;
    }

    /**
     * Array dels noms dels mètodes.
     *
     * @return
     */
    public String[] arrayNomMetodes() {
        Method[] method = arrayMetodes();
        String[] nomMetodes = new String[method.length];
        for (int i = 0; i < nomMetodes.length; i++) {
            nomMetodes[i] = method[i].getName();
        }
        return nomMetodes;
    }

    /**
     * Crear una instància.
     *
     * @return
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public T crearInstancia() throws InstantiationException, IllegalAccessException {
        return (T) t.newInstance();
    }

    /**
     * Crear objecte clonat de la classe genèrica
     *
     * @param clon
     * @return
     * @throws java.lang.IllegalAccessException
     * @throws java.lang.reflect.InvocationTargetException
     */
    public T clonarObjecte(Cloneable clon) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method metodoClone = null;
        for (Method metodo : new InfoClasse(clon).arrayMetodes()) {
            if (metodo.getName().toUpperCase().equals("CLONE")) {
                metodoClone = metodo;
                break;
            }
        }
        return (T) metodoClone.invoke(clon, null);
    }

}
