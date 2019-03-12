package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class BerserkService {

    private String createConfirmationID() {
        return java.util.UUID.randomUUID().toString();
    }


}
