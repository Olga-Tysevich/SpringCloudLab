package com.eureka.eurekasentence.services.impl;

import com.eureka.eurekasentence.dao.WordDAO;
import com.eureka.eurekasentence.feign.NounClient;
import com.eureka.eurekasentence.services.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SentenceServiceImpl implements SentenceService {
    @Qualifier("eureka-adjective")
    @Autowired
    private WordDAO adjectiveDao;
    @Qualifier("eureka-article")
    @Autowired
    private WordDAO articleDao;
    @Autowired
    private NounClient nounClient;
    @Qualifier("eureka-subject")
    @Autowired
    private WordDAO subjectDao;
    @Qualifier("eureka-verb")
    @Autowired
    private WordDAO verbDao;

    public String buildSentence() {
        return String.format("%s %s %s %s %s.",
                adjectiveDao.getWord().getWord(),
                articleDao.getWord().getWord(),
                nounClient.getWord().getWord(),
                subjectDao.getWord().getWord(),
                verbDao.getWord().getWord());
    }
}
