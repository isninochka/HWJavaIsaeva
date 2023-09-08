package de.telran.HWSeptember.Sep05;

import java.util.Scanner;

public class HW0509_4 {
    public static void main(String[] args) {

        long num16 = Long.parseLong("333", 16);
        System.out.println(num16);

        String num10 = Long.toHexString(num16);
        System.out.println(num10);

        int num2 = Integer.parseInt("101101",2);
        System.out.println(num2);

        long i =124;
        String num = Long.toBinaryString(i);
        System.out.println(num);

    }


}
