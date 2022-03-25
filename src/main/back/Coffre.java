package main.back;

import main.back.EtatsCoffre.Cache;
import main.back.EtatsCoffre.EtatCoffre;
import main.front.FenetreChienGentil;
import main.front.FenetreEtat;
import main.front.FenetreLapinTueur;
import main.front.Observateur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coffre implements I_CoffreChateau{

    private static Coffre instance;

    private EtatCoffre etatCoffre = new Cache();

    private List<Observateur> auditeurs = new ArrayList<>(Arrays.asList(new FenetreChienGentil(), new FenetreEtat(), new FenetreLapinTueur()));

    private Boolean lapin = false;

    private Boolean chien = false;

    public static Coffre getInstance() {
        if(instance == null) {
            instance = new Coffre();
        }
        return instance;
    }

    @Override
    public void oterLivre() {
        etatCoffre.oterLivre(this);
        avertir();
    }

    @Override
    public void remettreLivre() {
        etatCoffre.remettreLivre(this);
        avertir();
    }

    @Override
    public void tournerChandelleVersDroite() {
        etatCoffre.tournerChandelleVersDroite(this);
        avertir();
    }

    @Override
    public void tournerChandelleVersGauche() {
        etatCoffre.tournerChandelleVersGauche(this);
        avertir();
    }

    @Override
    public void fermerCoffre() {
        etatCoffre.fermerCoffre(this);
        avertir();
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

    private void avertir() {
        for (Observateur auditeur:
             auditeurs) {
            auditeur.mettreAJour(this);
        }
    }
}
