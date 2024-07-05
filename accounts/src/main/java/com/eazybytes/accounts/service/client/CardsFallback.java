package com.eazybytes.accounts.service.client;

import com.eazybytes.accounts.dto.CardsDto;
import org.springframework.stereotype.Component;

@Component
public class CardsFallback implements CardsFeignClient{
    @Override
    public CardsDto fetchCard(String mobileNumber) {
        return null;
    }
}
