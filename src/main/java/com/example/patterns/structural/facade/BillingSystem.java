package com.example.patterns.structural.facade;

import org.springframework.stereotype.Service;

@Service
public class BillingSystem {
    public Bill createBill(Integer amount) {
        return new Bill(amount);
    }
}
