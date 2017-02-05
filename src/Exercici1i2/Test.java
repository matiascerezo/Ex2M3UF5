package Exercici1i2;

import Exercicis3i4.Cercle;
import Exercicis3i4.ManipularFigures;
import Exercicis3i4.Figura;
import Exercicis3i4.PilaGenerica;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Matias
 */
public class Test {

    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        PilaGenerica<Integer> pila = new PilaGenerica<>();
        PilaGenerica<Figura> figures = new PilaGenerica<>();
        ManipularFigures mf = new ManipularFigures();
        
        //Afegir Pila
        pila.afegir(1);
        pila.afegir(2); //Afegim un més, per poder veure després amb el pila.toArray
                        //Perque si afegim un i treiem un altre, veurem després l'array buit.
        //Treure pila
        System.out.println("Treure objecte de pila: " + pila.treure());
        //Mida de la pila
        System.out.println("Mida de la pila: " + pila.mida());
        //Passar a array la pila
        System.out.println("Passar a array la pila: " + Arrays.toString(pila.toArray(Integer.class)));
        //Buidar pila
        pila.buidar();
        System.out.println();

        //Afegim cercles.
            figures.afegir(new Cercle(new Random().nextInt(10), "1"));
            figures.afegir(new Cercle(new Random().nextInt(10), "1"));
            figures.afegir(new Cercle(new Random().nextInt(10), "1"));
            

        //Formatem la sortida 
        DecimalFormat df = new DecimalFormat("#.##");
        //Mitaja perímetres
        System.out.println("Mitjana perímetres");
        System.out.println(df.format(mf.mitjanaPerimetres(figures)) + " cm");
        
        Figura[] figuresArray = figures.toArray(Figura.class);
        
        //Array desordenat
        System.out.println("\nArray desordenat: ");
        System.out.println(Arrays.toString(figuresArray));
        
        mf.arrayOrdenat(figuresArray);
        
        //Array ordenat
        System.out.println("\nArray ordenat de menor a major: ");
        System.out.println(Arrays.toString(figuresArray));
    }
}
