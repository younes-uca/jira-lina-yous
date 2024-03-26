package com.example.jira.bean.collaborateur;

import jakarta.persistence.*;

@Entity
public class Collaborateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nom;
    private String prenom;
    private String ref;
    @ManyToOne
    private GradeCollaborateur gradeCollaborateur;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public GradeCollaborateur getGradeCollaborateur() {
        return gradeCollaborateur;
    }

    public void setGradeCollaborateur(GradeCollaborateur gradeCollaborateur) {
        this.gradeCollaborateur = gradeCollaborateur;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}
