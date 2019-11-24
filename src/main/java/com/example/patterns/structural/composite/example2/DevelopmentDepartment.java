package com.example.patterns.structural.composite.example2;

public class DevelopmentDepartment implements Department {
    private Integer id;
    private String name;

    @Override
    public void printDepartmentCosts() {
        System.out.println(getClass().getSimpleName());
    }

    public DevelopmentDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
