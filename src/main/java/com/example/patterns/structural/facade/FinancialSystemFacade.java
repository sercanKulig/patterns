package com.example.patterns.structural.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class FinancialSystemFacade {

    @Autowired
    private BillingSystem billingSystem;

    @Autowired
    private InvoiceCustomerSystem invoiceCustomerSystem;

    public void createInvoice(Integer amount) {
        Bill bill = null;
        try {
            bill = billingSystem.createBill(amount);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            invoiceCustomerSystem.createInvoiceForBill(bill);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
