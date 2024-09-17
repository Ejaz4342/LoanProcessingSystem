package com.loanprocessing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoanApplicationFormController {

	// Method to render the loan application form
	@GetMapping("/loan-application-form")
	public String loanApplicationForm() {
		// Return the Thymeleaf template name (loan-application-form.html)
		return "loan-application-form";
	}

}
