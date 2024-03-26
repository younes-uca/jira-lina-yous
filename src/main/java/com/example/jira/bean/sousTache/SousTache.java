package com.example.jira.bean.sousTache;

import com.example.jira.bean.collaborateur.Collaborateur;
import com.example.jira.bean.tache.Tache;
import jakarta.persistence.*;

@Entity
public class SousTache {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String libelle;
    private String description;
    private double pourcentage;
    private double avancement;

    @ManyToOne
    private Collaborateur collaborateur;
    @ManyToOne
    private Tache tache;
    @ManyToOne
    private EtatSousTache etatSousTache;

    public double getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    public double getAvancement() {
        return avancement;
    }

    public void setAvancement(double avancement) {
        this.avancement = avancement;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }

    public Tache getTache() {
        return tache;
    }

    public void setTache(Tache tache) {
        this.tache = tache;
    }

    public EtatSousTache getEtatSousTache() {
        return etatSousTache;
    }

    public void setEtatSousTache(EtatSousTache etatSousTache) {
        this.etatSousTache = etatSousTache;
    }
}
