package com.example.jira.ws.Collaborateur;

import com.example.jira.bean.collaborateur.Collaborateur;
import com.example.jira.service.Collaborateur.CollaborateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("app/collaborateur")
public class CollaborateurWs {

    @Autowired
    private CollaborateurService collaborateurService;

    @GetMapping("/ref/{ref}")
    public Collaborateur findByLibelle(@PathVariable String ref) {
        return collaborateurService.findByRef(ref);
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByLibelle(@PathVariable String ref) {
        return collaborateurService.deleteByRef(ref);
    }

    @GetMapping("/")
    public List<Collaborateur> findAll() {
        return collaborateurService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Collaborateur collaborateur) {
        return collaborateurService.save(collaborateur);
    }
}
