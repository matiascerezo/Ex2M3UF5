package Exercici1;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 *
 * @author Matias
 */
public class Test {

    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        
        Element e = new Element(1,"Hola");
        InfoClasse ic = new InfoClasse(e);
//        System.out.println(ic.obtenirSuperClass() + " -------> Obtenir SuperClasse");
//        System.out.println(ic.obtenirClasseCompleta() + "  -------> Obtenir Classe Completa");
//        System.out.println(ic.obtenirNomesClasse() + " -------> Obtenir nomes classe");
//        System.out.println(Arrays.toString(ic.arrayAtribsField()) + " -------> Array atribs field");
        //System.out.println(Arrays.toString(ic.arrayMetodes()) + " -------> Array mètodes");
//        System.out.println(Arrays.toString(ic.arrayNomAtributs()) + " -------> Array nom atribus");
//        System.out.println(Arrays.toString(ic.arrayNomMetodes()) + " -------> Array nom metodes");
        System.out.println(e);
        Element et = (Element) ic.clonarObjecte(e);
        System.out.println(et.toString());
        
    }

}
