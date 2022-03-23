package main.EtatsCoffre.EtatsCoffreVIsible;

import main.Coffre;
import main.EtatsCoffre.Bloque;
import main.EtatsCoffre.Cache;
import main.EtatsCoffre.EtatCoffre;

public abstract class Visible extends EtatCoffre {

    @Override
    public void tournerChandelleVersGauche(Coffre coffre) {
        coffre.setEtatCoffre(Bloque.getInstance());
        coffre.setLapin(true);
    }

    @Override
    public void remettreLivre(Coffre coffre) {
        coffre.setEtatCoffre(Cache.getInstance());
        coffre.setChien(false);
    }
}
