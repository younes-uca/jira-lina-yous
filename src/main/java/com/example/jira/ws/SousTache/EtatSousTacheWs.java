package com.example.jira.ws.SousTache;

import com.example.jira.bean.sousTache.EtatSousTache;
import com.example.jira.service.SousTache.EtatSousTacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("app/etat-sous-tache")
public class EtatSousTacheWs {

    @Autowired
    private EtatSousTacheService etatSousTacheService;

    @GetMapping("/libelle/{libelle}")
    public EtatSousTache findByLibelle(@PathVariable String libelle) {
        return etatSousTacheService.findByLibelle(libelle);
    }

    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle(@PathVariable String libelle) {
        return etatSousTacheService.deleteByLibelle(libelle);
    }

    @GetMapping("/")
    public List<EtatSousTache> findAll() {
        return etatSousTacheService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody EtatSousTache tache) {
        return etatSousTacheService.save(tache);
    }
}
