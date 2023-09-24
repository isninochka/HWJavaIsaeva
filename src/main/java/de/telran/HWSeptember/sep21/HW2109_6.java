package de.telran.HWSeptember.sep21;

import de.telran.HWSeptember.sep07.UserInput;

import static de.telran.HWSeptember.sep21.HW2109_6Method.*;

public class HW2109_6 {
    //Напишите программу, которая определит, сколько слов Вы ввели с консоли.
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        System.out.println("Введите текст для подсчета количества слов: ");

        String userString = userInput.userInputText();

        int userWords = textSize(userString);
        System.out.println("Вы ввели " + userWords + "слов(a)");

            }
        }

