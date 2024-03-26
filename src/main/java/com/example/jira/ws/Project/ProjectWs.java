package com.example.jira.ws.Project;

import com.example.jira.bean.project.Project;
import com.example.jira.service.Project.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("app/project")
public class ProjectWs {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/libelle/{libelle}")
    public Project findByLibelle(@PathVariable String libelle) {
        return projectService.findByLibelle(libelle);
    }

    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle(@PathVariable String libelle) {
        return projectService.deleteByLibelle(libelle);
    }

    @GetMapping("/")
    public List<Project> findAll() {
        return projectService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Project project) {
        return projectService.save(project);
    }
}
