package de.telran.HWSeptember.Sep05;

public class hw0509_1 {
    public static void main(String[] args) {
        String study = new String("I study Basic Java!");

        int studyLength = study.length();

        System.out.println(study.length ());

        System.out.println("Second last symbol is  "+ study.charAt(studyLength-2));

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
