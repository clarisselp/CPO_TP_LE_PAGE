/*
 * TP2_convertisseurObjet_LE_PAGE
 * TDC
 * réalisation d'un convertisseur de températures en version objet
 * 16 Octobre 2024
 */
package tp2_convertisseurobjet_le_page;

/**
 *
 * @author clale
 */
public class TP2_convertisseurObjet_LE_PAGE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Création du premier objet de type Convertisseur
        Convertisseur convertisseur1 = new Convertisseur();

        // Exécuter quelques conversions avec le premier objet
        double tempC1 = 25.0;
        double tempK1 = convertisseur1.CelciusVersKelvin(tempC1);
        System.out.println(tempC1 + " Celsius = " + tempK1 + " Kelvin");

        double tempF1 = convertisseur1.CelciusVersFarenheit(tempC1);
        System.out.println(tempC1 + " Celsius = " + tempF1 + " Farenheit");

        double tempCFromF1 = convertisseur1.FarenheitVersCelcius(tempF1);
        System.out.println(tempF1 + " Farenheit = " + tempCFromF1 + " Celsius");

        // Afficher le nombre de conversions effectuées par le premier objet
        System.out.println("Nombre de conversions effectuées par le premier convertisseur : " + convertisseur1.toString());

        // Création du second objet de type Convertisseur
        Convertisseur convertisseur2 = new Convertisseur();

        // Exécuter quelques conversions avec le second objet
        double tempK2 = 300.0;
        double tempC2 = convertisseur2.KelvinVersCelcius(tempK2);
        System.out.println(tempK2 + " Kelvin = " + tempC2 + " Celsius");

        double tempF2 = convertisseur2.KelvinVersFarenheit(tempK2);
        System.out.println(tempK2 + " Kelvin = " + tempF2 + " Farenheit");

        // Afficher le nombre de conversions effectuées par le second objet
        System.out.println("Nombre de conversions effectuées par le second convertisseur : " + convertisseur2.toString());
    }   
}
