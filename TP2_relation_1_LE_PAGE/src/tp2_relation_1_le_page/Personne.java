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
public class Personne {
    
    String Nom;
    String Prenom;
    Voiture[] liste_voitures;  // Tableau de voitures (max 3)
    int nbVoitures;  // Nombre de voitures possédées
    
    // Constructeur pour initialiser nom et prenom
    public Personne(String Nom,String Prenom) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.liste_voitures = new Voiture[3];  // Capacité de 3 voitures maximum
        this.nbVoitures = 0;  // Aucun véhicule au départ
    }
    
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
        
        // Vérifier si la voiture a déjà un propriétaire
        if (voiture_a_ajouter.proprietaire != null) {
            System.out.println("Erreur: La voiture appartient deja a " + voiture_a_ajouter.proprietaire.Nom);
            return false;
        }

        // Vérifier si le tableau est plein (nombre max de voitures = 3)
        if (nbVoitures >= 3) {
            System.out.println("Erreur: " + this.Prenom + " possede deja 3 voitures.");
            return false;
        }
        
        // Ajouter la voiture au tableau
        liste_voitures[nbVoitures] = voiture_a_ajouter;
        voiture_a_ajouter.proprietaire = this;  // Définir la personne comme propriétaire de la voiture
        nbVoitures++;  // Incrémenter le nombre de voitures

        return true;  // Retourner true si tout s'est bien passé
    }

    
    // Méthode toString pour afficher les détails de la personne, y compris les voitures possédée
    @Override
    public String toString() {
        return "Prénom: " + Prenom + ", Nom: " + Nom;
    }
}
