package com.eureka.eurekasentence.services.impl;

import com.eureka.eurekasentence.entities.Word;
import com.eureka.eurekasentence.feign.*;
import com.eureka.eurekasentence.services.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.stereotype.Service;

@Service
public class WordServiceImpl implements WordService {
    @Autowired
    VerbClient verbClient;
    @Autowired
    SubjectClient subjectClient;
    @Autowired
    ArticleClient articleClient;
    @Autowired
    AdjectiveClient adjectiveClient;
    @Autowired
    NounClient nounClient;
    @Autowired
    CircuitBreakerFactory circuitBreakers;

    @Override
    public Word getSubject() {
        return subjectClient.getWord();
    }

    @Override
    public Word getVerb() {
        return verbClient.getWord();
    }

    @Override
    public Word getArticle() {
        return articleClient.getWord();
    }

    @Override
    public Word getAdjective() {
        CircuitBreaker cb = circuitBreakers.create("adjective");
        return cb.run(
                () -> adjectiveClient.getWord(),
                (throwable) -> getFallbackWord()
        );
    }

    @Override
    public Word getNoun() {
        return nounClient.getWord();
    }

    public Word getFallbackWord() {
        return new Word("");
    }
}
