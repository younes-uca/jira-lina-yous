package com.example.jira.service.Sprint;

import com.example.jira.bean.sprint.Sprint;
import com.example.jira.dao.Sprint.SprintDao;
import com.example.jira.service.Project.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SprintService {
    @Autowired
    private SprintDao sprintDao;
    @Autowired
    private ProjectService projectService;

    @Autowired
    private EtatSprintService etatSprintService;

    public Sprint findByLibelle(String libelle) {
        return sprintDao.findByLibelle(libelle);
    }

    @Transactional
    public int deleteByLibelle(String libelle) {
        return sprintDao.deleteByLibelle(libelle);
    }

    public List<Sprint> findAll() {
        return sprintDao.findAll();
    }

    public int save(Sprint sprint) {
        if (findByLibelle(sprint.getLibelle()) != null) {
            return -1;
        } else {
            sprintDao.save(sprint);
            return 1;
        }
    }

}
