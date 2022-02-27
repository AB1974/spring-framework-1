package com.cydeo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {
    //We create method from class which we can to return as object
    @Bean
    Car car () {
    Car c =   new Car();
    c.setMake("Honda");
    return c;
    }
//Direct Wiring
//    @Bean
//    Person person () {
//        Person p = new Person();
//        p.setName("Mike");
//        //direct wiring
//        //calling the bean annotated method from other bean annotated method
//        p.setCar(car());
//        return p;
//    }
     //Autowiring Spring is handling
    //pass as a parameter

    @Bean
    Person person (Car car) {
        Person p = new Person();
        p.setName("Mike");
         p.setCar(car);
        return p;
    }
}
