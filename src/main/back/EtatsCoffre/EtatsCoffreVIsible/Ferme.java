package main.back.EtatsCoffre.EtatsCoffreVIsible;

import main.back.Coffre;

public class Ferme extends Visible {

    private static Ferme instance;

    public static Ferme getInstance() {
        if(instance == null) {
            instance = new Ferme();
        }
        return instance;
    }

    @Override
    public void tournerChandelleVersDroite(Coffre coffre) {
        coffre.setEtatCoffre(PresqueOuvert.getInstance());
        coffre.setChien(true);
    }
}
