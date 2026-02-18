/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salledesport;

import java.util.ArrayList;
import java.util.Scanner;

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
    private boolean etatAbonnement;
    
    // Listes demandées
    private ArrayList<Cours> listeCoursFuturs;
    private ArrayList<Cours> listeCoursPasses;

    //Constructeur Client
    
    /*public Client(String idMail, String mdp, int numClient, String nom, String prenom, String tel , String adresse, String typeAbonnement, boolean etatAbonnement) {
        super(idMail, mdp);
        this.numClient = numClient;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.adresse = adresse;
        this.typeAbonnement = typeAbonnement;
        this.etatAbonnement = etatAbonnement;
        listeCoursFuturs = new ArrayList();
        listeCoursPasses = new ArrayList();
        
    }
    // CHANGER PAR GAB
    // Méthodes Client (void)
    */
    public Client(){
    
            
    Scanner S = new Scanner(System.in);
    Scanner I = new Scanner(System.in);

    System.out.println("Veuillez rentre votre nom : ");
    this.nom = S.nextLine();
    System.out.println("Veuillez rentre votre prenom : ");
    this.prenom = S.nextLine();
    System.out.println("Veuillez rentre votre Numero de telephone : ");
    this.tel = S.nextLine();
    System.out.println("Veuillez rentre votre adresse : ");
    this.adresse = S.nextLine();
    System.out.println("Veuillez rentre votre type d'abonnement (sem,tri,an) : ");
    typeAbonnement = S.nextLine();
    System.out.println("Veuillez rentre votre type adresse mail : ");
    this.idMail = S.nextLine();
    System.out.println("Veuillez rentre votre type mot de passe : ");
    this.mdp = S.nextLine();
    etatAbonnement = true;
    
    }
    
    public int generernum(){
    
        return 0;
    
    }
    
    public void ConsulterCompte(Client client){
        System.out.println("Voici votre mail : " + client.idMail );
        System.out.println("Voici votre mdp : " + client.mdp );
        System.out.println("Voici votre nom : " + client.nom );
        System.out.println("Voici votre prenom : " + client.prenom );
        System.out.println("Voici votre numero de tel : " + client.tel );
        System.out.println("Voici votre adresse : " + client.adresse );
        System.out.println("Voici votre nom : " + client.nom );


    
    }
    public void MAJinfoCOmpte(){}
    public void ConsulterCoursFutur(){}
    public void SinscrirCoursFutur(){}
    public void ConsultCoursFutur(){}
    public void ConsultCoursPasse(){}
    public void Desinscrircourfutur(){}
    public void ConsulterListeActivite(){}
    
    
}
