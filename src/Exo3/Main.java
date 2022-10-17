package Exo3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Arbre f1 = new Feuille(1);
        final Arbre f2 = new Feuille(2);
        final Arbre n1 = new Noeud(List.of(f1,f2));
        final Arbre f3 = new Feuille(3);
        final Arbre n2 = new Noeud(List.of(n1,f3));
    }
}