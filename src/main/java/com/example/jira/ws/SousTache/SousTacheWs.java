package com.example.jira.ws.SousTache;

import com.example.jira.bean.sousTache.SousTache;
import com.example.jira.service.SousTache.SousTacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("app/sous-tache")
public class SousTacheWs {

    @Autowired
    private SousTacheService sousTacheService;

    @GetMapping("/libelle/{libelle}")
    public SousTache findByLibelle(@PathVariable String libelle) {
        return sousTacheService.findByLibelle(libelle);
    }

    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle(@PathVariable String libelle) {
        return sousTacheService.deleteByLibelle(libelle);
    }

    @GetMapping("/")
    public List<SousTache> findAll() {
        return sousTacheService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody SousTache tache) {
        return sousTacheService.save(tache);
    }
}
