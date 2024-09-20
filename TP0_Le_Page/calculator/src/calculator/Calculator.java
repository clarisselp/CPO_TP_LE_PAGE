/*
 * TPO_calculator
 * TDC
 * Addition d'entiers
 * 20 Septembre 2024
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author clale
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator: 1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
        int operateur;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        operateur=sc.nextInt();
        
        int operateur1;
        //Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        operateur1=sc.nextInt();
        
        int operateur2;
        //Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        operateur2=sc.nextInt();
    }
    
}
