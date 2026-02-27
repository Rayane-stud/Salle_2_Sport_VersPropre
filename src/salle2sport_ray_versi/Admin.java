/*
Vignes Gabriel
Ouchiha Rayane
Groupe CB
 */
package salle2sport_ray_versi;

/**
 *
 * @author rayan
 */
public class Admin extends Utilisateur {
    // Aucun Attribut supplémentaire a ceux qu'elle herite de la classe utilisateur 
    
    //Constructeur : 
 
    public Admin(String identifiant, String motDePasse) {
        super(identifiant, motDePasse);  // appelle le constructeur de Utilisateur
}
    
    // Herite des methodes de Utilisateurs
    // la logique est centralisée dans la classe salle, pas besoin d'autres methodes ici
    // Classe pouvant etre enrichie si l'on voulait plusieurs admin avec plusieurs types d'acces
    
}
