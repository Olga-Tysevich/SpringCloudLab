package com.eureka.eurekasentence.dao.impl;

import org.springframework.stereotype.Component;

@Component("eureka-article")
public class ArticleDaoImpl extends WordDaoImpl {

    @Override
    public String getPartOfSpeech() {
        return "eureka-article";
    }
}
