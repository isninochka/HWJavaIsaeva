package de.telran.HWSeptember.sep21;

import java.util.Arrays;
import java.util.Random;

public class HW2109_4 {
//    Создайте массив из 8 случайных целых чисел из отрезка [1;10]
//    Выведите массив на экран в строку
//    Замените каждый элемент с нечётным индексом на ноль
//    Снова выведете массив на экран на отдельной строке

    public static void main(String[] args) {
        int[] intArray = new int[8];
        Random random = new Random();
        System.out.println("Ваш массив выглядит так: ");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i]= random.nextInt(10)+1;
            System.out.print(intArray[i] +",");
            if (intArray[i] % 2 ==0 && intArray[i]!=0){
                intArray[i]=0;
            }
                   }
        System.out.println();
        System.out.println("После замены четных чисел, ваш массыв выглядит так:");
        System.out.print(Arrays.toString(intArray));
    }
}
