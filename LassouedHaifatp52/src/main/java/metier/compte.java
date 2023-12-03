package metier;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

// Classe représentant un compte
//@WebService
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code = 0;
    private double solde = 0.0;
    @XmlTransient
    private Date date = new Date();

    // Constructeur avec paramètres pour initialiser les attributs
    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.date = dateCreation;
    }

    // Constructeur par défaut
    public Compte() {

    }

    // Getter et Setter pour l'attribut 'code'
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    // Getter et Setter pour l'attribut 'solde'
    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    // Getter et Setter pour l'attribut 'date'
    public Date getDateCreation() {
        return date;
    }

    public void setDateCreation(Date dateCreation) {
        this.date = dateCreation;
    }
}