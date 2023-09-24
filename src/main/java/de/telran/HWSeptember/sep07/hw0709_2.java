package de.telran.HWSeptember.sep07;

public class hw0709_2 {
    public static void main(String[] args) {

        UserInput ui = new UserInput();


        System.out.println("Is Rewe open?");

        System.out.println("1.Yes");
        System.out.println("2.No");


        int isReweOpen;
        isReweOpen = ui.userInputInt();


        if (isReweOpen ==1) {
            System.out.println("You can buy anything");}

        else if (isReweOpen == 2){

                System.out.println("Is Edeka open?");

                System.out.println("1.Yes");
                System.out.println("2.No");
        }
        int isEdekaOpen;
        isEdekaOpen = ui.userInputInt();


        switch (isEdekaOpen) {

            case 1:

                System.out.println("You can buy anything");
                break;

            case 2:

                System.out.println("All shops are closed!");
        }
    }
}








