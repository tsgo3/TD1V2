package Exo3;

public class Entier<T> implements Sommable<T>{

    T a;

    public Entier(T a)
    {
        this.a=a;
    }

    @Override
    public T sommer(T t) {
        return t;
    }
}
