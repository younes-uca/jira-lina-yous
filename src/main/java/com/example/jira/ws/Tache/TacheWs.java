package com.example.jira.ws.Tache;

import com.example.jira.bean.tache.Tache;
import com.example.jira.service.Tache.TacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("app/tache")
public class TacheWs {

    @Autowired
    private TacheService tacheService;

    @GetMapping("/libelle/{libelle}")
    public Tache findByLibelle(@PathVariable String libelle) {
        return tacheService.findByLibelle(libelle);
    }

    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle(@PathVariable String libelle) {
        return tacheService.deleteByLibelle(libelle);
    }

    @GetMapping("/")
    public List<Tache> findAll() {
        return tacheService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Tache tache) {
        return tacheService.save(tache);
    }
}
