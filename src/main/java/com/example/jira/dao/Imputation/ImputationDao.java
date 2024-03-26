package com.example.jira.dao.Imputation;


import com.example.jira.bean.imputation.Imputation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImputationDao extends JpaRepository<Imputation,Long> {
    Imputation findById(String id);
    int deleteById(String id);
}
