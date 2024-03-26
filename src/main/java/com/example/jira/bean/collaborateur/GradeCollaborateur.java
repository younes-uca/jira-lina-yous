package com.example.jira.bean.collaborateur;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GradeCollaborateur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String libelle;
    private String code;
    private Double tjm;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getTjm() {
        return tjm;
    }

    public void setTjm(Double tjm) {
        this.tjm = tjm;
    }
}

