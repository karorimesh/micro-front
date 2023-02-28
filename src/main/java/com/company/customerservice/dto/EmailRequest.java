package com.company.customerservice.dto;

public class EmailRequest {
    private String subject;
    private String to;
    private String from;
    private String content;

    public EmailRequest(String subject, String to, String from, String content) {
        this.subject = subject;
        this.to = to;
        this.from = from;
        this.content = content;
    }
}
