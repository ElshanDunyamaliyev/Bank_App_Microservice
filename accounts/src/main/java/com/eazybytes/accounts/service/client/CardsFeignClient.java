package com.eazybytes.accounts.service.client;

import com.eazybytes.accounts.dto.CardsDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "cards",fallback = CardsFallback.class)
@Primary
public interface CardsFeignClient {

    @GetMapping("/cards")
    CardsDto fetchCard(@RequestParam String mobileNumber);
}
