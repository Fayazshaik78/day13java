package com.company;

public class Company {
	
    private String companyName;
    private String companyAddress;
    private String companyRules;

    
    private Company(String companyName, String companyAddress, String companyRules) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyRules = companyRules;
    }


    public static Company createCompany(String companyName, String companyAddress, String companyRules) {
        return new Company(companyName, companyAddress, companyRules);
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyRules() {
        return companyRules;
    }

    public void setCompanyRules(String companyRules) {
        this.companyRules = companyRules;
    }

    public String toString() {
        return "Company [Name=" + companyName + "\nAddress=" + companyAddress + "\n Rules=" + companyRules + "]";
    }
}

