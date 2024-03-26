package com.example.jira.ws.Tache;

import com.example.jira.bean.tache.EtatTache;
import com.example.jira.service.Tache.EtatTacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("app/etatTache")
public class EtatTacheWs {

    @Autowired
    private EtatTacheService etatTacheService;

    @GetMapping("/libelle/{libelle}")
    public EtatTache findByLibelle(@PathVariable String libelle) {
        return etatTacheService.findByLibelle(libelle);
    }

    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle(@PathVariable String libelle) {
        return etatTacheService.deleteByLibelle(libelle);
    }

    @GetMapping("/")
    public List<EtatTache> findAll() {
        return etatTacheService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody EtatTache etatTache) {
        return etatTacheService.save(etatTache);
    }
}
