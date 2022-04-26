import presentation.Banque;

public class Main {
    public static void main(String[] args) {
        Banque b = new Banque(50000000);
        b.chargerDonnees("data.csv");
        System.out.println();
        b.affichageCapital();
        System.out.println();
        b.afficherComptes();
        b.encaissementFrais();
        b.paiementInteret();
        b.avancerTemps(70);
        System.out.println();
        b.affichageCapital();
        System.out.println();
        b.afficherComptes();
    }
}
