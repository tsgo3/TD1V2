package Exo3;

public class Entier implements Sommable<Entier>{

    //valeur de l'objet
    public int a;

    public Entier(int a)
    {
        this.a=a;
    }

    @Override
    public Entier sommer(Entier t) {
        return new Entier(this.a + t.a);
    }
}
