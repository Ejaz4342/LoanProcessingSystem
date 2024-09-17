package com.loanprocessing.dto;

import java.math.BigDecimal;

public class LoanApplicationsDto {

	private Long customerId;
	private BigDecimal loanAmount;
	private Integer loanTerm;
	private BigDecimal interestRate;
	
	private CustomerDto customer;
	
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
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
	
	
    public CustomerDto getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerDto customer) {
		this.customer = customer;
	}


	// Nested class for Customer Data
    public static class CustomerDto {
        private String name;
        private String pan;
        private String aadhar;
        private BigDecimal netMonthlyIncome;
        private String szstate;
        private String district;
        private String city;
        private String addressLine;
        private Double obligation;

        public BigDecimal getNetMonthlyIncome() {
			return netMonthlyIncome;
		}

		public void setNetMonthlyIncome(BigDecimal netMonthlyIncome) {
			this.netMonthlyIncome = netMonthlyIncome;
		}

		public String getSzstate() {
			return szstate;
		}

		public void setSzstate(String szstate) {
			this.szstate = szstate;
		}

		public String getDistrict() {
			return district;
		}

		public void setDistrict(String district) {
			this.district = district;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getAddressLine() {
			return addressLine;
		}

		public void setAddressLine(String addressLine) {
			this.addressLine = addressLine;
		}

		public Double getObligation() {
			return obligation;
		}

		public void setObligation(Double obligation) {
			this.obligation = obligation;
		}

		// Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPan() {
            return pan;
        }

        public void setPan(String pan) {
            this.pan = pan;
        }

        public String getAadhar() {
            return aadhar;
        }

        public void setAadhar(String aadhar) {
            this.aadhar = aadhar;
        }

        public BigDecimal getIncome() {
            return netMonthlyIncome;
        }

        public void setIncome(BigDecimal netMonthlyIncome) {
            this.netMonthlyIncome = netMonthlyIncome;
        }
    }
}
