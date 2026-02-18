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
public class Utilisateur {
    protected String idMail;
    protected String mdp;

    // Méthodes communes
    public void seConnecter() {}
    public void majMotDePasse() {}
    
    public Utilisateur(){
        
        Scanner S = new Scanner(System.in);
        
        System.out.println("Veuillez rentre votre nom : ");
        this.idMail = S.nextLine();
        System.out.println("Veuillez rentre votre prenom : ");
        this.mdp = S.nextLine();
    }
    
}
