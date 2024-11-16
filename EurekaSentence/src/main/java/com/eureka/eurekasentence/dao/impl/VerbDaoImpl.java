package com.eureka.eurekasentence.dao.impl;

import org.springframework.stereotype.Component;

@Component("eureka-verb")
public class VerbDaoImpl extends WordDaoImpl {
    @Override
    public String getPartOfSpeech() {
        return "eureka-verb";
    }
}
