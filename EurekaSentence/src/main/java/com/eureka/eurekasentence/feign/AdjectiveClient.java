package com.eureka.eurekasentence.feign;

import com.eureka.eurekasentence.entities.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-adjective")
public interface AdjectiveClient {
    @GetMapping("/")
    Word getWord();
}
