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
    
    public Client(String idMail, String mdp, int numClient, String nom, String prenom, String tel , String adresse, String typeAbonnement, boolean etatAbonnement) {
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
    
    public void CreeCompte(){
    
    String nom;
    String prenom;
    String tel;
    String adresse;
    String typeAbonnement;
    String mail;
    String mdp;
    boolean etatAbonnement;
            
    Scanner S = new Scanner(System.in);
    Scanner I = new Scanner(System.in);

    System.out.println("Veuillez rentre votre nom : ");
    nom = S.nextLine();
    System.out.println("Veuillez rentre votre prenom : ");
    prenom = S.nextLine();
    System.out.println("Veuillez rentre votre Numero de telephone : ");
    tel = S.nextLine();
    System.out.println("Veuillez rentre votre adresse : ");
    adresse = S.nextLine();
    System.out.println("Veuillez rentre votre type d'abonnement (sem,tri,an) : ");
    typeAbonnement = S.nextLine();
    System.out.println("Veuillez rentre votre type adresse mail : ");
    mail = S.nextLine();
    System.out.println("Veuillez rentre votre type mot de passe : ");
    mdp = S.nextLine();
    etatAbonnement = true;
    //Client(String mail, String mdp, int numClient, String nom, String prenom, String tel , String adresse, String typeAbonnement, boolean etatAbonnement);
    
    
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
        System.out.println("Voici votre type d'abonnement : " + client.typeAbonnement );

    }
    
    
    
    public void MAJinfoCOmpte(){
        
        Scanner I = new Scanner(System.in);
        int c = 100;
        
        
        System.out.println("Qu'est ce que vous voulez modifier ? ");
        while(c != 0){
        System.out.println("1: mail, 2: Mot de Passe, 3: nom, 4:prenom, 5: numero de tel, 6: adresse, 7: type d'abonnement, 0: sortir ");
        c = I.nextInt();
        switch(c) {
            
        /*  case 1: // mail
                System.out.println("Nombre de pages :");
                int nbPages = scanner.nextInt();
                scanner.nextLine();
                ajouter(description, prix, nbExe, numero, nbPages);
                break;
                
            case 2: // mdp
                System.out.println("Nombre de pages :");
                nbPages = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Matière :");
                String matiere = scanner.nextLine();
                System.out.println("Niveau :");
                String niveau = scanner.nextLine();
                ajouter(description, prix, nbExe, numero, nbPages, matiere, niveau);
                break;
                
            case 3: // nom
                System.out.println("Périodicité (hebdomadaire/mensuel/trimestriel) :");
                String perio = scanner.nextLine();
                System.out.println("Date de publication (format yyyy-MM-dd) :");
                String dateStr = scanner.nextLine();
                LocalDate datePub = LocalDate.parse(dateStr);
                ajouter(description, prix, nbExe, numero, perio, datePub);
                break;
            
            case 4: // prenom
                System.out.println("Périodicité (hebdomadaire/mensuel/trimestriel) :");
                String perio = scanner.nextLine();
                System.out.println("Date de publication (format yyyy-MM-dd) :");
                String dateStr = scanner.nextLine();
                LocalDate datePub = LocalDate.parse(dateStr);
                ajouter(description, prix, nbExe, numero, perio, datePub);
                break;
            
            case 5: // tel
                System.out.println("Nombre de pages :");
                int nbPages = scanner.nextInt();
                scanner.nextLine();
                ajouter(description, prix, nbExe, numero, nbPages);
                break;
            
            case 6: // adresse
                System.out.println("Nombre de pages :");
                int nbPages = scanner.nextInt();
                scanner.nextLine();
                ajouter(description, prix, nbExe, numero, nbPages);
                break;
            
            case 7: // type d'abonnement
                System.out.println("Nombre de pages :");
                int nbPages = scanner.nextInt();
                scanner.nextLine();
                ajouter(description, prix, nbExe, numero, nbPages);
                break;
            
            case 0: // sortir
                System.out.println("Nombre de pages :");
                int nbPages = scanner.nextInt();
                scanner.nextLine();
                ajouter(description, prix, nbExe, numero, nbPages);
                break;
                
            default:
                System.out.println("Type non valide.");
                i--; // Réessayer cet article
                continue;*/
        }
    
        }
    }
    public void ConsulterCoursFutur(){}
    public void SinscrirCoursFutur(){}
    public void ConsultCoursFutur(){}
    public void ConsultCoursPasse(){}
    public void Desinscrircourfutur(){}
    public void ConsulterListeActivite(){}
    
    
}
