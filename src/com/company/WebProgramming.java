package com.company;

import java.util.Scanner;

public class WebProgramming extends Employeer {

    Scanner input = new Scanner(System.in);
    String lastjob;
    String language_used;




    public void webp(){
        Employeer emp =new Employeer();
        emp.Input_Specifications();

        System.out.println("Enter your Last Job :\n");
        lastjob=input.nextLine();

        System.out.println("Enter your language Used:\n");
        language_used=input.nextLine();

        emp.disply();
        System.out.println("Your Last Job is :" + lastjob);
        System.out.println("Your Language Used is :" + language_used);

    }
}
