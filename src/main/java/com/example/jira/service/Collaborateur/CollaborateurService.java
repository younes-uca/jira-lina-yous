package com.example.jira.service.Collaborateur;

import com.example.jira.bean.collaborateur.Collaborateur;
import com.example.jira.dao.Collaborateur.CollaborateurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CollaborateurService {
    @Autowired
    private CollaborateurDao collaborateurDao;

    public Collaborateur findByRef(String ref) {
        return collaborateurDao.findByRef(ref);
    }

    @Transactional
    public int deleteByRef(String ref) {
        return collaborateurDao.deleteByRef(ref);
    }

    public List<Collaborateur> findAll() {
        return collaborateurDao.findAll();
    }

    public int save(Collaborateur collaborateur) {
        if (findByRef(collaborateur.getRef()) != null) {
            return -1;
        } else {
            collaborateurDao.save(collaborateur);
            return 1;
        }
    }

}
