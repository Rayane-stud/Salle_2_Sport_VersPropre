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
public class Client extends Utilisateur{
    
    private int numClient;
    private String nom;
    private String prenom;
    private String tel;
    private String adresse;
    private String typeAbonnement; // sem/tri/an
    private String etatAbonnement;
    
    // Listes demandées
    private ArrayList<Cours> listeCoursFuturs = new ArrayList<>();
    private ArrayList<Cours> listeCoursPasses = new ArrayList<>();

    //Constructeur Client
    
    public Client(String idMail, String mdp) {
        super(idMail, mdp);
    }

    // Méthodes Client (void)
    
    public void CreeCompte(){}
    public void ConsulterCompte(){}
    public void MAJinfoCOmpte(){}
    public void ConsulterCoursFutur(){}
    public void SinscrirCoursFutur(){}
    public void ConsultCoursFutur(){}
    public void ConsultCoursPasse(){}
    public void Desinscrircourfutur(){}
    public void ConsulterListeActivite(){}
    
    
}
