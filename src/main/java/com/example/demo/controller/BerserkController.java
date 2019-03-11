package com.example.demo.controller;

import com.example.demo.repository.BerserkRepository;
import com.example.demo.service.BerserkService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"online", "max"})
public class BerserkController {
    private final BerserkRepository berserkRepository;
    private final BerserkService berserkService;


    public BerserkController(BerserkRepository berserkRepository, BerserkService berserkService) {
        this.berserkRepository = berserkRepository;
        this.berserkService = berserkService;
    }


}
