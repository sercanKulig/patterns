package com.example.patterns.structural.composite.example2;

public class Client {
    public static void main(String[] args) {
        CompositeDepartment compositeDepartment = new CompositeDepartment();

        compositeDepartment.addDepartment(new SalesDepartment(
                1, "Sales department"));
        compositeDepartment.addDepartment(new FinancialDepartment(
                2, "Financial department"));
        compositeDepartment.addDepartment(new DevelopmentDepartment(
                3, "Development department"));

        compositeDepartment.printDepartmentCosts();
    }
}
