package Exo3;

import java.util.Set;

public interface Arbre <T> {
    int taille();
    boolean contient(final T val);
    Set<T> valeurs();

    /*Integer somme();*/
}
