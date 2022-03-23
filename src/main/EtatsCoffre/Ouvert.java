package main.EtatsCoffre;

import main.Coffre;
import main.EtatsCoffre.EtatsCoffreVIsible.Ferme;

public class Ouvert extends EtatCoffre {

    private static Ouvert instance;

    public static Ouvert getInstance() {
        if(instance == null) {
            instance = new Ouvert();
        }
        return instance;
    }

    @Override
    public void fermerCoffre(Coffre coffre) {
        coffre.setEtatCoffre(Ferme.getInstance());
    }
}
