/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author clale
 */
public class Guerrier extends Personnage{
    
    private boolean aCheval;
    private static int nbGuerriers = 0;  // Compteur des guerriers

    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);
        this.aCheval = aCheval;
        nbGuerriers++;  // Incrémenter le compteur de guerriers
    }

    // Getter pour savoir s'il est à cheval
    public boolean estACheval() {
        return aCheval;
    }

    // Setter pour modifier l'état du cheval
    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        // Convertir le booléen en texte : "À cheval" ou "À pied"
        String deplacement = aCheval ? "à cheval" : "à pied";
        return super.toString() + " | Deplacement : " + deplacement;
    }

    // Méthode pour attaquer un autre personnage
    public void attaquer(Personnage personnage) {
        if (estVivant()) {
            int pointsDeDommage = 30;  // Le guerrier inflige 30 points de dégâts
            personnage.estAttaque(pointsDeDommage);
            System.out.println(this.getNom() + " attaque " + personnage.getNom() + " et lui inflige " + pointsDeDommage + " points de dégâts.");
        } else {
            System.out.println(this.getNom() + " ne peut pas attaquer car il est mort.");
        }
    }

    // Getter pour obtenir le nombre de guerriers créés
    public static int getNbGuerriers() {
        return nbGuerriers;
    }
}
