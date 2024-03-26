package com.example.jira.service.Sprint;

import com.example.jira.bean.sprint.EtatSprint;
import com.example.jira.dao.Sprint.EtatSprintDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EtatSprintService {
    @Autowired
    private EtatSprintDao etatSprintDao;

    public EtatSprint findByLibelle(String libelle) {
        return etatSprintDao.findByLibelle(libelle);
    }

    @Transactional
    public int deleteByLibelle(String libelle) {
        return etatSprintDao.deleteByLibelle(libelle);
    }

    public List<EtatSprint> findAll() {
        return etatSprintDao.findAll();
    }

    public int save(EtatSprint etatSprint) {
        if (findByLibelle(etatSprint.getLibelle()) != null) {
            return -1;
        } else {
            etatSprintDao.save(etatSprint);
            return 1;
        }
    }

}
