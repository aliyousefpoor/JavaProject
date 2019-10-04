package com.company;

import java.util.Scanner;

public class MobileProgramming extends Employeer {

    Scanner input = new Scanner(System.in);
    String lastjob;
    String released_app;


    public void lastjob(){

        System.out.println("Enter your Last Job :\n");
        lastjob=input.nextLine();
    }

    public void released_app(){

        System.out.println("Enter Number of Released App :\n");
        released_app=input.nextLine();
    }
}
