package com.loanprocessing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loanprocessing.model.CustomerData;
import com.loanprocessing.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService custService;
	
	@GetMapping("/{id}")
	public ResponseEntity<CustomerData> getCustomerById(@PathVariable("id") Long id){
		
		CustomerData customer = custService.getCustomerData(id);
		if(customer!=null) {
			return ResponseEntity.ok(customer);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping
	public List<CustomerData> getAllCustomers(){
		return custService.getAllCustomers();
	}
	
	public ResponseEntity<CustomerData> createCustomer(@RequestBody CustomerData customerData){
		
		CustomerData createdCustomer = custService.saveCustData(customerData);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdCustomer);
	}

}







