package com.example.jira.dao.Sprint;


import com.example.jira.bean.sprint.EtatSprint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatSprintDao extends JpaRepository<EtatSprint,Long> {
    EtatSprint findByLibelle(String libelle);
    int deleteByLibelle(String libelle);
}
