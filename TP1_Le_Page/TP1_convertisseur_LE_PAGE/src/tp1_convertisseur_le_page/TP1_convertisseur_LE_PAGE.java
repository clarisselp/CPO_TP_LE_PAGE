/*
 * TP1_convertisseur
 * TDC
 * Réalisation d'un convertisseur de températures
 * 23 Septembre 2024
 */
package tp1_convertisseur_le_page;

import java.util.Scanner;

/**
 *
 * @author clale
 */
public class TP1_convertisseur_LE_PAGE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Initialisation de la première valeur
        double v1;
        //double deg_K;
        
        //Saisi d'un nombre (temperature) par l'utilisateur
        System.out.println("\n Bonjour, saisissez une valeur :");
        v1=sc.nextDouble();
        //Saisi de la conversion que l'utilisateur souaite effectuer
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");
        
        
        //deg_K=v1+273.15;
        //System.out.println("La température en Kelvin est de: "+deg_K+" K.");
        //System.out.println("La température en Kelvin est de: "+CelciusVersKelvin(v1)+" K.");
        //System.out.println("La température en Kelvin est de: "+KelvinVersCelcius(v1)+" K.");
        //System.out.println("La température en Kelvin est de: "+FarenheitVersCelcius(v1)+" K.");
        //System.out.println("La température en Kelvin est de: "+CelciusVersFarenheit(v1)+" K.");
        //System.out.println("La température en Kelvin est de: "+KelvinVersFarenheit(v1)+" K.");
        //System.out.println("La température en Kelvin est de: "+FarenheitVersKelvin(v1)+" K.");
       
        int conversion;
        conversion = sc.nextInt();
        if (conversion==1){
            System.out.println(v1 + " degre Celsius est egal a " + CelciusVersKelvin(v1) + " degres Kelvin");
        }
       
        if (conversion==2){
            System.out.println(v1 + " degre Kelvin est egal a " + KelvinVersCelcius(v1) + " degres Celsius");
        }
       
        if (conversion==3){
            System.out.println(v1 + " degre Farenheit est egal a " + FarenheitVersCelcius(v1) + " degres Celsius");
        }
       
        if (conversion==4){
            System.out.println(v1 + " degre Celsius est egal a " + CelciusVersFarenheit(v1) + " degres Farenheit");
        }
       
        if (conversion==5){
            System.out.println(v1 + " degre Kelvin est egal a " + KelvinVersFarenheit(v1) + " degres Farenheit");
        }
       
        if (conversion==6){
            System.out.println(v1 + " degre Farenheit est egal a " + FarenheitVersKelvin(v1) + " degres Kelvin");
        }
       
    }
    public static double CelciusVersKelvin (double tCelcius) {
        double tKelvin;
        tKelvin=tCelcius+273.15;
        return tKelvin;
    }
    public static double KelvinVersCelcius (double tKelvin) {
        double tCelcius;
        tCelcius=tKelvin-273.15;
        return tCelcius;
    }
    public static double FarenheitVersCelcius (double tFarenheit) {
        double tCelcius;
        tCelcius=(tFarenheit-32)/1.8;
        return tCelcius;
    }
    public static double CelciusVersFarenheit (double tCelcius) {
        double tFarenheit;
        tFarenheit=(tCelcius*1.8)+32;
        return tFarenheit;
    }
    public static double KelvinVersFarenheit (double tKelvin) {
        double tFarenheit;
        tFarenheit=(tKelvin*1.8)-459.67;
        return tFarenheit;
    }
    public static double FarenheitVersKelvin (double tFarenheit) {
        double tKelvin;
        tKelvin=(tFarenheit+459.67)/1.8;
        return tKelvin;
    }
}
