/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bières;

/**
 *
 * @author clale
 */
public class BouteilleBiere {
    // Déclaration des attributs
    String Nom;          // Le nom de la bière
    float degreAlcool;   // Le degré d'alcool de la bière
    String brasserie;    // Le nom de la brasserie qui produit la bière
    boolean ouverte;     // Indique si la bouteille est ouverte (true) ou fermée (false)
    
    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
        Nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
}
    
    // Méthode pour lire l'étiquette de la bouteille
    public void lireEtiquette() {
        System.out.println("Bouteille de " + Nom + " (" + degreAlcool + " degrés) de la Brasserie : " + brasserie);
    }
    
    // Méthode pour décapsuler la bière
    public boolean Decapsuler() {
        if (ouverte) {
            // Si la bière est déjà ouverte, afficher un message d'erreur
            System.out.println("Erreur : bière déjà ouverte !");
            return false;  // Retourne false, car la bière était déjà ouverte
        } else {
            // Ouvrir la bière (mettre ouverte à true)
            ouverte = true;
            System.out.println("Bière " + Nom + " décapsulée !");
            return true;   // Retourne true, car la bière a été correctement décapsulée
        }
    }
    
    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = Nom + " (" + degreAlcool + " degrés)de la Brasserie : " + brasserie+" - Ouverte ? ";
        if (ouverte) {
            chaine_a_retourner += "oui";
        } else {
            chaine_a_retourner += "non";
        }
        return chaine_a_retourner;
    }

    
}
