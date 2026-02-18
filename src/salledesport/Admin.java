/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salledesport;

/**
 *
 * @author gabri
 */
public class Admin extends Utilisateur {

    //Constructeur Admin
    
    public Admin(String idMail, String mdp) {
        super(idMail, mdp);
    }
    // Hérite des attributs de Utilisateur oui 
  
    // Méthodes Admin (void)
    public void consulterComptesClients() {}
    public void rechercheClient() {}
    public void reactiverAbonnement() {}
    public void desactiverAbonnement() {}
    public void consulterListeCoursPasses() {}
    public void consulterListeCoursFuturs() {}
    public void supprimerUnCoursFutur() {}
    public void creerUnCoursFutur() {}
    public void modifierUnCoursFutur() {}
    public void consulterListeCoursParActivite() {}
    public void verifierCoursPlusPopulaires() {}
    public void verifierCoursMoinsPopulaires() {}
    public void sauvegarder() {}
    public void charger() {}
    
    
}
