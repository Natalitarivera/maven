package com.mavenmvc.controllers;

@Controller
public class MyMavenController{

//http://localhost:8080/springMVCDemo/getQuote.html

    @RequestMapping(value="/getQuote")
    public String getRandomQuote(Model mode){

        model.addAtributte("randomQuote", "to be or not to be-Shakespeare");
        return "quote";
    }
}