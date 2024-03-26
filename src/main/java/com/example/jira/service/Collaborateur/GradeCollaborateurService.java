package com.example.jira.service.Collaborateur;

import com.example.jira.bean.collaborateur.GradeCollaborateur;
import com.example.jira.dao.Collaborateur.GradeCollaborateurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GradeCollaborateurService {
    @Autowired
    private GradeCollaborateurDao gradeCollaborateurDao;

    public GradeCollaborateur findByLibelle(String libelle) {
        return gradeCollaborateurDao.findByLibelle(libelle);
    }

    @Transactional
    public int deleteByLibelle(String libelle) {
        return gradeCollaborateurDao.deleteByLibelle(libelle);
    }

    public List<GradeCollaborateur> findAll() {
        return gradeCollaborateurDao.findAll();
    }

    public int save(GradeCollaborateur gradeCollaborateur) {
        if (findByLibelle(gradeCollaborateur.getLibelle()) != null) {
            return -1;
        } else {
            gradeCollaborateurDao.save(gradeCollaborateur);
            return 1;
        }
    }

}
