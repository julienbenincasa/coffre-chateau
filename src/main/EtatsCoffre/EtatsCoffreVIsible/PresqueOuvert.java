package main.EtatsCoffre.EtatsCoffreVIsible;

import main.Coffre;
import main.EtatsCoffre.Bloque;
import main.EtatsCoffre.Cache;
import main.EtatsCoffre.Ouvert;

public class PresqueOuvert extends Visible {

    private static PresqueOuvert instance;

    public static PresqueOuvert getInstance() {
        if(instance == null) {
            instance = new PresqueOuvert();
        }
        return instance;
    }

    @Override
    public void tournerChandelleVersDroite(Coffre coffre) {
        coffre.setEtatCoffre(Ouvert.getInstance());
    }
}
