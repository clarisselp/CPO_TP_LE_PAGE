/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import java.util.ArrayList;
import Armes.Arme;

/**
 *
 * @author clale
 */
public abstract class Personnage {
    
    private String nom;
    private int niveauVie;
    private ArrayList<Arme> armes;

    // Constructeur pour initialiser le nom et le niveau de vie
    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        this.armes = new ArrayList<>();
    }

    // Getter pour le niveau de vie
    public int getNiveauVie() {
        return niveauVie;
    }

    // Getter pour le nom
    public String getNom() {
        return nom;
    }
    
    // Méthode pour ajouter une arme
    public void ajouterArme(Arme arme) {
        if (armes.size() < 5) { // Vérifie si le personnage a moins de 5 armes
            armes.add(arme);
            System.out.println("L'arme " + arme.getNom() + " a été ajoutée à " + nom + ".");
        } else {
            System.out.println("Le personnage " + nom + " ne peut pas porter plus de 5 armes.");
        }
    }

    // Getter pour accéder à la liste des armes
    public ArrayList<Arme> getArmes() {
        return armes;
    }

    // Redéfinition de la méthode toString pour afficher les informations du personnage
    @Override
    public String toString() {
        return "Personnage : " + nom + " | Niveau de vie : " + niveauVie;
    }
}
