package com.eureka.eurekasentence.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/sentence")
public class SentenceController {
    @Autowired
    DiscoveryClient client;
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/get")
    public String getSentence() {
        return
                "<h3>Some Sentences</h3><br/>" +
                        buildSentence() + "<br/><br/>" +
                        buildSentence() + "<br/><br/>" +
                        buildSentence() + "<br/><br/>" +
                        buildSentence() + "<br/><br/>" +
                        buildSentence() + "<br/><br/>"
                ;
    }

    public String buildSentence() {
        return String.format("%s %s %s %s %s.",
                getWord("EUREKA-SUBJECT"),
                getWord("EUREKA-VERB"),
                getWord("EUREKA-ARTICLE"),
                getWord("EUREKA-ADJECTIVE"),
                getWord("EUREKA-NOUN"));
    }

    /*
     * When using the `@LoadBalanced` annotation, RestTemplate assumes that you passed a service name, not a URI.
     * When you call `restTemplate.getForObject(uri, String.class);`, `uri` in this case must be the service name, not the full URI.
     * */
    public String getWord(String service) {
//        List<ServiceInstance> list = client.getInstances(service);
//        if (list != null && !list.isEmpty()) {
//            URI uri = list.get(0).getUri();
//            if (uri !=null ) {
//                return restTemplate.getForObject(uri, String.class);
//            }
//        }
//        return null;
        return restTemplate.getForObject("http://" + service, String.class);
    }
}
