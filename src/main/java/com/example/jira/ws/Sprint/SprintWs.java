package com.example.jira.ws.Sprint;

import com.example.jira.bean.sprint.Sprint;
import com.example.jira.service.Sprint.SprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("app/sprint")
public class SprintWs {

    @Autowired
    private SprintService sprintService;

    @GetMapping("/libelle/{libelle}")
    public Sprint findByLibelle(@PathVariable String libelle) {
        return sprintService.findByLibelle(libelle);
    }

    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle(@PathVariable String libelle) {
        return sprintService.deleteByLibelle(libelle);
    }

    @GetMapping("/")
    public List<Sprint> findAll() {
        return sprintService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Sprint sprint) {
        return sprintService.save(sprint);
    }
}
