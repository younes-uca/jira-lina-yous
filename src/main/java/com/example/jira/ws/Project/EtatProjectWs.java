package com.example.jira.ws.Project;

import com.example.jira.bean.project.EtatProject;
import com.example.jira.service.Project.EtatProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("app/etatProject")
public class EtatProjectWs {

    @Autowired
    private EtatProjectService etatProjectService;

    @GetMapping("/libelle/{libelle}")
    public EtatProject findByLibelle(@PathVariable String libelle) {
        return etatProjectService.findByLibelle(libelle);
    }

    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle(@PathVariable String libelle) {
        return etatProjectService.deleteByLibelle(libelle);
    }

    @GetMapping("/")
    public List<EtatProject> findAll() {
        return etatProjectService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody EtatProject etatProject) {
        return etatProjectService.save(etatProject);
    }
}
