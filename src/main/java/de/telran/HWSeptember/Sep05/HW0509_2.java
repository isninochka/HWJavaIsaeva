package de.telran.HWSeptember.Sep05;

import java.util.Scanner;

public class HW0509_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Напечатайте первое слово");
        String input1 = scanner.nextLine();


        System.out.println("Напечатайте второе слово");
        String input2 =scanner.nextLine();

        int FirstHalf= input1.length()/2;

        int SecondHalf =input2.length()/2;

        String newWord =input1.substring(0,FirstHalf) + input2.substring(SecondHalf);

        System.out.println("Новое слово    " + newWord);






    }
}
