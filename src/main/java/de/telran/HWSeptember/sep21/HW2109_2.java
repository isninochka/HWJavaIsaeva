package de.telran.HWSeptember.sep21;

import de.telran.HWSeptember.sep07.UserInput;

import java.util.Random;
import java.util.Scanner;

public class HW2109_2 {

//    Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3.
//    Введенное пользователем число сохраняется в переменную n.
//    Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
//    Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
//    Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.

    public static void main(String[] args) {


        Random random = new Random();

        System.out.print("Введите размер массива (натуральное число, больше 3): ");
        UserInput userInput = new UserInput();
        int n = userInput.userInputInt();

        if (n <= 3) {
            System.out.print("Не правильно введен размер массива! Попробуйте еще раз ");
            return;   }

        int[] intArray = new int[n];
        int evenNum = 0;
        System.out.println("Ваш массив выглядит так: ");

        for (int i = 0; i < n; i++) {
            intArray[i] = random.nextInt(50);
            System.out.print(intArray[i] + ",");

            if (intArray[i] % 2 == 0 && intArray[i] != 0) {
                evenNum++;  }
        }
        System.out.println();

        int[] intArrayEven = new int[evenNum];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (intArray[i] % 2 == 0 && intArray[i] != 0) {
                intArrayEven[count] = intArray[i];
                count++;   }
        }
        System.out.println("Ваш массив с четными числами выглядит так: ");

        for (int i = 0; i < count; i++) {
            System.out.print(intArrayEven[i] + ",");
        }
    }    }