/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author clale
 */
public class Epee extends Arme {
    // Attribut propre à Epee
    private int ind_F;

    // Constructeur pour Epee
    public Epee(String nom, int nivAtt, int ind_F) {
        super(nom, nivAtt);  // Appelle le constructeur de la classe parente Arme
        this.ind_F = Math.min(ind_F, 100);  // Limite l'indice de finesse à 100 max
    }

    // Getter pour l'indice de finesse
    public int getIndiceFinesse() {
        return ind_F;
    }

    // Redéfinition de la méthode toString pour inclure l'indice de finesse
    @Override
    public String toString() {
        return super.toString() + " | Indice de finesse : " + ind_F;
    }
}
    

