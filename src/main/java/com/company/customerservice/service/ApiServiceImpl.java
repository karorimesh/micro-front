package com.company.customerservice.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ApiServiceImpl<T, U > implements ApiService<T, U>{
    private final RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Override
    public U makePostRequest(String endpoint, T requestBody, U response) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(List.of(MediaType.ALL));
        HttpEntity<T> httpEntity = new HttpEntity<>(requestBody, headers);
        try {
            U res = (U) restTemplate.postForObject(
                    "http://" + endpoint,
                    httpEntity,
                    response.getClass()
            );
            return res;
        } catch (Exception e) {
            // Log error
            return response;
        }
    }

    @Override
    public U makeGetRequest(String endpoint, T requestBody, U response) {
        return null;
    }
}
