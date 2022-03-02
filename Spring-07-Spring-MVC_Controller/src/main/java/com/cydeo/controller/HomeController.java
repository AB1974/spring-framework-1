package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Dispatcher servlet comes here and search for end point!!!
@Controller
public class HomeController {


    @RequestMapping("/home")
    public String home(){
        return  "home.html";
        //return views on UI
    }
    //Dispatcher is looking to @RequestMapping
    //end point of url should match request mapping parameter
    @RequestMapping("/welcome")
    public String welcome(){
        return  "welcome.html";
    }

    //Dispatcher is looking to @RequestMapping
    @RequestMapping
    public String welcome3(){
        return  "welcome.html";
    }

}
