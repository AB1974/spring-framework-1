package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Controller
public class StudentController {


    @RequestMapping("/welcome")
    public String homePage(Model model){

        //In order to use model method
        // we need instance
        //therefore we use Model model as parameter
        model.addAttribute("name","Cydeo");
        model.addAttribute("course","MVC");

        String subject = "Collections";
        model.addAttribute("subject",subject);

        int studentId= new Random().nextInt();
        model.addAttribute("ID",studentId);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(8);
        numbers.add(18);
        numbers.add(10);
        model.addAttribute("numbers",numbers);

        Student student =new Student (1,"Mike","Tyson");
        model.addAttribute("student",student);

        return "/student/welcomed";
    }
}
