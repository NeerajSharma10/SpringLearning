package com.njcoder.learningSpringAnnotations.Pizza;

import org.springframework.stereotype.Component;

@Component
public class NonVegPizza implements PizzaType{
    @Override
    public void getPizza() {
        System.out.println("this is Non Veg Pizza");
    }
}
