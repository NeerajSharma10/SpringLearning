package com.njcoder.learningSpringAnnotations.Pizza;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

public class VeganPizza implements PizzaType{
    @Override
    public void getPizza() {
        System.out.println("This is vegan pizza !!!");
    }
}
