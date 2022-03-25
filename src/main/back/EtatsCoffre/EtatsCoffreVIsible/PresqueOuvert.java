package main.back.EtatsCoffre.EtatsCoffreVIsible;

import main.back.Coffre;
import main.back.EtatsCoffre.Ouvert;

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
