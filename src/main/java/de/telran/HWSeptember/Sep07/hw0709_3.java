package de.telran.HWSeptember.Sep07;

public class hw0709_3 {
    public static void main(String[] args) {

        UserInput ui = new UserInput();

        System.out.println("Введите температуру первой колбы");
        int userInput = ui.userInputInt();
        int Temp1 = userInput;

        if (Temp1 < 100) {
            System.out.println("Прибор работает не корректно, так как температура первой колбы ниже 100 градусов и равна  " + Temp1);
        }
        else  {
            System.out.println("Введите температуру второй колбы");
            int userInput2 = ui.userInputInt();
            int Temp2 = userInput2;

            if (Temp2 < 100) {
                System.out.println("Прибор работает корректно " + "температура первой колбы " + Temp1 + " температура второй колбы " + Temp2);
            }
            else {

                System.out.println("Прибор работатет не корректно, так как темпратура второй колбы выше 100 градусов и равна " + Temp2);

            }
        }
    }
}










