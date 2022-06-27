package com.kebab.cloud_note_java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("name","spring");
        return "index";
    }
}
