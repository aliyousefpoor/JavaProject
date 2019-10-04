package com.company;

import java.util.Scanner;

public class WebProgramming extends Employeer {

    Scanner input = new Scanner(System.in);
    String lastjob;
    String language_used;


    public void last_job(){

        System.out.println("Enter your Last Job :\n");
        lastjob=input.nextLine();
    }

    public void language(){

        System.out.println("Enter your language Used:\n");
        language_used=input.nextLine();
    }
}
