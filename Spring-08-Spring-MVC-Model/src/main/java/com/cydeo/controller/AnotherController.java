package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/another")
public class AnotherController {

    @RequestMapping("/list")//localhost:9090/another/list
    public String showtable (Model model){

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Mike","Tyson",45, Gender.MALE));
        mentorList.add(new Mentor("Mike","Tyson",45, Gender.MALE));
        mentorList.add(new Mentor("Mike","Tyson",45, Gender.MALE));
        mentorList.add(new Mentor("Mike","Tyson",45, Gender.MALE));

        model.addAttribute("mentors",mentorList);

        return "/mentor/mentor-list";

    }
}
