package com.loanprocessing.model;

import java.math.BigDecimal;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PostPersist;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Transient;

@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "CUSTOMER_DATA")
public class CustomerData {

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_id_seq")
   @SequenceGenerator(name="customer_id_seq", sequenceName = "CUSTOMER_ID_SEQ", allocationSize = 1)
    private Long customerId;
    private String name;
    private String pan;
    private String aadhar;
    private String szstate;
    private String district;
    private String city;
    private String addressLine;
    private BigDecimal netMonthlyIncome;
    
    @PostPersist
    public void formatCustomerId() {
        this.formattedCustomerId = "cust" + String.format("%03d", this.customerId);
    }
    
    public String getFormattedCustomerId() {
		return formattedCustomerId;
	}

	public void setFormattedCustomerId(String formattedCustomerId) {
		this.formattedCustomerId = formattedCustomerId;
	}

	private Double obligation;
    @Transient
    private String formattedCustomerId;

    // Getters and Setters

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

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

    public BigDecimal getNetMonthlyIncome() {
        return netMonthlyIncome;
    }

    public void setNetMonthlyIncome(BigDecimal bigDecimal) {
        this.netMonthlyIncome = bigDecimal;
    }

    public Double getObligation() {
        return obligation;
    }

    public void setObligation(Double obligation) {
        this.obligation = obligation;
    }
}

