package com.njcoder.learningSpringAnnotations.Controller;

import com.njcoder.learningSpringAnnotations.Pizza.PizzaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class PizzaController {

    @Autowired
    public PizzaType pizzaType;
    public void getPizza() {
        pizzaType.getPizza();
    }
}
