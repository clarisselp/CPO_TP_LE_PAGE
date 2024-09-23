/*
 * TP1_convertisseur
 * TDC
 * Réalisation un convertisseur de températures
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
        double v1;
        double deg_K;
        int res_add,res_sous,res_mult;
        res_add=0;
        res_sous=0;
        res_mult=0;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n Entrer un nombre réelle :");
        v1=sc.nextDouble(); // On demande a sc de donner le prochain entier
        
        deg_K=v1+273.15;
        System.out.println("La température en Kelvin est de: "+deg_K+" K.");
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
