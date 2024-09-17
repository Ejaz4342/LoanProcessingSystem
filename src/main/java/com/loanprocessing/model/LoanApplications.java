package com.loanprocessing.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="LOAN_APPLICATIONS")
public class LoanApplications {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="APPLICATION_ID")
	private Long ApplicationId;
	
	@ManyToOne
	@JoinColumn(name="CUSTOMER_ID",nullable = false)
	private CustomerData customerData;
	
	@Column(name="APPLICATION_DATE")
	@Temporal(TemporalType.DATE)
	private Date applicationDate;
	
	@Column(name="STATUS")
	private String ststus;
	
	@Column(name="LOAN_AMOUNT")
	private BigDecimal loanAmount;
	
	@Column(name="LOAN_TERM")
	private Integer loanTerm;
	
	@Column(name="INTEREST_RATE")
	private BigDecimal interestRate;

	public Long getApplicationId() {
		return ApplicationId;
	}

	public void setApplicationId(Long applicationId) {
		ApplicationId = applicationId;
	}

	public CustomerData getCustomerData() {
		return customerData;
	}

	public void setCustomerData(CustomerData customerData) {
		this.customerData = customerData;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}

	public String getStstus() {
		return ststus;
	}

	public void setStstus(String ststus) {
		this.ststus = ststus;
	}

	public BigDecimal getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(BigDecimal loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Integer getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(Integer loanTerm) {
		this.loanTerm = loanTerm;
	}

	public BigDecimal getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}

}

