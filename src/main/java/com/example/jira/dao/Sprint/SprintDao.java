package com.example.jira.dao.Sprint;


import com.example.jira.bean.sprint.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SprintDao extends JpaRepository<Sprint,Long> {
    Sprint findByLibelle(String libelle);
    int deleteByLibelle(String libelle);
}
