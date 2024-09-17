package com.loanprocessing.model;

@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "CUSTOMER_DATA")
public class CustomerData {

    @jakarta.persistence.Id
    private Long customerId;
    private String name;
    private String pan;
    private String aadhar;
    private String szstate;
    private String district;
    private String city;
    private String addressLine;
    private Double netMonthlyIncome;
    private Double obligation;

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

    public Double getNetMonthlyIncome() {
        return netMonthlyIncome;
    }

    public void setNetMonthlyIncome(Double netMonthlyIncome) {
        this.netMonthlyIncome = netMonthlyIncome;
    }

    public Double getObligation() {
        return obligation;
    }

    public void setObligation(Double obligation) {
        this.obligation = obligation;
    }
}

