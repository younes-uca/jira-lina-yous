package com.example.jira.dao.Collaborateur;


import com.example.jira.bean.collaborateur.GradeCollaborateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeCollaborateurDao extends JpaRepository<GradeCollaborateur,Long> {
    GradeCollaborateur findByLibelle(String libelle);
    int deleteByLibelle(String libelle);
}
