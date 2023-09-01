package de.telran.lesson2;

public class HWNumber {
    public static void main(String[] args){
    int x = 457;

    int hunderds = x/100;
    int tens = x/10%10;
    int ones = x%10;


    System.out.println(" " + hunderds + "," + tens +"," + ones);
    }
}