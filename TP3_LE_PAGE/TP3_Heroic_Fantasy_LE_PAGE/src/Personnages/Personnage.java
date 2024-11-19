/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import java.util.ArrayList;
import Armes.Arme;
import Armes.*;
import tp3_heroic_fantasy_le_page.etreVivant;

/**
 *
 * @author clale
 */
public abstract class Personnage implements etreVivant {
    
    private String nom;
    private int niveauVie;
    private ArrayList<Arme> armes;  // Tableau dynamique pour stocker les armes
    private Arme armeEnMain;       // Arme actuellement portée par le personnage

    // Constructeur
    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        this.armes = new ArrayList<>();  // Initialisation du tableau dynamique
        this.armeEnMain = null;         // Initialisation de l'arme en main à NULL
    }

    // Getter pour le niveau de vie
    public int getNiveauVie() {
        return niveauVie;
    }

    // Getter pour le nom
    public String getNom() {
        return nom;
    }

    // Getter pour la liste des armes
    public ArrayList<Arme> getArmes() {
        return armes;
    }

    // Getter pour l'arme en main
    public Arme getArmeEnMain() {
        return armeEnMain;
    }

    // Méthode pour ajouter une arme au tableau dynamique
    public void ajouterArme(Arme arme) {
        if (armes.size() < 5) {
            armes.add(arme);
            System.out.println("Arme ajoutée : " + arme.getNom() + " au personnage " + nom);
        } else {
            System.out.println("Impossible d'ajouter l'arme : " + arme.getNom() + ". Inventaire plein !");
        }
    }

    // Méthode pour équiper une arme
    public void equiperArme(String nomArme) {
        for (Arme arme : armes) {
            if (arme.getNom().equals(nomArme)) {
                this.armeEnMain = arme;
                System.out.println(nom + " est maintenant équipé de : " + arme.getNom());
                return;
            }
        }
        System.out.println("Arme non trouvée dans l'inventaire de " + nom);
    }

    // Méthode attaquer selon les règles spécifiées
    public void attaquer(Personnage cible) {
        int degats = 0;

        // Vérification que le personnage a une arme équipée
        if (armeEnMain != null) {
            // Calcul des dégâts en fonction de l'arme et du type de personnage
            if (this instanceof Magicien && armeEnMain instanceof Baton) {
                // Magicien avec bâton : dégâts multipliés par l'âge du bâton
                degats = armeEnMain.getAttaque() * ((Baton) armeEnMain).getAge();
            } else if (this instanceof Guerrier && armeEnMain instanceof Epee) {
                // Guerrier avec épée : dégâts multipliés par la finesse de l'épée
                degats = armeEnMain.getAttaque() * ((Epee) armeEnMain).getFinesse();
            } else {
                // Dégâts normaux si l'arme ne correspond à aucun des cas ci-dessus
                degats = armeEnMain.getAttaque();
            }

            // Si le magicien est confirmé ou si le guerrier est à cheval, diviser les dégâts par 2
            if ((this instanceof Magicien && ((Magicien) this).estConfirme()) || 
                (this instanceof Guerrier && ((Guerrier) this).estACheval())) {
                degats /= 2;
            }

            // Fatigue après chaque attaque
            this.seFatiguer();

            // Infliger les dégâts à la cible
            cible.estAttaque(degats);
            System.out.println(this.getNom() + " attaque " + cible.getNom() + " et inflige " + degats + " points de dégâts.");
        } else {
            System.out.println(this.getNom() + " n'a pas d'arme pour attaquer !");
        }
    }

    // Implémentation des méthodes de l'interface EtreVivant
    @Override
    public void seFatiguer() {
        this.niveauVie -= 10; // Le personnage perd 10 points de vie après chaque fatigue
    }

    @Override
    public boolean estVivant() {
        return niveauVie > 0; // Un personnage est vivant si son niveau de vie est supérieur à 0
    }

    @Override
    public void estAttaque(int points) {
        this.niveauVie -= points; // Le personnage perd les points de vie de l'attaque
        if (niveauVie < 0) {
            niveauVie = 0; // On s'assure que la vie ne tombe pas en dessous de zéro
        }
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        String description = "Personnage : " + nom + " | Niveau de vie : " + niveauVie;
        if (armeEnMain != null) {
            description += " | Arme en main : " + armeEnMain.getNom();
        } else {
            description += " | Aucun arme en main";
        }
        return description;
    } 
    }

