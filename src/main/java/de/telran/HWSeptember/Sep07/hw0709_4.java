package de.telran.HWSeptember.Sep07;

public class hw0709_4 {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        System.out.println("Введите оставшее рабочее время в секундах, для перевода в часы");

        int sec = ui.userInputInt();
        int hours = sec/3600;

        if (hours>0){
            System.out.println("Осталось " + hours + "часа(ов)");
        }
        else {
            System.out.println("Осталось меньше часа. Скоро домой!");
        }

    }
}
