package main;

import main.EtatsCoffre.Cache;
import main.EtatsCoffre.EtatCoffre;

public class Coffre implements I_CoffreChateau{
    private EtatCoffre etatCoffre = new Cache();

    private Boolean lapin = false;

    private Boolean chien = false;

    @Override
    public void oterLivre() {
        etatCoffre.oterLivre(this);
    }

    @Override
    public void remettreLivre() {
        etatCoffre.remettreLivre(this);
    }

    @Override
    public void tournerChandelleVersDroite() {
        etatCoffre.tournerChandelleVersDroite(this);
    }

    @Override
    public void tournerChandelleVersGauche() {
        etatCoffre.tournerChandelleVersGauche(this);
    }

    @Override
    public void fermerCoffre() {
        etatCoffre.fermerCoffre(this);
    }

    @Override
    public boolean lapinEstLibere() {
        return lapin;
    }

    @Override
    public boolean chienEstLibere() {
        return chien;
    }

    @Override
    public String nomEtat() {
        return etatCoffre.getClass().getSimpleName();
    }

    public void setEtatCoffre(EtatCoffre etatCoffre) {
        this.etatCoffre = etatCoffre;
    }

    public void setLapin(Boolean lapin) {
        this.lapin = lapin;
    }

    public void setChien(Boolean chien) {
        this.chien = chien;
    }
}
