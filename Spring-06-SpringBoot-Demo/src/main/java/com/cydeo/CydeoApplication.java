package com.cydeo;

import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication this is your configuration class
//also enables component scanning for package that the class in it ( com.cydeo)
//enable auto configuration

@SpringBootApplication
public class CydeoApplication {

    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

     ApplicationContext context= SpringApplication.run(CydeoApplication.class, args);
     CommentService cs =context.getBean(CommentService.class);

     cs.publishComment(comment);

    }

}
