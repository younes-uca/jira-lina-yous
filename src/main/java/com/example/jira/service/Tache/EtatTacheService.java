package com.example.jira.service.Tache;

import com.example.jira.bean.tache.EtatTache;
import com.example.jira.dao.Tache.EtatTacheDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EtatTacheService {
    @Autowired
    private EtatTacheDao etatTacheDao;

    public EtatTache findByLibelle(String libelle) {
        return etatTacheDao.findByLibelle(libelle);
    }

    @Transactional
    public int deleteByLibelle(String libelle) {
        return etatTacheDao.deleteByLibelle(libelle);
    }

    public List<EtatTache> findAll() {
        return etatTacheDao.findAll();
    }

    public int save(EtatTache etatTache) {
        if (findByLibelle(etatTache.getLibelle()) != null) {
            return -1;
        } else {
            etatTacheDao.save(etatTache);
            return 1;
        }
    }

}
