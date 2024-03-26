package com.example.jira.service.Imputation;

import com.example.jira.bean.imputation.Imputation;
import com.example.jira.dao.Imputation.ImputationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ImputationService {
    @Autowired
    private ImputationDao imputationDao;

    public Imputation findById(String id) {
        return imputationDao.findById(id);
    }

    @Transactional
    public int deleteById(String id) {
        return imputationDao.deleteById(id);
    }

    public List<Imputation> findAll() {
        return imputationDao.findAll();
    }

}
