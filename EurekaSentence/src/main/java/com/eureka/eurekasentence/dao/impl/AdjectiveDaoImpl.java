package com.eureka.eurekasentence.dao.impl;

import org.springframework.stereotype.Component;

@Component("eureka-adjective")
public class AdjectiveDaoImpl extends WordDaoImpl {

    @Override
    public String getPartOfSpeech() {
        return "eureka-adjective";
    }
}
