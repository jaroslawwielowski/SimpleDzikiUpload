package com.example.demo.controller;

import com.example.demo.repository.BerserkRepository;
import com.example.demo.service.BerserkService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class BerserkController {
    private final BerserkRepository berserkRepository;
    private final BerserkService berserkService;


    public BerserkController(BerserkRepository berserkRepository, BerserkService berserkService) {
        this.berserkRepository = berserkRepository;
        this.berserkService = berserkService;
    }


    @GetMapping(value = "/")
//    @ResponseBody
    public String home(HttpServletRequest request, HttpServletResponse response, Model model){
        return "first";
    }

    @PostMapping(value = "/")
    public String home1(){
        return "first";
    }


    @GetMapping(value = "/j")
    public String home3(){
        return "jojo";
    }
}
