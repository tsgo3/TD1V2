package Exo3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Arbre<Entier> f1 = new Feuille<>(new Entier(1));
        final Arbre<Entier> f2 = new Feuille<>(new Entier(2));
        final Arbre<Entier> n1 = new Noeud<>(List.of(f1,f2));
        final Arbre<Entier> f3 = new Feuille<>(new Entier(3));
        final Arbre<Entier> n2 = new Noeud<>(List.of(n1,f3));

        System.out.println(n2.contient(new Entier(4)));
        System.out.println(n2.contient(new Entier (1)));
        System.out.println(n2.taille());
        System.out.println(n2.valeurs());

        System.out.println(f2.valeurs());
        System.out.println(f2.taille());
        System.out.println(f2.contient(new Entier(3)));
        System.out.println(f2.contient(new Entier(2)));




        final Arbre<Chaine> f4 = new Feuille<Chaine>(new Chaine("1"));
        final Arbre<Chaine> f5 = new Feuille<Chaine>(new Chaine("2"));
        final Arbre<Chaine> n3 = new Noeud<>(List.of(f1,f2));
        final Arbre<Chaine> f6 = new Feuille<Chaine>(new Chaine("3"));
        final Arbre<Chaine> n4 = new Noeud<>(List.of(n1,f3));

        System.out.println(n4.contient(new Chaine("4")));
        System.out.println(n4.contient(new Chaine ("1")));
        System.out.println(n4.taille());
        System.out.println(n4.valeurs());

        System.out.println(f5.valeurs());
        System.out.println(f5.taille());
        System.out.println(f5.contient(new Chaine("3")));
        System.out.println(f5.contient(new Chaine("2")));
    }
}