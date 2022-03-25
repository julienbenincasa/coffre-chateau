package main.controller;

import main.back.Coffre;

public class Controller implements I_Controller {
    private Coffre coffre = Coffre.getInstance();

    public void oterLivre() {
        coffre.oterLivre();
    }

    public void remettreLivre() {
        coffre.remettreLivre();
    }

    public void tournerChandelleVersDroite() {
        coffre.tournerChandelleVersDroite();
    }

    public void tournerChandelleVersGauche() {
        coffre.tournerChandelleVersGauche();
    }

    public void fermerCoffre() {
        coffre.fermerCoffre();
    }
}
