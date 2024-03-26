package com.example.jira.bean.tache;

import com.example.jira.bean.collaborateur.Collaborateur;
import com.example.jira.bean.sprint.Sprint;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String libelle;
    @ManyToOne
    private Collaborateur collaborateur;
    @ManyToOne
    private Sprint sprint;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    @ManyToOne
    private EtatTache etatTache;
    private double pourcentage;
    private double avancement;

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

    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }

    public Sprint getSprint() {
        return sprint;
    }

    public void setSprint(Sprint sprint) {
        this.sprint = sprint;
    }

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDateTime getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }

    public EtatTache getEtatTache() {
        return etatTache;
    }

    public void setEtatTache(EtatTache etatTache) {
        this.etatTache = etatTache;
    }
}
