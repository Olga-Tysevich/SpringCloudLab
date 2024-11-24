package com.eureka.eurekasentence.services;

import com.eureka.eurekasentence.entities.Word;

public interface WordService {
    Word getSubject();
    Word getVerb();
    Word getArticle();
    Word getAdjective();
    Word getNoun();
}
