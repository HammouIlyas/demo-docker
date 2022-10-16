package com.example.demodocker;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RequestMapping("/")
public class ApplicationController {

    @GetMapping("")
    @ResponseBody
    public String homePage(){
        return "index.html";
    }
}

