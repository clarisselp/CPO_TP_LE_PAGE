/*
 * TP2_relation_1_LE_PAGE
 * TDC
 * Mettre en place une relation simple entre deux ou plusieurs objets
 * 23 Octobre 2024
 */
package tp2_relation_1_le_page;

/**
 *
 * @author clale
 */
public class Voiture {
    
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne proprietaire;
    
    // Constructeur pour initialiser nom et prenom
    public Voiture(String Modele,String Marque,int PuissanceCV) {
        this.Modele = Modele;
        this.Marque = Marque;
        this.PuissanceCV = PuissanceCV;
        this.proprietaire = null;
    }
    
    @Override
    public String toString () {
        return "Modele : " +Modele+" Marque:"+Marque+" PuissanceCV:"+PuissanceCV;
    }
    
}
