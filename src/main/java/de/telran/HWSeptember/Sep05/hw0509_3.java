package de.telran.HWSeptember.Sep05;

import java.util.Scanner;

public class hw0509_3 {

    public static void main(String[] args) {

      mathMethods mathMethods = new mathMethods();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите первое число   " );
        double x = scanner1.nextDouble();

        Scanner scanner2 =new Scanner(System.in);
        System.out.println("Введите второе число   " );
        double y = scanner2.nextDouble();





        System.out.println("Результат ваших чисел равна   " + mathMethods.add(x,y));
        System.out.println("Результат сложения ваших чисел равна   " + mathMethods.sub(x,y));
        System.out.println("Результат умножения ваших чисел равна   " + mathMethods.mult(x,y));
        System.out.println("Результат деления ваших чисел равна   " + mathMethods.div(x,y));


        }
    }





