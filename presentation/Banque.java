package presentation;

import java.util.HashMap;
import java.util.HashSet;

public class Banque {
    private static HashMap<String, HashSet<Compte>> listeComptes = new HashMap<>();
    private double chiffreAffaire;
    private static final String BANCAIRE = "Bancaire";
    private static final String TERME = "Terme";
    private static final String EPARGNE = "Epargne";
    private static final Double FRAIS_OUVERTURE = 13.50;


    public Banque(int chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }


    public void chargerDonnees(String path){
        
    }

    public void afficherComptes(){
        
    }

    public void encaissementFrais(){
        
    }

    public void paiementInteret(){
        
    }

    public void avancerTemps(int nbJours){
        
    }

    public void affichageChiffreAffaire(){
        
    }
}
