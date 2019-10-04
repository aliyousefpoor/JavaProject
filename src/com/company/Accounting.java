package com.company;

import java.util.Scanner;

public class Accounting extends Employeer {
    Scanner input = new Scanner(System.in);
    String lastedcer;

    public void last_educational_certificate(){
        Employeer emp =new Employeer();

        emp.Input_Specifications();

        System.out.println("Enter Last Educational Certificate :");
        lastedcer =input.nextLine();

        emp.disply();

        System.out.println("Your Last Educational Certificate is :" + lastedcer);


    }
}
