/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salledesport;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Cours {
    private int id;
    private String activite;
    private String dateHeure;
    private String typeCours; // indiv/collectif
    private int nombreDePlaces;
    
    // Liste des clients inscrits à ce cours
    private ArrayList<Client> listeClientsInscrits = new ArrayList<>();
    
    // COnstructeur Cours
    public Cours(int id, String activite, String dateHeure, String typeCours, int nombreDePlaces){
        this.activite = activite;
        this.dateHeure = dateHeure;
        this.typeCours = typeCours;
        this.id = id;
        this.nombreDePlaces = nombreDePlaces;
        
        
    }
}