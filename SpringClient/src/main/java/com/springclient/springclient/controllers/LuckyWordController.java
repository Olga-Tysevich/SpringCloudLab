package com.springclient.springclient.controllers;

import com.springclient.springclient.meetrics.SpringClientMetrics;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "word-config")
@Getter
@Setter
public class LuckyWordController {
    @Autowired
    private SpringClientMetrics clientMetrics;
    @Value("${lucky-word:unknown}")
    private String luckyWord;

    @GetMapping("/lucky-word")
    public String showLuckyWord(){
        clientMetrics.incrementLuckyWordRequestCounter();
        return "The lucky word is: " + luckyWord;
    }
}
