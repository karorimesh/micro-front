package com.company.customerservice.dto;


public class EligibilityRequest {
    private String fullName;
    private String id;

    public EligibilityRequest(String fullName, String id) {
        this.fullName = fullName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "EligibilityRequest{" +
                "fullName='" + fullName + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
