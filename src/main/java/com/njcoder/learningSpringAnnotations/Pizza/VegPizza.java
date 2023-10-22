package com.njcoder.learningSpringAnnotations.Pizza;

import org.springframework.stereotype.Component;

@Component
public class VegPizza implements PizzaType{

    @Override
    public void getPizza() {
        System.out.println("this is vegPizza");
    }
}
