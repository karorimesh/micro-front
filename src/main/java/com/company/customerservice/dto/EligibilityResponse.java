package com.company.customerservice.dto;


public class EligibilityResponse {
    private String status;
    private boolean eligible;

    private String message;

    public EligibilityResponse(String status, boolean eligible, String message) {
        this.status = status;
        this.eligible = eligible;
        this.message = message;
    }

    public EligibilityResponse() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isEligible() {
        return eligible;
    }

    public void setEligible(boolean eligible) {
        this.eligible = eligible;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
