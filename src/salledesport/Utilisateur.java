/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salledesport;

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
    
    public Utilisateur(String idMail, String mdp){
        this.idMail = idMail;
        this.mdp = mdp;
    }
    
}
