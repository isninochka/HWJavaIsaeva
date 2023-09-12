package de.telran.HWSeptember.Sep12.Praktika;

import java.util.Scanner;

public class TextInput {

    public String inputStringLine (){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Пожалуйста напечатайте вашу строку: ");
        return scanner.nextLine();
    }

}
