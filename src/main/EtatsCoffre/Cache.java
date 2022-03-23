package main.EtatsCoffre;

import main.Coffre;
import main.EtatsCoffre.EtatsCoffreVIsible.Ferme;

public class Cache extends EtatCoffre {

    private static Cache instance;

    public static Cache getInstance() {
        if(instance == null) {
            instance = new Cache();
        }
        return instance;
    }

    @Override
    public void oterLivre(Coffre coffre) {
        coffre.setEtatCoffre(Ferme.getInstance());
    }
}
