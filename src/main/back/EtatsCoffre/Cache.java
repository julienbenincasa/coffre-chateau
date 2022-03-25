package main.back.EtatsCoffre;

import main.back.Coffre;
import main.back.EtatsCoffre.EtatsCoffreVIsible.Ferme;

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
