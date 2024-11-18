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
public class Baton extends Arme {
    
    // Attribut propre à Baton
    private int age;

    // Constructeur pour Baton
    public Baton(String nom, int nivAtt, int age) {
        super(nom, nivAtt);  // Appelle le constructeur de la classe parente Arme
        this.age = Math.min(age, 100);  // Limite l'âge à 100 max
    }

    // Getter pour l'âge
    public int getAge() {
        return age;
    }

    // Redéfinition de la méthode toString pour inclure l'âge
    @Override
    public String toString() {
        return super.toString() + " | Age : " + age;
    }
    
}
