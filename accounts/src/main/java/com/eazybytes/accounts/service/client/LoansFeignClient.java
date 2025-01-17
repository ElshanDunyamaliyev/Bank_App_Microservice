package com.eazybytes.accounts.service.client;

import com.eazybytes.accounts.dto.LoansDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "loans",fallback = LoansFallback.class)
@Primary
public interface LoansFeignClient {

    @GetMapping("/loans")
    LoansDto fetchLoan(@RequestParam String mobileNumber);
}
