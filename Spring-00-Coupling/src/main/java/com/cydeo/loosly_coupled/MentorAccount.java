package com.cydeo.loosly_coupled;

public class MentorAccount {
    //Loose Coupling
    Mentor mentor;


    public MentorAccount(Mentor mentor) {
        this.mentor = mentor;
    }

 public void manageAccount(){
        this.mentor.createAccount();
 }
}
