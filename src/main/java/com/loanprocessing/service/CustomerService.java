package com.loanprocessing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loanprocessing.model.CustomerData;
import com.loanprocessing.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	public CustomerData getCustomerData(Long id) {
		return customerRepo.findById(id).orElse(null);
	}
	
	public List<CustomerData> getAllCustomers(){
		
		return customerRepo.findAll();
	}

}
