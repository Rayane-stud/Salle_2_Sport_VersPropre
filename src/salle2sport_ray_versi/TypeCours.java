/*
Vignes Gabriel
Ouchiha Rayane
Groupe CB
 */
package salle2sport_ray_versi;

/**
 * Enumération des types de cours proposés dans la salle de sport.
 * Associée à chaque cours lors de sa création par l'administrateur.
 * Permet de catégoriser et filtrer les cours par discipline.
 * Stockée sous forme de String dans les fichiers de sauvegarde via .toString() / .valueOf().
 * 
 * @author rayan
 */
public enum TypeCours {
    CARDIO,       
    MUSCULATION,  
    YOGA,         
    CROSSFIT      
}