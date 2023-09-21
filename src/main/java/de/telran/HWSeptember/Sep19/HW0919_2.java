package de.telran.HWSeptember.Sep19;

import java.util.Random;

public class HW0919_2 {
    //    Создайте массив из 5 случайных целых чисел из интервала [10;99]
//    Выведите его на консоль в строку.
//    Определите и выведите на экран сообщение о том, является ли
//    массив строго возрастающей последовательностью.
    public static void main(String[] args) {
        Random random = new Random();
        int arraySize = 5;

        int[] intArray = new int[arraySize];

        System.out.print("Массив выглядит так:  ");

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(100 - 10);
            System.out.print(intArray[i] + ",");
        }
        boolean check = true;
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i]<=intArray[i-1]) {
                check = false;
               break;
            }
            }
        if (check) {
            System.out.println("Массив является строго возрастающей последовательностью");
        }else{

                System.out.println("Массив не является строго возрастающей последовательностью");
        }

    }
}
