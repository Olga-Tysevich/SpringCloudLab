package com.eureka.eurekasubject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("eureka")
public class WordsController {


    @GetMapping("/")
    public @ResponseBody String getWord() {
//        String[] wordArray = words.split(",");
//        int i = (int)Math.round(Math.random() * (wordArray.length - 1));
//        return wordArray[i];
        return null;
    }

}
