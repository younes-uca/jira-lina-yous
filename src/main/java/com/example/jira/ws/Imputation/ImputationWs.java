package com.example.jira.ws.Imputation;

import com.example.jira.bean.imputation.Imputation;
import com.example.jira.service.Imputation.ImputationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("app/imputation")
public class ImputationWs {

    @Autowired
    private ImputationService imputationService;

    @GetMapping("/id/{id}")
    public Imputation findByLibelle(@PathVariable String id) {
        return imputationService.findById(id);
    }

    @DeleteMapping("/id/{id}")
    public int deleteByLibelle(@PathVariable String id) {
        return imputationService.deleteById(id);
    }

    @GetMapping("/")
    public List<Imputation> findAll() {
        return imputationService.findAll();
    }

}
