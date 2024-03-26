package com.example.jira.dao.Tache;


import com.example.jira.bean.tache.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacheDao extends JpaRepository<Tache,Long> {
    Tache findByLibelle(String libelle);
    int deleteByLibelle(String libelle);
}
