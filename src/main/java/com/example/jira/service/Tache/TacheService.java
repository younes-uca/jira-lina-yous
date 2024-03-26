package com.example.jira.service.Tache;

import com.example.jira.bean.tache.Tache;
import com.example.jira.dao.Tache.TacheDao;
import com.example.jira.service.Sprint.SprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TacheService {
    @Autowired
    private TacheDao tacheDao;
    @Autowired
    private EtatTacheService etatTacheService;
    @Autowired
    private SprintService sprintService;

    /*@Autowired
    private CollaborateurService collaborateurService;
*/
    public Tache findByLibelle(String libelle) {
        return tacheDao.findByLibelle(libelle);
    }

    @Transactional
    public int deleteByLibelle(String libelle) {
        return tacheDao.deleteByLibelle(libelle);
    }

    public List<Tache> findAll() {
        return tacheDao.findAll();
    }

    public int save(Tache tache) {
        if (findByLibelle(tache.getLibelle()) != null) {
            return -1;
        } else {
            tacheDao.save(tache);
            return 1;
        }
    }

    public int update(Tache tache) {
        if (findByLibelle(tache.getLibelle()) == null) {
            return -1;
        } else {
            tacheDao.save(tache);
            return 1;
        }
    }
}
