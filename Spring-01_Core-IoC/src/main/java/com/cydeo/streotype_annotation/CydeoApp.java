package com.cydeo.streotype_annotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigCourse.class);
        Java jv= context.getBean(Java.class);
        jv.getTeachingHours();

        Selenium sl= context.getBean(Selenium.class);
        sl.getTeachingHours();

        Agile ag= context.getBean(Agile.class);
        ag.getTeachingHours();

    }
}
