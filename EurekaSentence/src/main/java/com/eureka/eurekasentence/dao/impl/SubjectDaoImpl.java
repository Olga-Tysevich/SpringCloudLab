package com.eureka.eurekasentence.dao.impl;

import org.springframework.stereotype.Component;

@Component("eureka-subject")
public class SubjectDaoImpl extends WordDaoImpl {

    @Override
    public String getPartOfSpeech() {
        return "eureka-subject";
    }
}
