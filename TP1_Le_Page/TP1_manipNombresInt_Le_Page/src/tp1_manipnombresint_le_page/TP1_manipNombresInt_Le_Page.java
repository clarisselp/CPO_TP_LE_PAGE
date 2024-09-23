/*
 * TP1_manipNombresInt
 * TDC
 * Opération sur les entiers
 * 23 Septembre 2024
 */
package tp1_manipnombresint_le_page;

import java.util.Scanner;

/**
 *
 * @author clale
 */
public class TP1_manipNombresInt_Le_Page {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaration des variables
        int nb1;
        int nb2;
        int res_add,res_sous,res_mult;
        res_add=0;
        res_sous=0;
        res_mult=0;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n Entrer un premier nombre entier :");
        nb1=sc.nextInt(); // On demande a sc de donner le prochain entier
 
        System.out.println("\n Entrer un deuxième nombre entier :");
        nb2=sc.nextInt();
        
        res_add=nb1+nb2;
        res_sous=nb1-nb2;
        res_mult=nb1*nb2;
        System.out.println("Le resultat de l'addition est: "+res_add+"");
        System.out.println("Le resultat de l'addition est: "+res_sous+"");
        System.out.println("Le resultat de l'addition est: "+res_mult+"");
        System.out.println("Le quotient des deux nombre est: "+nb1/nb2+" et son reste est de:"+nb1%nb2+" ");
       
    }
    
}
