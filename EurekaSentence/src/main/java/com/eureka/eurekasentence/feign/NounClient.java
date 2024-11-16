package com.eureka.eurekasentence.feign;

import com.eureka.eurekasentence.entities.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-noun")
public interface NounClient {
    @GetMapping("/")
    Word getWord();
}
