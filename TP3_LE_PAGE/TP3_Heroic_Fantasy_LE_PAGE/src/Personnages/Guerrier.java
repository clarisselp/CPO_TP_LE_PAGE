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

    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);
        this.aCheval = aCheval;
    }

    public boolean estACheval() {
        return aCheval;
    }

    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    @Override
    public String toString() {
        // Convertir le booléen en texte : "À cheval" ou "À pied"
        String deplacement = aCheval ? "a cheval" : "a pied";
        return super.toString() + " | Deplacement : " + deplacement;
    }
}
