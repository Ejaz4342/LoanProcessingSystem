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
	
	CustomerData  customer;

	
	public LoanApplications submitApplication(LoanApplicationsDto dto) {
		
	
	if(dto.getCustomerId() !=null) {
		// Existing customer
		 customer= customerRepo.findById(dto.getCustomerId())
				.orElseThrow(()-> new ResourceNotFoundException("Customer Not Found"));
	}else {
		
		CustomerData newCustomerData = new CustomerData();
		newCustomerData.setName(dto.getCustomer().getName());
		newCustomerData.setPan(dto.getCustomer().getPan());
		newCustomerData.setAadhar(dto.getCustomer().getAadhar());
		newCustomerData.setAddressLine(dto.getCustomer().getAddressLine());
		newCustomerData.setCity(dto.getCustomer().getCity());
		newCustomerData.setDistrict(dto.getCustomer().getDistrict());
		newCustomerData.setSzstate(dto.getCustomer().getSzstate());
		newCustomerData.setNetMonthlyIncome(dto.getCustomer().getNetMonthlyIncome());
		newCustomerData.setObligation(dto.getCustomer().getObligation());
		customer = customerRepo.save(newCustomerData);
	}
	
	// Now save the loan application with the associated customer
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









