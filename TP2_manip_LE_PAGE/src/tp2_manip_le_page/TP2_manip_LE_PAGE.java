/*
 * TP2_manip_LE_PAGE
 * TDC
 * Manipulation des références objets pour comprendre un peu mieux les mécanismes de référence des objets
 * 20 Octobre 2024
 */
package tp2_manip_le_page;

/**
 *
 * @author clale
 */
public class TP2_manip_LE_PAGE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);

        // Affichage avant inversion
        System.out.println("Avant inversion :");
        System.out.println("Assiette 1 : " + assiette1.nbCalories);
        System.out.println("Assiette 2 : " + assiette2.nbCalories);

        // Inversion des références
        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;

        // Affichage après inversion
        System.out.println("Après inversion :");
        System.out.println("Assiette 1 : " + assiette1.nbCalories);
        System.out.println("Assiette 2 : " + assiette2.nbCalories);
        
        // Création et manipulation du tableau de Moussaka
        Moussaka[] tableauMoussaka = new Moussaka[10];

        // Remplir le tableau avec des objets Moussaka
        for (int i = 0; i < tableauMoussaka.length; i++) {
            tableauMoussaka[i] = new Moussaka(i * 100);  // Exemple : calories croissantes
        }

        // Afficher les calories de chaque Moussaka
        for (int i = 0; i < tableauMoussaka.length; i++) {
            System.out.println("Moussaka " + i + " a " + tableauMoussaka[i].nbCalories + " calories.");
        }
    }
    
}
