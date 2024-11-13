/*
 * TP3_Heroic_Fantasy_LE_PAGE
 * TDC
 * création des armes de 2 types - l’épée et le bâton, que tous les personnages peuvent 
utiliser avec plus ou moins d’efficacité – et des personnages de 2 types : un magicien et un guerrier. Chaque 
classe de personnage a son arme de prédilection. Utilisatuin de l’héritage simple pour avoir un modèle le plus pertinent et extensible possible.
 * 23 Octobre 2024
 */
package tp3_heroic_fantasy_le_page;

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
        
        // Création des épées avec des paramètres différents
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);

        // Création des bâtons avec des paramètres différents
        Baton chene = new Baton("Chene", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        // Affichage des informations des objets créés
        System.out.println(excalibur);
        System.out.println(durandal);
        System.out.println(chene);
        System.out.println(charme);
        
        // Création d'un ArrayList pour stocker les armes
        ArrayList<Arme> armes = new ArrayList<Arme>(); 
    
        // Ajout des armes dans le tableau dynamique
        armes.add(excalibur);
        armes.add(durandal);
        armes.add(chene);
        armes.add(charme);

        // Affichage des caractéristiques de chaque arme en parcourant le Vector
        for (int i = 0; i < armes.size(); i++) {
            System.out.println(armes.get(i));
        }
        

    }
    
}
