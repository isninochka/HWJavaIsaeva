package de.telran.HWSeptember.sep21;

import java.util.Random;

import static de.telran.HWSeptember.sep21.HW2109_5Method.*;

public class HW2109_5 {
//    Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
//    Выведите массивы на экран в двух отдельных строках
//    Посчитайте среднее арифметическое элементов каждого массива и сообщите,
//    для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)
public static void main(String[] args) {

    Random random = new Random();
    int[] intArray1 = new int[5];
    int[] intArray2 = new int[5];

    System.out.println("Первый массив выглядит так: ");
    for (int i = 0; i < intArray1.length; i++) {
        intArray1[i]= random.nextInt(5);
        System.out.print(intArray1[i] + ",");
    }

    int average1 = arithmetikMean(intArray1);
    System.out.println();
    System.out.println("Среднее арифметическое первого массива: " + average1);

    System.out.println("Второй массив выглядит так: ");
    for (int i = 0; i < intArray2.length; i++) {
        intArray2[i]= random.nextInt(5);
        System.out.print(intArray2[i] + ",");
    }

    int average2 = arithmetikMean(intArray2);
    System.out.println();
    System.out.println("Среднее арифметическое первого массива: " + average2);

    if (average1>average2){
        System.out.println("Среднее арифметическое первого массива, больше чем второго и равно " + average1);
        }if (average2>average1) {
        System.out.println("Среднее арифметическое второго массива, больше чем первого и равно " + average2);
    }if (average1==average2) {
        System.out.println("Среднее арифметическое двух массивов одинаково");
    }
    }
}

