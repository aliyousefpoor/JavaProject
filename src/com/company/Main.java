package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Accounting account =new Accounting();
        WebProgramming web = new WebProgramming();
        MobileProgramming mobile = new MobileProgramming();
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("If Occupation is Accounting enter 1 ," +"\n" + "If Occupation WebProgramming enter 2 ," +"\n"+ "If Occupation WebProgramming enter 3 .");
        num = input.nextInt();

        if (num==1){
            account.last_educational_certificate();



        }
        else if (num==2){


            web.webp();


        }

        else if (num==3){
            mobile.mobilep();


        }
    }
}
