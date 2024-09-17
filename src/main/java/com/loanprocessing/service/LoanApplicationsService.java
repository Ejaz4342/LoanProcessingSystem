package com.loanprocessing.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loanprocessing.dto.LoanApplicationsDto;
import com.loanprocessing.exceptions.ResourceNotFoundException;
import com.loanprocessing.model.CustomerData;
import com.loanprocessing.model.LoanApplications;
import com.loanprocessing.repository.CustomerRepository;
import com.loanprocessing.repository.LoanApplicationsRepository;

@Service
public class LoanApplicationsService {

	@Autowired
	private LoanApplicationsRepository loanApplicationRepo;

	@Autowired
	private CustomerRepository customerRepo;

	public LoanApplications submitApplication(LoanApplicationsDto dto) {
		
		CustomerData customer= customerRepo.findById(dto.getCustomerId())
				.orElseThrow(()-> new ResourceNotFoundException("Customer Not Found"));
		
		
		LoanApplications application=new LoanApplications();
		application.setCustomerData(customer);
		application.setApplicationDate(new Date());
		application.setStstus("Submited");
		application.setLoanAmount(dto.getLoanAmount());
		application.setLoanTerm(dto.getLoanTerm());
		application.setInterestRate(dto.getInterestRate());
		
		return loanApplicationRepo.save(application);
		
	}

}









