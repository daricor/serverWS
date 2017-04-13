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
public class Partie {
    
    private boolean etat;
    private int tableau[][] = new int[19][19];
    private int nbTenaillesJ1;
    private int nbTenaillesJ2;
    private boolean prolongation;
    private boolean finPartie;
    private String detailFinPartie;
    private int numTour;
    private int code;

    public Partie(){
    
        etat = false;
    
    
    
    }
    
    
    
    /**
     * @return the etat
     */
    public boolean getEtat() {
        return etat;
    }

    /**
     * @param status the etat to set
     */
    public void setEtat(boolean status) {
        this.etat = status;
    }


    /**
     * @return the tableau
     */
    public int[][] getTableau() {
        return tableau;
    }

    /**
     * @param tableau the tableau to set
     */
    public void setTableau(int[][] tableau) {
        this.tableau = tableau;
    }

    /**
     * @return the nbTenaillesJ1
     */
    public int getNbTenaillesJ1() {
        return nbTenaillesJ1;
    }

    /**
     * @param nbTenaillesJ1 the nbTenaillesJ1 to set
     */
    public void setNbTenaillesJ1(int nbTenaillesJ1) {
        this.nbTenaillesJ1 = nbTenaillesJ1;
    }

    /**
     * @return the nbTenaillesJ2
     */
    public int getNbTenaillesJ2() {
        return nbTenaillesJ2;
    }

    /**
     * @param nbTenaillesJ2 the nbTenaillesJ2 to set
     */
    public void setNbTenaillesJ2(int nbTenaillesJ2) {
        this.nbTenaillesJ2 = nbTenaillesJ2;
    }

    /**
     * @return the prolongation
     */
    public boolean isProlongation() {
        return prolongation;
    }

    /**
     * @param prolongation the prolongation to set
     */
    public void setProlongation(boolean prolongation) {
        this.prolongation = prolongation;
    }

    /**
     * @return the finPartie
     */
    public boolean isFinPartie() {
        return finPartie;
    }

    /**
     * @param finPartie the finPartie to set
     */
    public void setFinPartie(boolean finPartie) {
        this.finPartie = finPartie;
    }

    /**
     * @return the detailFinPartie
     */
    public String getDetailFinPartie() {
        return detailFinPartie;
    }

    /**
     * @param detailFinPartie the detailFinPartie to set
     */
    public void setDetailFinPartie(String detailFinPartie) {
        this.detailFinPartie = detailFinPartie;
    }

    /**
     * @return the numTour
     */
    public int getNumTour() {
        return numTour;
    }

    /**
     * @param numTour the numTour to set
     */
    public void setNumTour(int numTour) {
        this.numTour = numTour;
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
    
    
    
    
    
    
}
