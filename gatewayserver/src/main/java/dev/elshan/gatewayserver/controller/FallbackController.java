package dev.elshan.gatewayserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @GetMapping("/contactSupport")
    public Mono<String> fallback() {
        return Mono.just("An error occured, please contact with support team");
    }
}
