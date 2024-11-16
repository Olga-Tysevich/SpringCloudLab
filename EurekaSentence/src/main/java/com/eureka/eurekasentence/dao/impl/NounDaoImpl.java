package com.eureka.eurekasentence.dao.impl;

import org.springframework.stereotype.Component;

@Component("eureka-noun")
public class NounDaoImpl extends WordDaoImpl{

    @Override
    public String getPartOfSpeech() {
        return "eureka-noun";
    }
}
