package com.example.patterns.creational.strategy.controller;

import com.example.patterns.creational.strategy.resource.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StrategyController {

    @GetMapping("/request")
    public int execute() {
        StrategyContext context = new StrategyContext(new OperationAdd());
        System.out.println("add " + context.initializeStrategy(10,5));

        context = new StrategyContext(new OperationSubstract());
        System.out.println("substract " + context.initializeStrategy(10,5));

        context = new StrategyContext(new OperationMultiply());
        System.out.println("multiply " + context.initializeStrategy(10,5));
        return context.initializeStrategy(10,5);
    }


    /* Resource Option */
    @Resource(name = "add")
    Strategy addStrategy;
    @Resource(name = "multiply")
    Strategy multiplyStrategy;
    @Resource(name = "substract")
    Strategy substractStrategy;
    @GetMapping("/requestBootBean")
    public int executeWithBeen() {
        System.out.println("add " + addStrategy.doOperation(10,5));
        System.out.println("substract " + substractStrategy.doOperation(10,5));
        System.out.println("multiply " + multiplyStrategy.doOperation(10,5));
        return 1;
    }
    /* Autowired Option */

    @Autowired
    BeanFactory bf;
    @GetMapping("/requestBootAutowired")
    public void executeWithAutowired() {
        System.out.println(bf.getBean("add", Strategy.class).doOperation(10,5));
        System.out.println(bf.getBean("substract", Strategy.class).doOperation(10,5));
        System.out.println(bf.getBean("multiply", Strategy.class).doOperation(10,5));
    }

}
