package com.example.jira.dao.Project;


import com.example.jira.bean.project.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectDao extends JpaRepository<Project,Long> {
    Project findByLibelle(String libelle);
    int deleteByLibelle(String libelle);
}
