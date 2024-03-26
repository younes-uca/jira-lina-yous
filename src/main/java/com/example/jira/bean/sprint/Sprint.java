package com.example.jira.bean.sprint;

import com.example.jira.bean.project.Project;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Sprint {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String libelle;
    @ManyToOne
    private Project project;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    @ManyToOne
    private EtatSprint etatSprint;

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

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
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

    public EtatSprint getEtatSprint() {
        return etatSprint;
    }

    public void setEtatSprint(EtatSprint etatSprint) {
        this.etatSprint = etatSprint;
    }
}
