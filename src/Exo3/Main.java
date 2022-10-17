package Exo3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Arbre<Entier> f1 = new Feuille<>(1);
        final Arbre<Entier> f2 = new Feuille<>(2);
        final Arbre<Entier> n1 = new Noeud<>(List.of(f1,f2));
        final Arbre<Entier> f3 = new Feuille<>(3);
        final Arbre<Entier> n2 = new Noeud<>(List.of(n1,f3));

        System.out.println(n2.contient(4));
        System.out.println(n2.contient(1));
        System.out.println(n2.taille());
        System.out.println(n2.valeurs());

        System.out.println(f2.valeurs());
        System.out.println(f2.taille());
        System.out.println(f2.contient(3));
        System.out.println(f2.contient(2));

        /*final Arbre<Entier> f4 = new Feuille<>(1);*/
    }
}