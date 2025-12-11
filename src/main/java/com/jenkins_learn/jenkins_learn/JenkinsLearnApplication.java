package com.jenkins_learn.jenkins_learn;

import com.jenkins_learn.jenkins_learn.config.PizzaConfig;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@Log
public class JenkinsLearnApplication implements CommandLineRunner {

    private final PizzaConfig pizzaConfig;
    JenkinsLearnApplication(PizzaConfig pizzaConfig) {
        this.pizzaConfig=pizzaConfig;
    }
	public static void main(String[] args) {
		SpringApplication.run(JenkinsLearnApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        log.info(String.format("I want a %s crust pizza, with %s and %s sauce",
                pizzaConfig.getCrust(),
                pizzaConfig.getTopping(),
                pizzaConfig.getSauce()
                ));

        log.info(Hello.showing(Arrays.asList(10,20)));
    }

    private static class Hello {
        private static String showing(List<Integer> nums) {
            for(int num:nums) log.info(String.format("%d\t", num));
            return "kushal";
        }
    }
}



