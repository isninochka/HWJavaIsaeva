package de.telran.HWSeptember.sep21;

public class HW2109_7Method {

    public static boolean testArray(int[] intArray) {

        boolean check = true;
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] <= intArray[i - 1]) {
                check = false;

            }
        }
        if (check) {

            System.out.println("Массив является строго возрастающей последовательностью");
        } else {

            System.out.println("Массив не является строго возрастающей последовательностью");
        }return check;
    }

}