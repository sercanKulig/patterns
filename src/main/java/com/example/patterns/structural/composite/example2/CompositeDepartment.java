package com.example.patterns.structural.composite.example2;

import java.util.ArrayList;
import java.util.List;

public class CompositeDepartment implements Department {
    private List<Department> childDepartments;
    CompositeDepartment() {
        this.childDepartments = new ArrayList<>();
    }

    @Override
    public void printDepartmentCosts() {
        childDepartments.forEach(Department::printDepartmentCosts);
    }

    void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }
}
