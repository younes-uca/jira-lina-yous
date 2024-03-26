package com.example.jira.dao.Tache;


import com.example.jira.bean.tache.EtatTache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatTacheDao extends JpaRepository<EtatTache,Long> {
    EtatTache findByLibelle(String libelle);
    int deleteByLibelle(String libelle);
}
