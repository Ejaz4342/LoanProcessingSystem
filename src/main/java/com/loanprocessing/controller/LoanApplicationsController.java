package com.loanprocessing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loanprocessing.dto.LoanApplicationsDto;
import com.loanprocessing.model.LoanApplications;
import com.loanprocessing.service.LoanApplicationsService;

@RestController
@RequestMapping("/api/applications")
@Validated
public class LoanApplicationsController {
	
	@Autowired
	private LoanApplicationsService loanApplicationsService;
	
	@PostMapping(value = "submit", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<LoanApplications> submitApplication(@RequestBody LoanApplicationsDto dto){
		
		LoanApplications application = loanApplicationsService.submitApplication(dto);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(application);
	}

}








