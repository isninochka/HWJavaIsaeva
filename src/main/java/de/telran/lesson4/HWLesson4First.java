package de.telran.lesson4;

public class HWLesson4First {
    public static void main(String[] args) {
        String study = new String("I study Basic Java!");
        System.out.println("last symbol is  "+ study.charAt(17));

        String string = "I study Basic Java!";
        String substring = "Java";
        System.out.println(string.contains(substring));

        String java = string.substring(14,18);
        System.out.println(java);

        String repl = substring.replace("a", "o");
        System.out.println(repl);

        String strBig = string.toUpperCase();
        System.out.println(strBig);

        String strLit = string.toLowerCase();
        System.out.println(strLit);


    }
}
