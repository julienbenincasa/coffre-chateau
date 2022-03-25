package main.back.EtatsCoffre.EtatsCoffreVIsible;

import main.back.Coffre;
import main.back.EtatsCoffre.Bloque;
import main.back.EtatsCoffre.Cache;
import main.back.EtatsCoffre.EtatCoffre;

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
