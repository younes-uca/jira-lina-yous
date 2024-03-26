package com.example.jira.service.SousTache;

import com.example.jira.bean.sousTache.SousTache;
import com.example.jira.bean.tache.Tache;
import com.example.jira.dao.SousTache.SousTacheDao;
import com.example.jira.service.Tache.TacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SousTacheService {
    @Autowired
    private SousTacheDao sousTacheDao;
    @Autowired
    private TacheService tacheService;


    public SousTache findByLibelle(String libelle) {
        return sousTacheDao.findByLibelle(libelle);
    }

    @Transactional
    public int deleteByLibelle(String libelle) {
        return sousTacheDao.deleteByLibelle(libelle);
    }

    public List<SousTache> findAll() {
        return sousTacheDao.findAll();
    }

    public int save(SousTache sousTache) {
        Tache tache = tacheService.findByLibelle(sousTache.getTache().getLibelle());
        sousTache.setTache(tache);
        if (findByLibelle(sousTache.getLibelle()) != null) {
            return -1;
        } else if (tache == null) {
            return -2;
        } else {
            double nvAvancement = tache.getAvancement() + sousTache.getAvancement() * sousTache.getPourcentage() / 100;
            tache.setAvancement(nvAvancement);
            tacheService.update(tache);
            sousTacheDao.save(sousTache);
            return 1;
        }
    }
}
