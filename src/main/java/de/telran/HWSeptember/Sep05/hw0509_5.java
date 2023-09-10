package de.telran.HWSeptember.Sep05;

import java.util.Scanner;

public class hw0509_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму в евро, которую вы хотите перевести в доллары США -   ");

        double input = scanner.nextDouble();

        double out = input*1.07;
        System.out.println("Ваша сумма в долларах США равна -   " + out);



    }
}
