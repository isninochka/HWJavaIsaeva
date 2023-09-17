package de.telran.HWSeptember.Sep14;

import de.telran.HWSeptember.Sep07.UserInput;

public class HW0914 {


//    У вас на банковском счету N долларов.
//        Вы хотите снять все, но банк разрешает снять только сумму, которая является делителем текущей суммы на счету и меньше текущей суммы.
//        Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится, чтобы забрать все свои деньги из банка?
//        Примечание: если оставшаяся сумма равна 1, вы можете снять ее.

    public static void main(String[] args) {
        UserInput ui = new UserInput();
        System.out.println("Введите сумму которую вы хотите снять со счета");
        int money = ui.userInputInt();
        int days = 0;

        for (int i = 1; i <= money; i++) {
            if (money % i == 0) {
                days++;

                System.out.println("Для снятия вашей суммы: " + money + ". Вам потребуется " + days + " дня (дней)");

            }
        }

    }
}
