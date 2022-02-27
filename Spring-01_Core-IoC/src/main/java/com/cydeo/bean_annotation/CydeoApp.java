package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {
        //Runner Class
        //interface                     //implementation classes
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class,ConfigAny.class);
        //Spring Core container concept
        //We are calling Bean Object from container
        FullTimeMentor fm= container.getBean(FullTimeMentor.class);
        fm.createAccount();

      //  PartTimeMentor pt = container.getBean("p1",PartTimeMentor.class);
       PartTimeMentor pt = container.getBean(PartTimeMentor.class);
        pt.createAccount();
     //   PartTimeMentor pt2 = container.getBean("p2",PartTimeMentor.class);
      //  pt.createAccount();
        //We are printing Developer
        String fm1 = container.getBean(String.class);
        System.out.println(fm1);

        Integer int1  = container.getBean(Integer.class);
        System.out.println(int1);


    }
}
