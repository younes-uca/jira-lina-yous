package com.example.jira.dao.Collaborateur;


import com.example.jira.bean.collaborateur.Collaborateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollaborateurDao extends JpaRepository<Collaborateur,Long> {
    Collaborateur findByRef(String ref);
    int deleteByRef(String ref);
}
