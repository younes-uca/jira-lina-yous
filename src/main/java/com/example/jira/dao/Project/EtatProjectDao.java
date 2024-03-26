package com.example.jira.dao.Project;


import com.example.jira.bean.project.EtatProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatProjectDao extends JpaRepository<EtatProject,Long> {
    EtatProject findByLibelle(String libelle);
    int deleteByLibelle(String libelle);
}
