/*
 * TP2_convertisseurObjet_LE_PAGE
 * TDC
 * réalisation d'un convertisseur de températures en version objet
 * 16 Octobre 2024
 */
package tp2_convertisseurobjet_le_page;

import java.util.Scanner;

/**
 *
 * @author clale
 */
public class TP2_convertisseurObjet_LE_PAGE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

// Création d'un objet de type Convertisseur
        Convertisseur convertisseur = new Convertisseur();

        // Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);
        int choix;
        boolean continuer = true;

        // Boucle pour afficher le menu tant que l'utilisateur ne choisit pas de quitter
        while (continuer) {
            System.out.println("\nMenu de conversion :");
            System.out.println("1. Convertir Celsius vers Kelvin");
            System.out.println("2. Convertir Kelvin vers Celsius");
            System.out.println("3. Convertir Fahrenheit vers Celsius");
            System.out.println("4. Convertir Celsius vers Fahrenheit");
            System.out.println("5. Convertir Kelvin vers Fahrenheit");
            System.out.println("6. Quitter");
            System.out.print("Veuillez choisir une option (1-6) : ");
            choix = scanner.nextInt();

            double temp;  // Température saisie par l'utilisateur
            double resultat;  // Résultat de la conversion

            switch (choix) {
                case 1:
                    System.out.print("Entrez la température en Celsius : ");
                    temp = scanner.nextDouble();
                    resultat = convertisseur.CelciusVersKelvin(temp);
                    System.out.println(temp + " Celsius = " + resultat + " Kelvin");
                    break;

                case 2:
                    System.out.print("Entrez la température en Kelvin : ");
                    temp = scanner.nextDouble();
                    resultat = convertisseur.KelvinVersCelcius(temp);
                    System.out.println(temp + " Kelvin = " + resultat + " Celsius");
                    break;

                case 3:
                    System.out.print("Entrez la température en Fahrenheit : ");
                    temp = scanner.nextDouble();
                    resultat = convertisseur.FarenheitVersCelcius(temp);
                    System.out.println(temp + " Fahrenheit = " + resultat + " Celsius");
                    break;

                case 4:
                    System.out.print("Entrez la température en Celsius : ");
                    temp = scanner.nextDouble();
                    resultat = convertisseur.CelciusVersFarenheit(temp);
                    System.out.println(temp + " Celsius = " + resultat + " Fahrenheit");
                    break;

                case 5:
                    System.out.print("Entrez la température en Kelvin : ");
                    temp = scanner.nextDouble();
                    resultat = convertisseur.KelvinVersFarenheit(temp);
                    System.out.println(temp + " Kelvin = " + resultat + " Fahrenheit");
                    break;

                case 6:
                    // Afficher le nombre total de conversions avant de quitter
                    System.out.println("Nombre total de conversions effectuées : " + convertisseur.toString());
                    continuer = false;
                    break;

                default:
                    System.out.println("Option invalide, veuillez réessayer.");
            }
        }
        // Fermeture du scanner pour éviter les fuites de ressources
        scanner.close();
    }
}
