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
    public ArrayList<Cours> listeCoursFuturs;
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
    
    int c;        
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
    System.out.println("Veuillez rentrez le  type d'abonnement :");
                System.out.println("1: sem, 2: tri, 3: an");
                c = I.nextInt();
                switch(c) {
            
                    case 1: // sem
                        this.typeAbonnement = "sem";
                        break;
                 
                    case 2: // tri
                        this.typeAbonnement = "tri";
                        break;
                
                    case 3: // an
                        this.typeAbonnement = "an";
                        break;
                    default:
                        System.out.println("Type non valide.");    
                    }
    System.out.println("Veuillez rentre votre type adresse mail : ");
    this.idMail = S.nextLine();
    System.out.println("Veuillez rentre votre mot de passe : ");
    this.mdp = S.nextLine();
    etatAbonnement = true;
    
    }
    
    
    public void ConsulterCompte(){
        System.out.println("Voici votre mail : " + this.idMail );
        System.out.println("Voici votre mdp : " + this.mdp );
        System.out.println("Voici votre nom : " + this.nom );
        System.out.println("Voici votre prenom : " + this.prenom );
        System.out.println("Voici votre numero de tel : " + this.tel );
        System.out.println("Voici votre adresse : " + this.adresse );
        System.out.println("Voici votre type d'abonnement : " + this.typeAbonnement );

    }
    
    
    
    public void MAJinfoCOmpte(){
        
        Scanner I = new Scanner(System.in);
        Scanner S = new Scanner(System.in);

        int c = 100;
        
        
        System.out.println("Qu'est ce que vous voulez modifier ? ");
        while(c != 0){
        System.out.println("1: mail, 2: Mot de Passe, 3: nom, 4:prenom, 5: numero de tel, 6: adresse, 7: type d'abonnement, 0: sortir ");
        c = I.nextInt();
        switch(c) {
            
          case 1: // mail
                System.out.println("Rentrez le nouveau mail :");
                this.idMail = S.nextLine();
                break;
                 
            case 2: // mdp
                System.out.println("Rentrez le nouveau mdp :");
                this.mdp = S.nextLine();
                break;
                
            case 3: // nom
                System.out.println("Rentrez le nouveau nom :");
                this.nom = S.nextLine();
                break;
            
            case 4: // prenom
                System.out.println("Rentrez le nouveau prenom :");
                this.prenom = S.nextLine();
                break;
            
            case 5: // tel
                System.out.println("Rentrez le nouveau numero de telephone :");
                this.tel = S.nextLine();
                break;
            
            case 6: // adresse
                System.out.println("Rentrez la nouvelle adresse :");
                this.adresse = S.nextLine();
                break; 
                
                
            case 7: // type d'abonnement
                System.out.println("Rentrez le nouveau type d'abonnement :");
                System.out.println("1: sem, 2: tri, 3: an");
                c = I.nextInt();
                switch(c) {
            
                    case 1: // sem
                        this.typeAbonnement = "sem";
                        break;
                 
                    case 2: // tri
                        this.typeAbonnement = "tri";
                        break;
                
                    case 3: // an
                        this.typeAbonnement = "an";
                        break;   
                    }
                    
                break;
        }
    
        }
      System.out.println("Voici vos nouvelles information");
      this.ConsulterCompte();

    }
    public void ConsulterCoursFutur(){}
    public void SinscrirCoursFutur(){}
    public void ConsultCoursFutur(){}
    public void ConsultCoursPasse(){}
    public void Desinscrircourfutur(){}
    public void ConsulterListeActivite(){}
    
    
}
