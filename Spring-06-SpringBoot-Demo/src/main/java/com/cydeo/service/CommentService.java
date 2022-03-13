package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    //business logic goes here
    //interface//dependency classes //developers good practice//we wire these are by using constructor
    //we do not need to put autowired annotation
private final CommentRepository commentRepository;
private final CommentNotificationProxy commentNotificationProxy;
//constructor//autowired no need because there is one constructor
    public CommentService(CommentRepository commentRepository, @Qualifier("EMAIL")CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;

    }
//method
    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);

    }
}
