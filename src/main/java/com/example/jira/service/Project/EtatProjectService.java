package com.example.jira.service.Project;

import com.example.jira.bean.project.EtatProject;
import com.example.jira.dao.Project.EtatProjectDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EtatProjectService {
    @Autowired
    private EtatProjectDao etatProjectDao;
    

    public EtatProject findByLibelle(String libelle) {
        return etatProjectDao.findByLibelle(libelle);
    }

    @Transactional
    public int deleteByLibelle(String libelle) {
        return etatProjectDao.deleteByLibelle(libelle);
    }

    public List<EtatProject> findAll() {
        return etatProjectDao.findAll();
    }

    public int save(EtatProject etatProject) {
        if (findByLibelle(etatProject.getLibelle()) != null) {
            return -1;
        } else {
            etatProjectDao.save(etatProject);
            return 1;
        }
    }

}
