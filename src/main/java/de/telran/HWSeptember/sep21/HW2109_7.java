package de.telran.HWSeptember.sep21;

import java.util.Random;

import static de.telran.HWSeptember.sep21.HW2109_7Method.*;

public class HW2109_7 {
//    Создайте массив из 5 случайных целых чисел из интервала [10;99]
//    Выведите его на консоль в строку.
//    Определите и выведите на экран сообщение о том, является ли
//    массив строго возрастающей последовательностью (каждый элемент строго больше предыдущего)
public static void main(String[] args) {
    Random random = new Random();
    int arraySize = 5;

    int[] intArray = new int[arraySize];

    System.out.print("Массив выглядит так:  ");

    for (int i = 0; i < intArray.length; i++) {
        intArray[i] = random.nextInt(100 - 10);
        System.out.print(intArray[i] + ",");
    }
    System.out.println();
    boolean check = testArray(intArray);

    System.out.println(check);
}
}

