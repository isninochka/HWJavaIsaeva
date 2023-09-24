package de.telran.HWSeptember.sep07;

public class hw0709_5 {
    public static void main(String[] args) {

        UserInput ui = new UserInput();

        int pizzaDiametr;
        int klCm = 40;

        System.out.println("Выберите диаметр пиццы для рассчета калорий ");
        System.out.println("1.Диаметр 28");
        System.out.println("2.Диаметр 26");
        System.out.println("3.Диаметр 24");

        pizzaDiametr = ui.userInputInt();

        switch (pizzaDiametr){
            case 1:
                int diam = 28;

                System.out.println("Калорийность вашей пиццы " + (int)(diam*diam/(4*3.14))*klCm
                        + " калорий.Это больше на "+ (28-26)*klCm + " калорий, чем в пицце 26 см" +
                        " и больше на " + (28-24)*klCm + " калорий, чем в пицце 24 см" );
            break;
            case 2:
                int diam2 = 26;
                int rasnicaKl2826 = (28-26)*klCm;

                System.out.println("Калорийность вашей пиццы " + (int)(diam2*diam2/(4*3.14))*klCm
                        + " калорий. "+ " В этой пицце меньше калорий чем в 28 см, на " + rasnicaKl2826
                        +" калорий ");
                break;
            case 3:
                int diam3 = 24;
                int rasnicaKl2624 = (26-24)*klCm;
                int rasnicaKl2824 = (28-24)*klCm;

                System.out.println("Калорийность вашей пиццы " + (int)((diam3*diam3/(4*3.14)))*klCm
                        + " калорий. "+ " В этой пицце меньше калорий чем в 26 см, на " + rasnicaKl2624
                        + " калорий " + " и меньше калорий чем в 28 см, на " + rasnicaKl2824 + " калорий ");
                break;
        }


    }

}
