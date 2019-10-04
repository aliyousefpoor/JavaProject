package com.company;

import java.util.Scanner;

public class Employeer {

    Scanner input=new Scanner(System.in);

    String name;
    Long id;
    int workexcp;

    public void Input_Specifications() {

        System.out.println("Enter your Name :\n");
        name = input.nextLine();

        System.out.println("Enter your Id :\n");
        id = input.nextLong();

        System.out.println("Enter Your Work Experience(Number Of Year) :\n");
        workexcp = input.nextInt();





    }

    public void disply(){

        System.out.println("Your Name is :" + name);
        System.out.println("Your Id is :" + id);
        System.out.println("Your Work Experience is :" + workexcp);
    }
}
