package com.example.jira.ws.Sprint;

import com.example.jira.bean.sprint.EtatSprint;
import com.example.jira.service.Sprint.EtatSprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("app/etatSprint")
public class EtatSprintWs {

    @Autowired
    private EtatSprintService etatSprintService;

    @GetMapping("/libelle/{libelle}")
    public EtatSprint findByLibelle(@PathVariable String libelle) {
        return etatSprintService.findByLibelle(libelle);
    }

    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle(@PathVariable String libelle) {
        return etatSprintService.deleteByLibelle(libelle);
    }

    @GetMapping("/")
    public List<EtatSprint> findAll() {
        return etatSprintService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody EtatSprint etatSprint) {
        return etatSprintService.save(etatSprint);
    }
}
