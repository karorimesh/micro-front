package com.company.customerservice.service;

import org.springframework.stereotype.Service;

@Service
public interface ApiService<T, U> {
    U makePostRequest(String endpoint, T requestBody, U response);
    U makeGetRequest(String endpoint, T requestBody, U response);
}
