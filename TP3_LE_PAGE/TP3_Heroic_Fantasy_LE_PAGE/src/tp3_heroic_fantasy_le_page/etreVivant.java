/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tp3_heroic_fantasy_le_page;

/**
 *
 * @author clale
 */
public interface etreVivant {
    
    void seFatiguer(); // Méthode pour fatiguer l'être vivant (par exemple en réduisant son niveau de vie)
    boolean estVivant(); // Méthode pour vérifier si l'être vivant est encore vivant
    void estAttaque(int points); // Méthode pour attaquer l'être vivant, ce qui va réduire sa vie
}
