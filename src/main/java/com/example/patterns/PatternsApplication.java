package com.example.patterns;

import com.example.patterns.structural.facade.FinancialSystemFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternsApplication {

	private static FinancialSystemFacade financialSystemFacade;

	@Autowired
	public PatternsApplication(FinancialSystemFacade financialSystemFacade) {
		PatternsApplication.financialSystemFacade = financialSystemFacade;
	}

	public static void main(String[] args) {
		SpringApplication.run(PatternsApplication.class, args);
		financialSystemFacade.createInvoice(100);
	}
}
