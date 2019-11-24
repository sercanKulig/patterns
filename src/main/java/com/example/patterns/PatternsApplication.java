package com.example.patterns;

import com.example.patterns.structural.facade.FinancialSystemFacadeImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternsApplication {

	private static final Logger logger = LoggerFactory.getLogger(PatternsApplication.class);
	private static FinancialSystemFacadeImpl financialSystemFacadeImpl;

	@Autowired
	public PatternsApplication(FinancialSystemFacadeImpl financialSystemFacadeImpl) {
		PatternsApplication.financialSystemFacadeImpl = financialSystemFacadeImpl;
	}

	public static void main(String[] args) {
		SpringApplication.run(PatternsApplication.class, args);
		financialSystemFacadeImpl.createInvoice(100);
	}
}
