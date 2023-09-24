package de.telran.HWSeptember.sep21;

public class HW2109_5Method {

    public static int arithmetikMean(int[] intArray) {
        int sum =0;
        for ( int num : intArray){
            sum += num;
        }
        int average;
        average = sum/ intArray.length;
        return average;
    }
}