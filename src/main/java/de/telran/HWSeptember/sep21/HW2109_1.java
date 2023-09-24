package de.telran.HWSeptember.sep21;

import java.util.Arrays;

public class HW2109_1 {
//    Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
//    Не используйте дополнительный массив для хранения результатов.
public static void main(String[] args) {


    String[] strings = {"программисты","-","это","устройства","преобразующие","кофеин","в","код"};

    String[] reversStrings = new String[strings.length];

    for (int i = 0; i < strings.length; i++) {
        reversStrings[reversStrings.length - 1 - i] = strings[i];
    }

    System.out.println(Arrays.toString(strings));
    System.out.println(Arrays.toString(reversStrings));

}
}


