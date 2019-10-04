package com.company;

import java.util.Scanner;

public class MobileProgramming extends Employeer {

    Scanner input = new Scanner(System.in);
    String lastjob;
    String releasedapp;


    public void mobilep(){
        Employeer emp =new Employeer();
        emp.Input_Specifications();

        System.out.println("Enter your Last Job :\n");
        lastjob=input.nextLine();

        System.out.println("Enter Number of Released App :\n");
        releasedapp=input.nextLine();


        emp.disply();

        System.out.println("Your Last Job is :" + lastjob);
        System.out.println("Your Number Of Released App is :" + releasedapp);
    }
}
