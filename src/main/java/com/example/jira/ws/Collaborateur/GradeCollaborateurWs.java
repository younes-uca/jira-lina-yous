package com.example.jira.ws.Collaborateur;

import com.example.jira.bean.collaborateur.GradeCollaborateur;
import com.example.jira.service.Collaborateur.GradeCollaborateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("app/gradeCollaborateur")
public class GradeCollaborateurWs {

    @Autowired
    private GradeCollaborateurService gradeCollaborateurService;

    @GetMapping("/libelle/{libelle}")
    public GradeCollaborateur findByLibelle(@PathVariable String libelle) {
        return gradeCollaborateurService.findByLibelle(libelle);
    }

    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle(@PathVariable String libelle) {
        return gradeCollaborateurService.deleteByLibelle(libelle);
    }

    @GetMapping("/")
    public List<GradeCollaborateur> findAll() {
        return gradeCollaborateurService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody GradeCollaborateur gradeCollaborateur) {
        return gradeCollaborateurService.save(gradeCollaborateur);
    }
}
