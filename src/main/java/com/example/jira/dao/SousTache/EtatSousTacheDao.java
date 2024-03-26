package com.example.jira.dao.SousTache;


import com.example.jira.bean.sousTache.EtatSousTache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatSousTacheDao extends JpaRepository<EtatSousTache,Long> {
    EtatSousTache findByLibelle(String libelle);
    int deleteByLibelle(String libelle);
}
