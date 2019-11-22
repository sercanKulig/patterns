package com.example.patterns.structural.facade;

import org.springframework.stereotype.Service;

@Service
public class InvoiceCustomerSystem {
    public void createInvoiceForBill(Bill bill) {
        System.out.println(bill.getAmount());
    }
}
