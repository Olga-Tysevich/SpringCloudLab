package com.eureka.eurekasentence.controllers;

import com.eureka.eurekasentence.services.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sentence")
public class SentenceController {
    @Autowired
    private SentenceService sentenceService;

    @GetMapping("/get")
    public String getSentence() {
        return
                "<h3>Some Sentences</h3><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>"
                ;
    }



    /*
     * When using the `@LoadBalanced` annotation, RestTemplate assumes that you passed a service name, not a URI.
     * When you call `restTemplate.getForObject(uri, String.class);`, `uri` in this case must be the service name, not the full URI.
     * */
//    public String getWord(String service) {
//        List<ServiceInstance> list = client.getInstances(service);
//        if (list != null && !list.isEmpty()) {
//            URI uri = list.get(0).getUri();
//            if (uri !=null ) {
//                return restTemplate.getForObject(uri, String.class);
//            }
//        }
//        return null;
//        return restTemplate.getForObject("http://" + service, String.class);
//    }
}
