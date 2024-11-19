/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author clale
 */
public class Magicien extends Personnage {
    
    private boolean confirmé;
    private static int nbMagiciens = 0;  // Compteur des magiciens

    public Magicien(String nom, int niveauVie, boolean confirmé) {
        super(nom, niveauVie);
        this.confirmé = confirmé;
        nbMagiciens++;  // Incrémenter le compteur de magiciens
    }

    // Getter pour savoir si le magicien est confirmé
    public boolean estConfirme() {
        return confirmé;
    }

    // Setter pour modifier l'état confirmé
    public void setConfirme(boolean confirmé) {
        this.confirmé = confirmé;
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        String confirmation = confirmé ? "Confirmé" : "Non confirmé";
        return super.toString() + " | Statut : " + confirmation;
    }

    // Méthode pour attaquer un autre personnage
    public void attaquer(Personnage personnage) {
        if (estVivant()) {
            int pointsDeDommage = 20;  // Le magicien inflige 20 points de dégâts
            personnage.estAttaque(pointsDeDommage);
            System.out.println(this.getNom() + " attaque " + personnage.getNom() + " et lui inflige " + pointsDeDommage + " points de dégâts.");
        } else {
            System.out.println(this.getNom() + " ne peut pas attaquer car il est mort.");
        }
    }

    // Getter pour obtenir le nombre de magiciens créés
    public static int getNbMagiciens() {
        return nbMagiciens;
    }
}
