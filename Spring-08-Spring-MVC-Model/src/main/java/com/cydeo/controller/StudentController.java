package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StudentController {


    @RequestMapping("/welcome")
    public String homePage(Model model){

        //In order to use model method
        // we need instance
        //therefore we use Model model as parameter
        model.addAttribute("name","Cydeo");
        model.addAttribute("course","MVC");

        return "student/welcome";
    }
}
