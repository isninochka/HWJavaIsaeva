package de.telran.lesson4;

import java.util.Scanner;

public class HWLesson4Second {
    public static void main(String[] args) {

        Scanner scanx = new Scanner(System.in);
        System.out.println("Please give me first number:");

        double x =scanx.nextDouble();

        Scanner scany = new Scanner(System.in);
        System.out.println("Please give me second number:");

        double y =scany.nextDouble();


        double add = x+y;
        System.out.println("The addition of your numbers is     "+add);

        double sub = x-y;
        System.out.println("The subtraction of your numbers is     "+sub);

        double mul = x*y;
        System.out.println("The multiplication of your numbers is     "+mul);

        double div = x/y;
        System.out.println("The division of your numbers is     "+div);




    }
}
