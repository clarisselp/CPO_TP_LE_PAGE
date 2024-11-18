/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author clale
 */
public abstract class Arme {
    private String nom;
    private int nivAtt;
    
    // Constructeur de la classe Arme
    public Arme(String nom, int nivAtt) {
        this.nom = nom;
        this.nivAtt = Math.min(nivAtt, 100);  // Assure que niveauAttaque <= 100
    }

    // Getter pour le niveau d'attaque
    public int getNiveauAttaque() {
        return nivAtt;
    }
    
    // Getter pour le nom de l'arme
    public String getNom() {
        return nom;
    }

    // Redéfinition de la méthode toString pour afficher les informations de l'arme
    @Override
    public String toString() {
        return "Arme : " + nom + " | Niveau d'attaque : " + nivAtt;
    }
    
}
