package com.eazybytes.accounts.service.client;

import com.eazybytes.accounts.dto.LoansDto;
import org.springframework.stereotype.Component;

@Component
public class LoansFallback implements LoansFeignClient {
    @Override
    public LoansDto fetchLoan(String mobileNumber) {
        return null;
    }
}
