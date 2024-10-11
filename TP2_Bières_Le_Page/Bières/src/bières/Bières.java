/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bières;

/**
 *
 * @author clale
 */
public class Bières {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //BouteilleBiere uneBiere = new BouteilleBiere() ;
        // Affectation de valeurs aux attributs
        //uneBiere.Nom = "Cuvée des Trolls";      // Nom de la bière
        //uneBiere.degreAlcool = 7.0f;            // Degré d'alcool de 7.0
        //uneBiere.brasserie = "Dubuisson";       // Brasserie Dubuisson
        //uneBiere.ouverte = false;               // Statut : non ouverte
        
        // Création de la deuxième bière
        //BouteilleBiere secondeBiere = new BouteilleBiere();
        //secondeBiere.Nom = "Leffe";
        //secondeBiere.degreAlcool = 6.6f;
        //secondeBiere.brasserie = "Abbaye de Leffe";
        //secondeBiere.ouverte = false;
        //secondeBiere.lireEtiquette();  // Affichage de l'étiquette de la deuxième bière
        
        //BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;


        // Appel de la méthode lireEtiquette pour afficher les informations
        //uneBiere.lireEtiquette();
        
        // Création de la première bière en utilisant le constructeur
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des Trolls", 7.0f, "Dubuisson");
        uneBiere.lireEtiquette();  // Affichage de l'étiquette de la première bière
        
        // Test de la méthode Decapsuler sur la première bière
        System.out.println("Test de décapsulage pour Cuvée des Trolls :");
        uneBiere.Decapsuler();  // Devrait décapsuler la bière
        System.out.println(uneBiere);  // Affiche l'état après ouverture

        // Tentative de décapsuler à nouveau la même bière
        System.out.println("Tentative de décapsulage à nouveau :");
        uneBiere.Decapsuler();  // Devrait afficher une erreur

        // Création de la deuxième bière en utilisant le constructeur
        BouteilleBiere secondeBiere = new BouteilleBiere("Leffe", 6.6f, "Abbaye de Leffe");
        secondeBiere.lireEtiquette();  // Affichage de l'étiquette de la deuxième bière
        
        // Création de la troisième bière
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Heineken", 5.0f, "Heineken Brewery");
        troisiemeBiere.lireEtiquette();  // Affichage de l'étiquette de la troisième bière

        // Création de la quatrième bière
        BouteilleBiere quatriemeBiere = new BouteilleBiere("Chimay Bleue", 9.0f, "Abbaye de Scourmont");
        quatriemeBiere.lireEtiquette();  // Affichage de l'étiquette de la quatrième bière

        // Création de la cinquième bière
        BouteilleBiere cinquiemeBiere = new BouteilleBiere("Guinness", 4.2f, "St. James's Gate Brewery");
        cinquiemeBiere.lireEtiquette();  // Affichage de l'étiquette de la cinquième bière
   

    }
    
}
