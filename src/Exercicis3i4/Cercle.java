
package Exercicis3i4;

/**
 *
 * @author Matias
 */
public class Cercle extends Figura {

    double radi;

    public Cercle(double radi, String nom) {
        super(nom);
        this.radi = radi;
    }

    /**
     * Calcula el perimetre i el retorna
     *
     * @return
     */
    @Override
    public double calcularPerimetre() {
        return 2 * Math.PI * radi;
    }

    /**
     * Calcula l'àrea i la torna
     *
     * @return
     */
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radi, 2);
    }

    /**
     * Set radi
     * @param radi 
     */
    public void setRadi(double radi) {
        this.radi = radi;
    }

    /**
     * Get radi
     * @return 
     */
    public double getRadi() {
        return radi;
    }

    /**
     * Mètode toString per imprimir per pantalla
     * @return 
     */
    @Override
    public String toString() {
        return "Cercle{" + "Radi = " + radi + " cm" +'}';
    }
}