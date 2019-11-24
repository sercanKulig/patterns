package com.example.patterns.structural.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinancialSystemFacade implements FinancialSystemFacadeImpl {

    @Autowired
    private BillingSystem billingSystem;

    @Autowired
    private InvoiceCustomerSystem invoiceCustomerSystem;

    public void createInvoice(Integer amount) {
        invoiceCustomerSystem.createInvoiceForBill(billingSystem.createBill(amount));
    }
}
