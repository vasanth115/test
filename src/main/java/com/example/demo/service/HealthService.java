package com.example.demo.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class HealthService {

    public Mono<String> health() {
        return Mono.just("health");
    }
}
