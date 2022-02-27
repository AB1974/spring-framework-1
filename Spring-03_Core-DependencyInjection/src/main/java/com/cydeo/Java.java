package com.cydeo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Java {

     //field injection to in the field of the class - depreciated
    //@Autowired
    OfficeHours officeHours;

    //Constructor injection to the constructor Spring 4.3 @autowired no need it's automatically there in the Spring
    //@Autowired ===> //@AllArgsConstructor handles everything

//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    public void getTeachingHours(){

        System.out.println("Weekly Java teaching hours  : "+ (20 + officeHours.getHours()));
    }

}
