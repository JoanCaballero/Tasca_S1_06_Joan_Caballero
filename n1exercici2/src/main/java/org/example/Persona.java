package org.example;

public class Persona {
    private String nom, cognom;
    private int edat;
    public Persona(String nom, String cognom, int edat){
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public int getEdat() {
        return edat;
    }

    @Override
    public String toString() {
        return ("Nom i Cognom: " + nom + " " + cognom + ". Edat: " + edat);
    }
}
