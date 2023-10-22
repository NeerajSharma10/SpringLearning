package com.njcoder.learningSpringAnnotations.Config;

import com.njcoder.learningSpringAnnotations.Controller.PizzaController;
import com.njcoder.learningSpringAnnotations.Pizza.PizzaType;
import com.njcoder.learningSpringAnnotations.Pizza.VeganPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "veganPizzaBean")
    public PizzaType pizzaType() {
        return new VeganPizza();
    }
}
