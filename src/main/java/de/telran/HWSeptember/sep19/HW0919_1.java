package de.telran.HWSeptember.sep19;

import java.util.Arrays;
import java.util.Random;

public class HW0919_1 {
//    Создайте массив из 8 случайных целых чисел из интервала [1;50]
//    Выведите массив на консоль в строку.
//    Замените каждый элемент с нечетным индексом на ноль.
//    Снова выведете массив на консоль в отдельной строке.

    public static void main(String[] args) {
        Random random = new Random();
        int arraySize = 8;



        int[] intArray = new int[arraySize];

        System.out.print("Массив выглядит так:  ");

        for (int i = 1; i < intArray.length; i++) {
            intArray[i] = random.nextInt(50-1);
            System.out.print(intArray[i] + ",");
        }
        System.out.println("После замены элементов с нечетным индексом на ноль. Ряд выглядит так: ");

        for (int i = 1; i < intArray.length; i++) {
// к сожалению не могу понять, как нужно написать, чтобы нулевой индекс не считался нечетным.
// Буду благодарна если напишите в комментарии к домашке. Понимаю что в иф, но не понимаю как
            if (i % 2 != 0) {
                intArray[i] = 0;
            }
        }
        System.out.print("Массив после замены элементов с нечетным индексом на ноль, " +
                "ряд выглядит так " + Arrays.toString(intArray));

    }

    }