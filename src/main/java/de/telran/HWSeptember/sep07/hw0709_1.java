package de.telran.HWSeptember.sep07;

public class hw0709_1 {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        int userInt;

        System.out.println("Is it weekend?");

        System.out.println("1.Yes");
        System.out.println("2.No");


        int userChoice;
        userChoice = ui.userInputInt();

        switch (userChoice) {
            case 1:
                System.out.println("Is it raining?");

                System.out.println("1.Yes");
                System.out.println("2.No");

                userInt = ui.userInputInt();




                if (userInt == 1) {

                    System.out.println("It is weekend and raining, you can't walking.");
                break;}

            {        System.out.println("It is weekend and not raining, you can walking.");
                break;}

            case 2:
                System.out.println("Is not weekend und you can't walking");
                break;

            }

 }
}
