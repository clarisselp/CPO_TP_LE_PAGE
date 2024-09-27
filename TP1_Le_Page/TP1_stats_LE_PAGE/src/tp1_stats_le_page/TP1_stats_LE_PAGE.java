/*
 * TP1_stats
 * TDC
 * vérifier si la distribution de nombres du générateur de nombre aléatoire est 
bien aléatoire, en simulant un lancer de dés à répétition
 * 27 Septembre 2024
 */
package tp1_stats_le_page;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author clale
 */
public class TP1_stats_LE_PAGE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création d'un tableau de 6 entiers pour représenter les faces du dé
        int[] des = new int[6]; // Toutes les cases sont initialisées à 0

        // Création d'un scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un nombre entier m
        System.out.print("Veuillez entrer le nombre de lancers de dés (m) : ");
        int m = scanner.nextInt();

        // Générateur de nombre aléatoire
        Random random = new Random();

        // Boucle de m itérations
        for (int i = 0; i < m; i++) {
            // Tirer un nombre aléatoire entre 0 et 5
            int resultat = random.nextInt(6);
            
            // Incrémenter la case correspondant à la face du dé
            des[resultat]++;
        }
        
        // Affichage du résultat
        //System.out.println("Résultat des lancers de dés :");
        //for (int i = 0; i < des.length; i++) {
           // System.out.println("Face " + (i + 1) + " : " + des[i] + " fois");
        //}
        
        // Affichage du résultat en pourcentages
        System.out.println("Résultat des lancers de dés (en pourcentage) :");
        for (int i = 0; i < des.length; i++) {
            // Calculer le pourcentage
            double pourcentage = ((double) des[i] / m) * 100;
            // Afficher le pourcentage avec deux décimales
            System.out.printf("Face %d : %.2f%%\n", (i + 1), pourcentage);
        }
    }
    
}
