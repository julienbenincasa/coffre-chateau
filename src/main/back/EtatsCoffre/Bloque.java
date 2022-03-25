package main.back.EtatsCoffre;

public class Bloque extends EtatCoffre {

    private static Bloque instance;

    public static Bloque getInstance() {
        if(instance == null) {
            instance = new Bloque();
        }
        return instance;
    }
}
