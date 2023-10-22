package com.njcoder.learningSpringAnnotations;

import com.njcoder.learningSpringAnnotations.Controller.PizzaController;
import com.njcoder.learningSpringAnnotations.Pizza.VeganPizza;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearningSpringAnnotationsApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LearningSpringAnnotationsApplication.class, args);
        VeganPizza veganPizza = (VeganPizza) context.getBean("veganPizzaBean");
        veganPizza.getPizza();



    }

}
