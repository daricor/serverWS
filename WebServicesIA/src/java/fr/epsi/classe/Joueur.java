/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.classe;

/**
 *
 * @author mcfly
 */
public class Joueur {
    
    
    
    private boolean etat ;
    
    private String idJoueur;
    private int code;
    private String nomJoueur;
    private int numJoueur;
    private int dernierCoupX;
    private int dernierCoupY;

    public Joueur(){
        
        etat = false;
        
        
        
    }
    
    
    /**
     * @return the idJoueur
     */
    public String getIdJoueur() {
        return idJoueur;
    }

    /**
     * @param idJoueur the idJoueur to set
     */
    public void setIdJoueur(String idJoueur) {
        this.idJoueur = idJoueur;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the nomJoueur
     */
    public String getNomJoueur() {
        return nomJoueur;
    }

    /**
     * @param nomJoueur the nomJoueur to set
     */
    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }

    /**
     * @return the numJoueur
     */
    public int getNumJoueur() {
        return numJoueur;
    }

    /**
     * @param numJoueur the numJoueur to set
     */
    public void setNumJoueur(int numJoueur) {
        this.numJoueur = numJoueur;
    }

    /**
     * @return the dernierCoupX
     */
    public int getDernierCoupX() {
        return dernierCoupX;
    }

    /**
     * @param dernierCoupX the dernierCoupX to set
     */
    public void setDernierCoupX(int dernierCoupX) {
        this.dernierCoupX = dernierCoupX;
    }

    /**
     * @return the dernierCoupY
     */
    public int getDernierCoupY() {
        return dernierCoupY;
    }

    /**
     * @param dernierCoupY the dernierCoupY to set
     */
    public void setDernierCoupY(int dernierCoupY) {
        this.dernierCoupY = dernierCoupY;
    }

    /**
     * @return the etat
     */
    public boolean isEtat() {
        return etat;
    }

    /**
     * @param etat the etat to set
     */
    public void setEtat(boolean etat) {
        this.etat = etat;
    }

   
    
    
    
    
}
