package de.telran.HWSeptember.sep21;

import java.util.Random;

public class HW2109_3 {
//    Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
//    Определите какой элемент является в этом массиве максимальным и
//    сообщите индекс его последнего вхождения в массив.
    public static void main(String[] args) {
        Random random = new Random();
        int minNum = 15;
        int maxNum = 15;


        int[] intArray = new int[12];

        System.out.println("Массив выглядит так: ");

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt((maxNum+minNum+1))-minNum;
            System.out.print(intArray[i] + ",");

        }
        int maxArrayNum = intArray[0];
        int indexMaxNum = 0;
        for(int i=0;i < intArray.length;i++) {
            if (intArray[i] > maxArrayNum) {
                maxArrayNum = intArray[i];


                System.out.println("Максимальное число массива : " + maxArrayNum);

                if (intArray[i] >= maxArrayNum) {
                    maxArrayNum = intArray[i];
                    indexMaxNum = i;

                }
                System.out.println("и имеет индекс: " + indexMaxNum);


            }
        }   }   }