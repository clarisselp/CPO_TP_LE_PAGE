/*
 * TP3_Heroic_Fantasy_LE_PAGE
 * TDC
 * création des armes de 2 types - l’épée et le bâton, que tous les personnages peuvent 
utiliser avec plus ou moins d’efficacité – et des personnages de 2 types : un magicien et un guerrier. Chaque 
classe de personnage a son arme de prédilection. Utilisatuin de l’héritage simple pour avoir un modèle le plus pertinent et extensible possible.
 * 23 Octobre 2024
 */
package tp3_heroic_fantasy_le_page;

import Armes.*;
import Personnages .*;
import java.util.ArrayList;

/**
 *
 * @author clale
 */
public class TP3_Heroic_Fantasy_LE_PAGE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Création des épées
    Epee excalibur = new Epee("Excalibur", 7, 5);
    Epee durandal = new Epee("Durandal", 4, 7);

    // Création des bâtons
    Baton chene = new Baton("Chêne", 4, 5);
    Baton charme = new Baton("Charme", 5, 6);

    // Création des personnages
    Magicien magicien = new Magicien("Gandalf", 70, false); // Magicien non confirmé
    Guerrier guerrier = new Guerrier("Aragorn", 90, true);  // Guerrier à cheval

    // Ajout des armes aux personnages
    magicien.ajouterArme(excalibur);
    magicien.ajouterArme(chene);

    guerrier.ajouterArme(durandal);
    guerrier.ajouterArme(charme);

    // Équipement des armes
    magicien.equiperArme("Chêne");  // Magicien choisit le bâton "Chêne"
    guerrier.equiperArme("Durandal"); // Guerrier choisit l'épée "Durandal"

    // Affichage initial des caractéristiques des personnages
    System.out.println("=== Caractéristiques initiales des personnages ===");
    System.out.println(magicien);
    System.out.println(guerrier);

    // Attaque du magicien sur le guerrier
    System.out.println("\n=== Le magicien attaque le guerrier ===");
    magicien.attaquer(guerrier);

    // Affichage après l'attaque du magicien
    System.out.println("\n=== Après l'attaque du magicien ===");
    System.out.println(magicien);
    System.out.println(guerrier);

    // Attaque du guerrier sur le magicien
    System.out.println("\n=== Le guerrier attaque le magicien ===");
    guerrier.attaquer(magicien);

    // Affichage après l'attaque du guerrier
    System.out.println("\n=== Après l'attaque du guerrier ===");
    System.out.println(magicien);
    System.out.println(guerrier);

    // Vérification si les personnages sont vivants
    System.out.println("\n=== Vérification si les personnages sont vivants ===");
    System.out.println(magicien.getNom() + " est " + (magicien.estVivant() ? "vivant" : "mort"));
    System.out.println(guerrier.getNom() + " est " + (guerrier.estVivant() ? "vivant" : "mort"));
}
}
