package com.eureka.eurekasentence.services.impl;

import com.eureka.eurekasentence.services.SentenceService;
import com.eureka.eurekasentence.services.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SentenceServiceImpl implements SentenceService {
    @Autowired
    WordService wordService;

    public String buildSentence() {
        long start = System.currentTimeMillis();
        String output = String.format("%s %s %s %s %s.",
                wordService.getSubject().getWord(),
                wordService.getVerb().getWord(),
                wordService.getArticle().getWord(),
                wordService.getAdjective().getWord(),
                wordService.getNoun().getWord());
        long end = System.currentTimeMillis();
        return output + "Elapsed time (ms): " + (end - start);
    }
}
