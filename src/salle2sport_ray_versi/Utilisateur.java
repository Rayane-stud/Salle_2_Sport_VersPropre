/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salle2sport_ray_versi;

/**
 *
 * @author rayan
 */
public abstract class Utilisateur {
    
    // Attribut en protected pour etre accessible directement des classes filles
    protected String id_email;
    protected String motDepasse;
    
    // Constructeur 
    public Utilisateur(String id, String mdp){
        id_email = id;
        motDepasse = mdp;
    }
    
    
    
    // Getteur identifiant 
    public String getIdentifiant(){
        return id_email;
    }
    
    // Getteur mot de passe 
    public String getMot2Passe(){
        return motDepasse;
    }
    
    // Permetra de modifier un mdp
    public void setMot2passe(String mdp){
        this.motDepasse = mdp;
    }
}
