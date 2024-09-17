/*
 * TPO_Exercice2
 * TDC
 * Addition d'entiers
 * 17 Septembre 2024
 */
package exo2;

/**
 *
 * @author clale
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaration des variables
        int nb; //nombre d'entiers à additioner
        int result;//resultat
        int ind;//indice
        nb=5;
        result=0;
        
        //Addition des nb primiers entiers
        ind=1;
        while(ind<=nb){
            result=result+ind;
        }
        //Affichage du resultat
        System.out.println();
        System.out.println("La somme des "+ nb + "entiers est: "+result);
    }
    
}
