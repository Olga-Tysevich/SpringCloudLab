package com.eureka.eurekasentence.dao.impl;

import com.eureka.eurekasentence.dao.WordDAO;
import com.eureka.eurekasentence.entities.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public abstract class WordDaoImpl implements WordDAO {
    //	Inject the load-balancing RestTemplate:
    @Autowired
    private RestTemplate template;

    public abstract String getPartOfSpeech();

    public Word getWord() {
        String service = getPartOfSpeech();
        try {
            return template.getForObject("http://" + service, Word.class);
        } catch (Exception e ) {
            System.out.println("Error retrieving " + service + " Error: " + e.getMessage());
            return new Word("(unknown " + service + ")");
        }

    }

}
