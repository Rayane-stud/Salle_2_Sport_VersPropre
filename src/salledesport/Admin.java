/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salledesport;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Admin extends Utilisateur {

    //Constructeur Admin
    
    public Admin(String idMail, String mdp) {
       
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
    
    
    
    public Cours creerUnCoursFutur() {
        int id = 0,c;
        String activite;
        String dateHeure;
        String typeCours = "collectif"; // indiv/collectif
        int nombreDePlaces;
        Cours B;
    Scanner S = new Scanner(System.in);
    Scanner I = new Scanner(System.in);

    
    System.out.println("Veuillez rentre l'activite : ");
    activite = S.nextLine();
    System.out.println("Veuillez rentre la date et l'heure : ");
    dateHeure = S.nextLine();
    System.out.println("Veuillez rentre le typ de cours : ");
    System.out.println("1: individuel , 2: collectif");
                c = I.nextInt();
                switch(c) {
            
                    case 1: // individuel
                        typeCours = "individuel";
                        break;
                 
                    case 2: // collectif
                        typeCours = "collectif";
                        break;
                    default:
                        System.out.println("Type non valide.");    
                    }
    System.out.println("Veuillez rentre le nombre de place : ");
    nombreDePlaces = I.nextInt();
    B = new Cours(id,activite,dateHeure,typeCours,nombreDePlaces);
    
    return B;
    }
    
    
    public void modifierUnCoursFutur() {}
    public void consulterListeCoursParActivite() {}
    public void verifierCoursPlusPopulaires() {}
    public void verifierCoursMoinsPopulaires() {}
    public void sauvegarder() {}
    public void charger() {}
    
    
}
