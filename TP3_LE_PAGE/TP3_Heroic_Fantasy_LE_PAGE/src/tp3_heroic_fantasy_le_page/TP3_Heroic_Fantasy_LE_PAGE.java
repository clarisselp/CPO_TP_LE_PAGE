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
        
        // Création des armes : 3 bâtons et 3 épées
        Baton baton1 = new Baton("Baton de Feu", 3, 7);
        Baton baton2 = new Baton("Baton de Glace", 4, 6);
        Baton baton3 = new Baton("Baton de Tonnerre", 5, 5);

        Epee epee1 = new Epee("Epee des Ombres", 6, 4);
        Epee epee2 = new Epee("Epee de Lumière", 7, 3);
        Epee epee3 = new Epee("Epee de l'Aube", 8, 2);

        // Création des personnages : 1 guerrier et 1 magicien
        Guerrier guerrier = new Guerrier("Conan", 80, false); // Guerrier à pied
        Magicien magicien = new Magicien("Merlin", 70, true); // Magicien confirmé

        // Ajout des armes au guerrier : 1 bâton et 2 épées
        guerrier.ajouterArme(baton1);
        guerrier.ajouterArme(epee1);
        guerrier.ajouterArme(epee2);

        // Faire choisir au guerrier la première épée
        guerrier.equiperArme("Epee des Ombres");

        // Ajout des armes au magicien : 2 bâtons et 1 épée
        magicien.ajouterArme(baton2);
        magicien.ajouterArme(baton3);
        magicien.ajouterArme(epee3);

        // Affichage des caractéristiques des personnages avant de les fatiguer ou attaquer
        System.out.println("\nCaractéristiques des personnages :");
        System.out.println(guerrier);
        System.out.println(magicien);

        // Fatigue du guerrier
        System.out.println("\nFatiguer le guerrier...");
        guerrier.seFatiguer();
        System.out.println("\nAprès fatigue, caractéristiques du guerrier :");
        System.out.println(guerrier);

        // Attaque du magicien contre le guerrier
        System.out.println("\nLe magicien attaque le guerrier...");
        magicien.attaquer(guerrier);

        // Affichage des caractéristiques après l'attaque
        System.out.println("\nAprès l'attaque, caractéristiques des personnages :");
        System.out.println(guerrier);
        System.out.println(magicien);
    }
}
