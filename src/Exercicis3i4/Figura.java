/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicis3i4;

/**
 *
 * @author Matias
 */
public abstract class Figura implements Comparable<Figura> {

    private String nom;

    /**
     * Constructor de figura
     *
     * @param nom
     */
    public Figura(String nom) {
        this.nom = nom;
    }

    public Figura() {
    }

    /**
     * Mètode per obtenir el nom
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     * Mètode per modificar el nom
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Metode abstracte que calculará l'area
     *
     * @return
     */
    public abstract double calcularArea();

    /**
     * Metode abstracte que calculará el perimetre
     *
     * @return
     */
    public abstract double calcularPerimetre();

    /**
     * Metode sobreescrit que s'utilitza per comparar una Figura actual amb una
     * que li arriba per parametre. Retorna un numero.
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(Figura o) {
        double areaObjecteActual = this.calcularArea(), areaObjecteParametre = o.calcularArea();
        return areaObjecteActual > areaObjecteParametre ? 1
                : areaObjecteActual == areaObjecteParametre ? 0 : -1;
    }

    /**
     * Mètode toString per la sortida per pantalla.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Figura{" + "nom=" + nom + '}';
    }
}
