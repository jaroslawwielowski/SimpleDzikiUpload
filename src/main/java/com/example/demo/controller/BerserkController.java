package com.example.demo.controller;

import com.example.demo.dto.BerserkDto;
import com.example.demo.entities.Berserk;
import com.example.demo.repository.BerserkRepository;
import com.example.demo.service.BerserkService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class BerserkController {
    private final BerserkRepository berserkRepository;
    private final BerserkService berserkService;


    public BerserkController(BerserkRepository berserkRepository, BerserkService berserkService) {
        this.berserkRepository = berserkRepository;
        this.berserkService = berserkService;
    }


    @GetMapping(value = "/")
    public String home(Model model){
        List<Berserk> allBerserkList = new ArrayList<>();
        try {
            allBerserkList = berserkRepository.findAll();
        }catch (Exception e){
        }
        Collections.reverse(allBerserkList);
        model.addAttribute("berserks", allBerserkList);
        model.addAttribute(new Berserk());
        return "first";
    }

    @PostMapping(value = "/")
    public String home1(@ModelAttribute BerserkDto berserkDto, Model model){
        Berserk berserk = berserkDto.toDto();
        berserkRepository.save(berserk);
        model.addAttribute(new Berserk());
        List<Berserk> allBerserkList = new ArrayList<>();
        try {
            allBerserkList = berserkRepository.findAll();
        }catch (Exception e){
        }
        Collections.reverse(allBerserkList);
        model.addAttribute("berserks", allBerserkList);

        return "first";
    }


}
