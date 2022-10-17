package Exo3;

public class Chaine implements Sommable<Chaine> {
    //valeur de l'objet
    public String a;

    public Chaine(String a)
    {
        this.a=a;
    }

    @Override
    public Chaine sommer(Chaine t) {
        return new Chaine(this.a + t.a);

    }
}
