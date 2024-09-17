package com.loanprocessing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loanprocessing.model.LoanApplications;

@Repository
public interface LoanApplicationsRepository extends JpaRepository<LoanApplications, Long>{

}
