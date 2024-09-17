package com.loanprocessing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loanprocessing.model.CustomerData;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerData, Long> {

}
