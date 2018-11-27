package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class EverIndexController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String hello() {
        return "home";
    }

    @RequestMapping(value = "/{word}", method = RequestMethod.GET)
    public String hello(@PathVariable("word") String word) {
        return "back:" + word;
    }

    @RequestMapping(value = "/cyy", method = RequestMethod.GET)
    public String cyy() {
        return "cyy";
    }
}
