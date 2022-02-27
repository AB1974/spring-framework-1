package com.cydeo.loosly_coupled;

public class CydeoApp {

    public static void main(String[] args) {
        FullTimeMentor fulltime = new FullTimeMentor();
        PartTimeMentor parttime = new PartTimeMentor();
//LOose couple
        MentorAccount mentorAccount= new MentorAccount(fulltime);
        mentorAccount.manageAccount();
    }
}
