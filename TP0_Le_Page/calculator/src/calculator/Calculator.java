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
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
        int operateur;
        System.out.println("\n Entrer le chiffre de l'opérateur :");
        operateur=sc.nextInt();
        
        int operande1;
        System.out.println("\n Entrer le nombre 1 :");
        operande1=sc.nextInt();
        
        int operande2;
        System.out.println("\n Entrer le nombre 2 :");
        operande2=sc.nextInt();
        
        int result;
        result=0;
        
        if ((operateur<1)||(operateur>5)){
            System.out.println("L'operateur n'est pas bon");
        }else{
            if (operateur==1){
                result=operande1+operande2;
            }
            if (operateur==2){
                result=operande1-operande2;
            }
            if (operateur==3){
                result=operande1*operande2;
            }
            if (operateur==4){
                result=operande1/operande2;
            }
            if (operateur==5){
                result=operande1%operande2;
            }
        System.out.println("Le resultat est: "+result+"");
        }
    }
    
}
