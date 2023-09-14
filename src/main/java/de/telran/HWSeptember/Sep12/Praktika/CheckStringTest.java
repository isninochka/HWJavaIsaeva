package de.telran.HWSeptember.Sep12.Praktika;

public class CheckStringTest {
    public static void main(String[] args) {

        CheckString checkString = new CheckString();

        String userText = ("Текст с четным количеством символов!");
        boolean test1 = checkString.checkString(userText);
        boolean expectedResult = true;
        if (test1==expectedResult){
            System.out.println("Тест пройден успешно!");
        } else {
            System.out.println("Тест не пройден, ищи ошибку!");
        }

        String userText2 = ("Текст с не четным количеством символов!");
        boolean test2 = checkString.checkString(userText2);
        boolean expectedResult2 = false;
        if (test2==expectedResult2){
            System.out.println("Тест пройден успешно!");
        } else {
            System.out.println("Тест не пройден, ищи ошибку!");
        }
    }
}
