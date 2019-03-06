package com.example.demo.controller;

import com.example.demo.repository.BerserkRepository;
import org.springframework.stereotype.Controller;

@Controller
public class BerserkController {
    private final BerserkRepository berserkRepository;

    public BerserkController(BerserkRepository berserkRepository) {
        this.berserkRepository = berserkRepository;
    }


}
