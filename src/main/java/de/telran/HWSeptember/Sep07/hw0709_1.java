package de.telran.HWSeptember.Sep07;

public class hw0709_1 {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        int userInt;
        String userText = ";";

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

//        Простой и скучный вариант:
//        boolean isWeekend = true;
//        boolean isRain = false;
//        boolean canWalk = isWeekend && isRain;
//        System.out.println("It is weekend and not raining, i can walking" + canWalk);
//
 }
}
