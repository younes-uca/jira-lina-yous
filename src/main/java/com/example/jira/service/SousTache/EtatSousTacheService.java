package com.example.jira.service.SousTache;

import com.example.jira.bean.sousTache.EtatSousTache;
import com.example.jira.dao.SousTache.EtatSousTacheDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EtatSousTacheService {
    @Autowired
    private EtatSousTacheDao etatSousTacheDao;

    public EtatSousTache findByLibelle(String libelle) {
        return etatSousTacheDao.findByLibelle(libelle);
    }

    @Transactional
    public int deleteByLibelle(String libelle) {
        return etatSousTacheDao.deleteByLibelle(libelle);
    }

    public List<EtatSousTache> findAll() {
        return etatSousTacheDao.findAll();
    }

    public int save(EtatSousTache etatSousTache) {
        if (findByLibelle(etatSousTache.getLibelle()) != null) {
            return -1;
        } else {
            etatSousTacheDao.save(etatSousTache);
            return 1;
        }
    }

}
