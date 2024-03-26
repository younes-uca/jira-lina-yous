package com.example.jira.bean.imputation;

import com.example.jira.bean.collaborateur.Collaborateur;
import com.example.jira.bean.sousTache.SousTache;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Imputation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    @ManyToOne
    private SousTache sousTache;
    private double nbrHeure;
    private LocalDateTime dateImputation;
    @ManyToOne
    private Collaborateur collaborateur;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public SousTache getSousTache() {
        return sousTache;
    }

    public void setSousTache(SousTache sousTache) {
        this.sousTache = sousTache;
    }

    public double getNbrHeure() {
        return nbrHeure;
    }

    public void setNbrHeure(double nbrHeure) {
        this.nbrHeure = nbrHeure;
    }

    public LocalDateTime getDateImputation() {
        return dateImputation;
    }

    public void setDateImputation(LocalDateTime dateImputation) {
        this.dateImputation = dateImputation;
    }

    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }
}
