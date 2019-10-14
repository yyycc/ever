package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
public class EverIndexController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String hello() {
        return "home";
    }

   /* @RequestMapping(value = "/{word}", method = RequestMethod.GET)
    public String hello(@PathVariable("word") String word) {
        return "back:" + word;
    }*/

    @RequestMapping(value = "/cyy", method = RequestMethod.GET)
    public String cyy(String cyy, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with, Content-Type, token, Accept");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        return "this is a project created by cyy";
    }
}
