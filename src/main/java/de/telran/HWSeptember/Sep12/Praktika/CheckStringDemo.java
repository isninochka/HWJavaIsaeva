package de.telran.HWSeptember.Sep12.Praktika;

public class CheckStringDemo {
    public static void main(String[] args) {

        TextInput textInput = new TextInput();
        String userText = textInput.inputStringLine();

        CheckString checkString = new CheckString();
        boolean checkResult = checkString.checkText(userText);

        TextOutput textOutput = new TextOutput();
        textOutput.printInfo(userText, checkResult);
    }

}
