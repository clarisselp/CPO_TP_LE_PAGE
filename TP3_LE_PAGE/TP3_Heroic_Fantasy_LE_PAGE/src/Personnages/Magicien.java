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
    
    private boolean confirme;

    // Constructeur pour Magicien
    public Magicien(String nom, int niveauVie, boolean confirme) {
        super(nom, niveauVie);  // Appel du constructeur de la classe parent Personnage
        this.confirme = confirme;
    }

    public boolean estConfirme() {
        return confirme;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    @Override
    public String toString() {
        // Convertir le booléen en texte : "Confirmé" ou "Novice"
        String statut = confirme ? "confirme" : "novice";
        return super.toString() + " | Statut : " + statut;
    }
}
