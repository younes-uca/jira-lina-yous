package com.example.jira.dao.SousTache;


import com.example.jira.bean.sousTache.SousTache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SousTacheDao extends JpaRepository<SousTache,Long> {
    SousTache findByLibelle(String libelle);
    int deleteByLibelle(String libelle);
}
