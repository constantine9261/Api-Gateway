package com.nttdata.api_gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GatewayController {
    @GetMapping("/")
    public String home() {
        return "API Gateway is Running!";
    }

    @GetMapping("/myFallback")
    public Mono<String> fallback() {
        return Mono.just("El servicio no está disponible. Intenta nuevamente más tarde.");
    }
}
