package com.eureka.eurekasentence.feign;

import com.eureka.eurekasentence.entities.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-article")
public interface ArticleClient {
    @GetMapping("/")
    Word getWord();
}
