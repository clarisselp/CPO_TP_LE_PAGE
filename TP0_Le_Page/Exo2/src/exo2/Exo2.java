/*
 * TPO_Exercice2
 * TDC
 * Addition d'entiers
 * 17 Septembre 2024
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author clale
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb;//nb=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb=sc.nextInt(); // On demande a sc de donner le prochain entier
        //Declaration des variables
        
        int result;//resultat
        int ind;//indice
        nb=5;
        result=0;
        
        //Addition des nb primiers entiers
        ind=1;
        while(ind<=nb){
            ind=ind+1;
            result=result+ind;
        }
        //Affichage du resultat
        System.out.println();
        System.out.println("La somme des "+ nb + "entiers est: "+result);
    }
}

