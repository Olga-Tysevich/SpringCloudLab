package com.springclient.springclient.meetrics;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Query: rate(metrics_lucky_word_requests_counter_total[1m])
 */
@Component
@RequiredArgsConstructor
public class SpringClientMetrics {
    private Counter luckyWordRequestCounter;
    private final MeterRegistry meterRegistry;

    @PostConstruct
    public void initMetrics() {
        luckyWordRequestCounter = meterRegistry.counter("metrics.lucky-word-requests.counter");
    }

    public void incrementLuckyWordRequestCounter() {
        luckyWordRequestCounter.increment();
    }
}
