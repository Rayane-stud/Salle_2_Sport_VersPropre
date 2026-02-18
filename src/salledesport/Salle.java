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
public class Salle {
    String NomSalle;
    ArrayList ListeClient;
    Admin Admin;
    ArrayList ListeCoursFutur;
    ArrayList ListeCoursPasse;
    String NomFichierSauvegarder;
    
    
    public void Affichage(){}
    
    public void SeConnecter(){}
    
    public void MAJmdp(){}
    
    // Methode client
    
    public void CreeCompte(){}
    
    public void ConsulterCompte(){}
    
    public void MAJinfoCOmpte(){}
    
    public void ConsulterCoursFutur(){}
    
    public void SinscrirCoursFutur(){}
    
    public void ConsultCoursFutur(){}
    
    public void ConsultCoursPasse(){}
    
    public void Desinscrircourfutur(){}
    
    public void ConsulterListeActivite(){}
    
    
    // COnstructeur Salle
    
    public Salle (String NomSalle, ArrayList ListeClient, Admin Admin, ArrayList ListeCoursFutur, ArrayList ListeCoursPasse,String NomFichierSauvegarder){
        this.NomSalle = NomSalle;
        this.ListeClient = ListeClient;
        this.Admin = Admin;
        this.ListeCoursFutur = ListeCoursFutur;
        this.ListeCoursPasse = ListeCoursPasse;
        this.NomFichierSauvegarder = NomFichierSauvegarder;
        
    }
        

    

    
    
}
