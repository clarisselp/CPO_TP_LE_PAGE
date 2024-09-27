/*
 * TP1_guessMyNumber
 * TDC
 * Réalisation d'un jeu de type « Guess My Number » : un nombre aléatoire est 
choisi, l’utilisateur doit le deviner.
 * 27 Septembre 2024
 */
package tp1_guessmynumber_le_page;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author clale
 */
public class TP1_guessMyNumber_LE_PAGE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        //int n = generateurAleat.nextInt(100);
        int nb1;
        int mode;
        int cpt;
        cpt=1;
        
        System.out.println("\n Choisir le niveau de difficulté 1,2 ou 3 :");
        System.out.println("\n 1)Facile :");
        System.out.println("\n 2)Normal");
        System.out.println("\n 3)Difficile");
        mode=sc.nextInt();
        
        //System.out.println("\n Entrer un nombre entier entre 0 et 100 :");
        //nb1=sc.nextInt();
        //int n1 = generateurAleat.nextInt(100);
        //int n2 = generateurAleat.nextInt(100);
        //int n3 = generateurAleat.nextInt(100);
        //int n4 = generateurAleat.nextInt(100);
        //int n5 = generateurAleat.nextInt(100);
        //System.out.println("Les nombres sont: "+n1+", "+n2+", "+n3+", "+n4+","+n5+"");
        
        if (mode==1){
            int n = generateurAleat.nextInt(20);
            System.out.println("\n Entrer un nombre entier entre 0 et 20 :");
            nb1=sc.nextInt();
            while(n!=nb1){
                if (n<nb1){
                    System.out.println("trop grand");
                }
                if (n>nb1){
                    System.out.println("trop petit");
                }
                System.out.println("\n Entrer un nouvedau nombre entier entre 0 et 20 :");
                nb1=sc.nextInt();
                cpt=cpt+1;
            }
            if (n==nb1){
                System.out.println("gagné");
                System.out.println("nombre de tentative effectuée:"+cpt+"");
            }
        }
        if (mode==2){
            int n = generateurAleat.nextInt(50);
            System.out.println("\n Entrer un nombre entier entre 0 et 50 :");
            nb1=sc.nextInt();
            while(n!=nb1){
                if (n<nb1){
                    System.out.println("trop grand");
                }
                if (n>nb1){
                    System.out.println("trop petit");
                }
                System.out.println("\n Entrer un nouvedau nombre entier entre 0 et 50 :");
                nb1=sc.nextInt();
                cpt=cpt+1;
            }
            if (n==nb1){
                System.out.println("gagné");
                System.out.println("nombre de tentative effectuée:"+cpt+"");
            }
        }
        if (mode==3){
            int n = generateurAleat.nextInt(100);
            System.out.println("\n Entrer un nombre entier entre 0 et 100 :");
            nb1=sc.nextInt();
            while(n!=nb1){
                if (n<nb1){
                    System.out.println("trop grand");
                }
                if (n>nb1){
                    System.out.println("trop petit");
                }
                System.out.println("\n Entrer un nouvedau nombre entier entre 0 et 100 :");
                nb1=sc.nextInt();
                cpt=cpt+1;
            }
            if (n==nb1){
                System.out.println("gagné");
                System.out.println("nombre de tentative effectuée:"+cpt+"");
            }
        }
    }
    
}
