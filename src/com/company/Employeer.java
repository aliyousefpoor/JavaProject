package com.company;

import java.util.Scanner;

public class Employeer {

    Scanner input=new Scanner(System.in);

    String name;
    int id;
    String workexcp;
    public void name(){

        System.out.println("Enter your Name :\n");
        name=input.nextLine();
    }

    public void number(){

        System.out.println("Enter your Id :\n");
        id=input.nextInt();
    }

    public void workexperience(){
        System.out.println("Enter your Work Experience :\n");
        workexcp=input.nextLine();
    }


}
