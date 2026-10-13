package com.servicenexus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ServiceController {

    @GetMapping("/services")
    public String searchServices(
            @RequestParam(required = false) String q,
            @RequestParam(required = false) String location,
            Model model) {

        model.addAttribute("query", q);
        model.addAttribute("location", location);

        return "services";
    }
}