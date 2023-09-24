package de.telran.HWSeptember.sep12;

public class TextOutput {
    public void printInfo (String userText, boolean checkResult){
        System.out.println("для строки:");
        System.out.println(userText);

        if (checkResult){
            System.out.println("длина строки - четное");
        } else {
            System.out.println("длина строки - не четное");
        }
    }
}
